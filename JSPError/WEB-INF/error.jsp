<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>
</head>
<body>
    <h3>An error occurred:</h3>
    <p><strong>Error Message:</strong> <%= exception.getMessage() %></p>
    <p><strong>Exception Details:</strong></p>
    <pre><%= exception.toString() %></pre>
</body>
</html>
