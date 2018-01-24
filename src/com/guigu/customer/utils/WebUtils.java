package com.guigu.customer.utils;

import java.util.Date;
import java.util.Enumeration;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

/**       
 * <p>project_name:Customer</p>
 * <p>package_name:com.guigu.customer.utils.WebUtils</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月3日下午3:28:50 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class WebUtils {
    // 把request请求封装到javabean中
    public static <T> T requestToBean(HttpServletRequest request, Class<T> clazz) {

        try {
            T t = clazz.newInstance();
            ConvertUtils.register(new DateLocaleConverter(), Date.class);

            Enumeration e = request.getParameterNames();

            while (e.hasMoreElements()) {
                String name = (String) e.nextElement(); // name age
                String value = request.getParameter(name);// zhangsan 12
                BeanUtils.setProperty(t, name, value);
            }
            return t;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static String makeId() {
        return UUID.randomUUID().toString();
    }

}
