package member;

public class MemberVO {
	String id, name;

	public MemberVO() {
	}

	/**
	 * @param id
	 * @param name
	 */
	public MemberVO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + "]";
	}

}
