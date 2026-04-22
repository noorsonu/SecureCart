FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

# FIX HERE 👇 (use shell form)
ENTRYPOINT sh -c "java -jar target/*.jar"