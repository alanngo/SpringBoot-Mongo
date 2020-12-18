# SpringBoot using MongoDB

## Prerequisites

<a href="https://github.com/alanngo/SpringBoot/blob/master/README.md">See SpringBoot</a>

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
```java
// Class Based
@RestController // allows the class to have API routes
@CrossOrigin // allows other programs to consume SpringBoot app
@RequestMapping // root url mapping

// Field Based
@Autowired // dependency injection

// Method Based
@GetMapping("/URL") // allows a method to be called when GET request is made w/ '/URL'
@PostMapping("/URL") // allows a method to be called when POST request is made w/ '/URL'
@PutMapping("/URL") // allows a method to be called when PUT request is made w/ '/URL'
@DeleteMapping("/URL") // allows a method to be called when DELETE request is made w/ '/URL'

// Method Parameter Based
@RequestBody // allows POJO to be parsed as JSON request body
@PathVariable // used for url patterns of *./{pathVar}, method arg name must also be the same
@QueryParam // used for url patterns of ?key=value
```

###### DTO
```java
// Class Based
@Data // constructor, getters, setters, equals, hashCode, toString 
```

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
```java
// Class Based
@Service // denotes service layer
@Transactional // allows the class to update DB fields

// Field Based
@Autowired // dependency injection
```

    
###### Utility

ErrorInfo
```java
// Class Based
@Data // constructor, getters, setters, equals, hashCode, toString 
```

ExceptionControllerAdvice
```java
// Class Based
@RestControllerAdvice // allows the app to output errors to user in a useful manner

// Field Based
@Autowired // dependency injection

// Method Based
@ExceptionHandler(value=Exception.class) // allows method to be called when exception is raised
```

LoggingAspect
```java
// Class Based
@Component // denotes spring bean
@Aspect // used for crosscutting concern

// Method Based
@AfterThrowing(pointcut = "execution(CLASS_NAME)") // will execute after throwing exception
```

## Repository Layer
```java
public interface ExampleRepository extends MongoRepository<ENTITY, ID>
{
    // methods inherited from CrudRepository
}
```