package connection;

public class sample {
	
	
	private int id;
	
	public sample(int id) {
		this.id= id;
	}
	
	public  void Display() {
		System.out.println("id=" + id);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		sample s =new sample(1);
		s.Display();
		
	}


}
