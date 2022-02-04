# SPRING_BOOT_ACTUATOR_DEMO_APP
A Spring Boot Demo App that exposes actuator endpoints

- the app exposes actuator endpoints based on customized configuration
- since the recent actuator update, it is mandatory to explicitly add "health & info" endpoints to the properties file
- the spring security support was added to secure the actuator endpoints
- the spring security default password was overriden to "admin" in the properties file
- the base api url is http://localhost:9090/myspringbootapp (the server port and base-url can be overriden from the properties file)
