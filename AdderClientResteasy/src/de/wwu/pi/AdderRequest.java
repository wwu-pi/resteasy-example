package de.wwu.pi;

public class AdderRequest {

	private int first;
	private int second;

	public AdderRequest(int first, int second) {
		this.first = first;
		this.second = second;
	}

	// default constructor
	AdderRequest() { }

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

}
