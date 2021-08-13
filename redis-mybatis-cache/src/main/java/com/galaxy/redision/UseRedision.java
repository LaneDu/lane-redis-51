package com.galaxy.redision;

import java.io.IOException;

/**
 * 业务逻辑中使用分布式锁
 * @author lane
 * @date 2021年08月06日 下午3:23
 */
public class UseRedision {

    public String discount() throws IOException {

        String key = "lock001";

//加锁
        DistributedRedisLock.acquire(key);
//执行具体业务逻辑
        System.out.println("执行业务逻辑成功");
// 释放锁
        DistributedRedisLock.release(key);
//返回结果
        return "soming";

    }
}


