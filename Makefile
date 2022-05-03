clean:
	./gradlew clean

build:
	./gradlew build

run-local:
	./gradlew build bootRun

debug:
	./gradlew bootRun --debug-jvm

pact-broker-up:
	docker-compose --file pact-broker-server/pact-broker-docker-compose.yaml up -d

pact-broker-down:
	docker-compose -f pact-broker-server/pact-broker-docker-compose.yaml down
