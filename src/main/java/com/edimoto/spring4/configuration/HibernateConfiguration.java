package com.edimoto.spring4.configuration;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by edicson on 14/2/17.
 */
//@Configuration
//@EnableTransactionManagement
public class HibernateConfiguration {

    @Bean(name = "HibernateSessionFactory")
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setPackagesToScan(new String[]{"com.edimoto.spring4.model"});
        Properties props = new Properties();
        props.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
        sfb.setHibernateProperties(props);
        return sfb;
    }

    @Bean(name = "HibernateTransactionManager")
    @Autowired
    public HibernateTransactionManager transactionManager(@Qualifier(value = "HibernateSessionFactory")SessionFactory sessionFactory) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory);
        return txManager;
    }




}


