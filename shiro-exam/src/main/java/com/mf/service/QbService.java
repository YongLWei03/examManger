package com.mf.service;
import java.util.List;

import com.mf.domain.Questionbank;

public interface QbService {

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
	public int insertQB(Questionbank questionbank);
}
