import java.util.LinkedList;
import java.util.Scanner;

public class myMain {
    public static class arrayStack<E> implements Stack<E>
    {
        private E[] data ; ///MY ARRAY
        private int t = -1 ; /// INDEX OF LAST ELEMENT IN THE STACK
        private static final int  CAPACITY = 7; ///default capacity for my stack

        public arrayStack()
        {
            this(CAPACITY);
        }
        public arrayStack(int c)
        {
            data = (E[]) new Object[c];
        }
        public boolean isEmpty() {
            return (t == -1);
        }
        public int size()
        {
            return t+1;
        }
        public void push ( E object)
        {
            /// should throw exception if the stack ois full
            if(t+1 == data.length) {
                System.out.println("Stack is full");
                return;
            }
            data[++t] = object;
        }
        public E pop()
        {
            if(isEmpty())
                return null;
            E answer  = data[t];
            data[t--] = null;
            return answer;
        }
        public E top()
        {
            if(isEmpty())
                return null;
            return data[t];
        }
    }
    public static class linkedListStack<E> implements Stack<E>
    {
        private LinkedList<E> data = new LinkedList<E>();
        private final int CAPACITY = 100;
        private  int t = -1;


        public boolean isEmpty() {
            return  (data.isEmpty());
        }


        public int size() {
            return data.size();
        }


        public void push(E object) {
            data.addFirst(object);
        }


        public E pop() {
            E object = data.getFirst();
            data.removeFirst();
            return object;
        }

        public E top()
        {
            return data.getFirst();
        }
    }
    public static boolean checkHtmlCode(String Code) /*Application for stack*/
    {
        Stack<String> HtmlTags = new linkedListStack<>();
        int k,j = Code.indexOf('<');
        while(j!=-1)
        {
            k = Code.indexOf('>',j+1);
            if(k==-1)
                return false;
            String tagName = Code.substring(j+1,k);
            if(tagName.startsWith("/"))
            {
                if(HtmlTags.isEmpty()) {
                    return false;
                }else {
                    if (HtmlTags.top() == tagName.substring(1))
                  HtmlTags.pop();
                }
            }else{
                HtmlTags.push(tagName);
            }
            j = Code.indexOf('<',j+1);


        }

        return false ;
    }
    public static void main(String[] args) {
        /**
        Stack<Integer> S = new linkedListStack<>();
        S.push(10);
        S.push(10);
        S.push(10);
        S.push(10);
        S.push(111);
        S.push(120);
        System.out.println("Size is "+S.size()); //6
        System.out.println("Size is "+S.pop()); ///120
        System.out.println("Size is "+S.size()); ///5
        System.out.println("Size is "+S.top()); ///111
        System.out.println("Size is "+S.size()); //5
        S.push(1200);
        S.push(12000);
        S.push(120164);
        **/
        //Scanner sc = new Scanner(System.in);
        //String Html = sc.nextLine();
        //System.out.println(" html is "+checkHtmlCode(Html));
        String f = "HamzaHassan";
        System.out.println(f.substring(0,5));

        //
    }
}
