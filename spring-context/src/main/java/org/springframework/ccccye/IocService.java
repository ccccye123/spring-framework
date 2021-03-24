package org.springframework.ccccye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IocService {
    @Autowired
    private Person[] persons;

    public Integer getCount(){
        return persons.length;
    }
}
