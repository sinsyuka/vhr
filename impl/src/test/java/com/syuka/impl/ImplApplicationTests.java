package com.syuka.impl;

import com.syuka.vhr.api.dao.HrDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImplApplicationTests {

    @Autowired
    private HrDao hrDao;

    @Test
    public void contextLoads() {
        System.out.println(hrDao.getAllHr((long) 3));
    }

}
