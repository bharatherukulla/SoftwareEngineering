import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ClassGrades {
Map<String, String> classGrades = new HashMap<String, String>();
	
	public ClassGrades() {
		
		classGrades.put("Bob", "A");
		classGrades.put("Mary", "C");
		classGrades.put("Sarah", "B");
		classGrades.put("Philip", "A");
		classGrades.put("Greg", "F");
		
	}
	
	public void printClassGrades() {
		Iterator<Entry<String, String>> entries = classGrades.entrySet().iterator();
		while (entries.hasNext())
		{
			Entry<String, String> entry = entries.next();
			System.out.println("Key = "+entry.getKey() + ", Value = "+entry.getValue());
		}
	}
	
	public void printClassGrades2() {
		for(Map.Entry<String, String> entry : classGrades.entrySet())
		{
			System.out.println("Key = "+entry.getKey()+", Value = "+ entry.getValue());
		}
		
		for(String key : classGrades.keySet())
		{
			System.out.println("Key = "+key);
		}
		for(String value : classGrades.values())
		{
			System.out.println("Value = "+value);
		}
	}
}