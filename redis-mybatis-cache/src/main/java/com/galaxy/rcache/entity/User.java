package com.galaxy.rcache.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lane
 * @date 2021年08月01日 下午7:26
 */
@Data
public class User implements Serializable {

    private Integer id;
    private String name;
    private String address;
}
