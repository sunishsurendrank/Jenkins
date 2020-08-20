def dockerPushImage
{

withCredentials([
            usernamePassword(credentialsId: 'dockerhubCredential',
              usernameVariable: 'username',
              passwordVariable: 'password')
            ]){
                sh """
               docker login -u ${usernameVariable} -p ${passwordVariable}
               docker push  sunishsurendrank/webserver:v$BUILD_NUMBER
                """ 
              }


}
