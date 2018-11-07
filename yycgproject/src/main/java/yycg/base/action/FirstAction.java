package yycg.base.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yycg.base.pojo.vo.ActiveUser;
import yycg.base.pojo.vo.Menu;
import yycg.base.process.context.Config;
import yycg.base.service.UserService;

@Controller
public class FirstAction {
	
	@Autowired
	private UserService userService;
	
	//首页
	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		
		
		return "/base/first";
	}
	
	//欢迎页面
	@RequestMapping("/welcome")
	public String welcome(){
		
		return "/base/welcome";
	}
	
	/**
	 * 获取菜单菜单，并转成json
	 */
	@RequestMapping("/usermenu")
	public @ResponseBody Menu usermenu(HttpServletRequest request)throws Exception{
		HttpSession session = request.getSession();
		ActiveUser activeUser =(ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
		return activeUser.getMenu();
	}

}
