package com.syuka.vhr.service;

import com.syuka.vhr.api.dao.HrDao;
import com.syuka.vhr.api.model.Hr;
import com.syuka.vhr.api.service.IHrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApplicationTests {

    @Autowired
    private IHrService hrService;
    @Autowired
    private HrDao hrDao;
    @Test
    public void contextLoads() {
        List<Hr> hrs = hrDao.getAllHr(null);
        List<Hr> list = hrService.getAllHr();
    }

}
