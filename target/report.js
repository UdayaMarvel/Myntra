$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Myntra.feature");
formatter.feature({
  "name": "com.myntra.men",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the myntra url \"https://www.myntra.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_gets_the_myntra_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating men module",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user search for mens clothing with one dim map",
  "rows": [
    {
      "cells": [
        "first search",
        "womens clothing"
      ]
    },
    {
      "cells": [
        "second",
        "mens clothing"
      ]
    },
    {
      "cells": [
        "third",
        "kids clothing"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_search_for_mens_clothing_with_one_dim_map(DataTable)"
});
formatter.result({
  "error_message": "java.net.UnknownHostException: www.myntra.com\r\n\tat java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:567)\r\n\tat java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:327)\r\n\tat java.base/java.net.Socket.connect(Socket.java:633)\r\n\tat java.base/sun.security.ssl.SSLSocketImpl.connect(SSLSocketImpl.java:304)\r\n\tat java.base/sun.security.ssl.BaseSSLSocketImpl.connect(BaseSSLSocketImpl.java:174)\r\n\tat java.base/sun.net.NetworkClient.doConnect(NetworkClient.java:183)\r\n\tat java.base/sun.net.www.http.HttpClient.openServer(HttpClient.java:532)\r\n\tat java.base/sun.net.www.http.HttpClient.openServer(HttpClient.java:637)\r\n\tat java.base/sun.net.www.http.HttpClient.parseHTTP(HttpClient.java:780)\r\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream0(HttpURLConnection.java:1688)\r\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1589)\r\n\tat java.base/java.net.HttpURLConnection.getResponseCode(HttpURLConnection.java:529)\r\n\tat java.base/sun.net.www.protocol.https.HttpsURLConnectionImpl.getResponseCode(HttpsURLConnectionImpl.java:308)\r\n\tat com.myntra.men_stepdefinition.Men_Module.user_search_for_mens_clothing_with_one_dim_map(Men_Module.java:80)\r\n\tat ✽.user search for mens clothing with one dim map(./src/test/resources/Myntra.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on men",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_clicks_on_men()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the deals displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Men_Module.validate_the_deals_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d110.0.5481.178)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-BPGMTVT\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.178, chrome: {chromedriverVersion: 110.0.5481.77 (65ed616c6e8e..., userDataDir: C:\\Users\\ADMIN\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54451}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 32f892265e0ac9251da2e2245788b523\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.myntra.men_stepdefinition.Hooks.stop(Hooks.java:22)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:48)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded1.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the myntra url \"https://www.myntra.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_gets_the_myntra_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating men module",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user search for mens clothing with one dim map",
  "rows": [
    {
      "cells": [
        "first search",
        "womens clothing"
      ]
    },
    {
      "cells": [
        "second",
        "mens clothing"
      ]
    },
    {
      "cells": [
        "third",
        "kids clothing"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_search_for_mens_clothing_with_one_dim_map(DataTable)"
});
formatter.result({
  "error_message": "java.net.UnknownHostException: www.myntra.com\r\n\tat java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:567)\r\n\tat java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:327)\r\n\tat java.base/java.net.Socket.connect(Socket.java:633)\r\n\tat java.base/sun.security.ssl.SSLSocketImpl.connect(SSLSocketImpl.java:304)\r\n\tat java.base/sun.security.ssl.BaseSSLSocketImpl.connect(BaseSSLSocketImpl.java:174)\r\n\tat java.base/sun.net.NetworkClient.doConnect(NetworkClient.java:183)\r\n\tat java.base/sun.net.www.http.HttpClient.openServer(HttpClient.java:532)\r\n\tat java.base/sun.net.www.http.HttpClient.openServer(HttpClient.java:637)\r\n\tat java.base/sun.net.www.http.HttpClient.parseHTTP(HttpClient.java:780)\r\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream0(HttpURLConnection.java:1688)\r\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1589)\r\n\tat java.base/java.net.HttpURLConnection.getResponseCode(HttpURLConnection.java:529)\r\n\tat java.base/sun.net.www.protocol.https.HttpsURLConnectionImpl.getResponseCode(HttpsURLConnectionImpl.java:308)\r\n\tat com.myntra.men_stepdefinition.Men_Module.user_search_for_mens_clothing_with_one_dim_map(Men_Module.java:80)\r\n\tat ✽.user search for mens clothing with one dim map(./src/test/resources/Myntra.feature:25)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on men",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_clicks_on_men()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the deals displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Men_Module.validate_the_deals_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded3.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the myntra url \"https://www.myntra.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_gets_the_myntra_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating men module",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user search for mens clothing with one dim map",
  "rows": [
    {
      "cells": [
        "first search",
        "womens clothing"
      ]
    },
    {
      "cells": [
        "second",
        "mens clothing"
      ]
    },
    {
      "cells": [
        "third",
        "kids clothing"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_search_for_mens_clothing_with_one_dim_map(DataTable)"
});
formatter.result({
  "error_message": "java.net.UnknownHostException: www.myntra.com\r\n\tat java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:567)\r\n\tat java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:327)\r\n\tat java.base/java.net.Socket.connect(Socket.java:633)\r\n\tat java.base/sun.security.ssl.SSLSocketImpl.connect(SSLSocketImpl.java:304)\r\n\tat java.base/sun.security.ssl.BaseSSLSocketImpl.connect(BaseSSLSocketImpl.java:174)\r\n\tat java.base/sun.net.NetworkClient.doConnect(NetworkClient.java:183)\r\n\tat java.base/sun.net.www.http.HttpClient.openServer(HttpClient.java:532)\r\n\tat java.base/sun.net.www.http.HttpClient.openServer(HttpClient.java:637)\r\n\tat java.base/sun.net.www.protocol.https.HttpsClient.\u003cinit\u003e(HttpsClient.java:266)\r\n\tat java.base/sun.net.www.protocol.https.HttpsClient.New(HttpsClient.java:380)\r\n\tat java.base/sun.net.www.protocol.https.AbstractDelegateHttpsURLConnection.getNewHttpClient(AbstractDelegateHttpsURLConnection.java:193)\r\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.plainConnect0(HttpURLConnection.java:1242)\r\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:1128)\r\n\tat java.base/sun.net.www.protocol.https.AbstractDelegateHttpsURLConnection.connect(AbstractDelegateHttpsURLConnection.java:179)\r\n\tat java.base/sun.net.www.protocol.https.HttpsURLConnectionImpl.connect(HttpsURLConnectionImpl.java:142)\r\n\tat com.myntra.men_stepdefinition.Men_Module.user_search_for_mens_clothing_with_one_dim_map(Men_Module.java:79)\r\n\tat ✽.user search for mens clothing with one dim map(./src/test/resources/Myntra.feature:39)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on men",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_clicks_on_men()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the deals displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Men_Module.validate_the_deals_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validating men module",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user search for mens clothing \"\u003cSearch\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on men",
  "keyword": "And "
});
formatter.step({
  "name": "validate the deals displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Search"
      ]
    },
    {
      "cells": [
        "womens clothing"
      ]
    },
    {
      "cells": [
        "mens clothing"
      ]
    },
    {
      "cells": [
        "kids clothing"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded5.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the myntra url \"https://www.myntra.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_gets_the_myntra_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating men module",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user search for mens clothing \"womens clothing\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_search_for_mens_clothing(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on men",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_clicks_on_men()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the deals displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Men_Module.validate_the_deals_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded7.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the myntra url \"https://www.myntra.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_gets_the_myntra_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating men module",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user search for mens clothing \"mens clothing\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_search_for_mens_clothing(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on men",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_clicks_on_men()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the deals displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Men_Module.validate_the_deals_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded8.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded9.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the myntra url \"https://www.myntra.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_gets_the_myntra_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating men module",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user search for mens clothing \"kids clothing\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Men_Module.user_search_for_mens_clothing(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d110.0.5481.178)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-BPGMTVT\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.178, chrome: {chromedriverVersion: 110.0.5481.77 (65ed616c6e8e..., userDataDir: C:\\Users\\ADMIN\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60551}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: dd8e6ed0d0abad39dc3976b10c1ff8ca\n*** Element info: {Using\u003dxpath, value\u003d//input[@placeholder\u003d\u0027Search for products, brands and more\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.sendKeys(Unknown Source)\r\n\tat com.myntra.commonaction.CommonFunction.sendValue(CommonFunction.java:46)\r\n\tat com.myntra.men_stepdefinition.Men_Module.user_search_for_mens_clothing(Men_Module.java:113)\r\n\tat ✽.user search for mens clothing \"kids clothing\"(./src/test/resources/Myntra.feature:53)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on men",
  "keyword": "And "
});
formatter.match({
  "location": "Men_Module.user_clicks_on_men()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the deals displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Men_Module.validate_the_deals_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d110.0.5481.178)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-BPGMTVT\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.178, chrome: {chromedriverVersion: 110.0.5481.77 (65ed616c6e8e..., userDataDir: C:\\Users\\ADMIN\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60551}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: dd8e6ed0d0abad39dc3976b10c1ff8ca\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.myntra.men_stepdefinition.Hooks.stop(Hooks.java:22)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:48)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
});ls_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png");
formatter.after({
  "status": "passed"
});
});