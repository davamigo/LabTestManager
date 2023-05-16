# LabTestManager

**Github:** [davamigo/LabTestManager](https://github.com/davamigo/LabTestManager)

Proof of concept of a Lab Test Manager

## Run tests

### Linux/MacOS

```shell
./gradlew :test
```

## Functional test performed

Find the functional tests in: [FunctionalTests,java](./src/test/java/com/davamigo/lis/testmanager/functional/FunctionalTests.java)

- `testOrderWithBloodSampleAndOneGlucoseTest`
    - Performed glucose test (biochemistry) on blood sample in container labeled 7559895548022. Result: 97 mg/100mL.

- `testOrderWithUrineSampleAndOneGlucoseTest`
  - Performed glucose test (biochemistry) on urine sample in container labeled 2795964662047. Result: 170 mg/100mL.

- `testOrderWithBloodSampleAndOnePotassiumTest`
  - Performed potassium test (biochemistry) on blood sample in container labeled 9602409226245. Result: 1.2 mmol/L.

- `testWhenThereIsNoOperationForTheTestAndSample`
  - Performed potassium test (biochemistry) on serum sample in container labeled 5343789971864. Message: No operations found for this test and sample.

- `testOrderWithBloodSampleAndSodiumAndPotassiumAndGlucoseTest`
  - Performed potassium test (biochemistry) on blood sample in container labeled 3123498859478. Result: 3.4 mmol/L.
  - Performed sodium test (biochemistry) on blood sample in container labeled 3123498859478. Result: 152 mmol/L.
  - Performed glucose test (biochemistry) on blood sample in container labeled 3123498859478. Result: 60 mg/100mL.
