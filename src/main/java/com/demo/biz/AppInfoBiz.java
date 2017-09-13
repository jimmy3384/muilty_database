package com.demo.biz;

import com.demo.database.config.SecondDb;
import com.demo.database.mapper.AppInfoPoMapper;
import com.demo.database.po.AppInfoPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xu.haifeng on 2017/8/10.
 */
@Service
public class AppInfoBiz {
    @Autowired
    private AppInfoPoMapper appInfoPoMapper;
    public AppInfoPo getPo(){
        return appInfoPoMapper.selectByPrimaryKey("1");
    }
}
