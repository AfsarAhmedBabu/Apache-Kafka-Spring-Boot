# Apache-Kafka-Spring-Boot

Download Kafka from:
https://kafka.apache.org/downloads
Binary downloads:
Scala 2.12  - kafka_2.12-3.3.1.tgz (asc, sha512)

Commands to start Zookeeper and Kafka :
 .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties

application.yml file:
spring:
  kafka:
    consumer:
      bootstrap-servers: localhost:2181
      group-id: group_id
      auto-offset-reset: earliest
      key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
      value-deserializer: org.apache.kafka.common.serialization.StringDeserializer
    producer:
      bootstrap-servers: localhost:2181
      key-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: org.apache.kafka.common.serialization.StringSerializer
