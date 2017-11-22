package com.DaoInterfaces;

import java.io.Serializable;

import com.pojo.NewAccount;

public interface IfRegDao {
	Serializable save(NewAccount na);

}
