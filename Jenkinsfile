pipeline {
    agent any

	parameters{
		choice (name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
		booleanParam (name: 'execTest', defaultValue: true, description: '')
	}
	stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
			when {
				expression {
					params.execTest == true
				}
			}
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                echo "deploying version ${params.VERSION}"
            }
        }
    }
}
