package com.winston.Repository3;
// Done first(I) so that GenderRepo and RaceRepo can extend without errors
public interface IRepositoryI<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
