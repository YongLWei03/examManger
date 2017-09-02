package com.mf.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import com.mf.domain.Employee_in;
import com.mf.domain.Role;

public interface RoleService {

	/**
	 * �����ɫ��ӵ�е�Ȩ��
	 * @param role
	 * @return
	 */
	public boolean addPermissionForRole(Role role) ;
		
	/**
	 * �����ɫ��Ϣ�Լ���Ȩ����Ϣ
	 * ��Ȩ�ޱ�Ŵ���role�е�permissionid���� ��ͬʱ�����ɫ��Ȩ����Ϣ
	 * @param role
	 * @return
	 */
	public boolean addRoleWithPermission(Role role);
	
	/**
	 * ���������ɫ��Ϣ
	 * @param role :������ɫ������Ϣ�����ű�ż��� departmentids��Ȩ��id���� permissionid
	 * 				�����ɫ����ʽΪ ����������ɫ��
	 * @return ����ļ�¼��
	 */
	public int addMoreRole(Role role,List<String> departmentids);
	
	/**
	 * ��ѯ���������������ŵ����н�ɫ��Ϣ
	 * @param condition departmentid ����id pageBegin����ʼ  pageSize��ÿҳ����
	 * @return role ���󼯺�
	 */
	public List<Role> getAllRole(Map<String, Object> condition);
	
	/**
	 * ����roleid��ѯ��ɫ��Ϣ������Ȩ����Ϣ
	 * @return ��ɫ��Ϣ(List<Role>)
	 * @throws SQLException
	 */
	public List<Role> getRoleWithPerByRoleId(String roleid);
	
	/**
	 * ���ݲ���id��ѯ�����ŵ����н�ɫ:
	 * @return ��ɫ��Ϣ����
	 * @throws SQLException
	 */
	public List<Role> getAllRoleByRoleId(String departmentid);
	
	/**
	 * ���ڸ��û������ɫ
	 * ��ѯ�������õĽ�ɫ:1�ж���Ȩ�� ���г���ϵͳ����Ȩ�ޣ�����'001'
	 * 					 2��û�г���Ȩ�� �����û���departmentid
	 * @return ��ɫ��Ϣ����
	 * @throws SQLException
	 */
	public List<Role> getIsUseRoleByRoleId(String departmentid);
		
	/**
	 * �����û���Ż�ȡ���û���ɫ��Ϣ
	 * @param �û���� employeeid
	 * @return ��ǰ�û��Ľ�ɫ��Ϣ
	 * @throws SQLException
	 */
	public List<Role> getRoleByUserId(String employeeid);
	
	/**
	 * �޸Ľ�ɫ��Ϣ
	 * @param roleInfo ��ɫ��Ϣ(role)
	 * @return �޸ĵļ�¼�� (int)
	 * @throws SQLException
	 */
	public boolean updateRoleInfo(Role role);
	
	/**
	 * ɾ����ɫ��Ϣ
	 * @param roleId ��ɫId(String)
	 * @return ɾ���ļ�¼��(int)
	 * @throws SQLException
	 */
	public boolean deleteRoleInfo(List<String> roleid);

	/**
	 * ɾ����ɫ������Ȩ��
	 * @param roleid
	 * @return ɾ���ļ�¼��
	 * @throws SQLException
	 */
	public boolean deleteRolePermissionByRoleid(String roleid);
	
	/**
	 * ����roleid permissionid ɾ����ɫ�Ĳ���Ȩ��
	 * @param Map<String, List<String>> roleid:roleid permissionid:permissionid�ļ���
	 * @return ɾ���ļ�¼��
	 */
	public boolean deleteRolePermissionByRoleidAndPermissionid(Map<String, List<String>> rolePermission);
	
	/**
	 * �����û���Ų�ѯ���û������ݵĽ�ɫ
	 * @param employeeid �û����
	 * @return ��ɫ������Ϣ
	 * @throws SQLException
	 */
	public List<Role> getLeftRoleByUserId(String employeeid);
	
	/**
	 * ���ݽ�ɫ��Ų�ѯ�ý�ɫ�µ������û�
	 * @param roleid:��ɫ��� pageBegin����ʼ  pageSize��ÿҳ����
	 * @return List<Employee_in> �û�������Ϣ 
	 * @throws SQLException
	 */
	public List<Employee_in> getUserByRoleId(Map<String, Object> roleid);

	/**
	 * ��ȡ�����ŵĽ�ɫ����(��������������)
	 * @param departmentid ���ű��
	 * @return ��ɫ����
	 */
	public int getRoleCount(String departmentid);
	
	/**
	 * ���ݽ�ɫ���͵ļ��ϻ�ò��ű�ż���
	 * @return
	 */
	public List<String> getDepartmentIdByRoleType(List<String> roleType);

}
