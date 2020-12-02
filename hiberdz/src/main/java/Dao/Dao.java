package Dao;

import java.util.List;
import java.util.Optional;

public interface Dao {
    Optional<T> get(int id);

    List<T> getAll();
    void save(T t);
    voidupdate(T t);
    void delete(T t);
}
