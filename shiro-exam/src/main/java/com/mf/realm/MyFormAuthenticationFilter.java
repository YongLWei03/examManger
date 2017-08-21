package com.mf.realm;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;


public class MyFormAuthenticationFilter extends FormAuthenticationFilter {


	//ԭFormAuthenticationFilter����֤����
	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		//�����������֤���У��
		
		//��session��ȡ��ȷ��֤��
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpSession session =httpServletRequest.getSession();
		//ȡ��session����֤�루��ȷ����֤�룩
		String validateCode = (String) session.getAttribute("validateCode");
		
		//ȡ��ҳ�����֤��
		//�������֤��session�е���֤���жԱ� 
		String randomcode = httpServletRequest.getParameter("randomcode");
		if(randomcode!=null && validateCode!=null && !randomcode.equals(validateCode)){
			//���У��ʧ�ܣ�����֤�����ʧ����Ϣ��ͨ��shiroLoginFailure���õ�request��
			httpServletRequest.setAttribute("shiroLoginFailure", "randomCodeError");
			//�ܾ����ʣ�����У���˺ź����� 
			return true; 
		}
		return super.onAccessDenied(request, response);
	}

		
}
