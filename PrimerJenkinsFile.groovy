
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
                echo' Ahora vamos a descargar el proyecto pipeline-examples'
                git 'https://github.com/jenkinsci/pipeline-examples.git'

            }
        }
    }
}

