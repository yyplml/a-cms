//angular.module("a.cms.ui", []).directive("dataGrid", function($log) {
//	return {
//		restrict : 'AE',
//		transclud : true,
//		templateUrl : './template/data-grid.html',
//		scope : {
//			dataList : "="
//		},
//		compile : function compiled(tElement, tAttrs, transclude) {
//			return {
//				pre : function preLink(scope, iElement, iAttrs, controller) {
//				},
//				post : function postList(scope, iElement, iAttrs, controller) {
//				}
//			};
//		}
//	};
//});

function dataGridCtrl($scope, $log) {
	$scope.dataList = [ {
		id : 1,
		title : "test",
		title2 : "test",
		title3 : "test",
		title4 : "test",
		title5 : "test",
		title6 : {
			aa : "test aa"
		},
		title7 : "test",
	} ];
	$scope.tableHeads = [];
	for ( var key in $scope.dataList[0]) {
		if (typeof ($scope.dataList[0][key]) === "object"
				|| typeof ($scope.dataList[0][key]) === "function")
			continue;
		$scope.tableHeads.push(key);
	}
	$scope.save = function(item) {
		item.$editing = false;

	};
}