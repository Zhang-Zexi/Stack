/**
 * @ClassName ArrayStack
 * @Description
 * @Author zhangzx
 * @Date 2019/3/27 10:21
 * Version 1.0
 **/
public class ArrayStack<E> implements Stack<E> {

    Array<E> arry;

    public ArrayStack(int capacity) {
        arry = new Array<>(capacity);
    }

    public ArrayStack() {
        arry = new Array<>();
    }

    @Override
    public int getSize() {
        return arry.getSize();
    }

    @Override
    public boolean isEmpty() {
        return arry.isEmpty();
    }

    public int getCapacity() {
        return arry.getCapacity();
    }

    @Override
    public void push(E e) {
        arry.addLast(e);
    }

    @Override
    public E pop() {
        return arry.removeLast();
    }

    @Override
    public E peek() {
        return arry.getLast();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack :");
        res.append('[');
        for(int i = 0; i < arry.getSize(); i++) {
            res.append(arry.get(i));
            if(i != arry.getSize() - 1){
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
