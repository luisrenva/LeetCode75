package leetcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "ADOBECODEBANC";
//		String s= "ADBCBAC";
		String t = "ABC";
		String res=findChain(s, t);
		System.out.println(res);
		

	}
	
	private static String findChain(String s, String t) {
        int rigth=0;
        String response = "";
        t = t.toUpperCase();

        int targetSize = t.length()-1;
        String [] array = s.split("");
        Map<String, Integer> map = new HashMap<>();
        int i=0;
        // I also need to know if the map already has the 3 keys
        int chain =1;
        StringBuilder sb = new StringBuilder("");
        String localABC = "ABC";


        while(rigth < s.length()) {
            String c = array[rigth];

//            if (rigth == targetSize) {
//                if (c.contains(t)) { 
//                    return "";
//                }
//
//            }
//
            if (map.containsKey(localABC)) {
            	int total = map.get(localABC);
            	if (total == 3) {
                    map.put(localABC, 0);
                    chain=0;
                    map.put(sb.toString(), sb.length());
                    sb = new StringBuilder();
//                    continue;
            	}
            }

            sb = sb.append(c);
            if (t.contains(c)) {
                map.put(localABC, chain);
                i++;
                chain++;
            }
            rigth ++;         //ADOBEC ODE BANC   
        }

        for (Map.Entry<String, Integer> val: map.entrySet()) {
            System.out.println("Key: "+val.getKey() + ",    val: " + val.getValue());
        }

        return "";  //ADOBEC ODEBANC
		
	}

}
