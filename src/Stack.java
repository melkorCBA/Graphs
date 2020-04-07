public class Stack{
    public int [] stackList;
    int size;
    int top;

    public Stack(int size) {
        stackList=new int[size];
        top =-1;
    }

    public void push(int data){
        stackList[++top]=data;

    }

    public int pop(){
        return stackList[top--];
    }

    public int peek(){
        return stackList[top];
    }


}
