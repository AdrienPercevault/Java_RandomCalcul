package org.aja.randomcalcul.dal;

import java.util.Set;


public interface IDAO<T, ID> {

    void create(T object);

    void update(T object);

    Set<T> findAll();

    T findById(ID id);
}
