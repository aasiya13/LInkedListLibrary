class LinkedList{
		
	Node head = null;
	Node temp = null;
	int count = 0;
	
	public LinkedList(){
		head = new Node();
		temp = head;
	}
	public void add(int data){
		if(count == 0) head.data = data;
		else{
			Node node = new Node(data); 
			temp.next = node;
			temp = node;
		}
		this.count ++;
	}
	
	public void displayAll(){
		Node tem = head;
		while(tem.next != null){
			System.out.print(" ------> "+ tem.data);
			tem = tem.next;
		}
		System.out.print(" ------> "+ tem.data+"\n");
	}
	
	// Display the element at given position 
	public void displayAt(int index){
		Node tem = head;
		int count = 0;
		try{
			while(count <= index-1){
				tem = tem.next;
				count ++;
			}
			System.out.println("Data at"+index +" is ------> "+ tem.data);
		}catch(Exception e){
			System.out.println("Index is Out of Bound.."+e);
		}
	}
}