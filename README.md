## 01 - Java Webapps without Spring

### Outro

There’s a fair amount of things you learned in this module. Let’s have a quick recap.

At the very beginning, you learned how to write simple Java web-apps with an embedded Tomcat and the Servlet API. This included shading your Maven project, so you can build an executable .jar file.

You also learned how to write HTML and JSON via the Servlet API, including using the Jackson 3rd-party dependency and configuring its behavior with annotations.

You finally learned about handling dependencies between classes in Java, first actively (Application class), then passively (Constructor Injection).

## 02 - Spring IoC Basics

### Outro

There’s a fair amount of things you learned in this module. Let’s have a quick recap.

At the very beginning, how to add Spring Framework to a project with just one Maven dependency.

You then created your first ApplicationContextConfigurations with the @Configuration annotation and @Bean factory methods.

Then, it was all about core Spring concepts. How @Beans are singletons by default and how you can change their scope. How you can make Spring use @ComponentScan to scan for Spring specific classes. The various ways of injecting dependencies, with constructor or field injection. And finally, bean lifecycles.

Last but not least, you learned about properties and profiles, specifying a different cdnUrl for different environments, that your REST services use.

## 03 - Spring WebMVC: Rest Services

### Outro

What a ride this module was. Here’s a quick recap!

At the very beginning, you learned how to add the proper Maven dependencies and Spring’s DispatcherServlet to get Spring MVC running.

You learned about writing @RestControllers, that can accept and return a variety of data formats, like JSON or XML through content negotiation.

You also learned all about various ways of accepting request params, path variables or request bodies.

Finally, you learned how to validate incoming beans or even just parameters, as well as changing exceptions in RestControllerAdvices.
