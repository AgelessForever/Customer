1.���������
	1.1���뿪����ص�jar��
		jstl������
		mysql����
		beanutils���߰�
		log4j��־��
	
	1.2���������
		com.guigu.customer.model
		com.guigu.customer.dao
		com.guigu.customer.dao.impl
		com.guigu.customer.service
		com.guigu.customer.service.impl
		com.guigu.customer.controller
		com.guigu.customer.web.UI
		com.guigu.customer.utils
		���е�ҳ����Ϣ���� web-inf/jsp֮��
	
	1.3�������ݿ�ͱ�
		CREATE TABLE `customer` (
		  `id` varchar(40) NOT NULL,
		  `name` varchar(40) NOT NULL,
		  `gender` varchar(4) NOT NULL,
		  `birthday` date default NULL,
		  `cellphone` varchar(20) NOT NULL,
		  `email` varchar(40) NOT NULL,
		  `preference` varchar(40) default NULL,
		  `type` varchar(100) default NULL,
		  `description` varchar(255) default NULL,
		  PRIMARY KEY  (`id`)
		) 
		
		
2�����ʵ��
		customer model����
	
	



					
		
		