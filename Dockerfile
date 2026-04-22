FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy full project
COPY . .

# Build jar inside container
RUN ./mvnw clean package -DskipTests

# Run jar
ENTRYPOINT ["java","-jar","target/*.jar"]