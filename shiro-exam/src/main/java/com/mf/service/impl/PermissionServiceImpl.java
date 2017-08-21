package com.mf.service.impl;

import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mf.domain.Permission;
import com.mf.mapper.PermissionMapper;
import com.mf.service.PermissionService;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {

	@Resource
	private PermissionMapper permissionMapper;
	
	/**
	 * ��ȡ����Ȩ����Ϣ
	 */
	@Override
	public List<Permission> getAllpermission() {
		List<Permission> permission = null;
		try {
			permission = permissionMapper.getAllPermission();
			return permission;
		} catch (SQLException e) {
			return null;
		}
	}

	/**
	 * ����Ȩ����Ϣ���Ƿ�����
	 */
	@Override
	public int updatePermission(Permission permission) {
		int i = 0;
		try {
			i = permissionMapper.updatePermission(permission);
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * ������õ�Ȩ����Ϣ
	 */
	@Override
	public List<Permission> getAllIsusePermission() {
		List<Permission> permission = null;
		try {
			permission = permissionMapper.getAllIsusePermission();
			return permission;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return permission;
		}
		
	}

	/**
	 * ���ݹ���id��ѯ����
	 */
	@Override
	public Permission getPermissionById(String permissionid) {
		Permission permission=null;
		try {
			permission=permissionMapper.getPermissionById(permissionid);
			return permission;
		} catch (Exception e) {
			e.printStackTrace();
			return permission;
		}
		
	}

	/**
	 * ���ݹ���id ��ѯ��������
	 */
	@Override
	public List<Permission> getNextPermissionById(String permissionid) {
		List<Permission> permission=null;
		try {
			permission=permissionMapper.getNextPermissionById(permissionid);
			return permission;
		} catch (Exception e) {
			e.printStackTrace();
			return permission;
		}
		
	}
	
	/**
	 * ���ݽ�ɫid��ѯ����ӵ�е�Ȩ�޼���
	 */
	@Override
	public List<Permission> getPermissionByRoleId(String roleid) {
		List<Permission> permission=null;
		try {
			permission=permissionMapper.getPermissionByRoleId(roleid);
			return permission;
		} catch (Exception e) {
			e.printStackTrace();
			return permission;
		}
		
	}

	@Override
	public List<Permission> selectDepartIsuserPermission() {
		List<Permission> permission=null;
		try {
			permission=permissionMapper.getDepartIsuserPermission();
			return permission;
		} catch (Exception e) {
			e.printStackTrace();
			return permission;
		}
		
	}
	

}
