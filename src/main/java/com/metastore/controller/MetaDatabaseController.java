package com.metastore.controller;

import com.metastore.domain.MetaDatabase;
import com.metastore.service.MetaDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihaocheng
 * @create 2019-04-06 13:16
 **/
@RestController
@RequestMapping("/meta/database")
public class MetaDatabaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String save(@ModelAttribute MetaDatabase metaDatabase){
        metaDatabaseService.save(metaDatabase);
        return "succues";

    }

    @RequestMapping(value="/",method = RequestMethod.GET)
    public Iterable<MetaDatabase> query(){
        return metaDatabaseService.query();
    }


}
