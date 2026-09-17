package com.codescope.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import com.codescope.config.HibernateUtil;
import com.codescope.model.Project;

public class ProjectHibernateDAO {

    public void createProject(Project project) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.persist(project);

            transaction.commit();

            System.out.println("Project created successfully using Hibernate!");

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println("Failed to create project.");
            e.printStackTrace();
        }
    }
    public Project getProjectById(int projectId) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            Project project = session.find(Project.class, projectId);

            return project;

        } catch (Exception e) {

            System.out.println("Failed to retrieve project.");
            e.printStackTrace();

            return null;
        }
    }
    public void updateProject(Project project) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.merge(project);

            transaction.commit();

            System.out.println("Project updated successfully using Hibernate!");

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println("Failed to update project.");
            e.printStackTrace();
        }
    }
    public void deleteProject(int projectId) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            Project project = session.find(Project.class, projectId);

            if (project != null) {

                session.remove(project);

                System.out.println("Project deleted successfully using Hibernate!");

            } else {

                System.out.println("Project not found.");
            }

            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println("Failed to delete project.");
            e.printStackTrace();
        }
      
    }
    public List<Project> getAllProjects() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session
                    .createQuery("FROM Project", Project.class)
                    .getResultList();

        } catch (Exception e) {

            System.out.println("Failed to retrieve projects.");
            e.printStackTrace();

            return null;
        }
    }
}