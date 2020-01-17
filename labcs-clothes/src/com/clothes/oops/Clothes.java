package com.clothes.oops;

public class Clothes {
	
	int      noOfItems;
	String   size;
	String   material;
	String   type;
	String   colour;
	String   brand;
	char     sectionName;
	double   price;
	boolean  inStock;
	
	
	void acceptDetails()
	{
		noOfItems=1;
		sectionName='F';
		size="S";
	    material="smooth slim fit";
		price = 599.00;
		type="Jeans";
		colour="Blue";
		brand ="Levis";
		inStock= true;
		
	}

	void displayDetails()
	{
		System.out.println(noOfItems);
		System.out.println(sectionName);
		System.out.println(size);
		System.out.println(material);
		System.out.println(price);
		System.out.println(type);
		System.out.println(colour);
		System.out.println(brand);
		System.out.println(inStock);
		
	}
	Clothes()
	{
		noOfItems=1;
		sectionName='F';
		size="S";
	    material="smooth slim fit";
		price = 599.00;
		type="Jeans";
		colour="Blue";
		brand ="Levis";
		inStock = true;
		
	}
	
	public Clothes(int pnoOfItems,char psectionName, String psize, String pmaterial,double pprice, String ptype, String pcolour, String pbrand,
			boolean pinStock)
	{
		noOfItems = pnoOfItems;
		sectionName = psectionName;
		size = psize;
		material =pmaterial;
		price = pprice;
		type = ptype;
		colour = pcolour;
		brand = pbrand;
	      inStock = pinStock;
	}

	@Override
	public String toString() {
		return "Clothes [noOfItems=" + noOfItems + ", size=" + size + ", material=" + material + ", type=" + type
				+ ", colour=" + colour + ", brand=" + brand + ", sectionName=" + sectionName + ", price=" + price
				+ ", inStock=" + inStock + "]";
	}
}

