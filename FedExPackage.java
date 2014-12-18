
public class FedExPackage extends DimensionalWeightPackage {

	
	//Zadaća
	
	@Override
	public double getWeight() 
	{
		double dimWeight = (width * height * length) / getFactor();
		double realWeight =  Math.max(weight, dimWeight);
		return realWeight;
	}
	
	@Override
	public double getFactor() 
	{
		double nekiBroj = 6000;
		return nekiBroj;
	}

}

