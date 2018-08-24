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
	
	public void addAt(int data, int index){
		Node tem = head;
		int ct = 0;
		try{
			if(index == 0){
				Node node = new Node(data);
				node.next = head;
				this.head = node;
			} else{
				while(ct < index-1){
					ct ++;
					tem = tem.next;
				}
					Node node = new Node(data);
					Node hold = tem.next;
					tem.next = node;
					node.next = hold;
			}
			this.count ++;
			System.out.println("Data " +data+ " is added at Position "+index );
		}catch(Exception e){
			System.out.println("Index is Out of Bound.."+e);
		}
	}
	
	public void update(int data, int index){
		Node tem = head;
		int ct = 0;
		try{
				while(ct < index){
					ct ++;
					tem = tem.next;
				}
					tem.data = data;
		}catch(Exception e){
			System.out.println("Index is Out of Bound.."+e);
		}
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
	
	public void deleteAt(int index){
		Node tem = head;
		Node previous = null; 
		int count = 0;
		try{
			if(index == 0){
				head = tem.next;
				tem = null;
			}else{
				while(count <= index-1){
					previous = tem;
					tem = tem.next;
					count ++;
				}
				previous.next = tem.next;
				tem =null;
			}
			System.out.println("Data Delete at "+index);
		}catch(Exception e){
			System.out.println("Index is Out of Bound.."+e);
		}
	}
}