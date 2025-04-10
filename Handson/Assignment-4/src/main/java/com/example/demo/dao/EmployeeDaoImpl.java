package com.example.demo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void insertEmployee(Employee emp) {
		String sql = "INSERT INTO employee " +
				"(employee_id,employee_name,employee_email,location) VALUES (?, ?, ? ,? )" ;
		getJdbcTemplate().update(sql, new Object[]{
				emp.getEmployee_id(), emp.getEmployee_name(),emp.getEmployee_email(),emp.getLocation()
		});
		
	}

	
	@Override
	public List<Employee> getAllEmployees(){
		String sql = "SELECT * FROM employee";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Employee> result = new ArrayList<Employee>();
		for(Map<String, Object> row:rows){
			Employee emp = new Employee();
			emp.setEmployee_id((String)row.get("employee_id"));
			emp.setEmployee_name((String)row.get("employee_name"));
			emp.setEmployee_email((String)row.get("employee_email"));
			emp.setLocation((String)row.get("location"));
			result.add(emp);
		}
		
		return result;
	}

	@Override
	public Employee getEmployeeById(String employee_id) {
		String sql = "SELECT * FROM employee WHERE employee_id = ?";
		return (Employee)getJdbcTemplate().queryForObject(sql, new Object[]{employee_id}, new RowMapper<Employee>(){
			@Override
			public Employee mapRow(ResultSet rs, int rwNumber) throws SQLException {
				Employee emp = new Employee();
				emp.setEmployee_id(rs.getString("employee_id"));
				emp.setEmployee_name(rs.getString("employee_name"));
				emp.setEmployee_email(rs.getString("employee_email"));
				emp.setLocation(rs.getString("location"));
				return emp;
			}
		});
	}

}
