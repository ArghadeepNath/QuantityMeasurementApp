pipeline {
agent any

```
tools {
    maven 'Maven'
    nodejs 'NodeJS'
}

stages {

    stage('Clone') {
        steps {
            git 'https://github.com/ArghadeepNath/QuantityMeasurementApp.git'
        }
    }

    stage('Backend Build') {
        steps {
            dir('backend') {
                sh 'mvn clean install'
            }
        }
    }

    stage('Frontend Build') {
        steps {
            dir('frontend') {
                sh 'npm install'
                sh 'npm run build'
            }
        }
    }
}
```

}
