import java.util.*;
import java.util.List;

public class Names {

	List<int[]> theList;
	List<int[]> gameBoard;
	int STATUS_VALUE = 0;
	int FLAGGED = 4;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void useNamesWithIntencions() {
		
		int c = 35; //what is this?
		
		int myAge = 35; //oh! I see
		int yearsAfterBirth = 35;
		int elapsedSprings = 35; //I actually born in autumn
	}

	
	//the Minesweeper example
	
	public List<int[]> getThem(){//WROMG
		
		List<int[]> list1 = new ArrayList<int[]>();
		for(int[] x : theList) {
			if(x[0] == 4) 
				list1.add(x);
		}
		
		return list1;
	}
	
	
	public List<int[]> getFlaggedCells(){//Right
		List<int[]> flaggedCells = new ArrayList<int[]>();
		
		for(int[] cell : gameBoard) {
			if(cell[STATUS_VALUE] == FLAGGED)
				flaggedCells.add(cell);
		}
		
		return flaggedCells;
	}
	
	
	//Another example with custom class
	 /*public List<Cell> getFlaggedCells() {
		 List<Cell> flaggedCells = new ArrayList<Cell>();
		 for (Cell cell : gameBoard)
		 if (cell.isFlagged())
		 flaggedCells.add(cell);
		 return flaggedCells;
		 }*/
	
	
	//don't name a list which is not a list
	public void DescribeList() {
		
		int studentsList = 30; //Wrong
		List<String> studentsNameList = new ArrayList<String>();//Right
		int studentsCount = 30; // //Right
		
	}
	
	//don't use names with minimal variations
	
	public void minimalVariation() {
		
		String theWritingOfTheWall = "Can you see the writing of the wall";
		
		String theWritingOnTheWall = "Can you see the writing on the wall";//see the difference
	}
	
	//Make meaningful distinctions
	 public void meaningfulDistinction() {
		 
		 String myDogsName = "Kai";
		 String theNameOfMyDog = "KAI";//Wrong
		 String myDogsNameUppercased = "KAI";//Right
	 }
	
	 
	 //Use names that can be pronounced
	 public void pronounceableNames() {
		 
		 String myCrshNm = "Tallulah";
		 String myCrsshName= "Tallulah";//Right
	 } 
	 
	 //Use searchable names
	 public void searchableNames() {
		 int c = 7; //many c's in the code
		 int capitalSinsCount = 7;//searcheable
	 }
	 
	 //avoid codifications
	 //no example
	 
	 //avoid hungarian notation
	 //I don't even know hungarian notation
	 
	 //no prefix are needed
	 
	 //don't prefix interfaces
	 //sorry but I work with C#
	 
	 //Avoid mental assignments
	 //I'm that smart
	 
	 //classes names must not be verbs
	 
	 //Methods must be verbs
	 
	 public int countMyPets(String pets[]) {
		 
		 return pets.length;
	 }
	 
	 
	 //when overload constructors make a static method which describe arguments 
	 public Animal createAnimal(String petName, String specieName) {
		 //this is my best example
		 if(petName == null)
			 return Animal.AnimalForWild(specieName);
		 else 
			 return Animal.AnimalForPet(petName, specieName);
		 
	 }
	 
	 //avoid inside jokes as names
	 
	 public String useFrankSladeFlamethrower() {
		 return "Burn this place!!!";
	 }
}
