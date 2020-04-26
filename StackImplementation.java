package Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackImplementation {
    public static void main(String[] args) {
        CustomizedStack<Integer> cs = new CustomizedStack<Integer>();
    }
}


class CustomizedStack<E> {
    private ArrayList<E> arrayList;
    private int pointer;

    public CustomizedStack() {
        arrayList = new ArrayList<>();
        pointer = 0;
    }

    public void push(E element) {
        arrayList.add(element);
        pointer++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E element = arrayList.get(--pointer);
        return element;
    }

    public boolean isEmpty() {
        if (pointer == 0) {
            return true;
        }
        return false;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arrayList.get(pointer - 1);
    }

    public void clear() {
        pointer = 0;
    }

}