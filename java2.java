public class Main {
    public static void main(String[] args) {
        int[] stack = new int[10];
        int top = -1;
        
        stack[++top] = 1;
        stack[++top] = 2;
        stack[++top] = 3;
        
        top--;
        
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if (i < top) {
                System.out.print(" ");
            }
        }
    }
}
