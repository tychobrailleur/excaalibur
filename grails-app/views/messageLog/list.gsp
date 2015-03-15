<!DOCTYPE html>
<html class="no-js landing-alt-body" lang="en" xmlns:ng="http://angularjs.org">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name='layout' content='main' />
</head>
<body>
<h2>Messages</h2>
<table class="messages">
    <thead>
    <th>ID</th>
    <th>Message</th>
    <th>Date Created</th>
    </thead>
<g:each var="message" in="${messages}">
  <tr>
    <td>${message.id}</td>
    <td>${message.message}</td>
    <td>${message.dateCreated}</td>
  </tr>
</g:each>
</table>
</body>
</html>
