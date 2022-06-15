# android-tasks
An Android implementation of java-tasks

## Java Tasks
See [Java Tasks](https://github.com/DevReborn/java-tasks) for details on how to use tasks

## Setup
In your apps build.gradle file, include the following in the depedency section
```gradle
implementation 'io.github.devreborn:android-tasks:1.0.0'
```
Thats it! No extra setup is needed. The `Tasks` functionality in java-tasks will automatically detect that you're on android and load the correct `ITaskFactory`
