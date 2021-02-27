package seminar1_clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animalList;
	
		public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
		super();
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
		public Zoo() {
			super();
			this.zookeeper=new Zookeeper("Gigel");
			this.animalList=new ArrayList<>();
		}

	public void addAnimal(Animal a) {
		this.animalList.add(a);
	}
	
	public void feedAnimals() {
		for(Animal a : animalList) {
			this.zookeeper.feed(a);
		}
	}
}
