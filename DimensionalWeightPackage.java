
public class DimensionalWeightPackage extends Package{

	
	public double getDimensionalWeight()
	{
		double dimWeight = (width * length * height) / getFactor();
		return dimWeight;
	}

	public double getFactor() 
	{
		double nekiBroj = 23.34;
		return nekiBroj;
	}
	
	@Override
	public double getWeight() 
	{
		double dimWeight =  Math.max(weight, getDimensionalWeight());
		return dimWeight;
	}
}
