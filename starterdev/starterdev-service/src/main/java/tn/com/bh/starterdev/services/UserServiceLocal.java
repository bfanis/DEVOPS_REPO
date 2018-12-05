package tn.com.bh.starterdev.services;

import javax.ejb.Local;

import tn.com.bh.starterdev.entities.User;
import tn.com.bh.starterdev.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
