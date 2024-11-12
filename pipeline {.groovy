pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                // Pulls code from the Git repository
                git 'https://your-repository-url.git'
            }
        }
        stage('Run Script') {
            steps {
                // Run the Hello World script
                sh './hello_world.sh'
            }
        }
    }
    post {
        always {
            echo 'Pipeline complete!'
        }
    }
}
