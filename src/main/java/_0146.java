import java.util.HashMap;
import java.util.Map;

/**
 * 新数据默认尾插，优先删除第一个节点，get时需要将节点挪到链表尾部
 */
public class _0146 {

    private Map<Integer, Node> map;
    private int capacity;
    private Node head; // 头结点，next指向链表第一个节点
    private Node tail; // 指向链表最后一个节点

    class Node {
        private int key;
        private int val;
        private Node prev;
        private Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public _0146(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        Node node = new Node(0, 0);
        head = node;
        tail = node;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }

        // 尾结点不需要操作
        if (node != tail) {
            deleteNode(node);
            putTail(node);
        }

        return node.val;
    }

    public void put(int key, int value) {
        // 删除已经存在的节点
        if (map.containsKey(key)) {
            Node current = map.get(key);
            deleteNode(current);
            map.remove(key);
        }

        // 删除第一个节点
        if (map.size() >= capacity) {
            if (head.next == null) {
                System.out.println();
            }
            map.remove(head.next.key);
            deleteNode(head.next);
        }

        // 新节点插入链表尾部
        Node node = new Node(key, value);
        putTail(node);
        map.put(key, node);
    }

    private void putTail(Node node) {
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
    }

    private void deleteNode(Node node) {
        // 避免删除的是尾结点
        if (node == tail) {
            tail = node.prev;
        }
        node.prev.next = node.next;
        if (node.next != null) {
            node.next.prev = node.prev;
        }
    }

}
