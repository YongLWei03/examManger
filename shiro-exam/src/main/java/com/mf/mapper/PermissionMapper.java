package com.mf.mapper;

import java.sql.SQLException;
import java.util.List;
import com.mf.domain.Permission;

public interface PermissionMapper {
    
    /**
     * ��ѯ���е�Ȩ��
     * @return Ȩ�޶���ļ���
     */
    public List<Permission> getAllPermission() throws SQLException;
    
    /**
     * ��ѯ���������õĵ�Ȩ��
     * @return �������õ�Ȩ�޶���ļ���
     */
    public List<Permission> getAllIsusePermission() throws SQLException;
    
	/**
	 * ��ѯ���õ�Ȩ�ޣ������� ������Ȩ�ޣ������ż���ɫ
	 * @return ����������Ȩ�޵�����Ȩ�޵ļ���
	 */
	public List<Permission> getDepartIsuserPermission() throws SQLException;
    
    /**
     * ����Ȩ�ޣ��Ƿ�����,����
     * @param permission permissionid,status(true,false)
     * @return �����ļ�¼��
     */
	public int updatePermission(Permission permission) throws SQLException;
	
	/**
	 * ����permissionid��ѯ������Ϣ
	 * @param Ȩ��id
	 * @return Ȩ�޼���
	 * 
	 */
	public Permission getPermissionById(String permissionid) throws SQLException ;

	/**
	 * ����permissionid��ѯ��һ�����й�����Ϣ
	 * @param ����id
	 * @return
	 *
	 */
	public List<Permission> getNextPermissionById(String permissionid)  throws SQLException;
	
	/**
	 * ���� roleid ��ѯ��ӵ�е�Ȩ��
	 * @param rolename
	 * @return
	 * @throws SQLException
	 */
	public List<Permission> getPermissionByRoleId(String roleid) throws SQLException;
}