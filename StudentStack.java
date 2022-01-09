class StackOverflow extends Exception{
    public String toString(){
        return "Stack is full";
    }
}

class StackUnderflow extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}

class Stack{
    private int size;
    private int top=-1;
    private int s[];

    public Stack(int sz){
        size=sz;
        s = new int[sz];
    }

    public void push(int x) throws StackOverflow{
        if(top==size-1)
            throw new StackOverflow();
        top++;
        s[top]=x;
    }

    public int pop(int x) throws StackUnderflow{
        if(top==-1)
            throw new StackUnderflow();
        x=s[top];
        top--;
        return x;
    }

}

public class StudentStack {
    public static void main(String[] args) throws Exception{
        Stack st = new Stack(5);
        try {
            st.push(10);
            st.push(20);
            st.push(13);
            st.push(15);
            st.push(11);
            st.pop(10);
        }
        catch(StackOverflow s){
            System.out.println(s);
        }
    }
}
