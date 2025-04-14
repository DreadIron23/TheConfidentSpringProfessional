# [The Confident Spring Professional - Course](https://www.marcobehler.com/courses/spring-professional)

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

## 04 - Spring WebMVC: HTML Pages

### Outro

Here’s a quick recap of what you learned in this module.

At the very beginning, you learned how to set up Thymeleaf and Spring, including its Maven dependencies and Spring beans.

You learned how to render a static HTML Thymeleaf template, as well as more advanced Thymeleaf templates with its special templating syntax.

Finally, you went on to submit forms with Thymeleaf, including automatic field-binding and validation.

That being said: Writing HTML with Spring MVC is a huge topic and not everything can be covered throughout this course.

If you want to get the information on all MVC concepts (including how to customize and internationalize your error messages), have a look at the [official documentation](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc).

## 05 - Spring Database Access

### Outro

First, you learned how to add an embedded H2 Database to your project and how to create a DataSource for it.

You then set up a JdbcTemplate to refactor your InvoiceService to execute SQL statements against a real database, instead of saving invoices into an in-memory list.

Finally, you had a quick look at how to set up Spring’s @Transactional annotation.
