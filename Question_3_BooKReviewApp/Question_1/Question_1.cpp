#include <iostream>
#include <unordered_map>
using namespace std;

class LRUCache {
    struct Node {
        int key, value;
        Node* prev;
        Node* next;
        Node(int k, int v) {
         key=k;
         value=v;
         prev=nullptr;
         next=nullptr;
        }
    };

    int capacity;
    unordered_map<int, Node*> cache;
    Node* head;
    Node* tail;

    void addToFront(Node* node) {
        node->next = head->next;
        node->prev = head;
        head->next->prev = node;
        head->next = node;
    }

    void removeNode(Node* node) {
        node->prev->next = node->next;
        node->next->prev = node->prev;
    }

    void moveToFront(Node* node) {
        removeNode(node);
        addToFront(node);
    }

    Node* removeLRU() {
        Node* lru = tail->prev;
        removeNode(lru);
        return lru;
    }

public:
    LRUCache(int cap) : capacity(cap) {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head->next = tail;
        tail->prev = head;
    }

    int get(int key) {
        if (cache.find(key) == cache.end()) return -1;
        Node* node = cache[key];
        moveToFront(node);
        return node->value;
    }

    void put(int key, int value) {
        if (cache.find(key) != cache.end()) {
            Node* node = cache[key];
            node->value = value;
            moveToFront(node);
        } else {
            if (cache.size() == capacity) {
                Node* lru = removeLRU();
                cache.erase(lru->key);
                delete lru;
            }
            Node* newNode = new Node(key, value);
            addToFront(newNode);
            cache[key] = newNode;
        }
    }

    ~LRUCache() {
        Node* curr = head;
        while (curr) {
            Node* temp = curr;
            curr = curr->next;
            delete temp;
        }
    }
};

int main() {
    LRUCache lru(2);
    lru.put(1, 1);
    lru.put(2, 2);
    cout << lru.get(1) << endl;
    lru.put(3, 3);              
    cout << lru.get(2) << endl; 
    lru.put(4, 4);             
    cout << lru.get(1) << endl; 
    cout << lru.get(3) << endl; 
    cout << lru.get(4) << endl; 
    return 0;
}
