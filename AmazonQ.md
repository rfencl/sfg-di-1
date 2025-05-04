# Spring Boot Actuator and Spring Boot Admin Setup

This document explains how to use Spring Boot Actuator and Spring Boot Admin to inspect the Spring application context and monitor your application.

## Dependencies Added

The following dependencies have been added to the project:

```xml
<!-- Spring Boot Actuator -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>

<!-- Spring Boot Web (required for HTTP endpoints) -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- Spring Boot Admin Client -->
<dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-starter-client</artifactId>
    <version>3.2.2</version>
</dependency>

<!-- Spring Boot Admin Server -->
<dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-starter-server</artifactId>
    <version>3.2.2</version>
</dependency>
```

## Configuration

The application has been configured to expose all Actuator endpoints and enable Spring Boot Admin:

```properties
# Actuator Configuration
management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always

# Spring Boot Admin Configuration
spring.boot.admin.client.url=http://localhost:8080
spring.boot.admin.client.instance.name=${spring.application.name}
```

## Available Endpoints

### Spring Boot Actuator Endpoints

1. `/actuator/beans` - Lists all beans in the Spring application context
2. `/actuator/health` - Shows application health information
3. `/actuator/info` - Displays application information
4. `/actuator/conditions` - Shows auto-configuration conditions evaluation
5. `/actuator/configprops` - Lists all @ConfigurationProperties
6. `/actuator/env` - Exposes properties from Spring's ConfigurableEnvironment
7. `/actuator/mappings` - Displays all @RequestMapping paths
8. `/actuator/metrics` - Shows metrics information
9. `/actuator/scheduledtasks` - Displays scheduled tasks
10. `/actuator/loggers` - Shows and modifies logger configurations
11. `/actuator/threaddump` - Performs a thread dump
12. `/actuator/heapdump` - Returns a heap dump file
13. `/actuator/caches` - Exposes available caches
14. And many more...

### Spring Boot Admin

Spring Boot Admin provides a web UI for the Actuator endpoints. Access it at:
- http://localhost:8080/

## How to Use

1. Start the application:
   ```bash
   ./mvnw spring-boot:run
   ```

2. Access the Spring Boot Admin UI:
   ```
   http://localhost:8080/
   ```

3. To view the beans in the Spring context:
   ```
   http://localhost:8080/actuator/beans
   ```
   
4. For documentation about available endpoints:
   ```
   http://localhost:8080/actuator-docs
   ```

## Benefits

- **Inspect Spring Context**: View all beans, their dependencies, and scopes
- **Monitor Application**: Track health, metrics, and performance
- **Debug Configuration**: Understand auto-configuration decisions
- **Runtime Management**: Change log levels, view environment properties
- **Visual Dashboard**: Spring Boot Admin provides a user-friendly interface
