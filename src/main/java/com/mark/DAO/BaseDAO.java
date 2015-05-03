package com.mark.DAO;


import java.io.Serializable;
import java.util.List;

/**
 * Created by mark on 5/3/15.
 */
public interface BaseDAO<T, PK extends Serializable> {

    T queryByPK(PK id);
    List<T> queryAll();
    void insert(T t);
    void delete(T t);
    void update(T t);


}
