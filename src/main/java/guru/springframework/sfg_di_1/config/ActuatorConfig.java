package guru.springframework.sfg_di_1.config;

import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpoint;
import org.springframework.boot.actuate.autoconfigure.endpoint.expose.EndpointExposure;
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;

/**
 * Configuration class for Spring Boot Actuator endpoints.
 * This class provides documentation for the various Actuator endpoints available in the application.
 */
@Configuration
public class ActuatorConfig {

    /**
     * Spring Boot Actuator provides numerous endpoints for monitoring and managing your application.
     * Below is a comprehensive list of available endpoints and their purposes:
     * 
     * 1. /actuator/beans - Displays a complete list of all Spring beans in your application context.
     *    This endpoint shows bean names, scopes, types, and dependencies, making it useful for
     *    understanding the structure of your application context.
     * 
     * 2. /actuator/health - Shows application health information. The detailed view includes status
     *    of various components like disk space, database connections, and custom health indicators.
     *    Useful for monitoring systems to check if the application is running properly.
     * 
     * 3. /actuator/info - Displays arbitrary application information. This can be customized to show
     *    version information, build details, or any other application metadata.
     * 
     * 4. /actuator/conditions - Shows the conditions that were evaluated on auto-configuration classes
     *    and the reasons why they did or did not match. Helpful for debugging configuration issues.
     * 
     * 5. /actuator/configprops - Displays a collated list of all @ConfigurationProperties beans.
     *    Shows all configuration properties available in your application with their current values.
     * 
     * 6. /actuator/env - Exposes properties from Spring's ConfigurableEnvironment. Shows all environment
     *    properties, system properties, configuration properties, and property sources.
     * 
     * 7. /actuator/mappings - Displays a list of all @RequestMapping paths. Shows all HTTP request
     *    handlers and their mappings, useful for understanding the API structure.
     * 
     * 8. /actuator/metrics - Shows metrics information for the current application. Provides detailed
     *    metrics about memory usage, garbage collection, HTTP requests, and more.
     * 
     * 9. /actuator/scheduledtasks - Displays the scheduled tasks in your application. Shows cron
     *    expressions and execution times for all scheduled methods.
     * 
     * 10. /actuator/httptrace - Displays HTTP trace information (by default, the last 100 HTTP request-response
     *     exchanges). Useful for debugging HTTP communication issues.
     * 
     * 11. /actuator/threaddump - Performs a thread dump. Shows detailed information about all threads
     *     in the JVM, their state, and stack traces.
     * 
     * 12. /actuator/heapdump - Returns a GZip compressed JVM heap dump. Useful for analyzing memory issues.
     * 
     * 13. /actuator/loggers - Shows and modifies the configuration of loggers in the application.
     *     Allows dynamic changing of log levels at runtime.
     * 
     * 14. /actuator/auditevents - Exposes audit events information. Shows security audit events like
     *     authentication successes and failures.
     * 
     * 15. /actuator/shutdown - Allows the application to be gracefully shutdown (disabled by default).
     * 
     * 16. /actuator/caches - Exposes available caches. Shows information about the application's caches.
     * 
     * 17. /actuator/sessions - Allows retrieval and deletion of user sessions from a Spring Session-backed session store.
     * 
     * 18. /actuator/flyway - Shows information about Flyway database migrations.
     * 
     * 19. /actuator/liquibase - Shows information about Liquibase database migrations.
     * 
     * 20. /actuator/prometheus - Exposes metrics in a format that can be scraped by a Prometheus server.
     */
}
