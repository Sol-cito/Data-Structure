## Lecture 7 - Tree



#### 1. When do we use tree ?

- Categorizing - makes **search** easier.
- leveling - **logical level**.



#### **2. Structure of tree**

- Tree consists of nodes, and parent nodes and child nodes are linked level by level.
- **Root node : ** the node on the very top of a tree.
- **Sub tree** : literally sub tree when root node is removed.
- **Leaf node : **the nodes that do not have child nodes. The ones on the bottom.
- If there is a **cycle**, **it is not a tree structure (it is called 'graph'**).
- **Root node has no inbound link,** whereas **other nodes have only one inbound link**. If a node has more than two inbound links, it is not tree but graph.
- **Leaf nodes have no outbound link.**



#### **3. Binary tree**

- Definition : **every node has two or less outbound links.**

##### (1) Perfect Binary Tree (포화 이진 트리)

-  All interior nodes have two children and all leaves have the same depth or same level

![[image(4)]](https://media.geeksforgeeks.org/wp-content/uploads/binary_tree-1.png)

[Link : https://www.geeksforgeeks.org/perfect-binary-tree-specific-level-order-traversal/]

##### (2) Complete Binary Tree (완전 이진 트리)

- Every node other than the leaves has two children.

[![?](https://web.cecs.pdx.edu/~sheard/course/Cs163/Graphics/CompleteBinary.jpg)](https://web.cecs.pdx.edu/~sheard/course/Cs163/Doc/FullvsComplete.html)

[Link : https://web.cecs.pdx.edu/~sheard/course/Cs163/Doc/FullvsComplete.html]



#### 4. Implementation 

- If a tree is complete or perfect binary tree, it is okay to implement it by array. But if not, memory leaks take place.
- Therefore, we have to use **a pointer** which points out its child nodes.



#### 5. Traversal (순회)

**(1)** **Pre-order traversal (전위 순회)** : Root -> Left -> Right

- Implemented by stack, recursion...

**(2) Post-order traversal (후위 순회)** : Left- > Right -> Root

- Implemented by recursive call.

```
struct node *nodeptr;
void postorder(struct node *tree_ptr){
	if(tree_ptr){
		postorder(tree_ptr -> left);
		postorder(tree_ptr -> right);
		printf("%d", tree_ptr -> info);
	}
}
```

- The code above shows how to implement postorder traversal. Pointer, firstly, goes deep into the bottom and finds a leaf node that is located in the very left side of the tree.
- After printing out the node's info, it recursively goes back to another postorder call to print out the right node, if it exists.

**(3) In-order traversal (중위순회)** : Left -> Root -> Right

