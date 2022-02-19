def gv

pipeline {
	agent any

	parameters{
		choice (name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
		booleanParam (name: 'EXCUTE_TEST', defaultValue: true, description: '')
	}
	stages {
        	stage('Init') {
            		steps {
                		script {
					gv = load "script.groovy"
				}
            		}
        	}
		stage('Build') {
            		steps {
                		script {
					gv.buildApp()
				}
            		}
        	}
        	stage('Test') {
			when {
				expression {
					params.EXCUTE_TEST == true
				}
			}
            		steps {
                		script {
					gv.testApp()
				}
            		}
        	}
        	stage('Deploy') {
            		steps {
                		script {
					gv.deployApp()
				}
            		}
		}
    	}
}	
