## Example of an institute
In an institute many students are coming for enrolling in different different courses.
Let's say in our example, institute offers 2 courser i.e. Java and PHP.

### Requirement
Enroll the students as per their preference. Inform them about trainer name and mobile number
plus institute address on successful enrollment.

### Sample output
- Java student response
 - Hello, **Rohit**
   Your trainer is **Bob** and his mobile number is **0987654321**.
   Classes will be in **MyInstitute, Bangalore** campus.
- Php student response
 - Hello, **Virat**
   Your trainer is **John** and his mobile number is **1234567890**.
   Classes will be in **MyInstitute, Bangalore** campus.

### Interpret dynamic data
- Student name is changing all the time
- Trainer info is changing only when Servlet is changing
- Institute info in never changing

### Data
- Student name - Rohit/Virat - HttpServletRequest (request object)
- Trainer info(name and number) - Bob and 0987654321 - ServletConfig
- Institute info (name and address) - MyInstitute, Banagelore - ServletContext

### Development process
- Create `java-enrollment.html` form
- Create `php-enrollment.html` form
- Create JavaServlet for showing dynamic response
  - Configure JavaServlet with Java trainer information
- Create PhpServlet for showing dynamic response
  - Configure PhpServlet with Java trainer information
- Configure application for institute information