pipeline {
  agent any
  stages {
    stage('BlueOcean-JenkinsFile') {
      steps {
        echo 'Primer Mensaje en una RAMA'
        build(job: 'maven_simple', quietPeriod: 1)
      }
    }
  }
}