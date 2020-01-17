package kitri.edu.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class EmpDAO {
	private static Connection conn;

	public EmpDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<EmpVO> getEmpList() {
		ArrayList<EmpVO> ar = new ArrayList<EmpVO>();
		try (PreparedStatement ps = conn
				.prepareStatement("select employee_id, first_name, hire_date, salary from EMPLOYEES");
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setHiredate(new SimpleDateFormat("yyyy/MM/dd").format(rs.getDate("hire_date")));
				vo.setId(rs.getInt("employee_id"));
				vo.setName(rs.getString("first_name"));
				vo.setSalary(rs.getDouble("salary"));
				ar.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ar;
	}
}
