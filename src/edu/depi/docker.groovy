package edu.depi;

def dockerBuild(IMAGE_NAME, IMAGE_TAG){
    sh 'docker build -t ${IMAGE_NAME}:V${IMAGE_TAG} .'
}

def dockerLogin(USERNAME, PASSWORD){
    sh 'docker login -u ${USERNAME} -p ${PASSWORD}'
}

def dockerPush(IMAGE_NAME, IMAGE_TAG){
    sh 'docker push ${IMAGE_NAME}:V${IMAGE_TAG}'
}