package com.example.springboot01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 事务管理
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setAge(100);
        girlA.setCupSize("D");
        girlRepository.save(girlA);


        Girl girlB=new Girl();
        girlB.setAge(112);
        girlB.setCupSize("T");
        girlRepository.save(girlB);
    }
}
