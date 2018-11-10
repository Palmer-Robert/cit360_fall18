
package com.robert;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

@ManagedBean
@SessionScoped
public class MyData {
    
    private MyMembers firstname;
    private NewHibernateUtil helper;
    private Session session;
    
    public void addMember(){
        
        firstname = new MyMembers("Jackson");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(firstname);
        session.getTransaction().commit();
        session.close();
    }
}
