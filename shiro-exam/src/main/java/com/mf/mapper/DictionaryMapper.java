package com.mf.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.mf.domain.Dictionary;


public interface DictionaryMapper {
	
	/**
	 * �����ֵ����Ʋ�ѯ�ֵ����
	 * @param dictionaryName �ֵ�����
	 * @return �ֵ����
	 * @throws SQLException
	 */
	public String getCodeByName(String dictionaryName) throws SQLException;

	/**
	 * �����ֵ�����ѯ�ֵ�����
	 * @param dictionaryId �ֵ�Id
	 * @return �ֵ�����
	 * @throws SQLException
	 */
	public String getNameByCode(String dictionaryId) throws SQLException;
	
	/**
	 * ����ֵ���Ϣ
	 * @param dictionary
	 * @return
	 * @throws SQLException
	 */
	public int insertDictionary(Dictionary dictionary) throws SQLException;

	/**
	 * �����ֵ�Idɾ���ֵ���Ϣ
	 * @param dictionaryId
	 * @return
	 * @throws SQLException
	 */
	public int deleteDictionary(String dictionaryId) throws SQLException;

	/**
	 * �޸��ֵ���Ϣ
	 * @param dictionary
	 * @return
	 * @throws SQLException
	 */
	public int updateDictionary(Dictionary dictionary)
			throws SQLException;

	/**
	 * �����ֵ�����ѯ�ֵ���Ϣ
	 * @param dictionaryId
	 * @return
	 * @throws SQLException
	 */
	public Dictionary getDictionaryById(String dictionaryId)
			throws SQLException;
	
	/**
	 * ����������ѯ�ֵ���Ϣ(�ֵ��ţ��ֵ����ƣ� ��ʼ��¼����ÿҳ�ļ�¼��)
	 * @param condition(dictionaryId �ֵ���,dictionaryName �ֵ�����,
	 * 					pageBegin ��ʼ��¼��,pageSize ÿҳ�ļ�¼��,updictionaryId �ϼ��ֵ���)
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
	 * �����ϼ��ֵ��Ų�ѯ�ֵ���Ϣ
	 * @param upDictionaryId(�ϼ��ֵ���)��pageBegin(��ʼ��¼��)��pageSize(���صļ�¼��)
	 * @return List<Dictionary> (�¼��ֵ��б�)
	 * @throws SQLException
	 */
	public List<Dictionary> getDictionaryByUpDicId(Map<String,Object> dicCondition)
			throws SQLException;
	
	/**
	 * ��ѯȫ���ֵ��б�
	 * @return List<Dictionary> (ȫ���ֵ��б�)
	 * @throws SQLException
	 */
	public List<Dictionary> getAllDictionary()
			throws SQLException;
	
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
	public String getMaxDictionaryId(String upDictionaryId) throws SQLException;
	/**
	 * �����ϼ��ֵ�Id��ѯ���µ�һ���¼��ֵ���Ϣ
	 * @param upDictionaryId �ϼ��ֵ�Id
	 * @return ���µ�һ���¼��ֵ���Ϣ
	 * @throws SQLException
	 */
	public Dictionary getNewDictionary(String upDictionaryId)throws SQLException;
	
	/**
	 * ��һ���ֵ���ú���һ���ֵ�Ҳ�ý���
	 * @param upDictionaryId �ϼ��ֵ�Id
	 * @throws SQLException
	 */
	public int updateChildNotUse(Dictionary dictionary)throws SQLException;
	
	/**
	 * �����ϼ��ֵ�Id��ѯ�¼��ֵ�����
	 * @param upDictionaryId �ϼ��ֵ�Id
	 * @return �����¼��ֵ�id �� name
	 * @throws SQLException
	 */
	public List<Map<String, Object>> selectDicNameByUpDicId(String upDictionaryId) throws SQLException;

	public List<String> getInstitutionList(Map<String, Object> institutionCon) throws SQLException;
	
	public List<Map<String, Object>> getDicNameByUpDicId(String upDictionaryOptionId) throws SQLException;
	
}