package guru.springframework.sfg_di_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller that provides documentation about available Spring Boot Actuator endpoints
 * and Spring Boot Admin features.
 */
@Controller
public class ActuatorDocsController {

    /**
     * Returns documentation about the available Actuator endpoints and how to use them.
     * 
     * @return String containing HTML documentation about Actuator endpoints
     */
    @GetMapping("/actuator-docs")
    @ResponseBody
    public String getActuatorDocs() {
        return "<html><body>" +
                "<h1>Spring Boot Actuator Endpoints Documentation</h1>" +
                "<p>This application has the following Actuator endpoints enabled:</p>" +
                "<ul>" +
                "<li><strong>/actuator/beans</strong> - Lists all beans in the Spring application context</li>" +
                "<li><strong>/actuator/health</strong> - Shows application health information</li>" +
                "<li><strong>/actuator/info</strong> - Displays application information</li>" +
                "<li><strong>/actuator/conditions</strong> - Shows auto-configuration conditions evaluation</li>" +
                "<li><strong>/actuator/configprops</strong> - Lists all @ConfigurationProperties</li>" +
                "<li><strong>/actuator/env</strong> - Exposes properties from Spring's ConfigurableEnvironment</li>" +
                "<li><strong>/actuator/mappings</strong> - Displays all @RequestMapping paths</li>" +
                "<li><strong>/actuator/metrics</strong> - Shows metrics information</li>" +
                "<li><strong>/actuator/scheduledtasks</strong> - Displays scheduled tasks</li>" +
                "<li><strong>/actuator/loggers</strong> - Shows and modifies logger configurations</li>" +
                "<li><strong>/actuator/threaddump</strong> - Performs a thread dump</li>" +
                "<li><strong>/actuator/heapdump</strong> - Returns a heap dump file</li>" +
                "<li><strong>/actuator/caches</strong> - Exposes available caches</li>" +
                "</ul>" +
                "<h2>Spring Boot Admin</h2>" +
                "<p>This application also includes Spring Boot Admin, which provides a web UI for the Actuator endpoints.</p>" +
                "<p>Access Spring Boot Admin at: <a href='/'>Spring Boot Admin Dashboard</a></p>" +
                "</body></html>";
    }
}
