# LRU Cache (C++ Implementation)
This is a simple C++ implementation of an LRU (Least Recently Used) Cache.
It allows you to store key-value pairs, automatically evicts the least recently used items,
and provides fast access using a combination of a doubly linked list and a hashmap.

## What This Code Can Do
Store Key-Value Pairs: You can add key-value pairs to the cache.
Get Values by Key: Retrieve a value by its key.
Automatic Eviction: If the cache reaches capacity, it removes the least recently used item.
Efficient Operations: Lookup, insert, and remove operations all happen in O(1) time.

## How It Works
The cache is built using:
Doubly Linked List: To keep track of the order of usage.
Hashmap (unordered_map): For fast key lookup.
When you access or add a key, it moves to the front as the most recently used.

## Technologies Used
Technologies used in this code:
C++: Programming language used for the implementation.
Doubly Linked List: To maintain the usage order of cache entries.
Hashmap: For fast access to keys.

## What You’ll Find in the Code
The project contains:

A LRUCache class that handles storing, retrieving, and managing the cache.

A main() function that demonstrates how the cache works.

Simple, easy-to-understand code that explains the logic clearly.

## Output
![image](https://github.com/user-attachments/assets/7a995c9f-23b2-4e44-96d5-37dafe7fb4f2)



