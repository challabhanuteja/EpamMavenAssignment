import java.util.*;
class Main
{
	List<Object> l = new ArrayList<>();
	Chocolate c1 = new Chocolate(100,250);
	Chocolate c2 = new Chocolate(200,750);
	Sweet s1 = new Sweet(50,100);
	Sweet s2 = new Sweet(100,250);
	Main()
	{
		l.add(c1);
		l.add(c2);
		l.add(s1);
		l.add(s2);
	}
	double TotalWeight(ArrayList<Object>a)
	{
		double s=0;
		for(Object i:a)
		{
			s+=i.getWeight();
		}
		return s;
	}
	double TotalPrice(ArrayList<Object>a)
	{
		double s=0;
		for(Object i:a)
		{
			s+=i.getPrice();
		}
		return s;
	}
}