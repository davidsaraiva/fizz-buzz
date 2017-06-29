# Fizz Buzz

Fizz buzz is a group word game for children to teach them about division. Players take turns to count incrementally, replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz".

([see Wikipedia](https://en.wikipedia.org/wiki/Fizz_buzz))

## About this exercise

<b>Step 1</b>

Write an application that prints out the following for a contiguous range of numbers:

* 'fizz' for numbers that are multiples of 3 
* 'buzz' for numbers that are multiples of 5
* 'fizzbuzz' for numbers that are multiples of 15.

If I run the program over a range from 1-20 I should get the following output: 
```
1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz.
```

<b>Step 2</b>

Enhance existing FizzBuzz solution to perform the following: 

* If the number contains a three output the text 'lucky'. This overrides any existing behaviour 

If I run the program over a range from 1-20 I should get the following output: 
```
1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz.
```

<b>Step 3</b>

Enhance existing solution to perform the following: 

* Produce a report at the end of the program showing how many times the following were output.

If I run the program over a range from 1-20 I should get the following output: 
```
1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10
```
(Integer is 10 because there were 10 numbers that were not altered in any way).


## Prerequisites

For executing this scripting you should have configured in your environment.

* [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - JVM

## Installation/Run

To run the application execute the script run.bat or run.sh included in the solution folder.

Example:
```sh
run.bat 1 20
./run.sh 1 20
```

The arguments represent minimum and maximum range of values for output ([minRange , maxRange]).
<p></p><b>Note:</b> In order to mantain the exercise simplicity only positive values are considered valids.

## Tests

You can perform some unit and integration tests executing the following commands:

Unit tests:
```
gradlew testUnit
```

Integration tests:
```
gradlew testIntegration
```

You can add --info or --debug to the command for additional stack trace.

## Author
* **David Saraiva** 
