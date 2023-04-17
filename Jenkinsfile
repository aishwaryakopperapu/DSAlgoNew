pipeline {
    agent any
    
    //tools{
        //maven 'maven_3_9_1'
        //jdk 'jdk17'
    //}
    stages {
        stage('Init'){
            steps{
                sh '''
                env | grep -e PATH -e JAVA_HOME
                which java
                java -version
                '''
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean'
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test -Dheadless=true'
            }
        }
    }
}