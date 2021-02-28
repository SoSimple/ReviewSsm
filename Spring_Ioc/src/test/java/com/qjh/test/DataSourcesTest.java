package com.qjh.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataSourcesTest {

    @Test
    public void test1() throws PropertyVetoException, SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://39.101.218.185:3306/changgou");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("root");

        Connection connection = comboPooledDataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void test2() throws PropertyVetoException, SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://39.101.218.185:3306/changgou");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");

        DruidPooledConnection connection = druidDataSource.getConnection();

        System.out.println(connection);
    }
    /*
    * 测试手动创建c3p0数据源（加载properties数据文件）  抽取配置文件，方便解耦
    * */
    @Test
    public void test3() throws PropertyVetoException, SQLException {
        //读取配置文件    ResourceBundle  相对于类加载路径的地址
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver =bundle.getString("jdbc.driver");
        String url =bundle.getString("jdbc.url");
        String username =bundle.getString("jdbc.username");
        String password =bundle.getString("jdbc.password");
        //创建数据源对象，设置连接参数
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(username);
        comboPooledDataSource.setPassword(password);
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
    /*
     * 测试Spring容器产生数据源对象
     * */
    @Test
    public void test4() throws SQLException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //classPathXmlApplicationContext.getBean("dataSource");
        DataSource bean = classPathXmlApplicationContext.getBean(DataSource.class);
        Connection connection = bean.getConnection();
        System.out.println(connection);
        connection.close();
    }


}
