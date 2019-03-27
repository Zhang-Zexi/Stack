/**
 * @ClassName Main
 * @Description
 * @Author zhangzx
 * @Date 2019/3/27 10:48
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>();
        for(int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
