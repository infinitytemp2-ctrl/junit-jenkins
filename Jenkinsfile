pipeline {
    agent any

    stages {
        stage ('Checkout') {
            steps {
                checkout scm
            }
        }

        stage ('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage ('Test'){
            bat 'mvn clean test'
        }
    }
}