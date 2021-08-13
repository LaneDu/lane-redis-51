package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;

/**
 * @author lane
 * @date 2021年07月28日 下午6:53
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:redis.xml")
public class RedisTest {

    @Autowired
    private RedisTemplate<Serializable, Serializable> rt;

    @Test
    public  void testRedis(){

        rt.opsForValue().set("spring","spring-redis");
        System.out.println(rt.opsForValue().get("spring"));


    }
}
