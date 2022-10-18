package CollectionObject2;

import java.util.ArrayList;

public class UseShirt {
	public static void main(String[] args) {
		
		Shirt s1=new Shirt("allen Soley","white",1500,true);

		Shirt s2=new Shirt("otto","black",2500,false);

		Shirt s3=new Shirt("Vanhusein","brown",2000,true);

		Shirt s4=new Shirt("Louis","blue",3500,true);

		Shirt s5=new Shirt("Peter England","white",3700,false);

		Shirt s6=new Shirt("Ramraj","white",1500,false);
	
	
	ArrayList<Shirt> s=new ArrayList<>();
	s.add(s1);
	s.add(s2);
	s.add(s3);
	s.add(s4);
	s.add(s5);
	s.add(s6);
	
	ArrayList<Shirt> checkedShirt=new ArrayList<>();
	
	for(int i=0;i<s.size();i++) {
		if(s.get(i).getIsChecked()==false)
		{
			checkedShirt.add(s.get(i));
		}
	}
	

	
	
	
	for(Shirt sh:s)
	{
		if(sh.getIsChecked()==true){
			checkedShirt.add(sh);
		}


}
	
	checkedShirt.forEach(x->System.out.println(x));
	}
}
