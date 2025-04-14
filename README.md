# [The Confident Spring Professional - Course](https://www.marcobehler.com/courses/spring-professional)

I have completed [The Confident Spring Professional course](https://www.marcobehler.com/courses/spring-professional) offered by Marco Behler, which provides an in-depth understanding of the Spring Framework and its ecosystem.

Throughout the course, I worked on practical exercises and projects to solidify my understanding of these concepts. This repository contains the code and projects developed during the course.

The following points in this file describe individual modules.

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

## 06 - Spring Boot Basics

### Outro

If you made it this far, you should understand by now that Spring Boot only takes plain Spring framework features, and configures them for you, behind the scenes:

* It boots up an embedded Tomcat when you run the `SpringBootApplication` main method.

* It automatically generates beans from `application.properties`.

* It makes dependency management much nicer: You don’t need to worry about versions anymore and can import "starter"-libraries like `spring-boot-starter-jdbc`, that will automatically pull in all other needed dependencies.

The issue: Without reading the documentation and by just copying code online, you will think that Spring Boot is a bunch of magic.

But remember: Spring Boot is hiding exactly what you did in the previous module (starting Tomcat, registering DispatcherServlet, creating DataSources etc.), it still has to happen behind the scenes. There’s no way around it!

Let’s find out how Spring Boot does all this, internally, in the next module.

## 07 - Spring Boot: Internals

### Outro

This was the deep dive into Spring Boot.

At the beginning you learned about Spring’s AutoConfigurations, how they work thanks to @Conditionals and how they are structured in Spring Boot’s source code.

You then proceeded to write your very own AutoConfiguration.

You should now have a pretty good grasp of Spring Boot!

## 08 - Spring Data JDBC

### Outro

The main takeaway from this section should be that Spring Data JDBC gives you convenient access to repositories with the help of a couple of mapping annotations.

As for all other Spring Data projects:

Even though they all run under the Spring Data banner, `spring-data-jdbc`, `spring-data-jpa`, `spring-data-ldap` and others are all different from each other, because the underlying data storage technologies are different. They also support different features, like you saw earlier with the `queries-by-method-names` support.

In the end, however, they all try to allow you easy data access by providing repositories on top of the underlying technology. Be that the JdbcTemplate, Hibernate or Active Directories.

This means, you’ll need to learn the underlying technology before blindly jumping right into the corresponding Spring Data project.
