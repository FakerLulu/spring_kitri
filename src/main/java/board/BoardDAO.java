package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	Connection conn;
	@Autowired
	BoardVO boardVO;

	public BoardDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertBoard(BoardVO vo) {
		try (PreparedStatement ps = conn.prepareStatement(
				"insert into board values((select nvl(max(seq),0) from board)+1,?,?,?,sysdate,?,0)")) {
			System.out.println(vo);

			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContents());
			ps.setString(3, vo.getWriter());
			ps.setString(4, vo.getPassword());
			int r = ps.executeUpdate();
			System.out.println("입력결과 " + r);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<BoardVO> getBoardList() {
		ArrayList<BoardVO> al = new ArrayList<BoardVO>();

		try (PreparedStatement ps = conn.prepareStatement("select * from board order by seq");
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setSeq(rs.getInt("seq"));
				vo.setTitle(rs.getString("title"));
				vo.setContents(rs.getString("contents"));
				vo.setWriter(rs.getString("writer"));
				vo.setTime(new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss").format(rs.getTimestamp("time")));
				vo.setViewcount(rs.getInt("viewcount"));
				al.add(vo);
			}
		} catch (Exception e) {
		}
		return al;
	}

	public BoardVO getOneBoard(int seq) {

		try (PreparedStatement ps = conn.prepareStatement("select * from board where seq = " + seq);
				ResultSet rs = ps.executeQuery()) {
			if (rs.next()) {

				boardVO.setSeq(rs.getInt("seq"));
				boardVO.setTitle(rs.getString("title"));
				boardVO.setContents(rs.getString("contents"));
				boardVO.setWriter(rs.getString("writer"));
				boardVO.setTime(new SimpleDateFormat().format(rs.getDate("time")));
				boardVO.setViewcount(rs.getInt("viewcount"));

			}
		} catch (Exception e) {
		}
		return boardVO;
	}
}
