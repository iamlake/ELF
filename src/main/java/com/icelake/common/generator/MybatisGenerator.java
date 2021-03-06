package com.icelake.common.generator;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * <br>Title: MybatisGenerator
 * <br>Description: MyBatis代码生成插件
 * <br>Author:李一鸣(liyiming.neu@neusoft.com)
 * <br>Date:2017年10月25日
 */
public class MybatisGenerator {

    public static void main(String[] args) {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        // 读取配置文件
        URL url = MybatisGenerator.class.getClassLoader().getResource("generatorConfig.xml");
        File configFile = new File(url.getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config;
        try {
            config = cp.parseConfiguration(configFile);

            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator;
            try {
                myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
                myBatisGenerator.generate(null);

                // 打印结果
                for (String str : warnings) {
                    System.out.println(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
    }
}
