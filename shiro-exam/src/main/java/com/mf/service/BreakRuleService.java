package com.mf.service;

import java.util.List;
import java.util.Map;

import com.mf.domain.Breakrules;

public interface BreakRuleService {

	/**
	 * ���Υ����Ϣ
	 * @param breakrules
	 * @return �Ƿ�����ɹ�
	 */
	public boolean addBreakRule(Breakrules breakrules);
	
	/**
	 * �޸�Υ����Ϣ
	 * @param breakrules
	 * @return �Ƿ�����ɹ�
	 */
	public boolean updateBreakRuleById(Breakrules breakrules);
	
	/**
	 * ����Υ�±��ɾ��Υ����Ϣ
	 * @param breakruleid
	 * @return �Ƿ�����ɹ�
	 */
	public boolean deleteBreakRuleById(String breakruleid);
	
	/**
	 * ������е�Υ����Ϣ
	 * @param map condition:pageBegin ��ʼ��¼��, pageSize�� ��Ҫ���ʵļ�¼��
	 * @return Υ����Ϣ����
	 */
	public List<Breakrules> getAllBreakRule(Map<String, Object> condition);
	
	/**
	 * ��ϲ�ѯΥ����Ϣ
	 * @param Map condition�� breakrule����employeeid �⳧Ա�����,minusnum �۳����֣�
	 * 						 dataBegin ��ʼʱ�� ��dataEnd ��ֹʱ�䣬
	 * 						 pageBegin ��ʼ��¼�� pageSize�� ��Ҫ���ʵļ�¼��
	 * @return Υ����Ϣ����
	 */
	public List<Breakrules> getSomeBreakRule(Map<String, Object> condition);
	
	
	
}
