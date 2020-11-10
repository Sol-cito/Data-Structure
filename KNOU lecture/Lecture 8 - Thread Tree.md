## Lecture 8 - Thread Tree

![Threaded binary tree - Wikipedia](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/Threaded_tree.svg/1200px-Threaded_tree.svg.png)

#### 1. What is thread tree ?

- In normal binary tree structure, each tree node has **space for left and right linked node** such as below : 

```Java
TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
}
```

- But on leaf nodes and on those nodes that do not have any left or right nodes, **those spaces occupy memory but not used**.
- So the idea is, **let's make another tree structure - thread tree- to use those wasted spaces**.
- A pointer called **'thread pointer'** is added into each node.
- Using thread pointer, **pre-order, in-order, post-order traversals** can be easily implemented.

- On the downside, **it takes more time to do inserting and deleting operation** because all the thread must point out the same target.

- Also, **extra spaces are needed** for additional pointers.

#### 2. Implementation

- In-order traversal implementation

```
void inorder(struct Tnode *firstIn){
	struct Tnode *p;
	p = firstIn;
	while(p != null){
		print("%d", p -> info);
		p = p->right_thread;
	}
}
// firstIn indicates not the root node but the first node of traversal
```

- Like above, traversal is executed by starting from the firstin node, not from the root node.
- **We also can use empty spaces of pointer as thread pointers** in order to reduce memory leaks.
- **If there are N nodes in a binary tree structure, we can always find (n + 1) empty pointer spaces**.
  - The number of pointer spaces in binary tree with n vertex : **2n**
  - The number of links in binary tree with n vertex : **n - 1**
  - Therefore, **2n - (n - 1) = n + 1** 

- So we can utilize this (n+1) links as thread pointers (**Threaded binary tree**).