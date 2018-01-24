package com.guigu.customer.model;
/**       
 * <p>project_name:Customer</p>
 * <p>package_name:com.guigu.customer.model.Customer</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月3日下午1:49:00 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Customer {

	private String id;

	private String name;

	private String gender;

	private Date birthday;

	private String cellphone;

	private String email;

	private String preference;

	private String type;

	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday
				+ ", cellphone=" + cellphone + ", email=" + email + ", preference=" + preference + ", type=" + type
				+ ", description=" + description + "]";
	}

	private String year = (this.birthday.toString()).substring(0, 3);
	private String month = (this.birthday.toString()).substring(4, 5);
	private String day = (this.birthday.toString()).substring(6, 7);
	private int y = Integer.parseInt(year);
	private int m = Integer.parseInt(month);
	private int d = Integer.parseInt(day);

	private Map<String, String> errors = new HashMap<>();

	public boolean validate() {
		boolean isOk = true;

		if (this.name == null || this.name.trim().equals("")) {
			isOk = false;
			errors.put("name", "用户名不能为空");
		} else if (!this.name.matches("[a-zA-Z]{3,8}")) {
			isOk = false;
			errors.put("name", "用户名必须是3-8位的字母");
		} else if (y % 4 == 0 && y % 100 != 0 && month == "02" && d > 29) {
			isOk = false;
			errors.put("birthday", "闰年2月29天");
		} else if (month == "02" && d > 28) {
			isOk = false;
			errors.put("birthday", "2月28天");
		} else if (month == "04" && d > 30) {
			isOk = false;
			errors.put("birthday", "4月30天");
		} else if (month == "06" && d > 30) {
			isOk = false;
			errors.put("birthday", "6月30天");
		} else if (month == "09" && d > 30) {
			isOk = false;
			errors.put("birthday", "9月30天");
		} else if (month == "11" && d > 30) {
			isOk = false;
			errors.put("birthday", "11月30天");
		} else if (this.cellphone == null || this.cellphone.trim().equals("")) {
			isOk = false;
			errors.put("cellphone", "手机号不能为空");
		} else if (!this.name.matches("[0-9]{11,11}")) {
			isOk = false;
			errors.put("cellphone", "手机号必须是11位的数字");
		}else if (this.cellphone == null || this.cellphone.trim().equals("")) {
			isOk = false;
			errors.put("email", "邮箱不能为空");
		} else if (!this.name.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")) {
			isOk = false;
			errors.put("email", "邮箱必须合法");
		}

		// 把剩余的表单完成校验....用正则表达式完成所有的校验

		return isOk;
	}

}
