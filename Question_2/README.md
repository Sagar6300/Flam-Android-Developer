# MyHashMap (C++ Implementation)
This project is a simple C++ implementation of a HashMap.
It allows you to store key-value pairs, retrieve values, and remove entries.
The implementation uses separate chaining with linked lists to handle collisions.

## What This Code Can Do
Store Key-Value Pairs: Add entries to the map using the put() function.
Get Values by Key: Retrieve a value by its key using the get() function.
Remove a Key: Delete a key-value pair from the map using the remove() function.
Handles Collisions: Uses linked lists to manage keys that hash to the same index.

## How It Works
The map is built using:
Fixed-Size Array (Bucket Array): Holds pointers to linked lists of entries.
Linked Lists: Each index in the array contains a linked list for handling multiple keys with the same hash.
Hash Function: A simple modulo-based hash to map keys to array indices.

## Technologies Used
Technologies used in this code:
C++: Programming language used for the implementation.
Linked Lists: To handle collisions in the hashmap.
Hash Function: Uses the modulo operation to map keys.

## What You’ll Find in the Code
The project contains:

A MyHashMap class that supports put(), get(), and remove() methods.

A main() function that shows how to use the MyHashMap class.

Simple and clear logic that demonstrates basic hash map functionality in C++.

## Output
![image](https://github.com/user-attachments/assets/807f83de-31f8-4aa5-ac01-d70e0908195d)

