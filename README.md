# 学习Spring Boot 打包分离jar

## 使用过程

1. 配置见pom.xml <plugins></plugins>部分
2. 运行package，会在target目录生成libs目录，此目录下的jar为工程依赖的所有第三方jar，
   learn-spring-boot-jar-separate-1.0.0.jar为此工程jar
3. 启动项目：java -Dloader.path=libs/ -jar learn-spring-boot-jar-separate-1.0.0.jar
   

