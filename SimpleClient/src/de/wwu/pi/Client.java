package de.wwu.pi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

@ManagedBean
@ViewScoped
public class Client {

	private static final String BASE_URI = "http://localhost:8080/SimpleService";

	private int first;
	private int second;
	private Integer result;

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public Integer getResult() {
		return result;
	}

	public void add() {
		// has to be done at least once
		RegisterBuiltin.register(ResteasyProviderFactory.getInstance());

		RestAdderClient adderClient = ProxyFactory.create(RestAdderClient.class, BASE_URI);
		result = adderClient.add(first, second);
	}
}
