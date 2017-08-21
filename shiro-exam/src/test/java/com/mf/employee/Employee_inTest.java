package com.mf.employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mf.domain.Employee_in;
import com.mf.service.Employee_inService;
import com.mf.service.RoleService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "classpath:applicationContext.xml" }) 
public class Employee_inTest {

	Logger logger=Logger.getLogger(RoleService.class);
	@Resource
	private Employee_inService employee_inService;
	
	String employeeid="S100001";
	String name="�ܲ�";
	String departmentid="001";
	
	@Test
	public void testSelect() {
		
		String employee=employee_inService.selectUserIdByName(name);
		logger.info("�����û����ƻ�ȡ�û�Id:"+employee);
		
		String nextuserid = employee_inService.selectNextUserId();
		logger.info("��ȡ��һ���û��ı��:"+nextuserid);
		
		Map<String, Object> map1=new HashMap<>();
		map1.put("departmentid", departmentid);
		List<Employee_in> employee_ins1=employee_inService.selectAllUserByDepartId(map1);
		logger.info("���ݲ���Id��ѯ�ò����µ��û�:"+employee_ins1);
		
		Employee_in employee_in2=new Employee_in();
		employee_in2.setEmployeeid(employeeid);
		employee_in2.setDepartmentid("001");
		employee_in2.setAddress("");
		Map<String, Object> map2=new HashMap<>();
		map2.put("employee", employee_in2);
		map2.put("departmentid", "001");
		List<Employee_in> employee_in1=employee_inService.selectUserByAny(map2);
		logger.info("��ϲ�ѯ �û���Ϣ:"+employee_in1);	
		
		Employee_in employee_in3=new Employee_in();
		employee_in3.setEmployeeid("S100001");
		employee_in3.setPassword("123");
		boolean i=employee_inService.selectIsUser(employee_in3);
		logger.info(i);
	}
	
	@Test
	public void testInsert(){
		Employee_in employee_in2=new Employee_in();
		String userid=employee_inService.selectNextUserId();
		employee_in2.setEmployeeid(userid);
		employee_in2.setDepartmentid("001");
		employee_in2.setName("����");
		boolean result=employee_inService.insertUserInfo(employee_in2);
		logger.info("����û�������Ϣ:"+result);
		
	}
	
	@Test
	public void testUpdate(){
		Employee_in employee_in2=new Employee_in();
		employee_in2.setEmployeeid("S100010");
		employee_in2.setDepartmentid("002");
		employee_in2.setAddress("ɽ��ʡ�ʼҿƴ�");
		boolean i1=employee_inService.updateUserInfo(employee_in2);
		logger.info("�޸��û�������Ϣ(����������):"+i1);
		
		Map<String, Object> userPassword=new HashMap<>();
		userPassword.put("employeeid", "S100010");
		userPassword.put("password", "123");
		boolean i2=employee_inService.updateUserPassword(userPassword);
		logger.info("�޸��û�����:"+i2);
	}
	
}
