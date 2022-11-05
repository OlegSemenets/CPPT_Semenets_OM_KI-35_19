package semenets;

public interface SafeInfo extends Comparable<SafeInfo> {
	public int Weight();
	public double Volume();
	public void print();
	public void ALL_Items();
	public int GetValue();
}
