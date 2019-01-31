package org.aja.randomcalcul.dal;

import org.aja.randomcalcul.domain.Account;

import java.sql.ResultSet;
import java.util.List;
import java.util.Set;


public interface IDAO<T, ID> {

    void create(T object);

    void update(T object);

    void updateNumber(Account account);

    Set<T> findAll();

    T findById(ID id);

    Set<T> getScore();

    List findAllResult();
}
