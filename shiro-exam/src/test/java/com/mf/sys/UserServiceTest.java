package com.mf.sys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.mf.domain.Employee_in;
import com.mf.service.Employee_inService;
import com.mf.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "classpath:applicationContext-shiro.xml","classpath:applicationContext-struts.xml" }) 
public class UserServiceTest {

	@Resource
	private UserService userService;
	@Resource
	private Employee_inService employee_inServicel;
	Logger logger=Logger.getLogger(UserServiceTest.class);
	String employeeid="S100001";
	String name="�ܲ�";
	String departmentid="001";
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}

	@Test
	public void testSelect() {
		
		
		
		Employee_in employee_in=userService.getEmployee_inByName(name);
		logger.info("�����û�����ѯ�û���Ϣ�����������ż��䲿����Ϣ�����ɫ��Ϣ:"+employee_in);
		
		
		Set<String> fun1= userService.getPermissionByName(name);
		logger.info("�����û�����ѯȨ��:"+fun1);
		
		Set<String> roles1= userService.addRoleByName(name);
		logger.info("�����û�����ѯ��ɫ:"+roles1);
		
		String pwd1=userService.getPasswordByUserId(employeeid);
		logger.info("�����û�Id��ѯ�û��ĵ�¼����"+pwd1);
		

		

	}
	
	@Test
	public void testInsert(){
		
		Employee_in employee_in2=new Employee_in();
		String userid=employee_inServicel.selectNextUserId();
		employee_in2.setEmployeeid(userid);
		employee_in2.setDepartmentid("001");
		employee_in2.setName("����");
		
		Employee_in employee_in1=new Employee_in();
		List<String> role=new ArrayList<>();
		role.add("003");
		role.add("004");
		employee_in1.setEmployeeid(employee_in2.getEmployeeid());
		employee_in1.setRoleid(role);
		boolean b=userService.addRoleForUser(employee_in1);
		logger.info("���û������ɫ"+b);		
	}
	
	@Test
	public void testDelete(){
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("employeeid", "S100010");
		map2.put("roleid", "");
		boolean i1=userService.deleteRoleFromUser(map2);
		logger.info("����������û��Ľ�ɫ"+i1);
		
		boolean i2=userService.deleteUserById("S100011");
		logger.info("�����û����ɾ���û�"+i2);
	}
	
	@Test
	public void testUpdate(){
	
	}

}
