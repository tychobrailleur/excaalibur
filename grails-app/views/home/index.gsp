<!DOCTYPE html>
<html ng-app class="no-js landing-alt-body" lang="en" xmlns:ng="http://angularjs.org">
  <head>
    <asset:javascript src="angular.min.js" />
    <asset:javascript src="application.js" />
    <meta name="layout" content="main" />
  </head>
  <body ng-controller="AppController">
    <div>
      <h3>Some UTF-8 characters beyond the latin characters &amp; symbols</h3>

      <div ng-include="'header.tpl.html'"></div>
      <p>This is → a test</p>
      <p>This is a Euro symbol: €</p>
      <p>This is a non-breakable space: </p>

      <div id="simplie-radio">
        <input id="one" type="radio" name="simpleRadio" value="one" ng-model="form.simpleRadio"><label for="one">One</label>
        <input id="two" type="radio" name="simpleRadio" value="two" ng-model="form.simpleRadio"><label for="two">Two</label>
        <input id="three" type="radio" name="simpleRadio" value="three" ng-model="form.simpleRadio"><label for="three">Three</label>

        <button ng-click="updateRadio()">Ok!</button>
      </div>
      <p>{{ form.simpleRadio }}</p>
    </div>
  </body>
</html>
