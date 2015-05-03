package com.mark.DAO;

import com.mark.Entity.MyUser;

import java.util.List;

/**
 * Created by mark on 5/2/15.
 */
public interface UserDAO {

    public List<MyUser> selectAll();
    public List<MyUser> select(String _id);
    public void update(MyUser _u);
    public void delete(MyUser _u);
    public void delete();
    public void insert(MyUser _u);

}
