package com.mf.util;

import java.util.UUID;

public class GetUuid {

	/** 
     * ���һ��UUID 
     * @return String UUID 
     */ 
	   public static String getUUID(){ 
	        String uuid = UUID.randomUUID().toString(); 
	        //ȥ����-������ 
	        //return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
	        return uuid;
	    } 
}
