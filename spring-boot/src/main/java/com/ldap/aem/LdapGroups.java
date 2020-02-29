package com.ldap.aem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LdapGroups {
	
	@Autowired 
	private LDAPRepository groupRepository;
	
	@RequestMapping(value="ldapUsers")
	public List<String> getLdapGroups(){
		
		List<String> names = groupRepository.getAllPersonNames();
		return names;
		
	}
	
	

}
