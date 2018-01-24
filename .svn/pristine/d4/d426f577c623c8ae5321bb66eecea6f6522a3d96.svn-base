package com.guigu.customer.dao.impl;

import java.util.Date;
import java.util.List;

import com.guigu.customer.dao.CustomerDAO;
import com.guigu.customer.model.Customer;

/**       
 * <p>project_name:Customer</p>
 * <p>package_name:com.guigu.customer.dao.impl.CustomerDAOImpl</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月3日下午2:00:30 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class CustomerDAOImpl extends BaseDAOImpl<Customer> implements CustomerDAO {

    @Override
    public void addCustomer(Customer c) throws Exception {
        String sql = "insert into customer(id,name,gender,birthday,cellphone,email,preference,type,description) values(?,?,?,?,?,?,?,?,?)";
        Object[] args = { c.getId(), c.getName(), c.getGender(), c.getBirthday(), c.getCellphone(), c.getEmail(),
                c.getPreference(), c.getType(), c.getDescription() };
        this.update(conn, sql, args);
    }

    @Override
    public void updateCustomer(Customer c) throws Exception {
        String sql = "update customer set name=?,gender=?,birthday=?,cellphone=?,email=?,preference=?,type=?,description=? where id=? ";
        Object[] args = { c.getName(), c.getGender(), c.getBirthday(), c.getCellphone(), c.getEmail(),
                c.getPreference(), c.getType(), c.getDescription(), c.getId() };
        this.update(conn, sql, args);
    }

    @Override
    public void deleteCustomer(String id) throws Exception {
        String sql = "delete from customer where id=?";
        Object[] args = { id };
        this.update(conn, sql, args);
    }

    @Override
    public Customer findCustomer(String id) throws Exception {
        String sql = "select * from customer where id=?";
        Object[] args = { id };
        List<Customer> list =this.getForList(conn, sql, args);
        
        return list.isEmpty()?null:list.get(0);
    }

    @Override
    public List<Customer> getAll() throws Exception {
        String sql = "select * from customer";
        return this.getForList(conn, sql);
    }

}
