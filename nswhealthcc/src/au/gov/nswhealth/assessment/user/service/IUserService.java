package au.gov.nswhealth.assessment.user.service;

import java.util.List;

import au.gov.nswhealth.assessment.model.User;

/**
 * 
 * User Service Interface
 * 
 *
 */
public interface IUserService {
	
	/**
	 * Add User
	 * 
	 * @param  User user
	 */
	public void addUser(User user);
	
	/**
	 * Update User
	 * 
	 * @param  User user
	 */
	public void updateUser(User user);

	/**
	 * Delete User
	 * 
	 * @param  User user
	 */
	public void deleteUser(User user);
	
	/**
	 * Get User
	 * 
	 * @param  int User Id
	 */
	public User getUserById(int id);
	
	/**
	 * Get User List
	 * 
	 * @return List - User list
	 */
	public List<User> getUsers();
}
