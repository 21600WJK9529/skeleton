package com.winston.Service4;

public interface IServiceI<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}

