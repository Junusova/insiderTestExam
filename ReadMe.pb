How to run in local browser :
1. Via Gradle job using : ./gradlew clean -i test
2. Via Gradle job : verification -> test
3. Via JUnit : click Run icon

How to run in selenoid :
1. Install selenoid in local machine
2. Run GUI
3. In the tes tests add after test class name "extends BaseClass"
4. Run tests
5. Open selenoid UI in your browser by default it in localhost:8080

How to get report
1. After all test has finished - open Gradle - insiderUI-> verification -> allureServe
2. Open in browser created url in terminal
3. All reports with logs and screenshots