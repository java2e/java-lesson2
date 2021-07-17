package service;

import java.sql.SQLException;
import java.util.List;

public interface BaseService<T> {

    public T getById(Long id);

    public List<T> getList() throws SQLException;

    public T save(T t) throws SQLException;

    public void delete(Long id) throws SQLException;

    public void update(T t) throws SQLException;

}
