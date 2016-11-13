Generic. Homework 1
===================

1. Pair Utils
-------------

Create class Pair. It should have two fields representing Key and Value. 
Pair should be generic class with two type parameters one for key and one for value.

Create static PairUtils class. 

There should be following methods:
1) **equals** - verify whether two pairs equals with the same key, value types;
2) **compareTo** - compare two pairs. Key types should implement java.lang.Comparable;
3) **getValues** - get array of values for array of pairs;
4) **getKeys** - get array of keys for array of pairs;
5) **countGreaterThan** - count pairs with keys greater than specified parameter. Key type and specified parameter type should be the same;
6) **containsUniqueObjects** - check whether array of pairs contains only unique keys.
    
2. Generic Container
--------------------

Create class container the same as for https://github.com/ChangeRequest/oop.hw1 but instead of Integer it should work with elements of any type.

There should be should be following methods:
1) **size** - get container size
2) **clear** - clear all container
3) **add(E)** - add element E to the end
4) **get** - get element at specified position
5) **add(E, I)** - add element E to specified position I
6) **remove** - remove element at specified position

Create demo program which demonstrates how Container works.

3. Number Generators
--------------------

Create abstract class NumberGenerator, with only method generateNumbers.
It should return container with any of subtypes java.lang.Number and be abstract.

Create IntegerGenerator class which extends NumberGenerator and implement method generateNumbers.
Method should return Container with 10 Integers. 

Create DoubleGenerator class which extends NumberGenerator and implement method generateNumbers.
Method should return Container with 10 Doubles.

Create class Printer, which contains field NumberGenerator and method generateAndPrint.
It should generate numbers and print their sum.

NOTE: Feel free to extend classes with any additional data fields, methods, generic types and so on. 
