Simple reproducer for Firebase Android SDK bug [#5972](https://github.com/firebase/firebase-android-sdk/issues/5972).

```shell
./gradlew lintDebug
```

<details>
<summary>Output</summary>

    ..
    FAILURE: Build failed with an exception.
    
    * What went wrong:
      Execution failed for task ':core:lintDebug'.
    > Lint found errors in the project; aborting build.
    
    Fix the issues identified by lint, or create a baseline to see only new errors.
    To create a baseline, run `gradlew updateLintBaseline` after adding the following to the module's build.gradle file:
      ```
      android {
          lint {
              baseline = file("lint-baseline.xml")
          }
      }
      ```
    For more details, see https://developer.android.com/studio/write/lint#snapshot
    
    core/build.gradle.kts: Error: All gms/firebase libraries must use the exact same version specification (mixing versions can lead to runtime crashes). Found versions 21.0.0, 2.0.0, 19.0.0, 18.3.0, 18.1.0, 18.0.2, 18.0.1, 18.0.0, 17.1.1, 17.0.0, 16.2.0, 16.0.0. Examples include com.google.firebase:firebase-common-ktx:21.0.0 and com.google.firebase:firebase-sessions:2.0.0 [GradleCompatible]
    
         Explanation for issues of type "GradleCompatible":
         There are some combinations of libraries, or tools and libraries, that are
         incompatible, or can lead to bugs. One such incompatibility is compiling
         with a version of the Android support libraries that is not the latest
         version (or in particular, a version lower than your targetSdkVersion).
    
    1 errors, 0 warnings
    ..
</details>