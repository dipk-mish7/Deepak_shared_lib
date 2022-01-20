def compile(){

echo "We are going to compile the pacakge"
sh 'mvn clean compile'
}

def testing(){
echo "We are going to test the package"

// below command will check code stability.
echo "Checking code stability"
sh 'mvn pmd:pmd'

// below command will check code coverage.
echo "Checking code coverage"
sh 'mvn cobertura:cobertura'

// below command will check quality
echo "Checking code quality"
sh 'mvn checkstyle:checkstyle'

}

def publishReports(){

recordIssues(tools: [checkStyle()])
publishCoverage adapters: [coberturaAdapter('')], sourceFileResolver: sourceFiles('NEVER_STORE')
recordIssues(tools: [pmdParser()])
}


def cleanup(){

cleanWs()

}


def cloneGit(){

git branch: 'main', url: 'https://github.com/dipk-mish7/Deepak_shared_lib.git'

}
