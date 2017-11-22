package com.Controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.DaoInterfaces.IBalanceDAo;
import com.pojo.NewAccount;

@Controller
public class BalanceInfoController {

	@Autowired
	IBalanceDAo bdao;

	private final static Logger logger = Logger.getLogger(BalanceInfoController.class);

	@RequestMapping(value = "/balance")
	public ModelAndView BalanceInfo(NewAccount na) {
		logger.info("Enter Into Balance Info");

		List<NewAccount> list = bdao.BalanceCheck(na);

		if (list != null) {

			for (NewAccount result : list) {
				return new ModelAndView("balance", "succes", result);
			}

		}
		return new ModelAndView("balance1", "error", "Invalid Account Number");

	}

}
