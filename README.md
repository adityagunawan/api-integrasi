# Spring Boot Rest API

Spring Boot Rest API whit JWT token

## Installation

clone https://github.com/adityagunawan/api-integrasi.git

```bash
mvn clean install
```

## How To Use
go to port/authenticate/ whit POST method and put json 

`{
    "username":"user", 
    "password":"password"
}`

and set auth type as Bearer whit prefix `Bearer<space> your_token`