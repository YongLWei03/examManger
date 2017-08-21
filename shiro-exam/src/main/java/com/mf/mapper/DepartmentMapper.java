package com.mf.mapper;

import java.sql.SQLException;
import java.util.List;

import com.mf.domain.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(String departmentid);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(String departmentid);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    
	/**
	 * ���ݲ���id��ѯ���ż����Ͻ����
	 * @param departmentId
	 * @return ����ʵ��
	 */
	public List<Department> selectAllDepartbyId(String departmentId) throws Exception;
	
	/**
	 * ���ݲ���id��ѯ���ż����Ͻ����
	 * @param departmentId
	 * @return ����ʵ��
	 */
	public Department selectDepartbyId(String departmentId) throws Exception;
	
	/**
	 * ���ݲ���id��ȡ��������
	 * @param departmentId ����id
	 * @return departmentName ��������
	 */
	public String selectDepartNameByDepartId(String  departmentId) throws SQLException;
	
}