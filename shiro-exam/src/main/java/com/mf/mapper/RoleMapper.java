package com.mf.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import com.mf.domain.Employee_in;
import com.mf.domain.Role;


public interface RoleMapper {
    
	/**
	 * Ϊ��ɫ����Ȩ��
	 * @param role
	 * @return
	 */
	public int addPermissionForRole(Role role) throws SQLException ;
		
	/**
	 * �����ɫ��Ϣ
	 * @param role
	 * @return
	 */
	public int addRole(Role role) throws SQLException;
	
	
	/**
	 * ��ѯ���������������ŵ����н�ɫ��Ϣ
	 * @param condition departmentid ����id pageBegin����ʼ  pageSize��ÿҳ����
	 * @return role ���󼯺�
	 */
	public List<Role> getAllRole(Map<String, Object> condition)  throws SQLException;
	
	/**
	 * 1.����roleid��ѯ��ɫ��Ϣ������Ȩ����Ϣ
	 * @return ��ɫ��Ϣ(List<TBaseRoleInfo>)
	 * @throws SQLException
	 */
	public List<Role> getRoleByRoleId(String roleid) throws SQLException;
	
	/**
	 * ��ѯ���н�ɫ:1�ж���Ȩ�� ���г���ϵͳ����Ȩ�ޣ������ֵ''��null
	 * 			    2��û�г���Ȩ�� �����û���departmentid
	 * @return ��ɫ��Ϣ����
	 * @throws SQLException
	 */
	public List<Role> getAllRoleByRoleId(String departmentid) throws SQLException;
	
	/**
	 * ��ѯ�������õĽ�ɫ:1�ж���Ȩ�� ���г���ϵͳ����Ȩ�ޣ������ֵ''��null
	 * 					 2��û�г���Ȩ�� �����û���departmentid
	 * @return ��ɫ��Ϣ����
	 * @throws SQLException
	 */
	public List<Role> getIsUseRoleByRoleId(String departmentid) throws SQLException;
		
	/**
	 * �����û���Ż�ȡ���û���ɫ��Ϣ
	 * @param userId �û����
	 * @return ��ǰ�û��Ľ�ɫ��Ϣ
	 * @throws SQLException
	 */
	public List<Role> getRoleByUserId(String employeeid) throws SQLException;
	
	
	/**
	 * �޸Ľ�ɫ��Ϣ
	 * @param role ��ɫ��Ϣ(role)
	 * @return �޸ĵļ�¼�� (int)
	 * @throws SQLException
	 */
	public int updateRoleInfo(Role role) throws SQLException;
	
	/**
	 * ɾ����ɫ��Ϣ
	 * @param roleId ��ɫId(String)
	 * @return ɾ���ļ�¼��(int)
	 * @throws SQLException
	 */
	public int deleteRoleInfo(List<String> roleid) throws SQLException;

	/**
	 * ɾ����ɫ������Ȩ��
	 * @param roleid
	 * @return ɾ���ļ�¼��
	 * @throws SQLException
	 */
	public int deleteRolePermissionByRoleid(String roleid) throws SQLException;
	
	/**
	 * ����roleid permissionid ɾ����ɫ�Ĳ���Ȩ��
	 * @param Map<String, List<String>> roleid:roleid permissionid:permissionid�ļ���
	 * @return ɾ���ļ�¼��
	 */
	public int deleteRolePermissionByRoleidAndPermissionid(Map<String, List<String>> rolePermission) throws SQLException;
	
	/**
	 * �����û���Ų�ѯ���û������ݵĽ�ɫ
	 * @param employeeid �û����
	 * @return ��ɫ������Ϣ
	 * @throws SQLException
	 */
	public List<Role> getLeftRoleByUserId(String employeeid) throws SQLException;
	
	/**
	 * ���ݽ�ɫ��Ų�ѯ�ý�ɫ�µ������û�
	 * @param roleid:��ɫ��� pageBegin����ʼ  pageSize��ÿҳ����
	 * @return List<Employee_in> �û�������Ϣ 
	 * @throws SQLException
	 */
	public List<Employee_in> getUserByRoleId(Map<String, Object> roleid) throws SQLException;
	
	/**
	 * ��ȡ�����ŵĽ�ɫ����(��������������)
	 * @param departmentid ���ű��
	 * @return ��ɫ����
	 */
	public int getRoleCount(String departmentid);
}