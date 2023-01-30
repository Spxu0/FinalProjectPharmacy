public class Node<T>{
    private String ID;
    private String name;
    private String company;
    private float price;
	private Node<T>next;
	
	public Node(String iD, String name, String company, float f) {
        ID = iD;
        this.name = name;
        this.company = company;
        this.price = f;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
	// public Node<T> getNext(){
	// 	return next;
	// }
	// public void setNext(Node<T>node) {
	// 	this.next = node;
	// }
	// public T getData() {
	// 	return data;
	// }
	// public String toString() {
	// 	return String.valueOf(data);
	// }
}