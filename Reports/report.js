$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/LoginInPage.feature");
formatter.feature({
  "name": "Verify the Everlane login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User verify the everlane signin with valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter the everlane home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_enter_the_everlane_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_enter_the_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successfully signin to place the order",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_successfully_signin_to_place_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the search button in home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_click_the_search_button_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the product name in search box",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_enter_the_product_name_in_search_box()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for text (\u0027Jeans\u0027) to be present in element found by By.xpath: (//*[@type\u003d\u0027search\u0027])[1] (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PRAVEEN\u0027, ip: \u0027192.168.43.184\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\JAYAPR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:64832}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 4b60cef5c934c4af846c0f962d91fb26\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.stepdefinition.LoginPage.user_enter_the_product_name_in_search_box(LoginPage.java:71)\r\n\tat ✽.User enter the product name in search box(src/test/resources/LoginInPage.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click the product",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_click_the_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click the add to bag options",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_click_the_add_to_bag_options()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});