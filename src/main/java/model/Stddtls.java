package model;
// Generated 4 Jun, 2018 8:11:39 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Stddtls generated by hbm2java
 */
public class Stddtls implements java.io.Serializable {

	private Integer stdId;
	private String stdMobleno;
	private String stdFname;
	private String stdLname;
	private String stdPswd;

	public Stddtls() {
	}

	public Stddtls(String stdMobleno, String stdFname, String stdLname, String stdPswd) {
		this.stdMobleno = stdMobleno;
		this.stdFname = stdFname;
		this.stdLname = stdLname;
		this.stdPswd = stdPswd;
	}

	public Integer getStdId() {
		return this.stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdMobleno() {
		return this.stdMobleno;
	}

	public void setStdMobleno(String stdMobleno) {
		this.stdMobleno = stdMobleno;
	}

	public String getStdFname() {
		return this.stdFname;
	}

	public void setStdFname(String stdFname) {
		this.stdFname = stdFname;
	}

	public String getStdLname() {
		return this.stdLname;
	}

	public void setStdLname(String stdLname) {
		this.stdLname = stdLname;
	}

	public String getStdPswd() {
		return this.stdPswd;
	}

	public void setStdPswd(String stdPswd) {
		this.stdPswd = stdPswd;
	}

}
