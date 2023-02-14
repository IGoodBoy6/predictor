FROM openjdk:17-jdk-slim
MAINTAINER Neil wangweili457@gmail.com
ENV TZ "Asia/Shanghai"
ADD build/libs/predictor-1.0.0.jar  /data/apps/predictor.jar
WORKDIR /data/apps/
EXPOSE 8080
CMD ["java", "-jar", "predictor.jar"]
