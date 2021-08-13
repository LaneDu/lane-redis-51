package test;

import redis.clients.jedis.Jedis;

/**
 * @author lane
 * @date 2021年07月28日 下午6:13
 */
public class JedisTest {

    public static void main(String[] args) {
        //与Redis建立连接 IP+port
        Jedis jedis = new Jedis("172.16.94.13", 6379);
        //在Redis中写字符串 key value
        jedis.set("name", "zhangfei");
        //获得Redis中字符串的值
        System.out.println(jedis.get("name"));
        //在Redis中写list
        jedis.lpush("list1", "1", "2", "3");
        //获得list的长度
        System.out.println(jedis.llen("list1"));

    }


}
