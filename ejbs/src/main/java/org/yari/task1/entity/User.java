package org.yari.task1.entity;

import javax.persistence.*;

@Entity
@Table(name="Users")
@NamedQueries({
    @NamedQuery(name = User.QUERY_FIND_BY_NAME, query = "from User u where u.name = :name")
})
public class User {
	public final static String QUERY_FIND_BY_NAME = "User.findByName";

    @Id
    @GeneratedValue
    private long id;
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }
}
