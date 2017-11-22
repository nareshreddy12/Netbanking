package com.Controllers;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.DaoInterfaces.IBalanceDAo;
import com.DaoInterfaces.IfRegDao;
import com.pojo.NewAccount;
import com.validate.Validations;

@Controller
public class RegController {

	@Autowired
	IfRegDao rdao;

	@Autowired
	IBalanceDAo bdao;

	private final static Logger logger = Logger.getLogger(RegController.class);

	@RequestMapping(value = "/createaccount")
	public ModelAndView Regsave(NewAccount na) {
		logger.info("enter into creat");

		Validations v = new Validations();
		boolean b = v.PasswordValidator(na.getPassword());
		boolean c = v.ValidatePhoneNumber(na.getPhone());
		if (b == false) {
			return new ModelAndView("create", "error",
					"Password MissMatch Type Mustbe{upper(A-Z),lower(a-z),num(0-9),symbol(@,$,#)}");
		} else if (c == false) {
			return new ModelAndView("create", "error1", "Give Me Valid Phone Number");
		}
		System.out.println("Venkatasai");
		Serializable save = rdao.save(na);
		logger.info("Connection Created To Database");

		if (save == null) {

			return new ModelAndView("create", "error2", "Registration Failuer please try again");
		}
		return new ModelAndView("create", "succesmsg", "Registraion Completed Succesfully");

	}

}
