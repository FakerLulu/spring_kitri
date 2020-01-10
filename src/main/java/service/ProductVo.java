package service;

public class ProductVo {
	int code;
	String name;
	int price;
	int coupon;
	double sale;

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductVo [code=" + code + ", name=" + name + ", price=" + price + ", sale=" + sale + ", coupon="
				+ coupon + ", 할인가격= " + price * (1 - sale) + "]";
	}

}
