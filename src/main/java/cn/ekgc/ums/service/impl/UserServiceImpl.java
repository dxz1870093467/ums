package cn.ekgc.ums.service.impl;

import cn.ekgc.ums.dao.UserDao;
import cn.ekgc.ums.pojo.entity.User;
import cn.ekgc.ums.pojo.vo.Page;
import cn.ekgc.ums.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <b>用具业务层实现类</b>
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	/**
	 * <b>使用分页查询</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@Override
	public Page < User > getPage(Page < User > page) throws Exception {
		//创建PageHepler分页对象
		PageHelper.startPage(page.getPagenum(), page.getPagesize());
		//进行列表查询
		List<User> userList=userDao.findUserByQuery(new User());
		//根据获得列表创建PageInfo数据
		PageInfo<User> pageInfo=new PageInfo <>(userList);
		//提取数据
		page.setList(pageInfo.getList());
		page.setTotalCount(pageInfo.getTotal());
		page.setTotalPage(pageInfo.getPages());
		return page;
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		Integer count=userDao.update(user);
		if(count>0){
			return true;
		}
		return false;
	}
}
