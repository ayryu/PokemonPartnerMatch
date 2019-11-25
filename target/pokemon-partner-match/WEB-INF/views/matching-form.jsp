<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
    <title>Pokemon Matching Form</title>

    <style>
        .error {color: red}
    </style>
</head>

<body>

<i>Fill out this form and your new Pokemon partner will be matched with you! </i>

<br><br>

    <form:form action="processMatchingForm" modelAttribute="trainer">

        What is your first name? (*) <form:input path="firstName" />
        <form:errors path="firstName" cssClass="error" />

        <br><br>

        What is your last name? <form:input path="lastName" />

    <br><br>

        <input type="submit" value="Submit" />
    </form:form>

</body>

</html>