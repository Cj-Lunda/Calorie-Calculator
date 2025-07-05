# Calorie Calculator

A simple Java GUI application to calculate Basal Metabolic Rate (BMR), calorie surplus, and calorie deficit.

## Prerequisites

* Java Development Kit (JDK) 8 or higher
* JUnit 5.13.3 JAR files (included in `lib` folder)

## Project Structure

```
Calorie Calculator/
├── .git/
├── bin/
│   └── .gitkeep
├── lib/
│   ├── apiguardian-api-1.1.2.jar
│   ├── junit-jupiter-api-5.13.3.jar
│   ├── junit-jupiter-engine-5.13.3.jar
│   ├── junit-platform-console-standalone-1.13.3.jar
│   └── opentest4j-1.3.0.jar
├── src/
│   ├── AppTest.java
│   ├── CalorieApp.java
│   ├── InputGui.java
│   └── OutputGui.java
├── README.md
└── .gitignore
```

## Running Tests

### 🪟 Windows

#### Compile:

```
javac -d bin -cp "lib\junit-platform-console-standalone-1.13.3.jar" src\*.java
```

#### Run Tests:

```
java -jar lib\junit-platform-console-standalone-1.13.3.jar --class-path "bin;lib\junit-platform-console-standalone-1.13.3.jar" --scan-class-path
```

#### Clean (Command Prompt):

```
del /Q bin\*.class
```

#### Clean (PowerShell):

```
rm bin\*.class
```

### 🐧 Linux / Mac

#### Compile:

```
javac -d bin -cp "lib/junit-platform-console-standalone-1.13.3.jar" src/*.java
```

#### Run Tests:

```
java -jar lib/junit-platform-console-standalone-1.13.3.jar --class-path "bin:lib/junit-platform-console-standalone-1.13.3.jar" --scan-class-path
```

#### Clean:

```
rm bin/*.class
```

## Running the Application (CalorieApp)

### 🪟 Windows

#### Compile:

```
javac -d bin src\*.java
```

#### Run:

```
java -cp bin CalorieApp
```

#### Clean (Command Prompt):

```
del /Q bin\*.class
```

#### Clean (PowerShell):

```
rm bin\*.class
```

### 🐧 Linux / Mac

#### Compile:

```
javac -d bin src/*.java
```

#### Run:

```
java -cp bin CalorieApp
```

#### Clean:

```
rm bin/*.class
```
