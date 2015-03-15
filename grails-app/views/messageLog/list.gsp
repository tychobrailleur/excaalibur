<!DOCTYPE html>
<html class="no-js landing-alt-body" lang="en" xmlns:ng="http://angularjs.org">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name='layout' content='main' />
</head>
<body>
<g:each var="message" in="${messages}">
    <p>Message: ${message.message}</p>
    <p>Date created: ${message.dateCreated}</p>
</g:each>
</body>
</html>
