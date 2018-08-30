pipeline {
  agent any
  stages {
    stage('Construcción proyecto Maven_simple') {
      steps {
        echo 'Primer Mensaje en una RAMA'
        build(job: 'maven_simple', quietPeriod: 1)
      }
    }
  }
}