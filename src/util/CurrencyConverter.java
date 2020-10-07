package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter (double quantidaDolar, double dolarUnitatio ) {
		double total = quantidaDolar * dolarUnitatio;
		double comImposto = total + total * IOF;	
		return comImposto;
	}

}
