public class LinkedList<T>{
	private Node<T>head;
	private Node<T>tail;
	public LinkedList() {
		this.head = null;
	}
	public Node<T> getHead(){
		return head;
	}
    public Node<T> getTail(){
		return tail;
	}

	public void setTail(Node<T>newNode) {
		this.tail = newNode;
	}
    public void setHead(Node<T>newNode) {
		this.head = newNode;
	}
	public boolean isEmpty() {
		if(getHead() == null) {
			return true;
		}
		return false;
	}
	public void addMedicine(Node<T>newNode) {
		if(isEmpty()) {
            setHead(newNode);
            setTail(newNode);
		}
		else {
            
		//Node<T>curr = getHead();
		
		newNode.setNext(getHead());
        setHead(newNode);
			
		}
	}
	public void deleteMedicineByNameAndId (String name ,String id  ) {
        Node<T> curr=getHead();
        Node<T> prev=null;
        if (getHead() ==null){
            System.out.println("there is no medicine");
        }

        else if( getHead()==getTail()){
            setHead(null);
            setTail(null);
        }
        
        else if (getHead() !=null && ((getHead().getName()==name &&getHead().getID()==id))){
            setHead(getHead().getNext());
        }

        else {
            
                while(curr !=null && !(curr.getName().equals(name) && curr.getID().equals(id)) ){
                    prev=curr;
                    curr=curr.getNext();
                }
                if(curr!=null){
                 prev.setNext(curr.getNext());
                 if (curr == tail) tail = prev;
                }

            }
        }
   


    
    
    public void searchForMedicineUsingGivenID(String id){
        Node<T> curr =getHead();
        boolean flag=true;
        if(isEmpty())System.out.println("there is no medicine");

        else if (!isEmpty()){
            while (curr!=null){
                if(curr.getID().equals(id)){
                    System.out.println("the medicine are there ");
                    flag=false;
                }
                curr=curr.getNext();
            }
            if (flag)System.out.println("incorrect ID");
        
        }
        

    }
    public void updateMedicineUsingTheID (String id, String name ,String company ,float price){
        Node<T>curr=getHead();
        boolean flag=true;
        while(curr!=null){
            if(curr.getID().equals(id)){
                curr.setCompany(company);
                curr.setName(name);
                curr.setPrice(price);
                flag=false;
            }
            curr=curr.getNext();
        }
        if (flag)System.out.println("incorrect ID");
    }
    void sortList() {
        Node<T> current = head;
        while (current != null) {
            Node<T> index = current.getNext();
            while (index != null) {
                if (current.getID().compareTo(index.getID()) > 0) {
                    String id = current.getID();
                    String name = current.getName();
                    String company = current.getCompany();
                    float price = current.getPrice();

                    current.setID(index.getID());
                    current.setName(index.getName()); 
                    
                current.setCompany(index.getCompany());
                current.setPrice(index.getPrice());

                index.setID(id);
                index.setName(name); 
                index.setCompany(company);
                index.setPrice(price); 
                }
                index = index.getNext();
            }
            current = current.getNext();
        }
    }
   // public void printAllMedicines (){}

	public void printAllMedicines() {
		if(!isEmpty()) {
		Node<T>curr = getHead();
		while(curr != null) {
            System.out.println("[ID: "+curr.getID()+" Name: "+curr.getName()+" Company: "+curr.getCompany()+" Price: "+curr.getPrice()+"]");
            curr = curr.getNext();
		}
		}else {
			System.out.println("The LinkedList is an Empty!");
		}
	}
}