package com.faithbook.v1.postgresql;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.acls.jdbc.LookupStrategy;
import org.springframework.security.acls.model.Acl;
import org.springframework.security.acls.model.AlreadyExistsException;
import org.springframework.security.acls.model.ChildrenExistException;
import org.springframework.security.acls.model.MutableAcl;
import org.springframework.security.acls.model.MutableAclService;
import org.springframework.security.acls.model.NotFoundException;
import org.springframework.security.acls.model.ObjectIdentity;
import org.springframework.security.acls.model.Sid;

public class PostgresqlJdbcMutableAclService implements MutableAclService {

	protected final JdbcTemplate jdbcTemplate;
	private static String queryFindChildren = 
			"select 	obj.object_id_identity, class.class " +
			"from  	acl_object_identity obj, acl_object_identity parent, acl_class class " +
			"where 	obj.entries_inheriting = true AND " +
				"obj.object_id_class = class.id AND " +
				"obj.parent_object = 2 AND " +
				"parent.object_id_class =  " +
				"(select id from acl_class where class='parent');";
	
	public PostgresqlJdbcMutableAclService(DataSource source)
	{
		this.jdbcTemplate = new JdbcTemplate(source);
	}
	
	@Override
	public List<ObjectIdentity> findChildren(ObjectIdentity arg0) {
		
		//select 
		
		return null;
	}

	@Override
	public Acl readAclById(ObjectIdentity arg0) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acl readAclById(ObjectIdentity arg0, List<Sid> arg1)
			throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<ObjectIdentity, Acl> readAclsById(List<ObjectIdentity> arg0)
			throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<ObjectIdentity, Acl> readAclsById(List<ObjectIdentity> arg0,
			List<Sid> arg1) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableAcl createAcl(ObjectIdentity arg0)
			throws AlreadyExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAcl(ObjectIdentity arg0, boolean arg1)
			throws ChildrenExistException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MutableAcl updateAcl(MutableAcl arg0) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
