package com.train4best.springbootbackend.model;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjectIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

        String prefix = "PR";
        Connection connection = session.connection();

        try {
            Statement statement=connection.createStatement();

            ResultSet rs=statement.executeQuery("select count(id) as Id from project");

            if(rs.next())
            {
                int id=rs.getInt(1)+101;
                String generatedId = prefix + new Integer(id).toString();
                System.out.println("Generated Id: " + generatedId);
                return generatedId;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

}
