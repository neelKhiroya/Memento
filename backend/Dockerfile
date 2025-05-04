FROM openjdk:17-jdk-slim

WORKDIR /app
COPY . .

RUN chmod +x ./gradlew
RUN ./gradlew build -x test --no-daemon

CMD ["java", "-jar", "build/libs/your-app-name.jar"]