
pipeline {
    agent any
    tools{
        maven 'maven3.5.0'
    }
    stages { 
        stage('Primera fase') {
            steps {
                echo 'Este es mi primer JenkinsFile'
            }
        }
        stage('Segunda fase -> DESCARGA'){
            steps{
                echo' Ahora vamos a descargar un proyecto MAVEN'
                git 'https://github.com/jitpack/maven-simple.git'

            }
        } stage('Tercera fase -> CONSTRUCCION'){
            steps{
                sh 'mvn clean install'
            }
        }
    }
}

