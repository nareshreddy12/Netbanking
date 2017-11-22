package com.DaoInterfaces;

import java.io.Serializable;
import java.util.List;

import com.pojo.NewAccount;
import com.pojo.Transuction;

public interface IDepositeDao {

	Serializable deposite(NewAccount na, Transuction tn);

	List<NewAccount> BalanceCheck(NewAccount na);

	
}
