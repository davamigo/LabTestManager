# LabTestManager

**Github:** [davamigo/LabTestManager](https://github.com/davamigo/LabTestManager)

Proof of concept of a Lab Test Manager

## Run tests

### Linux/MacOS

```shell
./gradlew :test
```

## Test available

Find the functional tests in: [FunctionalTests,java](./src/test/java/com/davamigo/lis/testmanager/functional/FunctionalTests.java)

- `testOrderWithBloodSampleAndOneGlucoseTest`
- `testOrderWithUrineSampleAndOneGlucoseTest`
- `testOrderWithBloodSampleAndOnePotassiumTest`
- `testWhenThereIsNoOperationForTheTestAndSample`
- `testOrderWithBloodSampleAndSodiumAndPotassiumAndGlucoseTest`
