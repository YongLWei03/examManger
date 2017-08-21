package com.mf.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mf.domain.Dictionary;
import com.mf.mapper.DictionaryMapper;
import com.mf.service.DictionaryService;
import com.mf.util.ValidateCheck;

@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {

	@Resource
	private DictionaryMapper dictionaryMapper;

	/**
	 * ����ֵ���Ϣ
	 * @param dictionary
	 * @return
	 * @throws SQLException
	 */
	public boolean addDictionary(Dictionary dictionary)
			throws SQLException {		
		if (dictionary != null) {
			dictionary.setDictionaryid(this.getNextDictionaryId(dictionary.getUpdictionaryid()));
			int addDictionaryResult = dictionaryMapper.insertDictionary(dictionary);

			boolean result = addDictionaryResult > -1 ? true : false;

			return result;

		}
		return false;
	}

	/**
	 * �����ֵ�Idɾ���ֵ���Ϣ
	 * 
	 * @param dictionaryId
	 * @return
	 * @throws SQLException
	 */
	public boolean deleteDictionary(String dictionaryId)
			throws SQLException {
		if (dictionaryId != null && !"".equals(dictionaryId)) {
			return dictionaryMapper.deleteDictionary(dictionaryId) > 0 ? true
					: false;
		} else {
			return false;
		}
	}

	/**
	 * �����ֵ�����ѯ�ֵ���Ϣ
	 * @param dictionaryId
	 * @return
	 * @throws SQLException
	 */
	public Dictionary getDictionaryById(String dictionaryId)
			throws SQLException {
		if (dictionaryId != null && !"".equals(dictionaryId)) {
			return dictionaryMapper.getDictionaryById(dictionaryId);
		}
		return null;
	}

	/**
	 * ����������ѯ�ֵ���Ϣ(�ֵ��ţ��ֵ����ƣ� ��ʼ��¼����ÿҳ�ļ�¼��)
	 * 
	 * @param condition
	 *            (dictionaryId �ֵ���,dictionaryName �ֵ�����, pageBegin
	 *            ��ʼ��¼��,pageSize ÿҳ�ļ�¼��,dictionaryId �ϼ��ֵ���)
	 * @return
	 * @throws SQLException
	 */
	public List<Dictionary> getDictionaryByConditon(
			Map<String, Object> condition) throws SQLException {

		if (condition != null) {

			return dictionaryMapper.getDictionaryByConditon(condition);
		}

		return null;
	}

	/**
	 * ����������ѯ�ֵ���ܵļ�¼��(�ֵ��ţ��ֵ�����)
	 * 
	 * @param condition
	 *            (dictionaryId �ֵ���,dictionaryName �ֵ�����)
	 * @return
	 * @throws SQLException
	 */
	public int getDicCountByConditon(Map<String, Object> condition)
			throws SQLException {

		if (condition != null) {

			return dictionaryMapper.getDicCountByConditon(condition);

		}
		return 0;
	}

	/**
	 * �޸��ֵ���Ϣ
	 * 
	 * @param dictionary
	 * @return
	 * @throws SQLException
	 */
	@Transactional
	public boolean updateDictionary(Dictionary dictionary)
			throws SQLException {

		if (dictionary != null) {

			boolean updateResult = false;

			dictionaryMapper.updateChildNotUse(dictionary);
			updateResult = dictionaryMapper.updateDictionary(dictionary) >= 0 ? true
					: false;
			
			
			return updateResult;

		} else {

			return false;
		}
	}

	/**
	 * �����ϼ��ֵ��Ų�ѯ�ֵ���Ϣ
	 * 
	 * @param upDictionaryId
	 *            (�ϼ��ֵ���)��pageBegin(��ʼ��¼��)��pageSize(���صļ�¼��)
	 * @return List<Dictionary> (�¼��ֵ��б�)
	 * @throws SQLException
	 */
	public List<Dictionary> getDictionaryByUpDicId(
			Map<String, Object> dicCondition) throws SQLException {

		if (dicCondition != null) {

			return dictionaryMapper.getDictionaryByUpDicId(dicCondition);

		} else {

			return null;
		}

	}

	/**
	 * ��ѯȫ���ֵ��б�
	 * 
	 * @return List<Dictionary> (ȫ���ֵ��б�)
	 * @throws SQLException
	 */
	public List<Dictionary> getAllDictionary() throws SQLException {

		return dictionaryMapper.getAllDictionary();
	}

	/**
	 * ��ѯ�ֵ�����Ϣ
	 * 
	 * @return List<Map<String,Object>>
	 *         ���ص�map����(dictionaryId,dictionaryName
	 *         ,upDictionaryId) (�ֵ��ţ��ֵ����ƣ��ϼ��ֵ���)
	 * @throws SQLException
	 */
	public List<Map<String, Object>> getDictionaryTree() throws SQLException {

		return dictionaryMapper.getDictionaryTree();
	}

	/**
	 * �����ϼ��ֵ�Id��ѯ��һ��Ҫ�������һ���ֵ�ı��
	 * 
	 * @param upDictionaryId
	 *            �ϼ��ֵ�Id
	 * @return
	 * @throws SQLException
	 */
	public String getNextDictionaryId(String upDictionaryId)
			throws SQLException {

		boolean result = ValidateCheck.isNotNull(upDictionaryId);

		if (result) {

			String nextId = dictionaryMapper
					.getMaxDictionaryId(upDictionaryId);

			if (nextId == null) {

				nextId = upDictionaryId + "001";

			} else {

				nextId = Integer.toString(Integer.parseInt(nextId) + 1);
			}

			return nextId;

		} else {

			return null;
		}

	}

	/**
	 * �����ϼ��ֵ�Id��ѯ���µ�һ���¼��ֵ���Ϣ
	 * 
	 * @param upDictionaryId
	 *            �ϼ��ֵ�Id
	 * @return ���µ�һ���¼��ֵ���Ϣ
	 * @throws SQLException
	 */
	public Dictionary getNewDictionary(String upDictionaryId)
			throws SQLException {

		boolean result = ValidateCheck.isNotNull(upDictionaryId);

		if (result) {

			return dictionaryMapper.getNewDictionary(upDictionaryId);

		} else {

			return null;
		}

	}

	/**
	 * �����ֵ����Ʋ�ѯ�ֵ����
	 * 
	 * @param dictionaryName
	 *            �ֵ�����
	 * @return �ֵ����
	 * @throws SQLException
	 */
	public String getCodeByName(String dictionaryName) throws SQLException {
		if(ValidateCheck.isNotNull(dictionaryName)) {
			return dictionaryMapper.getCodeByName(dictionaryName);
		}
		return null;
	}

	public List<String> getInstitutionList(Map<String, Object> institutionCon)
			throws SQLException {
		if(institutionCon != null && institutionCon.size() > 0) {
			return dictionaryMapper.getInstitutionList(institutionCon);
		}
		return null;
	}

	@Override
	public List<Map<String, Object>> getDicNameByUpDicId(String upDictionaryId) throws SQLException {
		if (ValidateCheck.isNotNull(upDictionaryId)) {
			return dictionaryMapper.selectDicNameByUpDicId(upDictionaryId);
		}
		return null;
	}
}
