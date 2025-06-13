package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm1 = new HashMap<>();
		// put(key,value)
		hm1.put(1, "misti doi");
		hm1.put(2, "jalebi");
		System.out.println(hm1);//{1=misti doi, 2=jalebi}
		
		//putAll(Map)
		HashMap<Integer,String> hm2 = new HashMap<>();
		hm2.put(4, "pepsi");
		hm2.put(1, "dosa");
		hm1.putAll(hm2);
		System.out.println(hm1);//{1=dosa, 2=jalebi, 4=pepsi}
		
		//puIfAbsent(key,value)
		hm1.putIfAbsent(5, "samosa");
		System.out.println(hm1);//{1=dosa, 2=jalebi, 4=pepsi, 5=samosa}
		
		hm1.putIfAbsent(2, "coke"); // this key is already associated
		System.out.println(hm1);//{1=dosa, 2=jalebi, 4=pepsi, 5=samosa}
		
		
		//containsKey(key)
		System.out.println(hm1.containsKey(5));//true
		System.out.println(hm1.containsKey(7));//false
		
		//containsValue(value)
		System.out.println(hm1.containsValue("samosa"));//true
		System.out.println(hm1.containsValue("chicken"));//false
		
		//remove(key)
		hm1.remove(4);
		System.out.println(hm1);//{1=dosa, 2=jalebi, 5=samosa}
		
		//remove(key,value)
		System.out.println(hm1.remove(5,"dosa"));//false
		System.out.println(hm1);//{1=dosa, 2=jalebi, 5=samosa}
		
		System.out.println(hm1.remove(1, "dosa"));//true
		System.out.println(hm1);//{2=jalebi, 5=samosa}
		
		// replace(key,oldvalue,newvalue)
		hm1.replace(5,"samosa", "puchka");
		System.out.println(hm1);
		
		//size()
		System.out.println(hm1.size());//2
		
		//{2=jalebi, 5=puchka}
		//get(key)
		System.out.println(hm1.get(2));//jalebi
		System.out.println(hm1.get(10));//null
		
		//getOrDefault(key,defaultValue)
		System.out.println(hm1.getOrDefault(2, "vada"));//jalebi
		System.out.println(hm1.getOrDefault(10, "vada"));//vada
		
		
		System.out.println("----------");
		//keySet() --> Set
		Set<Integer> set = hm1.keySet();
		
		for(Integer i : set)
			System.out.println(i);
		
		System.out.println("----------");
		
		Iterator<Integer> itr= set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("---");
		
		//forEach method
		set.forEach(x->System.out.println(x));
		
		
		// entrySet()
		Set<Map.Entry<Integer, String>> me = hm1.entrySet();
		
		Iterator<Map.Entry<Integer, String>> i = me.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<Integer, String> entry = i.next();
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		
		System.out.println("-------");
		
		//foreach loop
		for(Map.Entry<Integer, String> me1 : hm1.entrySet())
			System.out.println(me1.getKey()+"--->"+me1.getValue());
		
		
		
		
		
		
		
		
		
		


	}

}
