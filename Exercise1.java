package Week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an instance of an ArrayList of String called employeeNames and add 5 elements
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Mark");
		employeeNames.add("Ben");
		employeeNames.add("Evelyn");
		employeeNames.add("Jane");
		employeeNames.add("Vanessa");
	
	
		//Create an instance of a HashSet of Integer called ids and add 5 elements
		Set<Integer>ids = new HashSet<Integer>();
		ids.add(6);
		ids.add(4);
		ids.add(5);
		ids.add(1);
		ids.add(2);
		System.out.println(ids);
		 
		//Create an instance of a HashMap of Integer, String called employeeMap 
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//Create a variable int i = 0; then iterate over ids using an enhanced for loop. Inside the enhanced for loop use employeeMap.put() 
		//to add a new entry to the map. The entry should consist of a key that is the id in the enhanced loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList. 
		//Increment i so that each iteration grabs the next element in the ArrayList
		int i=0;
		for (Integer idsnum : ids){
			employeeMap.put(idsnum, employeeNames.get(i));
			i++;
		}
		//use the key for each current iteration to print to the console both the current key and its 
		//associated value in the map.
		System.out.println( "Key  Value" );
		Set<Integer> employeeKey = employeeMap.keySet();	
		for (Integer key : employeeKey) {
			System.out.println( key + " : " + employeeMap.get(key));
		}
		
		//Create a StringBuilder called idsBuilder.
		//Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		//Print the result of idsBuilder.toString() to the console.

		StringBuilder idsBuilder = new StringBuilder();
		for (Integer idsBuil : ids) {
		idsBuilder.append(idsBuil + "-");
		}
		System.out.print("idsBuilder is --> ");
		System.out.println(idsBuilder.toString());		
		
		//Create another StringBuilder called namesBuilder.
		//Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
		//Print the result of namesBuilder.toString() to the console.

		StringBuilder namesBuilder = new StringBuilder();
		for (String names : employeeNames ) {
			namesBuilder.append(names + " ");		
		}
		System.out.print("namesBuilder is --> ");
		System.out.println(namesBuilder.toString());
	}

}
