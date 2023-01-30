public class Main {
    public static void main(String[] args) {
        LinkedList<String>pharamcy=new LinkedList<>();
        Node<String>node1=new Node<String>("1","Paracetamol","ABC",158.7f);
        Node<String>node2=new Node<String>("2","Ibuprofen","XYZ",154.8f);
		Node<String>node3=new Node<String>("3","Aspirin","MNO",149.7f);
        pharamcy.addMedicine(node2);

        pharamcy.addMedicine(node1);


		pharamcy.addMedicine(node3);
        pharamcy.printAllMedicines();
        System.out.println("after sorting ");
        pharamcy.sortList();
        pharamcy.printAllMedicines();
        

    }
}