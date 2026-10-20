# Java Servlet Practicals

## About the Project
This project contains Java Servlet practical programs developed to understand Java web application development using Servlets, Filters, Listeners, HTTP requests, sessions, cookies, and web forms.

## Technologies Used
- Java
- Java Servlets (Jakarta Servlet API)
- Apache Maven
- Apache Tomcat 11
- HTML
- Git and GitHub

## Project Structure

```text
servlet/
├── pom.xml
├── .gitignore
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── servlet/
        │           ├── AppListener.java
        │           ├── AuthFilter.java
        │           ├── ConfigContextServlet.java
        │           ├── CookieServlet.java
        │           ├── HelloServlet.java
        │           ├── HomeServlet.java
        │           ├── LoggingFilter.java
        │           ├── LoginServlet.java
        │           ├── LogoutServlet.java
        │           ├── Main.java
        │           ├── ReadCookieServlet.java
        │           └── StudentServlet.java
        └── webapp/
            ├── index.html
            └── student.html
```

## Practicals Covered

- Hello Servlet
- Login and Home Servlet
- Authentication Filter
- Logout functionality
- Student Registration Form
- Cookie Creation and Reading
- ServletConfig and ServletContext
- Application Listener
- Logging Filter

## Software Requirements

- Java JDK
- Apache Maven
- Apache Tomcat 11
- A web browser

## How to Run the Project

1. Clone or download this repository.
2. Open a terminal in the project directory.
3. Build the project using Maven:

   ```bash
   mvn clean package
   ```

4. After a successful build, locate the generated WAR file:

   ```text
   target/servlet.war
   ```

5. Deploy `servlet.war` to Apache Tomcat 11.
6. Start Tomcat and open the application in your browser:

   ```text
   http://localhost:8080/servlet/
   ```

## Learning Outcomes

This project helps in understanding servlet lifecycle, request and response handling, form submission, authentication filters, cookies, application-level configuration, event listeners, and deployment of Java web applications.

## Author

**Neha Mulani**

## Note

This project is intended for academic learning and practical demonstrations. The login implementation is for demonstration purposes and should not be used as-is in a production application.
