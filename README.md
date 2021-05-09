# QuizLab

![Badge](https://img.shields.io/badge/JDK-11-brightgreen) ![Badge](https://img.shields.io/badge/JavaFx-13-brightgreen) ![Badge](https://img.shields.io/badge/sqlite-3.34.0-brightgreen) ![Badge](https://img.shields.io/badge/JUnit-5.7.1-brightgreen)


> Welcome to QuizLab, a simple desktop quiz application in java.

## Presentation

This application gives a simple quiz for the user and manage user's information and score.

Firstly, the user sign in or sign up. Then, the user can start the game.

The data is stored in `sqlite3 database`, to make adding users or changing questions easy for the code owner.

Also, the application is built using java fx. It is easy and intuitive to use. We used [Gulon scene builder](https://gluonhq.com/products/scene-builder/#download) to build the UI.

---

## Execution

To use this code please run:

```sh
$ mvn javafx:run --file pom.xml
```

---

## How to use this application

1. After running the application you will find a welcome page:
![welcome page](assets/welcomePage.png)
2. Then you will need either to sign in or to sign up:
![identification page](assets/identificationPage.png)
3. After identification you can demande help:
![before game page](assets/beforeGameHelpPage.png)
4. Now you can start a play:
![game on page](assets/gamePage.png)
5. After That you can demande help again:
![after game page](assets/afterGameHelpPage.png)
6. Also, you can update your information:
![playerInfos page](assets/playerInfosPage.png)

---

## Initial testing Database

To run provided tests successfully I recommand to use the provided database:
![tests db](assets/initialeTestingDataBase.png)

Otherwise, you can update your own tests data.

---

⚓ Please refer to the github repo [QuizLab](https://github.com/abdorah/QuizLab) for the console version.