package com.mf.service;

import java.util.List;

import com.mf.domain.Department;

public interface DepartService {
	
	/**
	 * ���ݲ���id��ѯ���ż����Ͻ����
	 * @param departmentId
	 * @return ����ʵ��
	 */
	public List<Department> selectAllDepartbyId(String departmentId) ;
	
	/**
	 * ���ݲ���id��ѯ���ż����Ͻ����
	 * @param departmentId
	 * @return ����ʵ��
	 */
	public Department selectDepartbyId(String departmentId) ;	

	/**
	 * ���ݲ���id��ȡ��������
	 * @param departmentId ����id
	 * @return departmentName ��������
	 */
	public String selectDepartNameByDepartId(String  departmentId);
	
	/**
	 * ���ݽ�ɫ�Ĳ���id���ϲ�ѯ������
	 * @param departmentid
	 * @return
	 */
	public List<Department> getDepartmentTreeByDepartIdFromRole(List<String> departmentid);
}
