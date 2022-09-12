package com.lip6.services.ServiceContactGroup;

import com.lip6.daos.DAOContactGroup.DAOContactGroup;
import com.lip6.daos.DAOContactGroup.IDAOContactGroup;

public class ServiceContactGroup {
	
	public void createContactGroup(String groupName) {
		
		IDAOContactGroup contactGroup = new DAOContactGroup();
		contactGroup.addContactGroup(groupName);
		
	}

}
