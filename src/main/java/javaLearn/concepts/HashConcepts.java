package javaLearn.concepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class HashConcepts {

	public static void main(String[] args) {
		functionOfHash();
	}

	public static void functionOfHash()
	{
		Map<String,Integer> map = new HashMap<>();
		map.put("Debasis", 1);
		
		String[][] logs1 = new String[][] {
		      { "58523", "user_1", "resource_1" },
		      { "62314", "user_2", "resource_2" },
		      { "54001", "user_1", "resource_3" },
		      { "200", "user_6", "resource_5" },
		      { "215", "user_6", "resource_4" },
		      { "54060", "user_2", "resource_3" },
		      { "53760", "user_3", "resource_3" },
		      { "58522", "user_22", "resource_1" },
		      { "53651", "user_5", "resource_3" },
		      { "2", "user_6", "resource_1" },
		      { "100", "user_6", "resource_6" },
		      { "400", "user_7", "resource_2" },
		      { "100", "user_8", "resource_6" },
		      { "54359", "user_1", "resource_3"},
		    };
		    
		 HashMap<String,TreeSet<String>> userTimeStamp = new HashMap<>();
		 
		 for(int i=0 ;i<logs1.length;i++)
		 {
			 String user = logs1[i][1];
			 String timeStamp = logs1[i][0];
			 
			 TreeSet<String> userTime=new TreeSet<>();
			 if(userTimeStamp.get(user)==null)
			 {
				 userTime.add(timeStamp);
			 }
			 else {
				userTime = userTimeStamp.get(user);
				userTime.add(timeStamp);
			 }
			 userTimeStamp.put(user, userTime);
		 }
		 //System.out.println(userTimeStamp.toString());

			HashMap<String, String[]> userTimeStart = new HashMap<>();
			for(Map.Entry<String, TreeSet<String>> userstamp: userTimeStamp.entrySet())
			{
				String[] time =new String[2];
			//	System.out.print(userstamp.getValue().first().toString());
				
				time[0] = userstamp.getValue().first().toString();
				time[1] = userstamp.getValue().last().toString();
				userTimeStart.put(userstamp.getKey(), time);
			}
			System.out.println(userTimeStart.toString());
	}
}
