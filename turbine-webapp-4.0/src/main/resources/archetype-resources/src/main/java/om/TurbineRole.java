package ${package}.om;

import java.sql.Connection;
import java.util.Set;

import org.apache.fulcrum.security.model.turbine.entity.TurbineUserGroupRole;
import org.apache.torque.TorqueException;
import org.apache.torque.om.SimpleKey;


/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Tue Oct 25 15:50:37 CEST 2016]
 *
 * You should add additional methods to this class to meet the
 * application requirements.  This class will only be generated as
 * long as it does not already exist in the output directory.
 */
/**
 * Added Interface and default implementations 
 * @author gk
 *
 */
public  class TurbineRole
    extends ${package}.om.BaseTurbineRole implements org.apache.fulcrum.security.entity.Role, org.apache.fulcrum.security.model.turbine.entity.TurbineRole
{
    /** Serial version */
    private static final long serialVersionUID = 1477403437121L;

    
    /**
     * Get the value of name.
     *
     * @return String
     */
    @Override
	public String getName() 
    {
        
        return getEntityName();
    }

    /**
     * Set the value of name.
     *
     * @param v new value
     */
    @Override
	public void setName(String v)
    {
        setEntityName(v);

    }

	@Override
	public Integer getEntityId() {
		return getRoleId();
	}

	@Override
	public void setEntityId(Integer id) throws TorqueException {
		setRoleId(id);
	}

	/**
	 * @TODO
	 */
	@Override
	public void update(Connection con) throws TorqueException {
    	Set<TurbineUserGroupRole> userGroupRoleSet = getUserGroupRoleSet();
        if (userGroupRoleSet != null)
        {


        }

        try
        {
            save(con);
        }
        catch (Exception e)
        {
            throw new TorqueException(e);
        }
	}

	@Override
	public String getDatabaseName() {
		return "default";
	}

	@Override
	public void delete() throws TorqueException {
		TurbineRolePeer.doDelete(SimpleKey.keyFor(getEntityId()));
		
	}

}