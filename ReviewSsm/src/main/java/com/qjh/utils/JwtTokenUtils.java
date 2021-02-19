package com.qjh.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.qjh.entity.User;

import java.io.UnsupportedEncodingException;

public class JwtTokenUtils {
    /*
        使用此方法生成token
     */
    public String getToken(User user) throws UnsupportedEncodingException {
        String token="";
        token = JWT.create()
                //存入需要保存在token的信息
                .withAudience(String.valueOf(user.getId()))
                //使用HMAC256 加密算法
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
