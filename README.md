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

