package com.guo.gmall.pms.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

//springboot引入某个场景，这个场景的组件就会自动配置好；
@Configuration
public class PmsDataSourceConfig {

    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        //Spring工具类从类路径下获取文件
        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(file);
        return dataSource;

    }
}
