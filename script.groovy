def built-app(){
	echo 'building the app - scrip groovy external'
}

def test-app(){
	echo 'testing the app - scrip groovy external'
}

def deploy-app(){
	echo 'deploying the app - scrip groovy external'
	echo "deploying ${params.VERSION}"
}

return this