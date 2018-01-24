package com.guigu.customer.service.impl;

import java.util.List;

import com.guigu.customer.dao.CustomerDAO;
import com.guigu.customer.dao.impl.CustomerDAOImpl;
import com.guigu.customer.model.Customer;
import com.guigu.customer.service.CustomerService;

/**       
 * <p>project_name:Customer</p>
 * <p>package_name:com.guigu.customer.service.impl.CustomerServiceImpl</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月3日下午2:16:39 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class CustomerServiceImpl implements CustomerService{
    private CustomerDAO dao =new CustomerDAOImpl();

    @Override
    public void addCustomer(Customer c) throws Exception {
        dao.addCustomer(c);
    }

    @Override
    public void updateCustomer(Customer c) throws Exception {
        dao.updateCustomer(c);
    }

    @Override
    public void deleteCustomer(String id) throws Exception {
        dao.deleteCustomer(id);
    }

    @Override
    public Customer findCustomer(String id) throws Exception {
        return dao.findCustomer(id);
    }

    @Override
    public List<Customer> getAll() throws Exception {
        return dao.getAll();
    }

}


