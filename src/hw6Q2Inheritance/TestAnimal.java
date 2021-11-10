package hw6Q2Inheritance;

public class TestAnimal {
	public static void main(String[] args) {
		
	Animal animal=new Animal();
	animal.AnimalInfo();
	
	System.out.println("\n");
	
	Birds birds =new Birds();
	birds.birdsInfo();
	birds.AnimalInfo();
	
	System.out.println("\n");
	
	BullDog bullDog =new BullDog();
	bullDog.bullDogInfo();
	bullDog.dogInfo();
	bullDog.mammalInfo();
	bullDog.AnimalInfo();
	
	System.out.println("\n");
	
	Cobra cobra =new Cobra();
	cobra.cobraInfo();
	cobra.snakeInfo();
	cobra.reptileInfo();
	cobra.AnimalInfo();
	
	System.out.println("\n");
	
	
	Dog dog =new Mammal();
	dog.dogInfo();
	dog.mammalInfo();
	dog.AnimalInfo();
	
	System.out.println("\n");
	
	
	Mammal mammal =new Mammal();
	mammal.mammalInfo();
	mammal.AnimalInfo();
	
	System.out.println("\n");
	
	Reptile reptile =new Reptile();
	reptile.reptileInfo();
	reptile.AnimalInfo();
	
	System.out.println("\n");
	
	Robin robin =new Robin();
	robin.robinInfo();
	robin.birdsInfo();
	robin.AnimalInfo();
	
	System.out.println("\n");
	
	
	Snake snake =new Snake();
	snake.snakeInfo();
	snake.reptileInfo();
	snake.AnimalInfo();
	
	
	System.out.println("\n");
	
	
	}

}
