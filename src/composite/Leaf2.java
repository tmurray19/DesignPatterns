package composite;

public class Leaf2 implements BaseComponent {

	private int id;
	private String name;
	
	public void printName() {
		System.out.println(getClass().getSimpleName());
	}

	public Leaf2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
