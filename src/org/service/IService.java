package org.service;

import java.util.List;

public interface IService<T> {

    public void ekle(T t);
    public void sil(T t);
    public List<T> liste();
    public void guncelle(T t);
}
