#Design Patterns Introduction

## Goals
1. Be able to define what makes a design pattern.
2. Recognize the benefit of using design patterns.
3. Recognize the _Builder_ design pattern.
4. Recognize the _Factory Method_ design pattern.
5. Recognize the _Singleton_ design pattern.
6. Discuss patterns that help with _Composition vs. Inheritance_

## What is a Design Pattern?
> In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem 
> within a given context in software design.
>
> -[Wikipedia](https://en.wikipedia.org/wiki/Software_design_pattern) 

Around the mid-90'sa group of developers started cataloging various common design patterns that they used to help 
implement object oriented principles.  This group was refered to as the "Gang of Four" in the Usenet group that they 
were using to collaborate with the software community.  The "GoF" released the book _Design Patterns: Elements of 
Reusable Object-Oriented Software_ and it remains to this day as a respected catalog of some of the first object 
oriented design patterns.  Not very many have been added to the collection, but as languages change, design patterns can 
change in minor ways to keep pace.    

## Design Pattern's Benefit
### Shared pattern vocabularies are POWERFUL
Using a design pattern when approaching a problem communicates a set of qualities, characteristics, and contraints that 
the pattern represents. 
### Patterns allow you to say more with less.
When you use a pattern when talking about an implementation, other developers quickly know precisely the design you have 
in mind.
### Talking at the pattern level allows you to stay "in the design" longer
Another example of "High level concepts, low level details".  Using design patterns lets you talk about a solution for a 
problem without diving into the finer details of the implementation of the solution.

## Pattern Categories
### Creational
These patterns involve object instantiation and all provide a way to decouple a client from the objects it needs to 
instantiate. 
- Builder
- Factory Method
- Singleton
### Structural
These patterns let you compose classes into larger structures.
- Decorator
- Adaptor
- Facade
### Behavioral
These patterns are concerned with how classes and objects interact and distribute responsibility.
- Strategy
- Command
- State

## _Builder_ Design Pattern
##### Use the _Builder_ pattern to encapsulate the construction of a product and allow for it to be constructed in steps. 
#### Why would I use this pattern?
This pattern shines when you have an object that can be created in steps, with default or with custom options.  
#### Benefits:
- Encapsulates the way a complex object is constructed.
- Allows objects to be constructed in a multi-step and varying process.
#### Drawbacks:
- Constructing objects requires more domain knowledge of the client than when using a _Factory_.

## _Factory_ Design Pattern
##### This pattern encapsulates object creation by letting subclasses decide what objects to create.
#### Why should I use this pattern?
It allows many different types of classes to be generated from a single source without any knowledge of how to create 
the objects.
#### Benefits: 
- Decouples the creation of an object from it's use.

## _Singleton_ Design Pattern
##### Use this pattern when there can only be _*ONE*_ object of the class.  It provides a way to get that one instance 
and prevent other objects from being created. 
#### Why should I use this pattern?
This pattern provides you with a way of not having to manage the state of multiple objects that should have the same 
information.  Think of classes designed to hold the state of configurations or other critical information that should 
always be uniform across the application.
#### Benefits:
- Reduced chance of accidentally having a multiple objects creating out of sync behavior in the application.
