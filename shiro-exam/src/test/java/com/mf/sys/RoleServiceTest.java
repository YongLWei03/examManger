package com.mf.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mf.domain.Employee_in;
import com.mf.domain.Role;
import com.mf.service.RoleService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "classpath:applicationContext.xml" }) 
public class RoleServiceTest {

	@Resource
	private RoleService roleService;
	Logger logger=Logger.getLogger(RoleService.class);
	String employeeid="S100001";
	String roleid="001";
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelect() {
		List<Role> role1=roleService.getLeftRoleByUserId(employeeid);
		logger.info("�����û���Ų�ѯ���û������ݵĽ�ɫ:"+role1);
		
		List<Role> role2=roleService.getRoleWithPerByRoleId(roleid);
		logger.info("1.����roleid��ѯ��ɫ��Ϣ������Ȩ����Ϣ:"+role2);
		
		List<Role> role3=roleService.getRoleWithPerByRoleId("");
		logger.info("1.����roleid��ѯ��ɫ��Ϣ������Ȩ����Ϣ :"+role3);
		
		List<Role> role4=roleService.getRoleByUserId(employeeid);
		logger.info("�����û���Ż�ȡ���û���ɫ��Ϣ:"+role4);
		
		Map<String, Object> map1=new HashMap<>();
		map1.put("roleid", roleid);
		List<Employee_in> employee_in1=roleService.getUserByRoleId(map1);
		logger.info("���ݽ�ɫ��Ų�ѯ�ý�ɫ�µ������û�:"+employee_in1);
		
		List<Role> role5=roleService.getIsUseRoleByRoleId("001");
		logger.info("��ѯ�������õĽ�ɫ:"+role5);
		
		
	}
	
	@Test
	public void testUpdadte(){
		Role role=new Role();
		role.setRoleid("002");
		role.setRolename("super�û�");
		role.setRolestatus(false);
		boolean i=roleService.updateRoleInfo(role);
		logger.info("�޸Ľ�ɫ��Ϣ:"+i);
	}
	
	@Test
	public void testInsert(){
		Role role=new Role();	
		role.setRolename("ϵͳ����Ա");
		role.setDescription("��������ŵ�Ȩ�޷���");
//		int i1=roleService.insertRole(role);
//		logger.info("�����ɫ��Ϣ:"+i1);
		
		List<String> departmentids=new ArrayList<>();
		List<String> permissionid=new ArrayList<>();
		departmentids.add("001001");
		departmentids.add("001002");
		departmentids.add("001001001");
		permissionid.add("001");
		permissionid.add("002");
		role.setDepartmentids(departmentids);
		role.setPermissionid(permissionid);		
		int i3=roleService.addMoreRole(role, departmentids);
		logger.info("���������ɫ��Ϣ:"+i3);
		
//		List<String> fun=new ArrayList<>();
//		fun.add("bankmanager:bank");
//		fun.add("grademanager:menu");
//		role.setRoleid("eac51c4a-790c-11e7-a31d-4437e6ee410f");
//		role.setPermissionid(fun);
//		int i2=roleService.insertRolePermission(role);
//		logger.info("�����ɫ��ӵ�е�Ȩ��"+i2);		
	}
	
	@Test
	public void testDelete(){
		List<String> roleid=new ArrayList<>();
		roleid.add("084eb262-790d-11e7-a31d-4437e6ee410f");
		roleid.add("eac51c4a-790c-11e7-a31d-4437e6ee410f");
		boolean i=roleService.deleteRoleInfo(roleid);
		logger.info("ɾ����ɫ��Ϣ:"+i);
		
		boolean i1 =roleService.deleteRolePermissionByRoleid("003");
		logger.info("ɾ����ɫ��Ȩ��(�ջط������ɫ��Ȩ��)"+i1);
	}

}
