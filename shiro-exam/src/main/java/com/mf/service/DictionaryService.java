package com.mf.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import com.mf.domain.Dictionary;

public interface DictionaryService {
	
	/**
	 * ����ֵ���Ϣ
	 * @param dictionary
	 * @return
	 * @throws SQLException
	 */
	public boolean addDictionary(Dictionary dictionary)throws SQLException;
	/**
	 * �����ֵ�Idɾ���ֵ���Ϣ
	 * @param dictionaryId
	 * @return
	 * @throws SQLException
	 */
	public boolean deleteDictionary(String dictionaryId)throws SQLException;
	
	/**
	 * �����ֵ�����ѯ�ֵ���Ϣ
	 * @param dictionaryId
	 * @return
	 * @throws SQLException
	 */
	public Dictionary getDictionaryById(String dictionaryId)throws SQLException;
	
	
	/**
	 * ����������ѯ�ֵ���Ϣ(�ֵ��ţ��ֵ����ƣ� ��ʼ��¼����ÿҳ�ļ�¼��)
	 * @param condition(dictionaryId �ֵ���,dictionaryName �ֵ�����,
	 * 					pageBegin ��ʼ��¼��,pageSize ÿҳ�ļ�¼��,dictionaryId �ϼ��ֵ���)
	 * @return
	 * @throws SQLException
	 */
	public List<Dictionary> getDictionaryByConditon(Map<String,Object> condition) throws SQLException;
	
	/**
	 * ����������ѯ�ֵ���ܵļ�¼��(�ֵ��ţ��ֵ�����)
	 * @param condition(dictionaryId �ֵ���,dictionaryName �ֵ�����)
	 * @return
	 * @throws SQLException
	 */
	public int getDicCountByConditon(Map<String,Object> condition) throws SQLException;
	
	/**
	 * �޸��ֵ���Ϣ
	 * @param dictionary
	 * @return
	 * @throws SQLException
	 */
	public boolean updateDictionary(Dictionary dictionary)throws SQLException;
	
	/**
	 * �����ϼ��ֵ��Ų�ѯ�ֵ���Ϣ
	 * @param upDictionaryId(�ϼ��ֵ���)��pageBegin(��ʼ��¼��)��pageSize(���صļ�¼��)
	 * @return List<Dictionary> (�¼��ֵ��б�)
	 * @throws SQLException
	 */
	public List<Dictionary> getDictionaryByUpDicId(Map<String,Object> dicCondition) throws SQLException;
	
	/**
	 * ��ѯȫ���ֵ��б�
	 * @return List<Dictionary> (ȫ���ֵ��б�)
	 * @throws SQLException
	 */
	public List<Dictionary> getAllDictionary()throws SQLException;
	
	/**
	 * ��ѯ�ֵ�����Ϣ
	 * @return List<Map<String,Object>>
	 * ���ص�map����(dictionaryId,dictionaryName,upDictionaryId)
	 * (�ֵ��ţ��ֵ����ƣ��ϼ��ֵ���)
	 * @throws SQLException
	 */
	public List<Map<String,Object>> getDictionaryTree() throws SQLException;
	/**
	 * �����ϼ��ֵ�Id��ѯ��һ��Ҫ�������һ���ֵ�ı�� 
	 * @param upDictionaryId �ϼ��ֵ�Id
	 * @return
	 * @throws SQLException
	 */
	public String getNextDictionaryId(String upDictionaryId) throws SQLException;
	/**
	 * �����ϼ��ֵ�Id��ѯ���µ�һ���¼��ֵ���Ϣ
	 * @param upDictionaryId �ϼ��ֵ�Id
	 * @return ���µ�һ���¼��ֵ���Ϣ
	 * @throws SQLException
	 */
	public Dictionary getNewDictionary(String upDictionaryId)throws SQLException;

	
	/**
	 * �����ֵ����Ʋ�ѯ�ֵ����
	 * @param dictionaryName �ֵ�����
	 * @return �ֵ����
	 * @throws SQLException
	 */
	public  String getCodeByName(String dictionaryName)throws SQLException;

	public List<String> getInstitutionList(Map<String, Object> institutionCon) throws SQLException;
	
	public List<Map<String, Object>> getDicNameByUpDicId(String upDictionaryId) throws SQLException;
}