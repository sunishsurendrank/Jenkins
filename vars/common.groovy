def dockerPushImage
{

withCredentials([
            usernamePassword(credentialsId: 'dockerhubCredential',
              usernameVariable: 'username',
              passwordVariable: 'password')
          ])

          sh """
          docker login -u username -p password;docker push  sunishsurendrank/webserver:v$BUILD_NUMBER
          """

}
