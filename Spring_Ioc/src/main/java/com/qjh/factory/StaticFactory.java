package com.qjh.factory;

import com.qjh.dao.UserDao;
import com.qjh.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
