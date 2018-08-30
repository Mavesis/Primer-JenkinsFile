pipeline {
  agent any
  stages {
    echo '\n\n============ ESTAMOS EN LA RAMA 1 ============\n\n'
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
       echo 'En este paso vamos a descargar el proyecto maven_simple de un repositorio git y a construirlo\n'
       git 'https://github.com/jitpack/maven-simple.git'
       bat "mvn clean install"
       
      }
    }
  }
}