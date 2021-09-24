package org.kodigo.codemasters.services;

import java.util.List;

/**
 *
 * @author Danny
 */
public interface ICRUD<T, V>{
    
    T register(T obj);
    T update(T obj);
    List<T> find();
    T findById(V id);
    boolean delete(V id);
    
}
