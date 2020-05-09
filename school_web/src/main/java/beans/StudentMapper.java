package beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStudentId(rs.getInt("student_id"));
		student.setStudentName(rs.getString("student_name"));
		student.setBirthDate(rs.getDate("birth_date"));
		return student;
	}

}
