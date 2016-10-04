<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html ng-app="app" lang="en" class="no-js"><!--<![endif]-->
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title><g:layoutTitle default="Grails"/></title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
	<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
	<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">
  	<asset:stylesheet src="main.css"/>
    <asset:stylesheet src="slider.css"/>
    <asset:stylesheet src="half-slider.css"/>
    <!-- <script src="https://code.jquery.com/jquery-1.11.3.js" type="text/javascript"></script> -->
	<g:layoutHead/>
  </head>
  <body<g:if test="${pageProperty(name:'body.ng-controller')}"> ng-controller="${pageProperty(name:'body.ng-controller')}"</g:if>>
    <div id="header">
      <h1>Excaalibur</h1>
    </div>
    <div id="nav">
      <ul>
        <li><g:link controller="home" action="index">Home</g:link></li></li>
      </ul>
    </div>

	<g:layoutBody/>
	<div class="footer" role="contentinfo"></div>
	<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
  </body>
</html>
