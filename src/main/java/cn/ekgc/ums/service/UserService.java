package cn.ekgc.ums.service;

import cn.ekgc.ums.pojo.entity.User;
import cn.ekgc.ums.pojo.vo.Page;
import org.springframework.stereotype.Service;


public interface UserService {
	/**
	 * <b>使用分页查询</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	Page< User> getPage(Page< User> page) throws Exception;

	/**
	 * <b>修改用信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean updateUser(User user)throws Exception;
}
