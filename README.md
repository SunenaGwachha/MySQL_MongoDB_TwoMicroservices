# MySQL_MongoDB_TwoMicroservices

InBrowser Goto this link
    http://localhost:9091/swagger-ui/#/        for student_mongodb
   
   http://localhost:9092/swagger-ui/#	for address_mongodb
    
   http://localhost:9091/swagger-ui/#/student-controller
   
   http://localhost:9092/swagger-ui/#/address-controller

Application.properties file
server.port=9091
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=studentdetails

Student.java
@Document        //@Entity for MySQL
public class Student {
    @Id
    private String id;
    private String name;
    private Integer age;

StudentRepository.java
@Repository //JpaRepository for MySQL
public interface StudentRepository extends MongoRepository<Student, String>{

}

Process
1. Goto Command terminal cd pathto bin of mongodb 
cd C:\Program Files\MongoDB\Server\4.2\bin
2. Start MongoDaemon by entering 
Mongod   hit enter
3. Then goto MongoDB Compass Community  GUI in Desktop tool bar and connect

Application.properties for MySQL

server.port=9092
spring.application.name=ADDRESS-SERVICE
spring.datasource.url = jdbc:mysql://localhost:3306/address?createDatabaseIfNotExist=true
spring.datasource.username = root
spring.datasource.password = root
spring.datasource.platform=mysql
spring.jpa.hibernate.ddl-auto = create
spring.jpa.show-sql = true

Primary key
If Id is string  use @Id, @Length(max=7)(it depends on spring version, may be not needed)
If Id is Integer @Id ,@GeneratedValue(strategry=GenerationType.AUTO)
Harcoded OpemFeign

If Not using Eureka service Discovery
@FeignClient(name="address-service", url = "http://localhost:9092/")
public interface MyFeignClient {

    @GetMapping(value = "getAddress")
  	String getAddress();
}

If  using Eureka service Discovery
 If Using Eureka Service Discovery

@FeignClient(value = "B-SERVICE")
public interface MyFeignClientA {

    @GetMapping(value = "getB")
    String getB();
}
