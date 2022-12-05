package Queue;


public class Queue {
    int size = 5;
    int items[] = new int[size];
    int front, rear;

    Queue(){
        front = -1;
        rear = -1;
    }

    boolean isfull(){
        if (front == 1 && rear == size - 1){
            return true;
        }else {
            return false;
        }
    }

    boolean isempty(){
        if (front == -1){
            return true;
        }else{
            return false;
        }
    }

    public void enqueue(int element){
        if (isfull()){
            System.out.println("The Array is full, Can't insert more.");
        }else {
            if (front == -1)
                front = 1;
            rear++;
            items[rear] = element;
        }
    }

    int dequeue(){
        int element;
        if (isempty()){
            System.out.println("The Array is empty, Can Insert some data.");
            return (-1);
        }else{
            element = items[front];
            if(front >= rear){
                front = rear = -1;
            }else {
                front++;
            }
            System.out.println("The Deleted Element is : " + element);
            return element;
        }
    }


    void display(){
        if(isempty()){
            System.out.println("The array is empty.");
        }else if(isfull()){
            System.out.println("The array is full.");
        }else {
            for (int j = front; j <= rear;j++){
                System.out.println( items[j] + " ");
            }
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();

        q.dequeue();

        q.enqueue(12);
        q.enqueue(24);
        q.enqueue(36);
        q.enqueue(48);

        q.display();

        q.dequeue();

        q.display();

    }

}
