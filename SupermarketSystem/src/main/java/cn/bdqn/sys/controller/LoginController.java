package cn.bdqn.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import cn.bdqn.sys.entity.SmbmsRole;
import cn.bdqn.sys.entity.SmbmsUser;
import cn.bdqn.sys.service.ISmbmsUserService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private ISmbmsUserService iUserService;

	@Autowired
	private SmbmsRoleController SmbmsRoleController;
	@RequestMapping("/")
	public String login() {
		return "login";
	}

	@RequestMapping("/login")
	public String dologin(String userCode, String userPassword, HttpSession session) {
		SmbmsUser user = iUserService.login(userCode, userPassword);
		if (user != null) {
			session.setAttribute("userSession", user);
			return "frame";
		} else {
			return "login";
		}
	}

	@RequestMapping("/outlogin")
	public String outlogin(HttpSession session) {
		session.removeAttribute("user");
		session.invalidate();
		return "login";

	}

	@RequestMapping("/querybill")
	public String querybill() {
		return "billlist";
	}

	@RequestMapping("/queryprovider")
	public String queryprovider() {
		return "providerlist";
	}

	@RequestMapping("/queryuser")
	public String queryuser(HttpServletRequest req) {
		List<SmbmsRole> roleList = SmbmsRoleController.RoleList();
		req.setAttribute("roleList",roleList);
		return "userlist";
	}

	@RequestMapping("/querypwdmodify")
	public String querypwdmodify() {
		return "pwdmodify";
	}
}
