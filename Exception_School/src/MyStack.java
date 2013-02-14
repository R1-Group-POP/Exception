
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Patrick
 */
public class MyStack {

    private final int SIZE = 2;
    private int[] mem;
    private int top = 0;

    public MyStack() {
        mem = new int[SIZE];
    }

    public void push(int i) throws StackIsFullException {
        if (SIZE == top) {
            throw new StackIsFullException("Din stack er fuld spade");
        }
        mem[top++] = i;
    }

    public int pop() throws StackIsEmptyException {
        if (top == 0) {
            throw new StackIsEmptyException("Din stack er tom din ko");
        }
        return mem[--top];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        try {
            ms.push(2);
            ms.push(5);

            System.out.println(Integer.toString(ms.pop()));
            System.out.println(Integer.toString(ms.pop()));
        } catch (StackIsFullException | StackIsEmptyException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
