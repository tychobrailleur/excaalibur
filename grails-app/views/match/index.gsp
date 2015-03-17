<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name='layout' content='main' />
</head>
<body>
    <div>
        <g:form name="match" action="submitScore" method="POST">
            <input type="hidden" name="matchId" value="${match.id}">
        ${match.home.username} <input type="text" name="homeScore" maxlength="3">
            — ${match.away.username} <input type="text" name="awayScore" maxlength="3">
            <input type="submit" name="ok" value="Ok">
        </g:form>
    </div>
</body>
</html>