
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
                git 'https://github.com/jitpack/maven-simple.git'

            }
        }
    }
}

