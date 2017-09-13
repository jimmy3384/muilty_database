package com.demo.database.mapper;

import com.base.BaseMapper;
import com.demo.database.po.AppInfoPo;
import com.demo.database.po.AppInfoPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppInfoPoMapper extends BaseMapper<AppInfoPo> {
    int countByExample(AppInfoPoExample example);

    int deleteByExample(AppInfoPoExample example);

    List<AppInfoPo> selectByExampleWithRowbounds(AppInfoPoExample example, RowBounds rowBounds);

    List<AppInfoPo> selectByExample(AppInfoPoExample example);

    int updateByExampleSelective(@Param("record") AppInfoPo record, @Param("example") AppInfoPoExample example);

    int updateByExample(@Param("record") AppInfoPo record, @Param("example") AppInfoPoExample example);
}