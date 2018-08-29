
pipeline {
    agent any
    tools{
        maven 'maven3.5.0'
    }
    stages { 
        stage('Primera fase') {
            steps {
                echo 'Este es mi primer JenkinsFile'
                sh 'mkdir NuevaCarpeta'
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

