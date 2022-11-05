package semenets;

import semenets.SafeInfo;

public class Jewelry implements SafeInfo {

	private  String mark;
	private  int Weight;
	private  double Volume;
	private  String Type;	

	public static int JCounter;

	
    public Jewelry(String mark, int Weight, double Volume, String Type) {
    	JCounter++;
		this.mark = mark;
    	this.Weight = Weight;
    	this.Volume = Volume;
    	this.Type = Type;    	
    }
	
	public void GetCounter()
	{
		System.out.println("Jewelery Items = " + JCounter);
	}

	public String getMark() {
		return mark;
	}
    
	public String getSafeType() { 
		return Type;
	}

	@Override
	public int compareTo(SafeInfo o) {
		Integer i = Weight;
        return i.compareTo(o.Weight());		
	}

	@Override
	public int Weight() {
		return Weight;
	}

	@Override
	public double Volume() {
		return Volume;
	}

	@Override
	public void print() {
		System.out.println(getMark() + " is safe, it's weight is -> " + Weight() + 
				" pounds " + "this safe has volume -> " + Volume() + "sm^3. This is safe for " + getSafeType() + ".\n" );    
				
	}

	@Override
	public void ALL_Items() {
		GetCounter();
		
		
	}

	@Override
	public int GetValue() {
		return JCounter;
	}
}
