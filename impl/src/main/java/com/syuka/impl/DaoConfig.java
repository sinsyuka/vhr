package com.syuka.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.syuka.impl")
@MapperScan("com.syuka.impl")
public class DaoConfig {
}
