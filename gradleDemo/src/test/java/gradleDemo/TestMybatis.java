package gradleDemo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aring.service.UserService;

@RunWith(value = SpringJUnit4ClassRunner.class) // 测试运行器
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" }) // 加载配置文件
public class TestMybatis {

	@Resource
	private UserService userService;

	@Test
	public void test() {
		System.out.println(userService.getUserById(1).getUname());
	}
}
