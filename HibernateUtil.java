package com.codescope.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codescope.model.Project;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {

            sessionFactory = new Configuration()
                    .configure()
                    .addAnnotatedClass(Project.class)
                    .buildSessionFactory();

            System.out.println("Hibernate SessionFactory created successfully!");

        } catch (Throwable e) {

            System.out.println("Failed to create Hibernate SessionFactory.");
            e.printStackTrace();

            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        sessionFactory.close();
    }
}