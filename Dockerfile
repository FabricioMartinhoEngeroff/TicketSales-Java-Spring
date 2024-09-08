# Etapa 1: Usar uma imagem base do Maven para compilar o projeto
FROM maven:3.8.6-eclipse-temurin-17 AS builder
WORKDIR /app

# Copiar arquivos de configuração do Maven e código-fonte para o contêiner
COPY pom.xml .
COPY src ./src

# Compilar o projeto e gerar o JAR sem executar os testes
RUN mvn clean package -DskipTests

# Etapa 2: Usar uma imagem base mais leve com apenas o JRE para rodar a aplicação
FROM eclipse-temurin:17-jre-alpine
WORKDIR /application

# Copiar o JAR gerado na etapa de build para a imagem final
COPY --from=builder /app/target/*.jar application.jar

# Definir o comando de execução da aplicação
ENTRYPOINT ["java", "-jar", "/application/application.jar"]