package com.DaoInterfaces;

import java.util.List;

import com.pojo.NewAccount;

public interface IBalanceDAo {
	List<NewAccount> BalanceCheck(NewAccount na);

}
