FROM openjdk:11
EXPOSE 9890
ADD target/springBoot-jenkins-pipeline.jar springBoot-jenkins-pipeline.jar
ENTRYPOINT ["java","-jar","/springBoot-jenkins-pipeline.jar"]