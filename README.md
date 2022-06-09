# Smart House Microservices

Notre architecture va contenir l’ensemble des microservices :

​

Microservice 1 : API Gateway

Microservice 2 : User Management

Microservice 3 : Device Management Service

Microservice 4 : Device Authority Service

Microservice 5 : Weather Forcast Service

Microservice 6 : Energy Consumption

Microservice 7 : Notification Service (Twilio)

Microservice 8 : Discovery Service

Microservice 9 : Configuration Service

​
![alt text](https://simplonline-v3-prod.s3.eu-west-3.amazonaws.com/media/image/png/23252e23-f1d8-4229-b308-7d72410a7605.png)

​

Contraintes:

Utiliser Maven Muti-modules
* Gateway: Spring Cloud Gateway
* Authentication + Authorization: (Openid connect + OAuth 2.0) Keycloak
* Internal Services Communication : RestTemplate | WebClient | OpenFeign
* Config Server: Spring Cloud Config Server (GitHub as a remote repository)
* Centralized Secrets Storage: Vault
* Service Discovery : Eureka
* Event Driven Microservices: RabbitMQ | Apache Kafka
* Circuit Breaker: Hystrix | Resilience 4j
* Distributed Tracing: Zipkin & Sleuth
* Centralized Logging: ELK (Elasticsearch, Logstash, Kibana)
* Tests : Unit Tests (JUnit & Mockito) & Integration Tests (Testing with Containers: Testcontainers).
* CI/CD : Jenkins | GitHub Actions
* Deployment: Docker & Kubernetes