package bakery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class BakeryDAO {

	public boolean insertBakery(BakeryVO vo) {
		// vo로 전달된 모든 내용을 db에 넣음
		// id = sequence 이용할 것...?
		// bakeryname = 파일이름
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

				PreparedStatement ps = conn.prepareStatement(
						"insert into bakery values(NVL((select max(bakeryid)+1 from bakery),1),?,?,?,?)");) {

			ps.setString(1, vo.getBakeryname());
			ps.setInt(2, vo.getPrice());
			ps.setInt(3, vo.getBalance());
			ps.setString(4, vo.getBakeryimage().getOriginalFilename());
			int i = ps.executeUpdate();
			if (i == 1) {
				System.out.println("성공");
				return true;
			} else {
				System.out.println("실패ㅊ");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
