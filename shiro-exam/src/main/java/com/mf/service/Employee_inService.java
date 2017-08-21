package com.mf.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.mf.domain.Employee_in;

public interface Employee_inService {

		/**
		 * ���ݲ���Id��ѯ�ò����µ������û�
		 * @param departmentId ���ű�� pageBegin ��ʼ��¼�� pageSize ��Ҫ���ʵļ�¼��
		 * @return List<Employee_in> �û�������Ϣ 
		 * @throws SQLException
		 */
		public List<Employee_in> selectAllUserByDepartId(Map<String,Object> condition);
		
		/**
		 * ��ϲ�ѯ �û���Ϣ
		 * @param 1��employee_in�����װ���� ����������Ϣ�����ű�š���ɫ��� 
		 * 			2������mydepartmentid ������ֻ�ܲ鿴�����ŵ�Ա�� ���г���Ȩ�� ����'001'
		 * 			3������pageBegin��pavgeSize��ɷ�ҳ
		 * @return �û�������Ϣ
		 * @throws SQLException
		 */
		public List<Employee_in> selectUserByAny(Map<String, Object> employee) ;
		
		/**
		 * �����û����ƻ�ȡ�û�Id
		 * @param name
		 * @return
		 * @throws SQLException
		 */
		public String selectUserIdByName(String name) ;
		
		/**
		 * ��ȡ��һ���û��ı��
		 * @return
		 * @throws SQLException
		 */
		public String selectNextUserId();
		
		/**
		 * �ж� employeeid �� password �Ƿ���ȷ
		 * @param employee_in ���� employeeid �� password
		 * @return 1 ���û�����  0������ȷ
		 * @throws SQLException
		 */
		public boolean selectIsUser(Employee_in employee_in) ;
		
		/**
		 * ����û�������Ϣ
		 * @param user
		 * @throws SQLException
		 */
		public boolean insertUserInfo(Employee_in employee_in);
		
		/**
		 * �޸��û�������Ϣ(���������롢�ر��û�)
		 * @param user
		 * @return
		 * @throws SQLException
		 */
		public boolean updateUserInfo(Employee_in employee_in);
		
		/**
		 * �޸��û�����
		 * @param userPassword map�������(userId,password)
		 * @return
		 * @throws SQLException
		 */
		public boolean updateUserPassword(Map<String,Object> userPassword);

		/**
		 * ���ݲ��ű�ţ���ȡԱ�����ܼ�¼��
		 * @param departmentid ���ű��
		 * @return �ܼ�¼��
		 */
		public int getUserCount(String departmentid);

}
