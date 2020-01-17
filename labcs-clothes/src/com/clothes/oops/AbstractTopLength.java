package com.clothes.oops;

public abstract class AbstractTopLength {
	public  abstract void toplength();

}
class FootLength extends AbstractTopLength
{
	public void toplength() 
	{
		System.out.println("This dress is full length ");
	}
}
 class KneeLength extends AbstractTopLength
{
	public void toplength() 
	{
		System.out.println("This dress is knee length ");
	}
}
 class ShortLength extends AbstractTopLength
 {
 	public void toplength() 
 	{
 		System.out.println("This dress is short length ");
 	}
 }

class CropLength extends AbstractTopLength
{
	 public void toplength() 
	{
		System.out.println("This dress is lesser than waist length ");
	}
}


