# Spring Framework

[原文地址](https://projects.spring.io/spring-framework/#quick-start)

## Introduction（简介）
The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications - on any kind of deployment platform. A key element of Spring is infrastructural support at the application level: Spring focuses on the "plumbing" of enterprise applications so that teams can focus on application-level business logic, without unnecessary ties to specific deployment environments.

Spring框架为现代基于Java的企业应用程序提供了一个全面的编程和配置模型 - 在任何类型的部署平台上。 Spring的一个关键元素是为应用程序级别的提供基础架构支持：Spring着重于企业应用程序的“探索”，以便团队可以专注于应用程序级别的业务逻辑，而不必与特定部署环境形成不必要的联系。

## Features（特性）
* **Core technologies**: dependency injection, events, resources, i18n, validation, data binding, type conversion, SpEL, AOP.
* **核心技术**: 依赖注入, 事件, 资源, i18n, 验证, 数据绑定, 类型转换, SpEL, AOP.
* **Testing**: mock objects, TestContext framework, Spring MVC Test, WebTestClient.
* **测试**: mock对象, 测试上下文框架, Spring MVC测试, WebTestClient.
* **Data Access**: transactions, DAO support, JDBC, ORM, Marshalling XML.
* **数据访问**: 事务, DAO支持, JDBC, ORM, Marshalling XML.
* **Spring MVC** and **Spring WebFlux** web frameworks
* **Integration**: remoting, JMS, JCA, JMX, email, tasks, scheduling, cache.
* **集成**: remoting, JMS, JCA, JMX, 邮件, 任务, 定时调度, 缓存.
* **Languages**: Kotlin, Groovy, dynamic languages.
* **语言支持**: Kotlin, Groovy, dynamic languages.

## Minimum requirements（最小要求）
* JDK 8+ for Spring Framework 5.x
- JDK 6+ for Spring Framework 4.x
- JDK 5+ for Spring Framework 3.x

## Quick Start（快速开始）
The recommended way to get started using spring-framework in your project is with a dependency management system – the snippet below can be copied and pasted into your build. Need help? See our getting started guides on building with Maven and Gradle.

在项目中开始使用spring-framework的推荐方法是使用依赖管理系统 - 下面的代码片段可以复制并粘贴到您的构建中。 需要帮忙？ 请参阅我们有关使用Maven和Gradle构建的入门指南。（参见：/Users/Hank/Documents/Blog/Spring Framework/Demo/HelloSpringFramework）

```
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>4.1.3.RELEASE</version>
    </dependency>
</dependencies>
```

Spring Framework includes a number of different modules. Here we are showing spring-context which provides core functionality. Refer to the getting started guides on the right for other options.

Spring框架包含许多不同的模块。 这里我们展示了提供核心功能的spring-context。有关其他选项，请参阅右侧的快速开始指南。

The example above shows the basic concept of dependency injection, the MessagePrinter is decoupled from the MessageService implementation, with Spring Framework wiring everything together.

上面的例子显示了**依赖注入**的基本概念，MessagePrinter与MessageService实现分离开来，Spring Framework将所有东西连接在一起。
