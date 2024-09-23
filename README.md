## Brain Games
Проект представляет собой пять игр: "Проверка на честность", "Калькулятор", "НОД", "Арифметическая прогрессия", "Простое ли число?".

При запуске проекта выводится меню выбора игр, которое дополнительно включает в себя два пункта: "Приветствие" и "Выход".

``` java
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
5 - Progression
6 - Prime
0 - Exit
Your choice:
```
Необходимую игры нужно выбрать вводом соответствующего номера с клавиатуры.

В случае выбора "Приветствие" программа завершается после вводы имени игрока, поприветствовав его.
``` java
Welcome to the Brain Games!
May I have your name?

Hello, John!
```

При старте каждая из игр начинается с приветствия игрока, после чего поочередно выводятся вопросы самой игры.

Числовые ответы вводятся игроком с клавиатуры.

В случае трех подряд правильных ответов, игра закачивается и выводится поздравление игрока.

``` java
Correct!
Congratulations, John! 
```

В случае ошибки - игра прерывается, выводится сообщение о неверном ответе и программа завершается.

```java
'72' is wrong answer ;(. Correct answer was '70'
Let's try again, Bill!
```

### Hexlet tests and linter status:
[![Actions Status](https://github.com/maslievV/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/maslievV/java-project-61/actions)
[![Maintainability](https://api.codeclimate.com/v1/badges/7136acc56728446388d6/maintainability)](https://codeclimate.com/github/maslievV/java-project-61/maintainability)
[![asciicast](https://asciinema.org/a/2eCDkHnJbpLnfSWZiUKi2mWM2.svg)](https://asciinema.org/a/2eCDkHnJbpLnfSWZiUKi2mWM2)