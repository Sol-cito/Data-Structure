## Lecture 3 - Stack



#### 1. Definition of Stack

- Stack is very common used data structure which literally stacks data.

- Once it stacks data, **it is impossible to take out an element not located on the top**. It is stack's distinct constraint from other data structures.

- **First In, Last Out**.

- So stack's **abstract data type** is, 'it has order among elements', and also pop() and push() method are defined.

- In stacks' abstract data type, all kinds of direct approach to an index are completely disallowed. Pop() or Push() method only allow you to change its order, indirectly.

  

#### 2. When do we use stack?

- Stack is used in various situations, as system stack, subroutine calls, calculation order, OS, compiler, recursive method, etc.

-  See this example below : 

  ```
  < Example 1 > 
  
  int a = 5;
  int b;
  b = a--;
  
  a : 4
  b : 5
  ```

  ```
  < Example 2>
  
  int a = 5;
  int b;
  b = --a;
  
  a : 4
  b : 4
  ```

  why do they throw different result ? 

- In **b = a--**, **allocate a value into b first, and subtract 1 from a**. On the other hand, **b = --a, subtract 1 from a first and allocate the value of a into b**. So the result of b value comes out differently.

- When compiler reads and compiles these codes, it puts each command order in stack, and the order of code translation depends on its location like those examples.



#### 3. Median, Postfix, Prefix notation (중위, 후위, 전위 표기법)

```
(5 + 3 * 7) / 2
```

- The expression above  is called 'median notation', which we commonly use.
- When it comes to computational calculation, however, this expression should be transitioned to other type of notation so computer can understand and calculate by using stack.

```
537*+2/
```

- So this is a prefix notation switched from the one above. 

- Computer points out each element from index 0 and puts them in a stack until it finds out an operator. 

  ```
  stack : (bottom) | 5 | 3 | 7 | (top)
  ```

- **Once an operator shows up, computer pops out two elements from the stack, calculates them and pushes the result number again.**    

  ```
  stack : (bottom) | 5 | 3 | 7 | * | (top)
  		pop 3, 7 
  		calculate 3 * 7
  		push 21
  		(bottom) | 5 | 21 | (top)
  ```

- Finally, when the stack only contains one element, which is the last result value, it returns the value and deallocate its memory space.
- This is one of the examples how stack takes its role.