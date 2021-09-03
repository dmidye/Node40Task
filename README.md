# Node40 Task

## Run With Docker

```
docker pull dpmidyett/node40helloworld:v1
docker run -d -p 8080:8080 dpmidyett/node40helloworld:v1
```


## Run The Jar
Clone this repo, cd into the directory, and run:
```
java -jar example/hello-world-0.0.1-SNAPSHOT.jar server hello-world.yml
```
You should then be able to open a command prompt and run:
```
curl http://localhost:8080/hello-world
curl http://localhost:8080/hello-world/format/reversed
```


I have included my tests in src/tests/groovy.
