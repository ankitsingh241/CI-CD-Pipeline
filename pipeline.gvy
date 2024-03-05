pipeline {
    agent any
    stages{
        stage("Clone Code") {
            steps {
                echo "Cloing the code from github."
                git url:"https://github.com/ankitsingh241/CI-CD-Pipeline.git"
            }
        }
        stage("Build") {
            steps {
                echo "Building the image."
                sh "docker build -t my_website ."
            }
        }
        stage("Deploy") {
            steps {
                echo "Deploying the container."
                sh "docker run -d --name testwebsite -p 80:80 my_website"
            }
        }
    }
}