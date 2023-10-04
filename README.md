# CodeInspector



Build a new docker image from this Dockerfile and assign the image a meaningful name, e.g. "myjenkins-blueocean:2.414.2-1":

`docker build -t myjenkins-blueocean:2.414.2-1 .`

If you have not yet downloaded the official Jenkins Docker image, the above process automatically downloads it for you.

Run your own myjenkins-blueocean:2.414.2-1 image as a container in Docker using the following docker run command:

```
docker run --name jenkins-blueocean --restart=on-failure --detach ^
  --network jenkins --env DOCKER_HOST=tcp://docker:2376 ^
  --env DOCKER_CERT_PATH=/certs/client --env DOCKER_TLS_VERIFY=1 ^
  --volume jenkins-data:/var/jenkins_home ^
  --volume jenkins-docker-certs:/certs/client:ro ^
  --publish 8080:8080 --publish 50000:50000 myjenkins-blueocean:2.414.2-1
```

Proceed to the Setup wizard.

`docker exec jenkins-blueocean cat /var/jenkins_home/secrets/initialAdminPassword`

