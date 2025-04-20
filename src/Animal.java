
public class Animal {

	public String petName;
	public String specieName;
	
	public Animal(String petName, String specieName) {
		
		this.petName = petName;
		this.specieName = specieName;
		
	}
	
	public Animal(String specieName) {
		
		this.specieName = specieName;
		
	}
	
	public static Animal AnimalForPet(String petName, String specieName) {
		return new Animal(petName, specieName);
	}

	public static Animal AnimalForWild(String specieName) {
		
		return new Animal(specieName);
	}
}
