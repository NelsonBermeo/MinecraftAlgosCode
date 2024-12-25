import LinkedListLevel.LinkedList;
public class App {
    public static void main(String[] args) throws Exception {
        LinkedList LL = new LinkedList();
        LL.insertFront(2);
        LL.insertFront(5);
        LL.insertFront(3);
        LL.insertFront(7);
        LL.insert(19, 2);
        LL.display();
    }
}
