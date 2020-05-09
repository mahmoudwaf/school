package beans;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		 this.dataSource = dataSource;
	      this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Student> getStudents(){
		String sql = "select * from student";
		List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
		return students;
	}
	
	
}
