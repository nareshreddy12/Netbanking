package com.Controllers;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DaoInterfaces.IDepositeDao;
import com.pojo.NewAccount;
import com.pojo.Transuction;

@Controller
public class DepositeController {
	private final static Logger logger = Logger.getLogger(DepositeController.class);

	@Autowired
	IDepositeDao idao;

	@RequestMapping(value = "deposit")
	public ModelAndView Deposite(@RequestParam(value = "deposite") Double deposite, NewAccount na) {
		logger.info("enter into deposite metod");
		Transuction tn = new Transuction();
		tn.setDeposite(deposite);
		tn.setWithdraw(0.0);
		List<NewAccount> list = idao.BalanceCheck(na);
		for (NewAccount na1 : list) {
			na.setAmount(na1.getAmount());

		}
		tn.setTotalAmount(deposite + na.getAmount());
		Serializable deposite2 = idao.deposite(na, tn);
		
			if(deposite2==null){
				return new ModelAndView("deposite1", "error", "Transuction  Failed please try again");
			}
		
			return new ModelAndView("deposit", "succses", "Transuction Completed Succesfully,Check Your Balance");
			

	}

}
