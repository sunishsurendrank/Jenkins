def dockerPushImage
{
 
 steps{

   withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'dockerhubCredential',
   usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {

   sh 'echo uname=$USERNAME pwd=$PASSWORD'
    }
 }



}
