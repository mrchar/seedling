# 使用 Spring Data JPA 创建服务

## 创建项目

与创建 Web 项目的过程类似，在选择依赖的步骤，选择 `Spring Web` 和 `Spring Data JPA` 以及`H2 Database`。

## Spring Data JPA

Spring data jpa 是基于 Hibernate 的 JPA 框架

## H2 Database

H2 Database 是一款内嵌的数据库

## 配置项目

Spring boot 的配置文件位于`src/main/resources/`目录下，通常为`application.properties`，也支持使用`yaml`格式。

将`application.properties`文件名为`application.yaml`

修改 application.yaml

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:demo2
  sql:
    init:
      schema-locations:
        - classpath:migration/schema.sql
```

在`src/main/resources/migration/`目录下创建`schema.sql`

```sql
create table student (
    `id` int primary key auto_increment,
    `name` varchar(50),
    `gender` varchar(10),
    `age` int
);
```

## 创建 Entity 和 Repository
