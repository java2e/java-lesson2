package hastane.service;

import hastane.exception.ServiceExcepiton;
import hastane.model.BaseModel;
import hastane.model.Doktor;

import java.util.List;

//Service -> ekle,sil,guncelle,list, ...
public interface BaseService<T extends BaseModel> {

    public void ekle(T t) throws ServiceExcepiton;

    public void sil(T t) throws ServiceExcepiton;

    public void guncelle(T t) throws ServiceExcepiton;

    public List<T> liste() throws ServiceExcepiton;

}
