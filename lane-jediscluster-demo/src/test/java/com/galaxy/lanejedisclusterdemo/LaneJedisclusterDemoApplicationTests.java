package com.galaxy.lanejedisclusterdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class LaneJedisclusterDemoApplicationTests {


    @Test
    public void testJedisCluster()throws Exception{
        //创建jedisCluster对象，有一个参数 nodes是Set类型，Set包含若干个HostAndPort对象
        Set<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("172.16.94.13",7010));
        nodes.add(new HostAndPort("172.16.94.13",7020));
        nodes.add(new HostAndPort("172.16.94.13",7030));
        nodes.add(new HostAndPort("172.16.94.13",7011));
        nodes.add(new HostAndPort("172.16.94.13",7012));
        nodes.add(new HostAndPort("172.16.94.13",7021));
        nodes.add(new HostAndPort("172.16.94.13",7022));
        nodes.add(new HostAndPort("172.16.94.13",7031));
        nodes.add(new HostAndPort("172.16.94.13",7032));
        nodes.add(new HostAndPort("172.16.94.13",7101));
        nodes.add(new HostAndPort("172.16.94.13",7102));

        JedisCluster jedisCluster = new JedisCluster(nodes);
        //使用jedisCluster操作redis
        jedisCluster.set("redis:001", "jediscluster001");
        String str = jedisCluster.get("redis:001");
        System.out.println(str);
        //关闭连接池
        jedisCluster.close();
    }

}
