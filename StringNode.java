public class StringNode {
    private String value;
    private StringNode next;

    public StringNode(String value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StringNode getNext() {
        return next;
    }

    public void setNext(StringNode next) {
        this.next = next;
    }
}

