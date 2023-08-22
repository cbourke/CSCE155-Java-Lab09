# Computer Science I
## Lab - Strings
### Java Version
[School of Computing](https://computing.unl.edu)  
[College of Engineering](https://engineering.unl.edu/)  
[University of Nebraska-Lincoln](https://unl.edu)  

This lab introduces you to strings and string manipulation
in Java.

## Prior to Lab

* Read and familiarize yourself with this handout.
* Read the required chapters(s) of the textbook as
  outlined in the course schedule.

## Peer Programming Pair-Up

***For students in online section(s):*** you may complete
the lab on your own if you wish or you may team up with a partner
of your choosing, or, you may consult with a lab instructor to get
teamed up online (via Zoom).

***For students in the on campus section:*** your lab instructor
may team you up with a partner.  

To encourage collaboration and a team environment, labs are be
structured in a *peer programming* setup.  At the start of
each lab, you will be randomly paired up with another student
(conflicts such as absences will be dealt with by the lab instructor).
One of you will be designated the *driver* and the other
the *navigator*.  

The navigator will be responsible for reading the instructions and
telling the driver what to do next.  The driver will be in charge of the
keyboard and workstation.  Both driver and navigator are responsible
for suggesting fixes and solutions together.  Neither the navigator
nor the driver is "in charge."  Beyond your immediate pairing, you
are encouraged to help and interact and with other pairs in the lab.

Each week you should alternate: if you were a driver last week,
be a navigator next, etc.  Resolve any issues (you were both drivers
last week) within your pair.  Ask the lab instructor to resolve issues
only when you cannot come to a consensus.  

Because of the peer programming setup of labs, it is absolutely
essential that you complete any pre-lab activities and familiarize
yourself with the handouts prior to coming to lab.  Failure to do
so will negatively impact your ability to collaborate and work with
others which may mean that you will not be able to complete the
lab.  

# Lab Objectives & Topics

At the end of this lab you should be familiar with the following

-   Understand the way Java implements and handles Strings

-   Use methods of String and understand the difference between classes
    `String` and `StringBuilder`

# Background

A string in Java is a collection of characters regarded and handled as a
single unit. The `String` class is used to represent strings, so
they are objects not primitive types. Like other objects, strings have
their own set of constructors and methods. When used with methods,
strings are passed by reference not by value. However, unlike most other
objects Strings can be instantiated without using the `new`
operator. For example, the following lines of code are all valid string
declarations:

``` java
String myString = "This is the string lab for CSE 155";
String myOtherString = new String( "This is the string lab for CSE 155" );
String anotherString = null;
String emptyString = "";
```

The reference variable `myString` refers to a string literal and
`anotherString` is a reference that points to `null`.
However, it can still be used to eventually reference a valid
`String` object. The reference variable `emptyString` does
*not* point to `null`, it is the empty string, and simply points
to a `String` object that has no characters. In Java strings are
immutable. That is, once created their contents cannot be changed.
`StringBuilder` is a `String`-like class that provides
methods to change character contents.

See the Java API for a full description of the `String` and
`StringBuilder` classes:

-   [`String`](https://download.java.net/java/early_access/jdk21/docs/api/java.base/java/lang/String.html)

-   [`StringBuilder`](https://download.java.net/java/early_access/jdk21/docs/api/java.base/java/lang/StringBuilder.html)

# Activities

This lab will familiarize you with some of these concepts. In
particular, you will complete a program that implements a common
children?s game, horse (also known as hangman). In this game, an English
word is chosen at random and its characters hidden. The player takes
turns by guessing a letter; each instance (if any) of the guessed letter
is revealed. If the user is able to guess the word before a certain
number of guessed letters then they win. If they run out of guesses then
they lose.

Most of the game mechanics have been implemented for you. However, you
will need to complete the game by implementing several methods used by
the game to manipulate and compare Strings. Clone the project for this
lab from GitHub using the following URL:

<https://github.com/cbourke/CSCE155-Java-Lab09>.

## Implementing String Manipulation Methods

1.  Open `HorseGame.java` in Eclipse. There are several methods
    already fully implemented in this file. Your task for this lab is to
    implement the following four methods:

    -   `initializeBlankString()` - This method takes one
        variable as input: a `String` variable containing the
        secret word. It should return nothing. The method should alter
        the `StringBuilder` instance so that it is of equal
        length to the secret word and set all of its values to an
        underscore. The `StringBuilder` instance will slowly
        reveal correctly guessed letters

    -   `printWithSpaces()` - This method will print the contents
        of the `StringBuilder` instance with spaces between each
        character. The method requires no input and should return
        nothing.

    -   `revealGuessedLetter()` - This method will take a
        `String` (the secret word) and a character (the user's
        guess) as input. The method should alter the
        `StringBuilder` instance in the following way: for every
        position in the secret word that contains the character passed
        in as the second argument, change the same position in the
        `StringBuilder` instance to that character. For example,
        if the secret word is: `"dinosaur"` and the
        `StringBuilder` variable is: `"________"` and the
        character passed is: `a` the method should alter the
        `StringBuilder` so that it becomes `"_____a__"`.
        The method should return `true` if any letters were
        changed and `false` otherwise.

    -   `checkGuess()` - This method checks if the
        `StringBuilder` instance is the same as the secret word
        string. The method should return `true` if they are, and
        `false` otherwise.

2.  Complete the implementation of the methods, and run the program in
    Eclipse.  Play several games to make sure the program works completely.


# Handin/Grader Instructions

1.  Hand in your completed files:

    -   `HorseGame.java`

    and make sure it compiles and runs correctly.

2.  Even if you worked with a partner, you *both* should turn in all
    files.

# Advanced Activity (Optional)

If strings are immutable, and their contents cannot be changed, why does
the following code execute as expected?

```java
String myString = "This week we?re studying Strings!";
System.out.println("myString contains: " + myString);
myString = "Next week we?re studying file I/O!";
System.out.println("myString now contains: " + myString);
```

Did the contents of `myString` change? Suppose we add another
line of code as follows:

`System.out.println( "myString now contains: "+ myString.toUpperCase() );`

What did the above line of code do? Did it also change the contents of
`myString`?
