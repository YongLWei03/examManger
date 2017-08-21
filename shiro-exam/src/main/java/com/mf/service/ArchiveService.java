package com.mf.service;

import java.util.List;
import java.util.Map;

import com.mf.domain.Archive;

public interface ArchiveService {
	
	/**
	 * �ⳡԱ���������û�ID��ѯ��ѵ������Ϣ
	 * @param Map��condition employeeOut	Id �⳧Ա����ţ�pageBegin ��ʼ��¼�� pageSize�� ��Ҫ���ʵļ�¼��
	 * @return ��ѵ��������
	 */
	public List<Archive> getOutAllArchiveByUserId(Map<String, Object> condition);
	
	/**
	 * �糧Ա���������û�ID��ѯ��ѵ������Ϣ
	 * @param Map��condition employeeInId �糧Ա����ţ�pageBegin ��ʼ��¼�� pageSize�� ��Ҫ���ʵļ�¼��
	 * @return ��ѵ��������
	 */
	public List<Archive> getInAllArchiveByUserId(Map<String, Object> condition);
	
	/**
	 * �ⳡԱ���������û�ID��ѯ��ѵ������Ϣ
	 * @param Map��condition archive����employeeOutId �⳧Ա����ţ�examlevel��int�� ���Եȼ���
	 * 						 dataBegin ��ʼʱ�� ��dataEnd ��ֹʱ�䣬isVia��boolean�� �Ƿ�ͨ��)
	 * 						 pageBegin ��ʼ��¼�� pageSize�� ��Ҫ���ʵļ�¼��
	 * @return ��ѵ��������
	 */
	public List<Archive> getOutSomeArchiveByCondition(Map<String, Object> condition);
	
	/**
	 * �糧Ա���������û�ID��ѯ��ѵ������Ϣ
	 * @param Map��condition archive����employeeInId �⳧Ա����ţ�examlevel��int�� ���Եȼ���
	 * 						isVia��boolean�� �Ƿ�ͨ���� dataBegin ��ʼʱ�� ��dataEnd ��ֹʱ�䣬
	 * 						 pageBegin ��ʼ��¼�� pageSize�� ��Ҫ���ʵļ�¼��
	 * @return ��ѵ��������
	 */
	public List<Archive> getInSomeArchiveByCondition(Map<String, Object> condition);
	
	
}
