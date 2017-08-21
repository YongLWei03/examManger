package com.mf.service;

import java.sql.SQLException;
import java.util.List;
import com.mf.domain.Permission;

public interface PermissionService {

	
    /**
     * ��ѯ���е�Ȩ��
     * @return Ȩ�޼���
     */
    public 	List<Permission> getAllpermission();
    
	 /**
     * ��ѯ�������õ�Ȩ�ޣ�������ɫ
     * @return �������õ�Ȩ�޼���
     */
	public List<Permission> getAllIsusePermission();
	
	/**
	 * ��ѯ���õ�Ȩ�ޣ������� ������Ȩ�ޣ������ż���ɫ
	 * @return ����������Ȩ�޵�����Ȩ�޵ļ���
	 */
	public List<Permission> selectDepartIsuserPermission();

    /**
     * ����Ȩ�� �Ƿ�����
     * @param permission
     * @return
     */
	public int updatePermission(Permission permission);
	
	/**
	 * ����permissionid��ѯȨ����Ϣ
	 * @param Ȩ��id
	 * @return
	 * 
	 */
	public Permission getPermissionById(String permissionid) ;

	/**
	 * ����Ȩ��id��ѯ��һ������Ȩ����Ϣ
	 * @param Ȩ��id
	 * @return
	 *
	 */
	public List<Permission> getNextPermissionById(String permissionid);

	/**
	 * ���� roleid ��ѯ��ӵ�е�Ȩ��
	 * @param rolename
	 * @return
	 * @throws SQLException
	 */
	public List<Permission> getPermissionByRoleId(String roleid);

}
