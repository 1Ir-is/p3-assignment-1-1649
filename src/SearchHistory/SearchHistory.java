package SearchHistory;

public class SearchHistory {
    static final int MAX = 1000;
    int top;
    String a[] = new String[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return (top < 0);
    }
    SearchHistory()
    {
        top = -1;
    }

    void push(String x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        }
        else {
            a[++top] = x;
        }
    }

    String pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        }
        else {
            String x = a[top--];
            return x;
        }
    }

    String peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        }
        else {
            String x = a[top];
            return x;
        }
    }

    void print(){
        System.out.println("Search Histories: ");
        for(int i = top;i>-1;i--){
            System.out.println(" "+ a[i]);
        }
    }

}
