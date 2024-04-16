# speeltuin


gradle build

java -jar build/libs/speeltuin-0.0.1-SNAPSHOT-standalone.jar

docker build --build-arg JAR_FILE=build/libs/speeltuin-0.0.1-SNAPSHOT-standalone.jar -t robbertvdzon/speeltuin .

docker run robbertvdzon/speeltuin 