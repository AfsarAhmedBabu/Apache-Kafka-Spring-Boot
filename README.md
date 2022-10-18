# Apache-Kafka-Spring-Boot

Download Kafka from:

https://kafka.apache.org/downloads

Binary downloads:

Scala 2.12  - kafka_2.12-3.3.1.tgz (asc, sha512)


Commands to start Zookeeper and Kafka :

 .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
 
.\bin\windows\kafka-server-start.bat .\config\server.properties


Basic Terminology in Apache Kafka:


Topics:- A stream of messages belonging to a perticular category is called a topic. Data is stored in topic.


Topics are further split into partitions. For each topic, kafka keeps a minimum of one partition.


Brokers:- Brokers are simple system responsible for maintaining the published data. Each broker may have zero or more partitions per topic.


Cluster:- Kafka's having more than one broker are called kafka cluster. A kafka cluster can be expanded without downtime.


Producer:- Producers are the publisher of messages to one or more kafka topics. Producers send data to kafka brokers. Every time a producer publishes a message to a broker, the broker simple appends the message to the last segment file.


Consumers:- Consumers read data from the brokers. Consumers subscribes to one or more topics and consume published messages by pulling data from the brokers.


Leader:- Leader is the node responsible for all the reads and writes for the given partition. Every partition has one server acting as a leader.


Follower:- Node that follows leader's instruction is called follower. If the leader fails, one of its follower automatically become the new leader.
