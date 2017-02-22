package com.edimoto.spring4.configuration;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by edicson on 7/2/17.
 */
@Configuration
public class DataBaseConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://mysqltests.cbpqpb37jhet.us-west-2.rds.amazonaws.com:3306/MySQLTests");
        ds.setUsername("edicsonm");
        ds.setPassword("#Col88031");
        return ds;
    }

    @Bean
    public BeanPostProcessor persistenceTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

//    @Bean
//    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
//        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
//        sfb.setDataSource(dataSource);
//        sfb.setPackagesToScan(new String[]{"com.edimoto.spring4.model"});
//        Properties props = new Properties();
//        props.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
//        sfb.setHibernateProperties(props);
//        return sfb;
//    }
//
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
//
////    @Bean
////    @Autowired
////    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
////        HibernateTransactionManager txManager = new HibernateTransactionManager();
////        txManager.setSessionFactory(sessionFactory);
////        return txManager;
////    }
//
//    /********/
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
//        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
//        emfb.setDataSource(dataSource);
//        emfb.setJpaVendorAdapter(jpaVendorAdapter);
//        emfb.setPackagesToScan("com.edimoto.spring4.model");
//        return emfb;
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//        adapter.setDatabase(Database.MYSQL);
//        adapter.setShowSql(false);
//        adapter.setGenerateDdl(false);
//        adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
//        return adapter;
//    }
//
//    @Bean
//    @Autowired
//    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//        JpaTransactionManager txManager = new JpaTransactionManager();
//        JpaDialect jpaDialect = new HibernateJpaDialect();
//        txManager.setEntityManagerFactory(entityManagerFactory);
//        txManager.setJpaDialect(jpaDialect);
//        return txManager;
//    }

}
