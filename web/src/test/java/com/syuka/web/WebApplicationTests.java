package com.syuka.web;

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
public class WebApplicationTests {

    @Autowired
    private IHrService hrService;
    @Test
    public void contextLoads() {
        List<Hr> hrs = hrService.getAllHr();
    }

}
