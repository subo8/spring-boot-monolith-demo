# Mini-Project-1:

In this project we're (studentID: 613799, 613812) implemented user signup, sign in, change role and running batch processes using following tech stacks:
This time there is no UI (only Hello World on the home page :D)

## Tech stacks:
1. Spring boot (dependencies: Spring-Batch, Spring-Securiy, Lombok, MySQL, JPA)
2. JJWT (json web token)
3. Docker
4. MySQL 

## Docker commands
1. docker-compose up
2. docker-compose down

## Testing endpoints

3. Create new user (method: *POST*)

    **localhost:8080/api/v1/authentication/sign-up**
    ```json
    body: "must be json format"
         {
            "username": "admin",
            "password": "password",
            "name": "admin"
        }
     ```           
    Response: "you will see something like below"
    ```json
        {
            "id": 1,
            "username": "admin",
            "password": "$2a$10$X1RzNcuVtQeQARd9k9UjvO0cgcelUk/BS72vVsn00HR.9HFy7a796",
            "name": "admin1",
            "createTime": "2022-05-27T19:32:00.738812",
            "role": "USER",
            "token": null
        }
    ```

4. Sign in with user credentials (method: *POST*)

    **localhost:8080/api/v1/authentication/sign-in**
    ```json
    body: "must be json format"
        {
            "username": "admin",
            "password": "password"
        }
    ```
    Response: "you will see something like below"
    ```json
        {
            "id": 1,
            "username": "admin",
            "password": "$2a$10$w6zppUqFkcppRVueUjibCugNC0Xadln9Hy8kFVIbCYOT9yqihvIT2",
            "name": "admin",
            "createTime": "2022-05-27T17:43:11.263081",
            "role": "USER",
            "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MSwiZXhwIjoxNjUzNzc4MzgwfQ.jZm-QwW3Kgr1P505pkgWNsdffbuZu4Dbr9FX-YpxEY4cMgR_mBwkbcg-yBHFX3-drbTcARU7W5x1Mn8ME8D7LA"
        }
    ```

5. Change user role to Admin (method: *PUTH*)

    **localhost:8080/api/v1/user/change/ADMIN**
    >**Comment:** "Please use jwt token generated after you sign in"
   
    >**Authorization:** Bearer Token eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoxLCJleHAiOjE2NTM3Nzc3OTl9.-XPGx_EIDaiyMS2yyq58EvLtuBBtgFQHw3g3AQXorI2gCJTgZnv7VDsrBm8oJBUsvwErr-sGp8wGW0Bu88qIXw

    >**Response:** true

6. **After you change role, repeat step 4 (Sign in again and generate new jwt token information)**

7. Run batch process (method: *GET*)

    **localhost:8080/api/v1/batch/load**
    
    >**Authorization:** Bearer Token eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoxLCJleHAiOjE2NTM3Nzc3OTl9.-XPGx_EIDaiyMS2yyq58EvLtuBBtgFQHw3g3AQXorI2gCJTgZnv7VDsrBm8oJBUsvwErr-sGp8wGW0Bu88qIXw

    >**Response:** "you will see something like below"
    ```json
        {
            "exitCode": "COMPLETED",
            "exitDescription": "",
            "running": false
        }
    ```
8. That's all, Thank you.