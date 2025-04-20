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
}
