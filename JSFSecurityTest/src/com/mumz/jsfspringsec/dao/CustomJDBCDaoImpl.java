package com.mumz.jsfspringsec.dao;
 
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
 
public class CustomJDBCDaoImpl extends JdbcDaoImpl {
    public CustomJDBCDaoImpl(){
        super();
    }
}