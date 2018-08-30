pipeline {
  agent any
  stages {
    stage('BUILD Maven_simple') {
      steps {
        echo 'Primer Mensaje en una RAMA'
        build(job: 'maven_simple', quietPeriod: 1)
      }
    }
  }
}