pipeline {
  agent any
  stages {
    stage('BlueOcean-JenkinsFile') {
      steps {
        echo 'Primer Mensaje'
        build(job: 'maven_simple', quietPeriod: 1)
      }
    }
  }
}