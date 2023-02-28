# F-1.lt Automation Testing

### Link to website [www.f-1.lt](https://www.f-1.lt)

### Technologies:

* Java/Maven

#### Dependencies:

* Selenium `org.seleniumhq.selenium:selenium-java`
* TestNG `org.testng:testng`
* WebDriverManager `io.github.bonigarcia:webdrivermanager`

## Test Scenarios:

### Registration:
**page:** [www.f-1.lt](https://www.f-1.lt)
#### 1. Check if Registration form is opened:
* Click `Prisijungti` button
* Click `Registruokites` button
* Check if there is an instance of Registration Form window

Expected result: Registration Form window is opened.

#### 2. Try to register user with invalid email:
* Click `Prisijungti` button
* Click `Registruokites` button
* Input valid **username, password, confirm password** and invalid **email** address
* Click `Registruotis` button
* Read message that **email** is invalid

Expected result: Shown message that **email** is invalid

#### 3. Try to register user with already used email:
* Click `Prisijungti` button
* Click `Registruokites` button
* Input valid **username, password, confirm password** and used **email** address
* Click `Registruotis` button
* Read message that **email** is already used for registration

Expected result: Shown message that **email** is already used

#### 4. Try to register user with blank username:
* Click `Prisijungti` button
* Click `Registruokites` button
* Input valid **email, password, confirm password** and blank **username**
* Click `Registruotis` button
* Read message that no fields should be left blank

Expected result: Shown message that all field must be filled

#### 5. Try to register user with not confirming the password:
* Click `Prisijungti` button
* Click `Registruokites` button
* Input valid **username, email, password** and wrong **Confirm password** 
* Click `Registruotis` button
* Read message that **password** and **Confirm password** are different

Expected result: Shown message that **password** and **Confirm password** are not equal

#### 6. Try to register user with existing Username:
* Click `Prisijungti` button
* Click `Registruokites` button
* Input valid **email, password, Confirm password** and already existing **username**
* Click `Registruotis` button
* Read message that user with specified **username** already exists

Expected result: Shown message that user with specified **username** already exists

#### 7. Try to register user with valid information:
* Click `Prisijungti` button
* Click `Registruokites` button
* Input valid **username, email, password, Confirm password**
* Click `Registruotis` button
* Read message that **User** is successfully created

Expected result: Shown message that **User** is created

### Logging in:
#### 1. Try to log in existing user:
* Click `Prisijungti` button
* Input valid **username, password**
* Click `PRISIJUNGTI` button
* Read **username** from navigation bar

Expected result: **Username** from navigation bar should be equal to entered one.

### Guess Form:
**page:** [www.f-1.lt/spelione/spejimai/26](https://www.f-1.lt/spelione/spejimai/26)
#### 1. Try to choose winner of qualifying:
* Select **racer** from `Kvalifikacijos nugalėtojas:` dropdown list by number (we've sent number **"16"**)
* Click `Patvirtinti` button
* Read **racer's** **Name** form `Kvalifikacijos nugalėtojas:` dropdown list (we've got **"Charlesas Leclercas"**)
* Check if sent **racer's** number corresponds with his **Name**

Expected result: Selected by number **racer** should correspond with his **Name**

#### 2. Fill guess form for qualifying, first 10 places and fastest lap:
* Select **racers** from all dropdown lists
* Click `Patvirtinti` button
* Read message that guess is accepted or refreshed

Expected result: Guess is accepted or refreshed

### F-1 Schedule 2023:
**page:** [www.f-1.lt/tvarkarastis](https://www.f-1.lt/tvarkarastis)
#### 1. Try if tickets buying page opens:
* Wait while all tickets links to be clickable
* Click `BILIETAI` button near `Bahreinas`
* Read *URL address* from opened tab 

Expected result: The wright URL is opened in a new tab
