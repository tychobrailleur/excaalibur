<!DOCTYPE html>
<html class="no-js landing-alt-body" lang="en" xmlns:ng="http://angularjs.org">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <asset:javascript src="angular.min.js" />
    <asset:javascript src="main.js" />
    <meta name='layout' content='main' />
</head>
<body ng-app="AppController">
    <h3>Some UTF-8 characters beyond the latin characters &amp; symbols</h3>
    
    <div ng-include="'header.tpl.html'"></div>
    <p>This is → a test</p>
    <p>This is a Euro symbol: €</p>
    <p>This is a non-breakable space: </p>
</body>
</html>
