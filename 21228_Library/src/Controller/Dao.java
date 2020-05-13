/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Book;
import Model.Client;
import Model.Users;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author clemence
 */
public class Dao {

    public Integer createClient(Client client) {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(client);
            s.getTransaction().commit();
            s.close();
            return 1;
        } catch (HibernateException e) {
            return 0;
        }

    }

    public List<Client> findAll() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Client> li = s.createQuery("FROM Client").list();
        s.close();
        return li;
    }

    public Integer update(Client client) {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(client);
            s.getTransaction().commit();
            s.close();
            return 1;
        } catch (HibernateException e) {
            return 0;
        }

    }

    public void delete(Client client) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(client);
        s.getTransaction().commit();
        s.close();
    }

    public Integer createBook(Book book) {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(book);
            s.getTransaction().commit();
            s.close();
            return 1;
        } catch (HibernateException e) {
            return 0;
        }

    }

    public List<Book> findAllB() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Book> li = s.createQuery("FROM Book").list();
        s.close();
        return li;
    }

    public List<Book> FindBookBy(String bookid, String categoryId) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Book> li = s.createQuery("FROM Book where BookId='" + bookid + "' and CategoryId='" + categoryId + "'").list();
        s.close();
        return li;

    }

    public Integer updateB(Book book) {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(book);
            s.getTransaction().commit();
            s.close();
            return 1;
        } catch (HibernateException e) {
            return 0;
        }

    }

    public void deleteB(Book book) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(book);
        s.getTransaction().commit();
        s.close();
    }

    public Integer createUser(Users user) {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(user);
            s.getTransaction().commit();
            s.close();
            return 1;
        } catch (HibernateException e) {
            return 0;
        }
    }

    public List<Users> AuthUser(String name, String password) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Users> li = s.createQuery("FROM Users where name='" + name + "' and password='" + password + "'").list();
        s.close();
        return li;

    }
}
