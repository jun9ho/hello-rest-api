# hello-rest-api

## Test
```bash
$ curl http://localhost:8080/hello | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   115  100   115    0     0   1251      0 --:--:-- --:--:-- --:--:--  1263
{
  "timestamp": 1760236794196,
  "message": "Hello, World!",
  "koreaTime": "2025-10-12T11:39:54.196921463+09:00[Asia/Seoul]"
}
```
<img width="474" height="99" alt="image" src="https://github.com/user-attachments/assets/6b34ae03-e919-4c7b-a137-477e2b67e564" />

## Build

```
$ ./gradlew clean bootJar
```

## Run

```bash
$ java -jar build/lib/hello-rest=api-<VERSION>.jar
```

## Remote Run

```bash
# scp -i <KEY.pem> start.sh ubuntu@<SERVER_IP>:~/app/spring-rest-api

$ ssh -i <KEY.pem> ubuntu@<SERVER_IP> \
"cd /home/ubuntu/app/spring-rest-api;pwd;./start.sh"
```

## Remote Stop

```bash
# scp -i <KEY.pem> stop.sh ubuntu@<SERVER_IP>:~/app/spring-rest-api

$ ssh -i <KEY.pem> ubuntu@<SERVER_IP> \
"cd /home/ubuntu/app/spring-rest-api;pwd;./stop.sh"
```

## Dockerizing
- https://spring.io/guides/gs/spring-boot-docker
- openJDK 17
```bash
# 빌드
$ ./gradlew clean bootJar
$ sudo docker build --build-arg JAR_FILE=build/libs/\*.jar \
-t datamario24/spring-rest-api:0.3.0 .

# Run
# sudo docker run -d -p 8030:8080 --name srq030 datamario24/spring-rest-api:0.3.0

$ sudo docker images | grep spring-rest-api
datamario24/spring-rest-api   0.3.0           df8b2c938eac   43 seconds ago   347MB

$ sudo docker push datamario24/spring-rest-api:0.3.0



$ sudo docker status
```

# test
