# HTML to JSP Conversion

## Aim
To convert an HTML form into a JSP-based web application and understand Servlet-JSP interaction.

## Technologies Used
- Java
- JSP (JavaServer Pages)
- Jakarta Servlet
- Apache Maven
- Apache Tomcat 11
- HTML

## Project Structure
- `HelloServlet.java` – Processes student form data.
- `student.jsp` – Displays the student information form.
- `result.jsp` – Displays submitted student details.
- `web.xml` – Web application configuration.
- `pom.xml` – Maven project configuration.

## Features
- Student information form
- Form submission using a Servlet
- Display of Name, Email, Course, and Age
- JSP Expression Language (EL) for displaying data

## How to Run
1. Build the project using `mvn clean package`.
2. Copy the generated WAR file from the `target` folder to Tomcat's `webapps` folder.
3. Start Apache Tomcat.
4. Open the following URL in your browser:

   `http://localhost:8080/jspexperiment/student.jsp`

5. Fill in the student details and submit the form.

## Expected Output
The application displays a registration success message and the submitted student details.

## Testing Status
Maven build and student form submission tested successfully using Apache Tomcat 11.
