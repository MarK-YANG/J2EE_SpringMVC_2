package com.mark.DAO;

import com.mark.Entity.MyUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created by mark on 5/2/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/META-INF/applicationContext.xml")
@Transactional

public class UserDAOImplTest {

    @Autowired
    private UserDAO dao;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSelectAll() throws Exception {

    }

    @Test
    public void testSelect() throws Exception {
        ArrayList<MyUser> list = (ArrayList<MyUser>) dao.selectAll();
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            MyUser user = (MyUser) iter.next();
            System.out.println(user.getUUID());
        }
    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {

    }
}