
FROM ubuntu:latest

RUN apt-get update && apt-get install -y \
    wget \
    && rm -rf /var/lib/apt/lists/*

# Download and install JDK 17
RUN wget https://download.java.net/java/17/latest/jdk-17_linux-x64_bin.tar.gz \
    && tar -xvf jdk-17_linux-x64_bin.tar.gz \
    && rm jdk-17_linux-x64_bin.tar.gz \
    && mv jdk-17 /usr/local/java

# Set environment variables for Java
ENV JAVA_HOME=/usr/local/java/jdk-17
ENV PATH="$PATH:$JAVA_HOME/bin"

FROM openjdk:17-jdk-alpine

ENV DB_AUTO_UPDATE="update" DB_URL="jdbc:mysql://localhost:3306/test" DB_USERNAME="root" DB_PASSWORD="" DB_SHOW_SQL="true"

#creat a directory
RUN mkdir /app  

#copy the jar file to the container
COPY  ./target/test-0.0.1-SNAPSHOT.jar /app

#set the working directory
WORKDIR /app

#run the jar file

CMD ["java", "-jar", "test-0.0.1-SNAPSHOT.jar"]