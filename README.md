# Spring Boot Kotlin PostgreSQL

Open your terminal then type this :

`mvn clean spring-boot:run`

Open your browser :

1. Save Data

    `http://localhost:8080/save`

2. Find All

    ```
    http://localhost:8080/findAll

 [
    {
        "firstName": "Hendi",
        "lastName": "Santika",
        "id": 1
      },
      {
        "firstName": "Uzumaki",
        "lastName": "Naruto",
        "id": 2
      },
      {
        "firstName": "Uchiha",
        "lastName": "Sasuke",
        "id": 3
      },
      {
        "firstName": "Haruno",
        "lastName": "Sakura",
        "id": 4
      },
      {
        "firstName": "Hatake",
        "lastName": "Kakashi",
        "id": 5
      }
 ]
```

3. Find By Id

    `http://localhost:8080/findById/1`

4. Find By Lastname

    `http://localhost:8080/findByLastname/Kakashi`