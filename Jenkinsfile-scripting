def gv

pipeline {
    agent any

	parameters{
		choice (name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
		booleanParam (name: 'execTest', defaultValue: true, description: '')
	}
	stages {
        stage('Init') {
            steps {
                script {
					gv = load"script.groovy"
				}
            }
        }
		stage('Build') {
            steps {
                script {
					gv.built-app()
				}
            }
        }
        stage('Test') {
			when {
				expression {
					params.execTest == true
				}
			}
            steps {
                script {
					gv.test-app()
				}
            }
        }
        stage('Deploy') {
            steps {
                script {
					gv.deploy-app()
				}
            }
        }
    }
}
