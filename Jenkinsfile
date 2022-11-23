pipeline {
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/jenkins-docker']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ankitkumaro632/bellurbis']]])
                bat 'mvn clean install'
            }
        }
         stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t akbb001/springboot-jenkins-pipeline .'
                }
            }
        }
         stage('Push image to DockerHub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'docker-hub-jenkins', variable: 'dockerjenkins')]) {
                   bat 'docker login -u akbb001 -p Ak@docker001'

}
                   bat 'docker push akbb001/springboot-jenkins-pipeline'
                }
            }
        }
    }
