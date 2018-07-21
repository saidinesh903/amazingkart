package com.niit.amazingkart.DAOIMPL;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.amazingkart.DAO.OrderTableDAO;
import com.niit.amazingkart.model.OrderTable;

@Repository("orderTableDAO")
@Transactional
public class OrderTableDAOImpl implements OrderTableDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public OrderTableDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public boolean save(OrderTable orderTable) {
		try {
			sessionFactory.getCurrentSession().save(orderTable);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<OrderTable> list(String userId) {
		
		return  sessionFactory.getCurrentSession().createQuery("from OrderTable where user_id=?").setString(0, userId).list();

	}

}
