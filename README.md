# Prasham Tated 


## Technology Used
----------------

This Mancala Game created with below technology
- Java 8
- Spring Boot
- Websocket with STOMP (Streaming Text Oriented Messaging Protocol)

## Use game as Microservice Application
-------------------------------------

Dockerfile added in repostiory. 

Direct use Docker file for production deployments. 

my docker image uploaded at `prashamtated/mancalagame:latest `

###### Command - 

```
docker build -t mancalagame .
```

###### Output of docker command- 
```
Sending build context to Docker daemon  179.2kB
Step 1/10 : FROM maven:3.6.3-openjdk-8 AS build
 ---> 410d94881c69
Step 2/10 : WORKDIR /code
 ---> Using cache
 ---> effe276ded2b
Step 3/10 : COPY pom.xml /code/pom.xml
 ---> Using cache
 ---> e9c0b0cd9898
Step 4/10 : COPY ["src/main", "/code/src/main"]
 ---> Using cache
 ---> 2deedece8542
Step 5/10 : RUN ["mvn", "package"]
 ---> Using cache
 ---> 76dad9a71e2d
Step 6/10 : FROM openjdk:8-jre-alpine
 ---> f7a292bbb70c
Step 7/10 : ARG JAR_FILE=/code/target/*.jar
 ---> Running in 60b7ce82059a
Removing intermediate container 60b7ce82059a
 ---> 3687a0b54d8b
Step 8/10 : COPY --from=build ${JAR_FILE} app.jar
 ---> 72572129ef6b
Step 9/10 : EXPOSE 8080
 ---> Running in 127711b6f082
Removing intermediate container 127711b6f082
 ---> d4f67896708f
Step 10/10 : CMD ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-jar", "/app.jar"]
 ---> Running in d643042c89ea
Removing intermediate container d643042c89ea
 ---> dbec2127d479
Successfully built dbec2127d479
Successfully tagged mancalagame:latest

```


# Board Setup 

Each of the two players has his six pits in front of him. To the right of the six pits, each player has a larger pit. At the start of the game, there are six stones in each of the six round pits . 
 
## Rules Game Play

- The player who begins with the first move picks up all the stones in any of his own six pits, and sows the stones on to the right, one in each of the following pits, including his own big pit. No stones are put in the opponents' big pit. If the player's last stone lands in his own big pit, he gets another turn. This can be repeated several times before it's the other player's turn. 
 
- Capturing Stones During the game the pits are emptied on both sides. Always when the last stone lands in an own empty pit, the player captures his own stone and all stones in the opposite pit (the other player’s pit) and puts them in his own (big or little?) pit. 
 
- The Game Ends The game is over as soon as one of the sides runs out of stones. The player who still has stones in his pits keeps them and puts them in his big pit. The winner of the game is the player who has the most stones in his big pit. 
 
You can also find some visual explanations of the game rules by running a Google Search for Mancala or Kalaha game.  


Author Information
------------------
- Prasham Tated
- Java/Devops Engineer
- mob- +35795910171 (WhatsApp)
 
