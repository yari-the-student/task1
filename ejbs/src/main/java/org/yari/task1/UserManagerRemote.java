package org.yari.task1;

import javax.ejb.Remote;

@Remote
public interface UserManagerRemote {

	void createUser(String name);

}
