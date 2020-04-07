public class Queue {
    public int [] queueList;
    public int size;
    public int top;
    public int nIndex;

    public Queue(int size) {

        queueList=new int [size];
        top=0;
        nIndex =0;
    }

    public void push(int data){
        queueList[nIndex++]=data;
    }

    public int peek(){
        return queueList[top];
    }

    public int pop(){

        return queueList[top++];
    }

    public boolean isEmpty(){
       return nIndex==top ? true : false;


    }
}
