package cn.ekgc.ums.controller;

import cn.ekgc.ums.controller.base.BaseController;
import cn.ekgc.ums.pojo.entity.User;
import cn.ekgc.ums.pojo.vo.Page;
import cn.ekgc.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
	@Autowired
	private UserService userService;
	/**
	 * <b>转发到用具信息</b>
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/index")
	public String forwardIndexPage()throws Exception{
		System.out.println("进入user_index");
		return "user_index";
	}

	/**
	 * <b>分页获得分页对象</b>
	 * @param pagenum
	 * @param pagesize
	 * @param draw
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	@ResponseBody
	public Page < User > queryPage(Integer pagenum,Integer pagesize,Integer draw)throws Exception{
		//封装分页对象
		Page<User> page=new Page<User>(pagenum,pagesize,draw);
		//进行分页查询
		System.out.println("进入page控制方法...");

		page=userService.getPage(page);

		return page;
	}

	/**
	 * <b>修改用户状态</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("status")
	@ResponseBody
	public boolean changeStatus(User user)throws Exception{

		boolean flag=userService.updateUser(user);
		return flag;
	}
}
