# Golang 

### Demo of an API with  
_"Hello World" message_   
_CRUD Customer in Java/Spring Boot_  
_Proxy to Pokemon API (Reply request to Pokemon API and return an STRING in JSON format with the resul)_

## Starting 🚀

_These instruction allow you run the API and test in your local machine._


### Pre-requisitos 📋

_Java 11+_

These dependencies are inside gradle configuration

_Spring Boot 2.5.4_  
_org.springframework.boot:spring-boot-starter-data-jpa_   
_org.springframework.boot:spring-boot-starter-data-rest_  
_org.springframework.boot:spring-boot-starter-validation_  
_org.springframework.boot:spring-boot-devtools_  
_org.springframework.boot:spring-boot-starter-test_  
_H2 in memory Database_  
_Tomcat Web Server_  

### Installation 🔧

_Download or unzip the code_

_Open the project on your IDE_

_Udate gradle dependencies_

_Run the project on IDE or in command line with the following command_

_java -jar WizelineGo-0.0.1-SNAPSHOT.jar_

_H2 Database available at 'jdbc:h2:mem:golangdb'_

## Testing ⚙️

_You can accese the api in these URLs_

_* Display "Hello World Golang" Message_  
_GET   	http://localhost:8080/api/v1/messages/_     			  	
_* Get all Customers_  
_GET   	http://localhost:8080/api/v1/customers/_				
_* Get the Customer that math the ID_  
_GET   	http://localhost:8080/api/v1/customers/{customerId}_  		
_* Create new Customer_  
_POST  	http://localhost:8080/api/v1/customers/_  					
_* Update Customer_  
_PUT   	http://localhost:8080/api/v1/customers/_  					
_* Change Status to FALSE_  
_DELETE	http://localhost:8080/api/v1/customers/{customerId}_  		

_Pokemon API Proxy_

_*Get all pokemons (limmit = quantity , offset = position)_
_GET	http://localhost:8080/api/v2/pokemons/limit/{limit}/offset/{offset}_  	
_* Get pokemons filtered by id_    
_GET	http://localhost:8080/api/v2/pokemon/pokemonid/{id}_    
_* Get pokemon filtered by name_  
_GET	http://localhost:8080/api/v2/pokemon/{name}_    
_* Get pokemons filtered by type_  
_GET	http://localhost:8080/api/v2/type/{type}_  
_* Get pokemons filtered by ability_  
_GET	http://localhost:8080/api/v2/ability/{ability}_    	


_The API documentaion in in the following URL https://documenter.getpostman.com/view/13208746/TVYDeKk8#e6cce4d8-0339-43a7-af4b-d5250e2193d5_

These inserts run at startup

```
Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 1,'fernando','sanchez garcia','fernando@hotmail.com','3333333333','3333333333','12345',1,now(),1;

Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 2,'virginia azucena','rodriguez vizcarra','viciky@hotmail.com','3333333333','3333333333','12345',1,now(),1;

Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 3,'ana martha','garcia valverde','ana@hotmail.com','3333333333','3333333333','12345',1,now(),1;

Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 4,'alejandro','gonzalez rubio','alex@hotmail.com','3333333333','3333333333','12345',1,now(),1;

Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 5,'yessica','gomez ascensio','yessica@hotmail.com','3333333333','3333333333','12345',1,now(),1;

```


###  🔩

_The Project include unit test , are separated by controller_

```
CustomerController =  CRUD of Customer
MessageController  =  Display "Hello World Golang Message"
The pokemon API only return the same the original API. Because it can change frequently I omit check the return values.
```

## Deploy 📦

_You can run the api in all OS_

## Tools 🛠️

_Most relevants tools_

* Spring Boot 2.5.4 - Web Framework 
* Intellij IDEA 2021.12.1 Ultimate Edition - IDE
* Gradle - Dependency Manager
* PostMan - To test the api and share documentation
* Spring Initializr - Setup the project
* M2 - Database
* Tomcat 9.0.52 - Web Server

## Autor ✒️


* **Francisco Vazquez** - ** - 


## Licence 📄

GNU General Public License (GPL)

##  🎁

* Enjoy Coding :) 📢


