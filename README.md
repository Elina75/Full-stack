##Course topic: Food helper

Application, which will be useful for all housekeepers.
This application will help you find new recipes for dinner,
using some of your preferences. You may enter 2-3 products,
and it will show you recipes with them. It is also can show 
you all recipes. 
_ _ _ _
You can use it in supermarket too.
You may check the nutritional labels like E-220, and so on.
---
##System configuration and startup process

Tomcat in my case started on port(s): 8080 (http) with context path ''.

Enter the 'localhost:8080/index'-there will be main page, 
after authorization you will see different links on navigation bar based on your role

After entering all credentials you may try next, you will be redirected 
on 'localhost:8080/signin' and you need to change it to 'localhost:8080/index' again.
```
login elfina75
password 12345678
role admin


OR


login adlvkn
password 87654321
role user
```

For starting the application you will need to restore the DB
(in my case it's PostgreSQL, the restore "Afanasyeva.tar" file, it is the same with previous one).

In package "Config" in AppConfig.class you need to change URL, username and password for connecting with DataBase

Also in application.properties file do the same actions


If the cUrl doesn't work try to change '' to ""
like 'Accept: application/json' 'http://localhost:8080/labels'
to "Accept: application/json" "http://localhost:8080/labels"

For opening swagger you need to write url in browser in my case 'localhost:8080/swagger-ui.html'
(maybe you will have another port)

I didn't do this lab well, but I will. I was making the test task from the company where I send my CV.
This work was similar to lab. You may check it out too. The readme and .tar are inside
```
https://github.com/Elina75/TaskTracker.git
```
- - - -
###Functionality for label model

1) Get all labels

    GET http://localhost:8080/labels or
```
   curl -X GET --header 'Accept: application/json' 'http://localhost:8080/labels')
   ```
----
2) Add new label
   
    POST http://localhost:8080/labels/addLabel
```
curl -X POST --header 'Content-Type: application/json' --header 'Accept: */*' -d '{ \ 
   "category": "healthy/toxic", \ 
   "description": "Karmin. Red dye", \ 
   "name": "E-125" \ 
 }' 'http://localhost:8080/labels/addLabel'
```
----
3)Delete label (ex. id=109. please change it to existing)

    DELETE http://localhost:8080/labels/deleteLabel/109
```
curl -X DELETE --header 'Accept: */*' 'http://localhost:8080/labels/deleteLabel/109'
```
----
4)Update label (ex. id=107. please change it to existing)

    UPDATE http://localhost:8080/labels/updateLabel
```
curl -X PUT --header 'Content-Type: application/json' --header 'Accept: */*' -d '{ \ 
   "category": "healthy/toxic", \ 
   "description": "purple", \ 
   "label_id": 107, \ 
   "name": "E-125" \ 
 }' 'http://localhost:8080/labels/updateLabel'
```
###Functionality for recipe model
1) Get all recipes

   GET http://localhost:8080/recipes or
```
   curl -X GET --header 'Accept: application/json' 'http://localhost:8080/recipes'
   ```
----
2)Get all recipes by category 

   GET http://localhost:8080/recipes/category/{{category}} or
   GET http://localhost:8080/recipes/category/vegan
```
   curl -X GET --header 'Accept: application/json' 'http://localhost:8080/recipes/category/vegan'
   ```
----
3)Get all recipes less than time

   GET http://localhost:8080/recipes/{{time}} or
   GET http://localhost:8080/recipes/20
```
   curl -X GET --header 'Accept: application/json' 'http://localhost:8080/recipes/20'
   ```
----

###Functionality for users model
1) Get all users

   GET http://localhost:8080/users or
```
  curl -X GET --header 'Accept: application/json' 'http://localhost:8080/users'
   ```
----
2)Get all users age less than or role is equal to 

GET http://localhost:8080/users/{{age}}/role/{{role}} or
GET http://localhost:8080/users/20/role/ADMIN
```
  curl -X GET --header 'Accept: application/json' 'http://localhost:8080/users/20/role/ADMIN'
   ```
----
3)Get users by name

GET http://localhost:8080/users/{{name}} or
GET http://localhost:8080/users/Elina
```
   curl -X GET --header 'Accept: application/json' 'http://localhost:8080/users/Elina'
   ```
----

###Functionality for files model
1)Upload file
http://localhost:8080/upload

```
curl -X POST --header 'Content-Type: multipart/form-data' --header 'Accept: application/json' {"type":"formData"} 'http://localhost:8080/upload'
```

2) Get all files, using the URL from the response of this method you may download the resourse
   http://localhost:8080/files
```
curl -X GET --header 'Accept: application/json' 'http://localhost:8080/files'
```