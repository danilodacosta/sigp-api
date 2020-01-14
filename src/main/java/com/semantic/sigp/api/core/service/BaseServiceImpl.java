package com.semantic.sigp.api.core.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.semantic.sigp.api.core.model.BaseModel;
import com.semantic.sigp.api.core.repository.IBaseRepository;

@Service
public abstract class BaseServiceImpl<T extends BaseModel> implements IBaseService<T> {

	/*
	 * 
	 * @Autowired
    private LogService logService;

    protected abstract BaseRepository<T, Long> getRepository();

    @Override
    @Transactional
    public Optional<T> findById(long id) {
        Optional<T> t = getRepository().findById(id);

        if (t.isPresent())
            logService.saveVisualizar(t.get(), getEntityName());

        return t;
    }

    @Override
    @Transactional
    public List<T> findAll(){
        logService.saveListar(getEntityName());

        return getRepository().findAll();
    }

    @Override
    @Transactional
    public Page<T> findAllPaginated(int page, int size) {
        logService.saveListar(getEntityName());

        return getRepository().findAll(PageRequest.of(page, size));
    }

    @Override
    @Transactional
    public T save(T t){
        if (t.getId() == null) {
            logService.saveCadastrar(t, getEntityName());
        } else {
            logService.saveEditar(t, getEntityName());
        }

        return getRepository().save(t);
    }

    @Override
    @Transactional
    public void remove(T t) {
        logService.saveExcluir(t, getEntityName());

        getRepository().delete(t);
    }

    @Override
    public Long count() {
        return getRepository().count();
    }

    private String getEntityName() {
        return ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
    }
	 * 
	 * */
   

}
