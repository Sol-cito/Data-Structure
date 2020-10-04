## Lecture 4 - Queue



#### 1. Definition of Queue & its abstract data type

- When an element is inserted into one side, a different element is removed from the other hand.
- **First in, first out.**
- In OS, Queue is used in various way, in particular, when tasks are scheduled.
-  The difference between Queue from Stack is **index pointer.** 
  - In Stack, **index pointer is always located on the top**, so it can point out element that is going to be removed, and also the spot where a new element will be inserted into. There can be only one pointer because removal and insertion take place on the same spot.
  - On the other hand, in Queue, there need to be **two index pointers** one of which should point out where an element is removed, whereas the other one has to be on the spot in which a new element is inserted.
  - Both in Stack and Queue, **programmers cannot reach or grab those pointers but they only can use its method**.


#### 2. When do we use stack?

- CPU management - FCFS (First-Come First-Served) scheduling.
  - Tasks are stored in **ready queue** waiting for CPU to handle themselves. When CPU finishes a task, it pulls out - **Delete method of Queue** - next task from the ready queue and starts working on it.

#### 3. Circular Queue -> Very important.

- When queue is full and rear pointer reaches the end (MAX_INDEX), it cannot move forward
- But there might be some spaces behind front pointer if Enqueue orders were executed.
- In that case, we can move rear pointer onto the empty spaces to preventing memory waste.
- To do this, we have to differentiate **when queue is empty ** and **when queue is full**, because if rear and front pointers are on the same spot it is hard to distinguish which status is which.
- Modular operation and one empty space of queue are key to this problem.
- Many blogs deal with this techniques, so please refer to other's brilliant ideas. 

