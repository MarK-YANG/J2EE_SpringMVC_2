package com.mark.Service;

import com.mark.DAO.UserDAO;
import com.mark.Entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by mark on 5/2/15.
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO dao;


    public List<MyUser> getAll() {
        return dao.selectAll();
    }
}
