package com.mf.action;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import com.mf.domain.Permission;
import com.mf.domain.Role;
import com.mf.service.PermissionService;
import com.mf.service.RoleService;
import com.opensymphony.xwork2.ActionSupport;


public class RolePermissionAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Logger logger=Logger.getLogger(RolePermissionAction.class);

	HttpServletRequest request=ServletActionContext.getRequest();
	
	private Role role;
	private Permission permission;

	public Permission getFunction() {
		return permission;
	}

	public void setFunction(Permission permission) {
		this.permission = permission;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Resource
	private PermissionService permissionService; 
	
	@Resource
	private RoleService roleService;
	
	/**
	 * �½���ɫ
	 */
	
	@Override
	public String execute() throws Exception {		
		logger.info(role);
		roleService.addRoleWithPermission(role);
		roleService.addPermissionForRole(role);
		return "upFunOK";
	}
	
	/**
	 * ��ȡ����Ȩ����Ϣ
	 * @return
	 */
	public String selectFun(){
		List<Permission> permission=permissionService.getAllpermission();
		request.setAttribute("funInfo", permission);
		return SUCCESS;	
	}
	
	/**
	 * ��ȡ����Ȩ����Ϣ
	 * @return
	 */
	public String selectIsuseFun(){
		List<Permission> permission=permissionService.getAllIsusePermission();
		request.setAttribute("funInfo", permission);
		return "rolefunOK";	
	}
	
	/**
	 * �޸�Ȩ����Ϣ
	 * @return
	 */
	public String updateFun(){
		logger.info(permission);
		permissionService.updatePermission(permission);
		return "upFunOK";
	}
	
	
}
