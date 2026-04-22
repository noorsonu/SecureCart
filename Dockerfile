FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

# Give permission to mvnw
RUN chmod +x mvnw

# Build jar
RUN ./mvnw clean package -DskipTests

# Run application
ENTRYPOINT ["java","-jar","target/*.jar"]