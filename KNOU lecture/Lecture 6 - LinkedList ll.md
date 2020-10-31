## Lecture 6 - LinkedList ll



#### 1. LinkedList's Transformation 

- Normal LinkedList : Each node is simply linked to the next node. 
  - **Problem** : If it is needed to reach previous nodes during list search, we have to research the whole list from the front node - **inefficient**!
- **Doubly LinkedList(이중 연결 리스트)** : Each node has two links and each link points its previous and next node's address.
- **Circular LinkedList(원형 연결 리스트)** : The last node of normal linkedList has null value in it's link, but in circular linkedList, **the address of head node** occupies last node's link space.

#### 2. Implementation (C)

- Create circular linkedList

```C
typedef struct ListNode{ // define ListNode
    int data;
    struct ListNode* link;
} listNode;

typedef struct{ // define head node
    listNode* head;
} linkedList_h;

linkedList_h* createLinkedList_h(void){
    linkedList_h* H;
    H = (linkedList_h*)malloc(sizeof(linkedList_h));
    H -> head = NULL;
    return H;
}
```

- Insertion Operation

```
void addFirstNode(linkedList_h* H, int x){
	listNode* tempNode;
	listNode* NewNode;
	NewNode = (listNode*)malloc(sizeof(listNode)); // allocate space
	NewNode -> data = x; // initialize NewNode's data
	NewNode -> link = NULL; // initialize NewNode's link
}
```

```
tempNode = H -> headNode; // initialize tempNode (one that head is linked to)
while(tempNode -> link != H-> headNode){ // util tempNode != headNode
	tempNode = tempNode -> link; // move tempNode
}
NewNode -> link = tempNode -> link; // create new node
tempNode -> link = NewNode // switch link of tempNode
H -> headNode = newNode;
```



#### 3. Doubly linked list

- One of the flaws of normal linkedList is, it is hard to be directed backward. 
- Each node has **two links which are left link and right link** and each link points out its left or right node's address.

```
typedef struct ListNode{ // define ListNode
	struct ListNode* Llink; // left link
	int data;
	struct ListNode* Rlink // right link
} listNode;

typedef struct{ // define head node
	listNode* Lhead;
	listNode* Rhead;
} linkedList_h;
```

- Insertion operation

```
// [prevNode] - [RNode] ==> [prevNode] - [NewNode] - [RNode]

NewNode -> Rlink = prevNode -> Rlink; // set NewNode's Rlink
prevNode -> Rlink = NewNode // switch prevNode's Rlink
NewNode -> Llink = prevNode; // set NewNode's Llink
NewNode -> Rlink -> Llink = newNode; // set Rnode's Llink
```

