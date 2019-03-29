package pl.pwn.reaktor.dziekanat.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.pwn.reaktor.dziekanat.model.RoleEnum;
import pl.pwn.reaktor.dziekanat.model.User;
import pl.pwn.reaktor.dziekanat.utils.HibernateUtils;

import java.io.Serializable;


public class SignUpService {


    public static long addToDB(String login, String pass)
    {
    User user = new User(login, pass, RoleEnum.ROLE_STUDENT, true);

    Session session = HibernateUtils.getSessionFactory().openSession();

    Transaction transaction = session.beginTransaction();

        long id = (long)session.save(user);

        transaction.commit();
        session.close();
        return id;
    }
}
