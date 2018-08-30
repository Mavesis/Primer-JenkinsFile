
pipeline {
    agent any
    tools{
        maven 'maven3.5.0'
    }
    stages { 
        stage('Primera fase') {
            steps {
                echo 'Este ya no es mi primer JenkinsFile y ahora estoy en una rama nueva, juguemos con ramas'
            }
        }
        stage('Segunda fase'){
            steps{
                echo' Ahora vamos a descargar un proyecto MAVEN'
                git 'https://github.com/jitpack/maven-simple.git'

            }
        }
        stage('Tercera fase') {
            steps{
                echo'Ahora vamos a construir el proyecto MAVEN'
                bat 'mvn clean install '
            }
        }
    }
}

