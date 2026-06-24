package com.example.demo.model;


import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Repository
public class StudentDAO {
	
	private final JdbcTemplate jdbcTemplate;
	
	private final NamedParameterJdbcTemplate namedParameterJdbc;
	
	private final RowMapper<Students> studentsRowMapper = (resultSet, rowNum) ->{
		Students students = new Students();
		students.setId(resultSet.getInt("id"));
		students.setStudentName(resultSet.getString("student_name"));
		students.setHeight(resultSet.getInt("height"));
		students.setEmail(resultSet.getString("email"));
		return students;
	};
	
	public List<Students> findTop100(){
		String sql = "select top(100) * from students order by id";
		return jdbcTemplate.query(sql, studentsRowMapper);
	}
	
		
	public Integer insertStudent(String name, Integer height, String email) {
		String sql = "insert into students(student_name, height, email) values(?,?,?)";
		return jdbcTemplate.update(sql, name, height, email);
	}
	
	public List<Students> findByNameAndEamil(String name, String email){
		String sql = "select * from students where student_name = :n and email = :email order by id";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("n", name);
		params.addValue("email", email);
		return namedParameterJdbc.query(sql,params ,studentsRowMapper);
	}
	


}
