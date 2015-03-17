<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name='layout' content='main' />
</head>
<body>
<div>
    <g:each var="match" in="${matches}">
        <g:formatDate format="dd/MM/yyyy" date="${match.matchDate}"/> ${match.home.username} ${match.scoreHome}
        — ${match.away.username} ${match.scoreAway} <g:link action="index" id="${match.id}">View</g:link>
    </g:each>
</div>
</body>
</html>