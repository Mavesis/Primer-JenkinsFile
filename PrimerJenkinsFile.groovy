
pipeline {
    agent any
    stages { 
        stage('Primera fase') {
            steps {
                echo 'Este es mi primer JenkinsFile'
            }
        }
        stage('Segunda fase'){
            steps{
                echo' Ahora vamos a descargar un proyecto MAVEN'
                git 'https://github.com/jenkinsci/pipeline-examples.git'

            }
        }
        stage('Tercera fase') {
            steps{
                echo'Ahora vamos a construir el proyecto MAVEN'
                sh 'mvn --verson'
            }
        }
    }
}

