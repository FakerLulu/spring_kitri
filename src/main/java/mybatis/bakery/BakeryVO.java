package mybatis.bakery;

import org.springframework.stereotype.Component;

@Component
public class BakeryVO {

	int bakeryid;
	String bakeryname;
	int price;
	int balance;
	String bakeryimage;

	public int getBakeryid() {
		return bakeryid;
	}

	public void setBakeryid(int bakeryid) {
		this.bakeryid = bakeryid;
	}

	public String getBakeryname() {
		return bakeryname;
	}

	public void setBakeryname(String bakeryname) {
		this.bakeryname = bakeryname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBakeryimage() {
		return bakeryimage;
	}

	public void setBakeryimage(String bakeryimage) {
		this.bakeryimage = bakeryimage;
	}

	@Override
	public String toString() {
		return "제품 정보 [등록번호=" + bakeryid + "|| 제품명=" + bakeryname + "|| 가격=" + price + "|| 수량=" + balance + "|| 사진이름="
				+ bakeryimage + "]";
	}

}
