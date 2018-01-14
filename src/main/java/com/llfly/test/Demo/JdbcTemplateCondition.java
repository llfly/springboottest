package com.llfly.test.Demo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by fangyou on 2018/1/14.
 */
public class JdbcTemplateCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context,
                           AnnotatedTypeMetadata metadata) {
        try {
            context.getClassLoader().loadClass(
                    "org.springframework.jdbc.core.JdbcTemplate");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


@Conditional(JdbcTemplateCondition.class)
class MyService {
    // 只有当JdbcTemplateCondition类的条件成立时才会创建MyService这个Bean。
}


/*
在向应用程序加入Spring Boot时，有个名为spring-boot-autoconfigure的JAR文件，其中包含了很多配置类。
每个配置类都在应用程序的Classpath里，都有机会为应用程序的配置添砖加瓦。
所有这些配置如此与众不同，原因在于它们利用了Spring的条件化配置，这是Spring 4.0引入的新特性。
条件化配置允许配置存在于应用程序中，但在满足某些特定条件之前都忽略这个配置。


在Spring里可以很方便地编写自己的条件，要做的就是实现Condition接口，覆盖它的matches()方法

@ConditionalOnBean  配置了某个特定Bean
@ConditionalOnMissingBean   没有配置特定的Bean
@ConditionalOnClass Classpath里有指定的类
@ConditionalOnMissingClass  Classpath里缺少指定的类
@ConditionalOnExpression    给定的Spring Expression Language(SpEL)表达式计算结果为true
@ConditionalOnJava  Java的版本匹配特定值或者一个范围值
@ConditionalOnJndi  参数中给定的JNDI位置必须存在一个，如果没有给参数，则要有JNDI InitialContext
@ConditionalOnProperty  指定的配置属性要有一个明确的值
@ConditionalOnResource  Classpath里有指定的资源
@ConditionalOnWebApplication    这是一个Web应用程序
@ConditionalOnNotWebApplication 这不是一个Web应用程序





@Configuration
@ConditionalOnClass({DataSource.class, EmbeddedDatabaseType.class})
@EnableConfigurationProperties(DataSourceProperties.class)
@Import({Registrar.class, DataSourcePoolMetadataProvidersConfiguration.class})
public class DataSourceAutoConfiguration {



    @Configuration
    @Conditional(DataSourceAutoConfiguration.DataSourceAvailableCondition.class)
    protected static class JdbcTemplateConfiguration {

        @Autowired(required = false)
        private DataSource dataSource;

        @Bean
        @ConditionalOnMissingBean(JdbcOperations.class)
        public JdbcTemplate jdbcTemplate() {
            return new JdbcTemplate(this.dataSource);
        }
    }
}


*/

