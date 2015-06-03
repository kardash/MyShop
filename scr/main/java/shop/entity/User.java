package shop.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User extends BaseEntity {
	
	private String userName;
	private String password;
	private boolean enabled;

    @ManyToMany
	@JoinTable
	private Collection<Role> roles;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String password, boolean enabled
			) {
		super();
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
		
	}

	
}