## Http Checker

### WHAT IT IS:

This is a simple rest client that checks public ip using amazon check ip service `http://checkip.amazonaws.com/`. 

Also TWO tests are included to test scenario http 404 error:
* `AmazonCheckIpClientWireMockTest` uses wiremock utility to mock amazon endpoint.
* `AmazonCheckIpClientMockTest` simply mocks rest client with mockito utility.

Both application and tests are written using spring-boot and maven.

### REQUIREMENTS:
Http Checker requires:
* Mac-OSx
* Java 8
* Curl

#### WHY?
* Script was developed using my personal MacBook laptop.
* Java and Curl require admin privileges to be installed.

### HOW TO RUN THE TESTS:
1. FIRST, Run ```./get_maven.sh``` and it will setup maven.
2. SECOND, Run ```mvn test``` to run the tests.

### OBSERVATIONS:
* If ```./get_maven.sh``` fails to add maven to your local path, then it can be executed as following ```target/apache-maven-3.6.1/bin/mvn test```.

### EXAMPLE LOGS FOR TEST:
``` bash
➜  http-checker mvn test            
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< com.evpn:http-checker >------------------------
[INFO] Building http-checker 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ http-checker ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ http-checker ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ http-checker ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ http-checker ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/jmcruz/Code/http-checker/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ http-checker ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest
19:46:13.663 [main] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]
19:46:13.668 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
19:46:13.675 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
19:46:13.699 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
19:46:13.726 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest], using SpringBootContextLoader
19:46:13.731 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]: class path resource [com/evpn/httpchecker/client/AmazonCheckIpClientWireMockTest-context.xml] does not exist
19:46:13.732 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]: class path resource [com/evpn/httpchecker/client/AmazonCheckIpClientWireMockTestContext.groovy] does not exist
19:46:13.733 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]: no resource found for suffixes {-context.xml, Context.groovy}.
19:46:13.734 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]: AmazonCheckIpClientWireMockTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
19:46:13.825 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]
19:46:13.932 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/Users/jmcruz/Code/http-checker/target/classes/com/evpn/httpchecker/HttpChecker.class]
19:46:13.933 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.evpn.httpchecker.HttpChecker for test class com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest
19:46:14.028 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]: using defaults.
19:46:14.029 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.cloud.contract.wiremock.WireMockTestExecutionListener]
19:46:14.042 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.transaction.TransactionalTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttributeSource]
19:46:14.043 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttribute]
19:46:14.043 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@4567f35d, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@5ffead27, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@6356695f, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@4f18837a, org.springframework.test.context.support.DirtiesContextTestExecutionListener@359f7cdf, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@1fa268de, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@4f6ee6e4, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@4466af20, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@a514af7, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@6b927fb, org.springframework.cloud.contract.wiremock.WireMockTestExecutionListener@3e58a80e]
19:46:14.046 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]
19:46:14.046 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]
19:46:14.048 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]
19:46:14.048 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]
19:46:14.050 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]
19:46:14.052 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest]
19:46:14.064 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@72d1ad2e testClass = AmazonCheckIpClientWireMockTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@2d7275fc testClass = AmazonCheckIpClientWireMockTest, locations = '{}', classes = '{class com.evpn.httpchecker.HttpChecker}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{AmazonCheckIp.url=http://localhost:9090/version, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}', contextCustomizers = set[[ImportsContextCustomizer@399f45b1 key = [org.springframework.cloud.contract.wiremock.WireMockConfiguration, org.springframework.cloud.contract.wiremock.WireMockRestTemplateConfiguration]], org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@7113b13f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6043cd28, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@87f383f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@810a2acb, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@7cbd213e], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> false]], class annotated with @DirtiesContext [true] with mode [AFTER_CLASS].
19:46:14.114 [main] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, AmazonCheckIp.url=http://localhost:9090/version, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}
  _       _     _                            _                     _
 | |__   | |_  | |_   _ __             ___  | |__     ___    ___  | | __   ___   _ __
 | '_ \  | __| | __| | '_ \   _____   / __| | '_ \   / _ \  / __| | |/ /  / _ \ | '__|
 | | | | | |_  | |_  | |_) | |_____| | (__  | | | | |  __/ | (__  |   <  |  __/ | |
 |_| |_|  \__|  \__| | .__/           \___| |_| |_|  \___|  \___| |_|\_\  \___| |_|
                     |_|

Version: 1.0.0

2019-08-24 19:46:14.508  INFO 8052 --- [           main] c.e.h.c.AmazonCheckIpClientWireMockTest  : Starting AmazonCheckIpClientWireMockTest on Juans-MBP.local.tld with PID 8052 (started by jmcruz in /Users/jmcruz/Code/http-checker)
2019-08-24 19:46:14.510  INFO 8052 --- [           main] c.e.h.c.AmazonCheckIpClientWireMockTest  : No active profile set, falling back to default profiles: default
2019-08-24 19:46:14.929  INFO 8052 --- [           main] c.e.h.client.AmazonCheckIpClient         : AmazonCheckIpClient constructed
2019-08-24 19:46:14.932  INFO 8052 --- [           main] c.e.h.client.AmazonCheckIpClient         : Constructed bean for RestTemplate
2019-08-24 19:46:15.343  INFO 8052 --- [           main] wiremock.org.eclipse.jetty.util.log      : Logging initialized @2042ms
2019-08-24 19:46:15.720  INFO 8052 --- [           main] w.org.eclipse.jetty.server.Server        : jetty-9.2.z-SNAPSHOT
2019-08-24 19:46:15.747  INFO 8052 --- [           main] w.o.e.j.server.handler.ContextHandler    : Started w.o.e.j.s.ServletContextHandler@726a17c4{/__admin,null,AVAILABLE}
2019-08-24 19:46:15.751  INFO 8052 --- [           main] w.o.e.j.server.handler.ContextHandler    : Started w.o.e.j.s.ServletContextHandler@76911385{/,null,AVAILABLE}
2019-08-24 19:46:15.793  INFO 8052 --- [           main] w.o.e.j.s.NetworkTrafficServerConnector  : Started NetworkTrafficServerConnector@2df4348{HTTP/1.1}{0.0.0.0:9090}
2019-08-24 19:46:15.794  INFO 8052 --- [           main] w.org.eclipse.jetty.server.Server        : Started @2494ms
2019-08-24 19:46:15.804  INFO 8052 --- [           main] c.e.h.c.AmazonCheckIpClientWireMockTest  : Started AmazonCheckIpClientWireMockTest in 1.688 seconds (JVM running for 2.504)
2019-08-24 19:46:15.965  INFO 8052 --- [           main] c.e.h.client.AmazonCheckIpClient         : Using url : http://localhost:9090/version
2019-08-24 19:46:16.062  INFO 8052 --- [tp1998882269-21] /                                        : RequestHandlerClass from context returned com.github.tomakehurst.wiremock.http.StubRequestHandler. Normalized mapped under returned 'null'
2019-08-24 19:46:16.298  INFO 8052 --- [tp1998882269-21] WireMock                                 : Request received:
127.0.0.1 - GET /version

User-Agent: [Java/1.8.0_171]
Connection: [keep-alive]
Host: [localhost:9090]
Accept: [text/plain, application/json, application/*+json, */*]



Matched response definition:
{
  "status" : 404
}

Response:
HTTP/1.1 404
Matched-Stub-Id: [b66520f0-cba8-448c-87a1-8484ab4d53a1]


2019-08-24 19:46:16.315  WARN 8052 --- [           main] o.s.c.c.w.WireMockTestExecutionListener  : You've used fixed ports for WireMock setup - will mark context as dirty. Please use random ports, as much as possible. Your tests will be faster and more reliable and this warning will go away
2019-08-24 19:46:16.340  INFO 8052 --- [           main] w.o.e.j.s.NetworkTrafficServerConnector  : Stopped NetworkTrafficServerConnector@2df4348{HTTP/1.1}{0.0.0.0:9090}
2019-08-24 19:46:16.343  INFO 8052 --- [           main] w.o.e.j.server.handler.ContextHandler    : Stopped w.o.e.j.s.ServletContextHandler@76911385{/,null,UNAVAILABLE}
2019-08-24 19:46:16.343  INFO 8052 --- [           main] w.o.e.j.server.handler.ContextHandler    : Stopped w.o.e.j.s.ServletContextHandler@726a17c4{/__admin,null,UNAVAILABLE}
2019-08-24 19:46:16.344  WARN 8052 --- [           main] w.o.e.j.util.thread.QueuedThreadPool     : qtp1998882269{STOPPING,8<=8<=10,i=1,q=4} Couldn't stop Thread[qtp1998882269-22,5,]
2019-08-24 19:46:16.346  WARN 8052 --- [           main] w.o.e.j.util.thread.QueuedThreadPool     : qtp1998882269{STOPPING,8<=8<=10,i=0,q=4} Couldn't stop Thread[qtp1998882269-17,5,]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.827 s - in com.evpn.httpchecker.client.AmazonCheckIpClientWireMockTest
[INFO] Running com.evpn.httpchecker.client.AmazonCheckIpClientMockTest
2019-08-24 19:46:16.377  INFO 8052 --- [           main] c.e.h.client.AmazonCheckIpClient         : AmazonCheckIpClient constructed
2019-08-24 19:46:16.745  INFO 8052 --- [           main] c.e.h.client.AmazonCheckIpClient         : Using url : http://checkip.amazonaws.com/
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.358 s - in com.evpn.httpchecker.client.AmazonCheckIpClientMockTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.719 s
[INFO] Finished at: 2019-08-24T19:46:17-04:00
[INFO] ------------------------------------------------------------------------
```
