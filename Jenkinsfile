@Library('Deepak_shared_lib') _

pipeline {
    agent {
        label 'aws_ec2_ubuntu_label'
    }
    stages{
        
        stage('Clone'){
            steps{
                git 'https://github.com/dipk-mish7/Deepak_shared_lib.git'
            }
        }
        stage('Compile and Testing'){
            steps{
                script{
                    mave_goals.compile()
                    mave_goals.testing()
                }
            }
        }
    }
    post{
        success{
            script{
                mave_goals.publishReports()
            }
        }
    }
}
