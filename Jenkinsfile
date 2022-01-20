@Library('Deepak_shared_lib') _

pipeline {
    agent {
        label 'aws_ec2_ubuntu_label'
    }
    stages{
        
        stage('Clone'){
            steps{
                scripts{
		   mave_goals.cloneGit()
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
	always{
	    script{
	        mave_goals.cleanup()
	    }
    }
}
