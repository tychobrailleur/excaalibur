'use strict';

angular.module('app', []).controller('AppController', ['$scope', function($scope) {
    $scope.form = { simpleRadio: 'one' };
    $scope.updateRadio = function(form) {
        console.log(form.simpleRadio);
    };
}]);
