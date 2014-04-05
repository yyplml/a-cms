angular.module(
		"app",
		[ "ngRoute" ],
		function($routeProvider, $locationProvider) {

			var systemConfig = {
				adminLocationRootPath : "",
				adminContentRootPath : "."
			};
			jQuery.cachedScript = function(url, options) {

				// Allow user to set any option except for dataType, cache, and
				// url
				options = $.extend(options || {}, {
					dataType : "script",
					cache : true,
					url : url
				});

				// Use $.ajax() since it is more flexible than $.getScript
				// Return the jqXHR object so we can chain callbacks
				return jQuery.ajax(options); 
			};


			$routeProvider.when(
					systemConfig.adminLocationRootPath + '/system-setting',
					{
						templateUrl : systemConfig.adminContentRootPath
								+ '/view/system-setting.html',
						controller : "systemSettingCtrl",
						resolve : {
							delay : function($q, $timeout, $rootScope) {
								var delay = $q.defer();
								$.cachedScript(
										systemConfig.adminContentRootPath
												+ "/ctrl/system-setting.js")
										.done(function(script, textStatus) {
											delay.resolve();
										});

								return delay.primise;
							}
						}
					}).otherwise({
				redirectTo : "/"
			}).when(
					systemConfig.adminLocationRootPath + '/change-password',
					{
						templateUrl : systemConfig.adminContentRootPath
								+ '/view/change-password.html',
						controller : "systemSettingCtrl",
						resolve : {
							delay : function($q, $timeout, $rootScope) {
								var delay = $q.defer();
								$.cachedScript(
										systemConfig.adminContentRootPath
												+ "/ctrl/change-password.js")
										.done(function() {
											delay.resolve();
										});

								return delay.primise;
							}
						}
					}).otherwise({
				redirectTo : "/"
			});

			$locationProvider.html5Mode(true);

		}).controller("mainCtrl", function($route, $routeParams, $location) {
	this.$route = $route;
	this.$location = $location;
	this.$routeParams = $routeParams;
});