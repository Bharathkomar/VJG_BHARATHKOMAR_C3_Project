public class Linkedlist {
    Node head;
    Node temp;
    Node newnode = new Node(5);

    public void insert(Linkedlist list, int data) {
        if (list.head.data == "NULL")
            list.head.data = newnode.data;
        else {
            temp = list.head;

            while (temp.next != "NULL") {
                temp = temp.next;
            }
            list.newnode.data=data;

        }
    }
}