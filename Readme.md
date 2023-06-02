# Docker Image 빌드를 학습하기 위한 demosvc
---------------------
* docker build . -t demosvc:1.0.0
* docker run -d -p 8082:8080 --name demosvc demosvc:1.0.0
* curl http://localhost:8082/users
