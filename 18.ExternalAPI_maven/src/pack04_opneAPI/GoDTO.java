package pack04_opneAPI;

public class GoDTO {
	private String sangho;
	private String sojaji;
	private String yeonlagcheo;
	private int num;
	private String menu;
	
	public GoDTO(String sangho, String sojaji, String yeonlagcheo, int num, String menu) {
		super();
		this.sangho = sangho;
		this.sojaji = sojaji;
		this.yeonlagcheo = yeonlagcheo;
		this.num = num;
		this.menu = menu;
	}

	public String getSangho() {
		return sangho;
	}

	public void setSangho(String sangho) {
		this.sangho = sangho;
	}

	public String getSojaji() {
		return sojaji;
	}

	public void setSojaji(String sojaji) {
		this.sojaji = sojaji;
	}

	public String getYeonlagcheo() {
		return yeonlagcheo;
	}

	public void setYeonlagcheo(String yeonlagcheo) {
		this.yeonlagcheo = yeonlagcheo;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	
	
}
