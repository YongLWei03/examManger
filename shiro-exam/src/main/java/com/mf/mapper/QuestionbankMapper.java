package com.mf.mapper;
import java.util.List;

import com.mf.domain.Questionbank;


public interface QuestionbankMapper {
  
	/**
	 * ���ݲ���id��ѯ�������
	 * @param departmentId
	 * @return �����ż��������ŵ������Ϣ
	 */
	public List<Questionbank> selectQbByDepartmentId(String departmentId);
	
	/**
	 * �½����
	 * @param questionbank
	 * @return 
	 */
	public int insertQB(Questionbank questionBank);
	
	
}