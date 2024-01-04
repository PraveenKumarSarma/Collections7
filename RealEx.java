import java.util.*;
public class RealEx {

	
	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(101,"laptop",12000.0));
		products.add(new Product(102,"mobile",7000.0));
		products.add(new Product(103,"tab",22000.0));
		products.add(new Product(104,"speakers",2500.0));
		products.add(new Product(105,"tv",11000.0));
		
		System.out.println(products);
		
		System.out.println("**************");
		
		for(Product product: products)
		{
			if(product.getProductName().equals("tv"))
			{
				product.setPrice(20000.0);
			}
		}
		System.out.println("***********2");
		
		List<Product> pros1 = new ArrayList<>();
		for(Product p: products)
		{
			if(p.getPrice()>10000.0)
			{
				pros1.add(p);
			}
		}
		System.out.println(pros1);
		
		System.out.println("********");
		
	
		Collections.sort(products, new ProPriceComp());
		System.out.println(products.get(0));
		System.out.println("********9");
		
		products.remove(products.size()-1);
		System.out.println(products);
		System.out.println("********");
		
		for(Product p: products)
		{
			if(p.getProductName().startsWith("t"))
			{
				System.out.println(p);
			}
		}
		
		
	for(Product p :products)
	{
		if(p.getProductId()==105)
		{
			System.out.println(p);
		}
	}
	}
}
