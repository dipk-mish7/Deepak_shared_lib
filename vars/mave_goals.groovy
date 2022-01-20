def compile(){

echo "We are going to compile the pacakge"
sh 'mvn compile'
}

def stability(){
echo "We are going to check stability the pacakge"
sh 'mvn pmd:pmd'
}

def quality(){
echo "We are going to check quality of the package"
sh 'mvn checkstyle:checkstyle'

}

def coverage(){

echo "We are going to check coverage of the package"
sh 'mvn cobertura:cobertura'

}



