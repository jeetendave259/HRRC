package beans;

public class HRRC_QualificationDtlsBean {

	private int Rplt;
	private int CanidQ;
	private String fy;
	private String insnam;
	private String univr;
	private String discp;
	private String dipdeg;
	private String from;
	private String to;
	private String per;
	public String getDipdeg() {
		return dipdeg;
	}
	public void setDipdeg(String dipdeg) {
		this.dipdeg = dipdeg;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	private String frmdate;
	private String todate;
	private String mainsubj;
	private int perc;
	private String rank;
	private int updbyQ;	
	private String updt;
	public int getCanidQ() {
		return CanidQ;
	}
	public void setCanidQ(int canidQ) {
		CanidQ = canidQ;
	}
	public String getInsnam() {
		return insnam;
	}
	public void setInsnam(String insnam) {
		this.insnam = insnam;
	}
	public String getUnivr() {
		return univr;
	}
	public void setUnivr(String univr) {
		this.univr = univr;
	}
	public String getDiscp() {
		return discp;
	}
	public void setDiscp(String discp) {
		this.discp = discp;
	}
	public String getFrmdate() {
		return frmdate;
	}
	public void setFrmdate(String frmdate) {
		this.frmdate = frmdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public String getMainsubj() {
		return mainsubj;
	}
	public void setMainsubj(String mainsubj) {
		this.mainsubj = mainsubj;
	}
	public int getPerc() {
		return perc;
	}
	public void setPerc(int perc) {
		this.perc = perc;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int setRplt(int rplt) {
		return Rplt = rplt;
	}
	public int getRplt() {
		return Rplt;
	}
	public void setFy(String fy) {
		this.fy = fy;
	}
	public String getFy() {
		return fy;
	}
	public void setUpdbyQ(int updbyQ) {
		this.updbyQ = updbyQ;
	}
	public int getUpdbyQ() {
		return updbyQ;
	}
	public void setUpdt(String updt) {
		this.updt = updt;
	}
	public String getUpdt() {
		return updt;
	}
}
