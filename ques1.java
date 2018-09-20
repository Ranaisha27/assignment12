import java.util.*;
  class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("MSD",new Double(2218.40));
		hm.put("SSA",new Double(8122.40));
		hm.put("MSS",new Double(4037.22));
		hm.put("MSR",new Double(3740.37));
		hm.put("SRK",new Double(4730.18));
		Iterator i=hm.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue()+":");
		}

	}
}
