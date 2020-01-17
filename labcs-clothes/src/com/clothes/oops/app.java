package com.clothes.oops;
//import java.util.ArrayList;
public class app {

	public static void main(String []args)
	{
//		Clothes cloth1;
//		cloth1= new Clothes();
//	 cloth1.acceptDetails();
//		cloth1.displayDetails();
//		Clothes cloth2 = new Clothes(1,'F',"M","Cotton",400.00,"Kurti","Red","Aurelia",true);
//		System.out.println(cloth2);
//		
//		Clothes clotharray[] = new Clothes[3];
//		clotharray[0]=new Clothes(1,'F',"M","Cotton",400.00,"Kurti","Red","Aurelia",true);
//		clotharray[1]=new Clothes(1,'M',"L","Cotton",490.00,"Shirt","Olive green","USPA",true);
//		clotharray[2]=new Clothes(1,'F',"M","Cotton",700.00,"Kurti","Burgandy","Aurelia",false);
//		for(int i=0;i<clotharray.length;i++)
//		{
//			System.out.println(clotharray[i]);
//		}
//		for(Clothes clothes1:clotharray)
//		{
//			System.out.println(clothes1);
//		}
//		 Clothes clotharray0=new Clothes(1,'F',"M","Cotton",400.00,"Kurti","Red","Aurelia",true);
//	Clothes clotharray1=new Clothes(1,'M',"L","Cotton",490.00,"Shirt","Olive green","USPA",true);
//Clothes	clotharray2=new Clothes(1,'F',"M","Cotton",700.00,"Kurti","Burgandy","Aurelia",false);
//		ArrayList clothlist = new ArrayList();
//		clothlist.add(clotharray0);
//		clothlist.add(clotharray1);
//		clothlist.add(clotharray2);
//		System.out.println(clothlist);
//			
		
AbstractTopLength top1=new FootLength();
top1.toplength();
AbstractTopLength top2= new KneeLength();
top2.toplength();
AbstractTopLength top3= new ShortLength();
top3.toplength();
AbstractTopLength top4= new CropLength();
top4.toplength();
}
	
}
