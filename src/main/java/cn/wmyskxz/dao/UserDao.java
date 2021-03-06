package cn.wmyskxz.dao;



import cn.wmyskxz.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户DAO层接口
 */
public interface UserDao {
	/**
	 * 通过账号和密码查询用户
	 */
	public User findUser(@Param("usercode") String usercode,
						 @Param("password") String password);
}
