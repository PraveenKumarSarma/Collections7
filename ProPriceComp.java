import java.util.*;
public class ProPriceComp implements Comparator<Product>
{
	public int compare(Product p1,Product p2)
	{
		return -p1.getPrice().compareTo(p2.getPrice());
	}
}
