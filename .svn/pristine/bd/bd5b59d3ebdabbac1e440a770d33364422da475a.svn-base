package com.guigu.customer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guigu.customer.model.Customer;
import com.guigu.customer.service.CustomerService;
import com.guigu.customer.service.impl.CustomerServiceImpl;
import com.guigu.customer.utils.WebUtils;

@WebServlet("/AddCustomerServlet")
public class AddCustomerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTf-8");
        Customer c = WebUtils.requestToBean(request, Customer.class);
        // 对Customer完成数据的校验

       
        try {
            if (c.validate() == false) {
                // 数据不能提交到数据库 要回显到页面让用户重新填写数据
            }
            
            c.setId(WebUtils.makeId());
            CustomerService service = new CustomerServiceImpl();
            service.addCustomer(c);
            request.setAttribute("message", "用户信息添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 对数据进行校验
        request.getRequestDispatcher("/message.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
