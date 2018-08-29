//Jenkinsfile (Declarative Pipeline)
pipelines{
        agent any
    stages {
        stage('Example') {
            steps {
                 echo 'Hola ! esto es un JenkinsFile de prueba.\n Poco a poco se iran añadiendo pasos con distintas funcionalidades '
            }
        }
    }
 }
