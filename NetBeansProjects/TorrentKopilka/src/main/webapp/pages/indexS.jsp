<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ru">
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
        <link href="<c:url value="/pages/css/signin.css" />" rel="stylesheet">

        <script type="text/javascript" src="<c:url value="/pages/js/jquery.min.js" />" ></script>
        <script type="text/javascript" src="<c:url value="/pages/js/custom.js" />" ></script>

        <title>JSP Page</title>

    </head>
    <body>

        <h3>Enter search from Name</h3>
        <input id="input_name" type="text">
        <input id="search" type="button" value="Search">
        <p id="result_text"></p>

        <h1>Hello indexS.jsp!</h1>

        <h3>Get Information:</h3>
        <input id="getAll" type="button" value="all">
        <p id="result_all"></p>      



        <button id="getForecast">Получить прогноз погоды</button>
        <div class="block">
            <h2 class="name0">Название : </h2>
            <h2 class="released0">Год выхода : </h2>
            <h2 class="name1">Название : </h2>
            <h2 class="released1">Год выхода : </h2>
            <h2>Качество : " ${kach} "</h2>
            <h2>Размер : " ${size} "</h2>
            <h2>Movie : " ${movie} "</h2>
        </div>

    </body>
</html>
