package com.mf.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import com.mf.domain.Employee_in;
public interface Employee_inMapper {
	
    
	/**
	 * ���ݲ���id��ѯ����Ա��
	 * @param unitName ��������
	 * @return Ա�����󼯺�
	 */
	public List<Employee_in> selectAllUserByDepartId(Map<String, Object> employee)throws Exception;
	
	/**
	 * ��ϲ�ѯ �û���Ϣ
	 * @param employee_in�����װ����
	 * @return �û�������Ϣ
	 * @throws SQLException
	 */
	public List<Employee_in> selectUserByAny(Map<String, Object> employee) throws Exception;

	/**
	 * ��ȡ��һ���û��ı��
	 * @return
	 * @throws SQLException
	 */
	public String selectNextUserId()throws SQLException;
	
	/**
	 * ����û�������Ϣ
	 * @param user
	 * @throws SQLException
	 */
	public int insertUserInfo(Employee_in employee_in)throws SQLException;
	
	
	/**
	 * �޸��û�������Ϣ(����������)
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public int updateUserInfo(Employee_in employee_in)throws SQLException;
	
	/**
	 * �޸��û�����
	 * @param userPassword map�������(userId,password)
	 * @return
	 * @throws SQLException
	 */
	public int updateUserPassword(Map<String,Object> userPassword)throws SQLException;
	
	/**
	 * ���ݲ���Id��ѯ�ò����µ��û�
	 * @param unitId ���ű�� pageBegin ��ʼ��¼�� pageSize ��Ҫ���ʵļ�¼��
	 * @return List<Employee_in> �û�������Ϣ 
	 * @throws SQLException
	 */
	public List<Employee_in> selectUserByDepartId(Map<String,Object> condition)throws SQLException;
	
	
	/**
	 * �����û����ƻ�ȡ�û�Id
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public String selectUserIdByName(String name) throws SQLException;
		
	/**
	 * �ж� employeeid �� password �Ƿ���ȷ
	 * @param employee_in ���� employeeid �� password
	 * @return 1 ���û�����  0������ȷ
	 * @throws SQLException
	 */
	public int selectIsUser(Employee_in employee_in) throws SQLException;
	
	/**
	 * ���ݲ��ű�ţ���ȡԱ�����ܼ�¼��
	 * @param departmentid ���ű��
	 * @return �ܼ�¼��
	 */
	public int getUserCount(String departmentid)throws SQLException;

}