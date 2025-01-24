package jenkinssample;

import java.util.HashSet;
import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();

		set.add("hai");
		set.add("welcome");
		set.add("back");
		System.out.println(set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		itr.remove();
		System.out.println(set);

			}
	}


