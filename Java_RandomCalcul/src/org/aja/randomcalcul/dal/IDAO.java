package org.aja.randomcalcul.dal;

import java.sql.SQLException;


public interface IDAO<T, ID> {

    void create(T object) throws SQLException;

    void delete(T object) throws SQLException;

}
