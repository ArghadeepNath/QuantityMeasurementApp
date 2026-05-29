pipeline {
    agent any

    tools {
        maven 'Maven'
        nodejs 'NodeJS'
    }

    stages {

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
}