package bakery;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class BakeryVO {

	int bakeryid;
	String bakeryname;
	int price;
	int balance;
	MultipartFile bakeryimage;

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

	public MultipartFile getBakeryimage() {
		return bakeryimage;
	}

	public void setBakeryimage(MultipartFile bakeryimage) {
		this.bakeryimage = bakeryimage;
	}

	@Override
	public String toString() {
		return "BakeryVO [bakeryid=" + bakeryid + ", bakeryname=" + bakeryname + ", price=" + price + ", balance="
				+ balance + ", bakeryimage=" + bakeryimage + "]";
	}

}
