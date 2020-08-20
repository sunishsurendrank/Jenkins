def dockerPushImage
{
 
 steps {
    withCredentials([usernamePassword(
        credentialsId: '${deployCredentialsId}',
        usernameVariable: 'USERNAME',
        passwordVariable: 'PASSWORD',
    )]) {
        sh 'echo uname=$USERNAME pwd=$PASSWORD'
    }
}



}
