
public class DHLPackage extends DimensionalWeightPackage {
	
	
	@Override
	public double getWeight() {
		double dimWeight = width * height * length / getFactor();
		double realWeight = Math.max(weight, dimWeight);
		return realWeight;
	}
	
	@Override
	public double getFactor() 
	{
		double nekiBroj = 5000;
		return nekiBroj;
	}

}
