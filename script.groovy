def buildApp(){
	echo 'building the app - scrip groovy external'
}

def testApp(){
	echo 'testing the app - scrip groovy external'
}

def deployApp(){
	echo 'deploying the app - scrip groovy external'
	echo "deploying ${params.VERSION}"
}

return this
