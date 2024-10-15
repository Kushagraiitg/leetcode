class MyLinkedList {

    static class Link {
        int val;
        Link next;

        Link(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Link head;
    private Link tail;
    private int size;

    public MyLinkedList() {
        head = new Link(0); // Dummy node
        tail = head;        // Tail starts as the dummy node
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1; // Index out of bounds
        }
        Link current = head.next; // Skip dummy node
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }
    
    public void addAtHead(int val) {
        Link newNode = new Link(val);
        newNode.next = head.next; // Link to the first real node
        head.next = newNode;       // Insert new node after dummy
        if (size == 0) {
            tail = newNode; // Update tail if the list was empty
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Link newNode = new Link(val);
        tail.next = newNode; // Link new node after tail
        tail = newNode;      // Update tail to the new node
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return; // Invalid index
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Link newNode = new Link(val);
        Link current = head; // Start at dummy node
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        newNode.next = current.next; // Link to the next node
        current.next = newNode;       // Insert new node
        if (index == size) {
            tail = newNode; // Update tail if added at the end
        }
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return; // Invalid index
        }
        Link current = head; // Start at dummy node
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next; // Bypass the node to be deleted
        if (index == size - 1) {
            tail = current; // Update tail if last node is deleted
        }
        size--;
    }
}

// Usage:
// MyLinkedList obj = new MyLinkedList();
// int param_1 = obj.get(index);
// obj.addAtHead(val);
// obj.addAtTail(val);
// obj.addAtIndex(index, val);
// obj.deleteAtIndex(index);
