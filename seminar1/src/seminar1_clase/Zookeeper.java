package seminar1_clase;

public class Zookeeper {
	private String name;

	public Zookeeper(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void feed(Animal a) {
		System.out.println(this.name+" a hranit animalul "+a.getName());
	}
}
