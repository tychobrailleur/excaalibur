'use strict';

angular.module('app', []).controller('AppController', ['$scope', function($scope) {
    $scope.form = { simpleRadio: 'one' };
    $scope.updateRadio = function() {
        console.log($scope.form.simpleRadio);
    };
}]);
