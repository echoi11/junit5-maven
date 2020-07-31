# junit5-maven

sample java project demonstrating execution of junit test with maven
- includes reporting in html
- includes XREF linking allowing user to view source code of test class in unit test report

after cloning this repo, run tests using "mvn test site"

Be sure JAVA_HOME is set in your environment.

3 tests will execute with 1 failure (this is intentional)

The test results can be viewed in ../target/site/index.html

Goto Project Reports > Surefire Report , scroll down to Failure Details, click on link to failed test case MyTestCase to see source code of failing test.
