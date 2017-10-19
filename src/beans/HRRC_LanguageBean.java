package beans;

public class HRRC_LanguageBean {
	
	private String lang;
	private int Rplt;
	private int CanidQ;
	private String fy;
	private String speak;
	private String read;
	private String write;
	private String updt;
	private int updbyQ;	
	
	public int getRplt() {
		return Rplt;
	}
	public void setRplt(int rplt) {
		Rplt = rplt;
	}
	public int getCanidQ() {
		return CanidQ;
	}
	public void setCanidQ(int canidQ) {
		CanidQ = canidQ;
	}
	public String getFy() {
		return fy;
	}
	public void setFy(String fy) {
		this.fy = fy;
	}
	
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getSpeak() {
		return speak;
	}
	public void setSpeak(String speak) {
		this.speak = speak;
	}
	public String getRead() {
		return read;
	}
	public void setRead(String read) {
		this.read = read;
	}
	public String getWrite() {
		return write;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public void setUpdt(String updt) {
		this.updt = updt;
	}
	public String getUpdt() {
		return updt;
	}
	public void setUpdbyQ(int updbyQ) {
		this.updbyQ = updbyQ;
	}
	public int getUpdbyQ() {
		return updbyQ;
	}

}
