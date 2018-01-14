
- 自动配置
- 起步依赖：特殊的 Maven依赖和 Gradle依赖，利用传递依赖解析，把常用库聚合在一起，组成了几个特定功能而定制的依赖
- 命令行界面
- Actuator 提供在运行时检视应用程序内部情况的能力
    - Spring 应用程序上下文里的配置的 Bean
    - Spring Boot 的自动配置做的决策
    - 应用程序取到的环境变量、系统属性、配置属性和命令行参数
    - 应用程序里线程的当前状态
    - 应用程序最近处理过的HTTP请求的追踪情况
    - 各种和内存用量、垃圾回收、Web请求以及数据源用量相关的指标