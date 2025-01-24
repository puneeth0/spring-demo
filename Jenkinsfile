pipeline {
    agent any
    tools{
        maven 'maven_3_8_8'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/puneeth0/spring-demo']]])
                sh 'mvn clean install'
            }
        }
}