//Jenkinsfile (Declarative Pipeline)
pipelines{
    stages{
        stage('Mi primer JenkinsFile'){
            steeps{
                echo 'Hola ! esto es un JenkinsFile de prueba.\n Poco a poco se iran añadiendo pasos con distintas funcionalidades '
            }
        }
    }
}