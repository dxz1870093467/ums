package cn.ekgc.ums.util;

import com.github.pagehelper.Page;

import java.security.PublicKey;
import java.util.Properties;

/**
 * <b>系统常量类</b>
 */
public class ConstantUtils {
	private static Properties properties=new Properties();
	static {
		try {
			properties.load(ConstantUtils.class.getClassLoader().getResourceAsStream("props/ums.properties"));

		}catch (Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * <b>分页信息,默认页码</b>
	 */
	public static final Integer PAGE_NUM=Integer.parseInt(properties.getProperty("page.num"));
	/**
	 * <b>分页信息,每页显示的数量</b>
	 */
	public static final Integer PAGE_SIZE=Integer.parseInt(properties.getProperty("page.size"));

}
