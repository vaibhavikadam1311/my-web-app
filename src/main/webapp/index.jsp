<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Input Form</title>
</head>
<body>
    <h1>User Input Form</h1>
    <form action="submit" method="post">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="profession">Profession:</label><br>
        <input type="text" id="profession" name="profession" required><br><br>
        
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>

