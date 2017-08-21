package com.mf.mapper;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import com.mf.domain.Employee_in;
import com.mf.domain.Permission;

public interface UserMapper {

	   /**
     * �����û�����ѯ�û���Ϣ�����������ż��䲿����Ϣ�����ɫ��Ϣ
     * @param name
     * @return Employee_in
     */
    public Employee_in getEmployee_inByName(String name) throws SQLException;
    
    /**
     * �����û�����ѯ��ɫ
     * @param name
     * @return ��ɫ����
     */
    public Set<String> getRoleByName(String name)throws SQLException;	
    
    /**
     * �����û�����ѯȨ��
     * @param name
     * @return ��ɫ����
     */
    public Set<String> getPermissionByName(String name) throws SQLException;	
	
	/**
	 * �����û�Id��ѯ�û��ĵ�¼����
	 * @param userId �û�Id
	 * @return ϵͳ��¼����
	 * @throws SQLException
	 */
	public String getPasswordByUserId(String employeeid) throws SQLException;
	
	
	/**
	 * ���û������ɫ
	 * @param userRole (employeeid,roleId)
	 * @return �����ļ�¼��
	 * @throws SQLException
	 */
	public int addRoleForUser(Employee_in employee_in)throws SQLException;
	
	/**
	 * �ر�/�����û�
	 * @param employee_ins map(employeeid Ա�����,status ״̬)
	 * @return �����ļ�¼��
	 */
	public int updateUserStatus(Employee_in employee_in)throws SQLException;
	
	/**
	 * ����������û��Ľ�ɫ
	 * @param userRole map����������û���� ��ɫ��� ��(employeeId,roleId)
	 * @return �����ļ�¼��
	 * @throws SQLException
	 */
	public int deleteRoleFromUser(Map<String,Object> userRole)throws SQLException;
		
	/**
	 * �����û����ɾ���û�
	 * @param employeeid
	 * @return
	 * @throws SQLException
	 */
	public int deleteUserById(String employeeid)throws SQLException;
	
	public Set<Permission> getObjectPermissionByName(String name); 
}
