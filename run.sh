rm -r target
mvn package
java -jar target/sprint2-0.1.0.jar --server.port=8081
