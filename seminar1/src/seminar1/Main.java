package seminar1;

import seminar1_clase.Animal;
import seminar1_clase.Lion;
import seminar1_clase.Pug;
import seminar1_clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo=new Zoo();
		Animal lion1=new Lion("Simba");
		Lion lion2=new Lion("Nala");
		zoo.addAnimal(lion1);
		zoo.addAnimal(lion2);
		Pug pug1=new Pug("Emma");
		Pug pug2=new Pug("Stark",3);
		zoo.addAnimal(pug1);
		zoo.addAnimal(pug2);
		zoo.feedAnimals();
	}

	

}
