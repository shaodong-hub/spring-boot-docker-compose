package com.github.dockercompose.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 16:59 2019-06-19
 * 项目名称 spring-boot-docker-compose
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class CountController {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("count")
    public String getCount() {
        return redisTemplate.opsForValue().increment("KEY") + "\n";
    }

}
