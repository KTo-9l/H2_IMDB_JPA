package org.example.repo;
import java.sql.*;
import java.util.List;

public interface IRepo<T> {
    Integer insert(T object) throws SQLException;
    void delete(T object) throws SQLException;
    void update(T object, int id) throws SQLException;
    List<T> getList();
    Connection connectToDB() throws SQLException;
    Statement getStatement(Connection conn) throws SQLException;
    void executeRequest(String request) throws SQLException;
}
