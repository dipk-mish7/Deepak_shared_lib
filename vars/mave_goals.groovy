def compile(){

echo "We are going to compile the pacakge"
sh 'mvn compile'
}

def testing(){
echo "We are going to test the package"

sh 'mvn pmd:pmd'
sh 'mvn cobertura:cobertura'
sh 'mvn checkstyle:checkstyle'

}

def publishReports(){

recordIssues(tools: [acuCobol()])

}





