package tn.com.bh.starterdev.services;

import javax.ejb.Remote;

import tn.com.bh.starterdev.entities.User;
import tn.com.bh.starterdev.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
