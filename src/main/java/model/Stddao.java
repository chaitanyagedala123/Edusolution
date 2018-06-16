package model;

import java.util.List;

public interface Stddao {
	
	List<Stddtls> alllist();
	public Stddtls login(String mobile);

}
