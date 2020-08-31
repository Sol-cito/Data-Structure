## Lecture 2 - Array



#### 1. Definition of array

- Array stores values on memory in **consecutive order**. Each element has its own memory address and all elements are, on the memory, neighbors to each other. 

- Array is a set consisting of **index** and **value**. 

- All the element of array has the same data structure and the same memory space.

- **Index of array is abstracted(추상화)** from the address of memory for programmers. Computer searches the memory address corresponding to each index and points to it.

- **So the index always starts from zero**, because it is abstracted whereas the address of it always changes when an array is declared.

  

#### 2. Array's abstract data type (추상자료형)

- **ADT** : **Definition of objects and relative operations (객체 및 관련된 연산의 정의)**
  - ADT is to explain defined data and operations to other people.

- Data type : int, float, double...(own memory space)

- ADT Array object : <i - index, e - element >

- ADT array operation : 

  - Array create(n) : create an array

  - Element retrieve (a, i) : -if(i in index) - then return value, else return error message.

    ...



#### 3. Implement Array's operations (of Complier)

- Code snippets below are written based on C

- Create operation : 

```C
void create(int *a, int n){ // n = 5
	int i;
    for(i = 0; i < n; i ++){
        a[i] = 0; // initialize as 0
    }
}
```

- Retrieve operation : 

```
int retrieve(int *a, int i){ // i = 2
	if(i >= 0 && i < a.size){
		return a[i];
	}else{
		printf("Error\n");
		return -1;
	}
}
```

- Store value : 

```
void store(int *a, int i, int e){ // i = 3
	if(i >= 0 && i < a.size){
		a[i] = e;
	}else{
		printf("Error\n");
	}
}
```

- These operations (ADT of array) have been implemented by C compiler programmers.



#### 4. Array's dimension

- If the first array element's memory space is 'a', **the next element's address is 'a + 1 * k'.** 
- **K means memory allocation unit** (int is 8 bit. double is 16 bit).
- And the rest of them are also assigned their memory address by the same method. 
- OS approaches the address based on this principle.
- For two dimensional array, there are two way of order  : 
  - row-first order : Row elements are firstly stored in memory and the next row comes after.
  - column-first order : Column elements are firstly stored in memory and the next column comes after.
  - And this storing method is decided by complier developers.
- **행우선, 열우선 저장방식은 프로그래밍 랭귀지 마다 다르다. 따라서 본인이 사용하는 프로그래밍 랭귀지가 어떤 저장방식을 택하고 있느냐를 알고있다면, 그에 따라 배열 프로그래밍을 생각하며 할 수 있으므로 성능을 더욱 높일 수 있다.**
- Each programming language has its own way of storing array element on the memory. So if a programmer knows which way the language takes, he can manipulate array more effectively.



#### 5. Abstract array to be more efficient

- Let's say there is an array matrix (two dimensional array) which has 1,000 rows and columns.

- The problem is, the array only has 10 spots that have values and the others do not contain value (0 value).

- This kind of array obviously occupies large memory spaces and it's a waste. 

- In this case, we can abstract array from the normal format.

  ![image-20200831195451300](C:\Users\datae\AppData\Roaming\Typora\typora-user-images\image-20200831195451300.png)



- Each row tells you what value each spot (pointed by number of row and column) contains.
- For example, in line number 2, we can see array[0] [4] has the value of 9.
- In this way of abstracting, programmers can reduce wasted memory spaces and implement their program more efficiently.
- And that's where the abstraction and data structure come in to play.

