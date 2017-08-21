package com.mf.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.mf.domain.Employee_in;


/**
 * �û�����ӿڣ���¼�����û������ɫ��ɾ���û����ر��û�
 * @author dream
 *
 */
public interface UserService {


    /**
     * �����û�����ѯ�û���Ϣ�����������ż��䲿����Ϣ�����ɫ��Ϣ
     * @param name
     * @return Employee_in
     */
    public Employee_in getEmployee_inByName(String name) ;
    
    /**
     * �����û�����ѯ��ɫ
     * @param name
     * @return ��ɫ����
     */
    public Set<String> addRoleByName(String name) ;	
    
    /**
     * �����û�����ѯȨ��
     * @param name
     * @return ��ɫ����
     */
    public Set<String> getPermissionByName(String name) ;	
     
    //public List<Permission> getObjectPermissionByName(String name);
	
	/**
	 * �����û�Id��ѯ�û��ĵ�¼����
	 * @param userId �û�Id
	 * @return ϵͳ��¼����
	 * @throws SQLException
	 */
	public String getPasswordByUserId(String employeeid) ;
	
	
	/**
	 * ���û������ɫ
	 * @param userRole (employeeid,roleId)
	 * @return �Ƿ�����ɹ�
	 * @throws SQLException
	 */
	public boolean addRoleForUser(Employee_in employee_in);
	
	/**
	 * �����ر�/�����û�
	 * @param employee_ins map(employeeid Ա�����,status ״̬)
	 * @return �Ƿ�����ɹ�
	 */
	public boolean updateUserStatus(List<Map<String, Object>> condition);
	
	/**
	 * ����������û��Ľ�ɫ
	 * @param userRole map����������û���� ��ɫ��� ��(employeeId,roleId)
	 * @return �Ƿ�����ɹ�
	 * @throws SQLException
	 */
	public boolean deleteRoleFromUser(Map<String,Object> userRole);
		
	/**
	 * �����û����ɾ���û�
	 * @param employeeid
	 * @return
	 * @throws SQLException
	 */
	public boolean deleteUserById(String employeeid);
	
	/**
	 * �����û��� username������ password
	 * @param username �û���
	 * @param password ����
	 * @return
	 */
	public boolean login(String username,String password);
	
}
