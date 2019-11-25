<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
    <title>Pokemon Partner Matching Confirmation</title>
</head>

<body>

Congratulations ${trainer.firstName} ${trainer.lastName}!

<br><br>

Your Pokemon partner is found here: <a href=${pokemon.URL}>Your New Partner</a>

</body>
</html>