# SpringBoot using MongoDB

## Prerequisites

<a href="https://github.com/alanngo/SpringBoot/blob/master/README.md#prerequisites">Click here</a>

## Getting Started
<a href="https://github.com/alanngo/SpringBoot/blob/master/README.md#getting-started">Click here</a>
- Follow the same steps listed in the link above
- Do NOT use MySQL dependency 
- Replace Spring Data JPA dependency w/ Spring Data MongoDB
- Download MongoDB: https://www.mongodb.com/try/download/enterprise
- For online MongoDB clusters, go to: https://account.mongodb.com/account/login

## Dependencies

```xml
<!-- For REST API/web functionality   -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

<!-- Needed to connect to MongoDB (causes conflict w/ Spring Data JPA)   -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb</artifactId>
    </dependency>
    
<!-- Reduce boiler plate code-->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
```


## Important Annotations

###### API
- <a href="https://github.com/alanngo/SpringBoot/blob/master/README.md#api">Click here</a>

###### DTO
- <a href="https://github.com/alanngo/SpringBoot/blob/master/README.md#dto">Click here</a>


###### Entity
```java
// Class Based
@Data // constructor, getters, setters, equals, hashCode, toString 
@Document // represents class as MongoDB document

// Field Based
@Id // primary key
```

    
###### Repository
   - none
    
###### Service
- <a href="https://github.com/alanngo/SpringBoot/blob/master/README.md#service">Click here</a>

- ``@Transactional`` does not work w/ MongoDB. To update a document, you have to set the field and call ``save(E e)``
###### Utility
- <a href="https://github.com/alanngo/SpringBoot/blob/master/README.md#utility">Click here</a>


## Repository Layer
```java
public interface ExampleRepository extends MongoRepository<ENTITY, ID>
{
    // methods inherited from MongoRepository
}
```