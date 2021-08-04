package com.yc.mybatis.mapper;

import com.yc.cinema.bean.Cinema;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CinemaMapperTest {

    @Test
    public void test1() throws IOException {

        //构建会话工程
        String resource="mybatis.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //获取会话对象
        SqlSession session = sqlSessionFactory.openSession();

        //执行sql
        String sql="com.yc.mybatis.mapper.CinemaMapper.selectAll";
        List<Object> list = session.selectList(sql);
        for (Object obj:list){
            System.out.println(obj);
        }

        System.out.println("****************************************");

        sql="com.yc.mybatis.mapper.CinemaMapper.selectAll1";
        List<Cinema> list1 = session.selectList(sql);
        for (Cinema cinema:list1){
            System.out.println(cinema);
        }

        System.out.println("****************************************");


    }


    @Test
    public void test2() throws IOException {
        //构建会话工程
        String resource="mybatis.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //获取会话对象
        SqlSession session = sqlSessionFactory.openSession();
//        String sql="com.yc.mybatis.mapper.CinemaMapper.selectByName";
//        List<Cinema> list = session.selectList(sql);
        //断言
//        Assert.assertEquals(1,list.size());

//        Cinema cinema = session.selectOne(sql, "鑫都国际影城");
//        System.out.println("********************");
//        System.out.println(cinema);
//        System.out.println("********************");
//        sql="com.yc.mybatis.mapper.CinemaMapper.selectByNameAndgps";
//        Cinema cinema1 = new Cinema();
//        cinema1.setName("搏广电影院");
//        cinema1.setGps("112.685875,26.749691");
//        Cinema cinema2 = session.selectOne(sql, cinema1);
//        System.out.println(cinema2);
//
//        cinema1.setName("我的影院");
//        cinema1.setAddress("湖南工学院");
//        cinema1.setGps("123456");
//        cinema1.setImg("a.jpg");
//        try {
//            int result = session.insert("com.yc.mybatis.mapper.CinemaMapper.addCinema", cinema1);
//            System.out.println(result);
//            //如果正常执行结束，则提交
//            session.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//            //出现异常，执行回滚
//            session.rollback();
//        }finally {
//            session.close();
//        }

//        System.out.println("更新操作***********************");
//        Cinema cinema3 = new Cinema();
//        cinema3.setName("师院影院");
//        cinema3.setId(16);
//        session = sqlSessionFactory.openSession();
//        try {
//            session.update("com.yc.mybatis.mapper.CinemaMapper.updateCinema",cinema3);
//            session.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//            session.rollback();
//        }finally {
//            session.close();
//        }
//        try {
//            session.delete("com.yc.mybatis.mapper.CinemaMapper.deleteCinema",17);
//            session.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//            session.rollback();
//        }finally {
//            session.close();
//        }
    }

    @Test
    public void test3() throws IOException {
        //构建会话工程
        String resource="mybatis.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //获取会话对象
        SqlSession session = sqlSessionFactory.openSession();
        CinemaMapper cinemaMapper = session.getMapper(CinemaMapper.class);
        List<Cinema> list =  cinemaMapper.selectAll1();
        for (Cinema cinema:list){
            System.out.println(cinema);
        }

    }























}
