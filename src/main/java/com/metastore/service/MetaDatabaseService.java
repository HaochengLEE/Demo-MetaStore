package com.metastore.service;

import com.metastore.domain.MetaDatabase;
import com.metastore.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lihaocheng
 * @create 2019-04-06 00:11
 **/
@Service
public class MetaDatabaseService {

    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    @Transactional
    public void save(MetaDatabase metaDatabase){
        metaDatabaseRepository.save(metaDatabase);
    }

    public Iterable<MetaDatabase> query(){
        return metaDatabaseRepository.findAll();
    }

}
