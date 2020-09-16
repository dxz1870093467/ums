package cn.ekgc.ums.dao;

import cn.ekgc.ums.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>用户持久层</b>
 */
@Repository
public interface UserDao {

	/**
	 * <b>查找用户所有信息</b>
	 * @return
	 * @throws Exception
	 */
	List< User > findUserByQuery(User user)throws Exception;
	/**
	 * <b>保存对象</b>
	 */
	Integer save(User user)throws Exception;
	/**
	 * <b>修改对象</b>
	 */
	Integer update(User user)throws Exception;
}
