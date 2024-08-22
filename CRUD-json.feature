Feature: CRUD Operation on Json Placeholder application

Scenario: Get all posts

Given  I have a base URI  of "https://jsonplaceholder.typicode.com"

When  I send a GET request to "/posts"

Then the response status code should be 200


Scenario: Get one posts

Given  I have a base URI  of "https://jsonplaceholder.typicode.com"

When  I send a GET request to "/posts/1"

Then the response status code should be 200


Scenario Outline: Create post

Given  I have a base URI  of "https://jsonplaceholder.typicode.com"

When  I send a CREAT request to "/posts" with body as "<RequestBody>"

Then the response time less than 5000



Examples:

|RequestBody                                                    |
|{\\"title\\": \\"foo\\". \\"body\\": \\"bar\\",\\"userId\\": 1}|



Scenario Outline: Update post

Given  I have a base URI  of "https://jsonplaceholder.typicode.com"

When  I send a UPDATE request to "/posts/1" with body as "<RequestBody>"

Then the response time less than 5000



Examples:

|RequestBody                                                                                 |

|{\\"title\\": \\"Updated Title\\", \\"body\\": \\"Updated body content\\", \\"userId\\": 1 }|

