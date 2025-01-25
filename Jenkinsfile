pipeline {
    agent any
    tools{
        maven 'maven_3_8_8'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/puneeth0/spring-demo']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t puneeth0/spring-demo .'
                }
            }
        }
        stage('Push docker image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u puneeth0 -p puni@P4175'
                    }
                    bat 'docker push puneeth0/spring-demo'
                }
            }
        }
    }
}