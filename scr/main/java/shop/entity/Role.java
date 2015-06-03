package shop.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
@Entity
public class Role extends BaseEntity{

	private String name;
	
	@ManyToMany(mappedBy = "roles")
    private Collection<User> users;

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
