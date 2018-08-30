pipeline {
  agent any
  stages {
    stage('BUILD & ANALYSIS Maven_simple') {
      steps {
        echo 'Primer Mensaje en una RAMA'
        build(job: 'maven_simple', quietPeriod: 1)
      }
    }
  stage('DOWNLOAD & BUILD') {
     tools{
       maven 'maven3.5.0'
     }
     steps {
       echo '\n       PASO 2 \n\n'
       echo'-------------------------------------------------------------------------------------------------'
       echo 'En este paso vamos a descargar el proyecto maven_simple de un repositorio git y a construirlo\n'
       echo'-------------------------------------------------------------------------------------------------'
       git 'https://github.com/jitpack/maven-simple.git'
       bat "C:\sonar-scanner\bin\sonar-scanner.bat -X"
       

       
      }
    }
  }
}