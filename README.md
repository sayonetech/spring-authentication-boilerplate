

# beco-api

gernralized spring project with preauth role token based auth basic login signup signin apis ,password hasher bcrypt

This project is built using Spring-boot and maven.

## todo ##

| Service       | Purpose                          | Port |
|---------------|-------------------------------|----|
|gateway-service     | Zuul Gateway           | 8081 |
|discovery-service     | Eureka Server           | 8761 |

### EndPoints SDK ###

| EndPoint                      | Method | Description                                      |
| ----------------------------- | :-----:| ------------------------------------------------ |
| /api/auth/signup  | POST    | signup new account                   |
| /api/auth/signin      | POST   | login an account                           |
| /api/test/all            | GET    | retrieve public content                  |
| 	/api/test/user | GET    | access User’s content           |
| 	/api/test/mod | GET    | access Moderator’s content             |
| 	/api/test/admin  | GET    | access Admin’s content              |




URI for gateway : *http://localhost:8081*


