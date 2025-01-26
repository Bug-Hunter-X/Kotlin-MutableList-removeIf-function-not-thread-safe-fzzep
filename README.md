# Kotlin MutableList removeIf Thread Safety Issue

This repository demonstrates a common thread safety issue with the `removeIf` function on `MutableList` in Kotlin.  The `removeIf` function modifies the list directly, leading to unexpected behavior when used in concurrent scenarios.

The `bug.kt` file contains the problematic code, showing how the `removeIf` function modifies the original list.  The `bugSolution.kt` file offers a solution using a synchronized block to ensure thread safety.

## How to Reproduce

1. Clone the repository.
2. Run `bug.kt`. Observe the modified list.
3. Run and compare the result with `bugSolution.kt` which demonstrates how to resolve this by adding synchronization.