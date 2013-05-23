package de.wwu.pi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AdderResult {
	private int first;
	private int second;

	public AdderResult(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	// default constructor for JAXB
	AdderResult() { }

	public AdderResult(AdderRequest adderRequest) {
		this(adderRequest.getFirst(), adderRequest.getSecond());
	}

	@XmlElement
	public int getFirst() {
		return first;
	}

	@XmlElement
	public int getSecond() {
		return second;
	}

	@XmlElement
	public int getResult() {
		return first + second;
	}
}