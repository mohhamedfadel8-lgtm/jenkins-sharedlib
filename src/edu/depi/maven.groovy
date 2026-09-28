package edu.depi;

def mavenCommand(COMMAND_OPT){
    sh "mvn ${COMMAND_OPT}"
}