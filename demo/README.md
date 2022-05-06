### Build, run, containerize, and run with colima
./mvnw clean install spring-boot:run
colima start
docker context ls
export DOCKER_HOST=unix:///Users/wesley.reisz/.colima/docker.sock
echo $DOCKER_HOST
./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=wesreisz/spring-boot-docker
docker run -d --platform linux/amd64 -p 8080:8080 wesreisz/spring-boot-docker\
docker run -d --platform linux/amd64 -p 8080:8080 wesreisz/spring-boot-docker