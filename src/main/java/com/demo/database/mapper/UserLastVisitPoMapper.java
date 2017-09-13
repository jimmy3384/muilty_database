package com.demo.database.mapper;

import com.base.BaseMapper;
import com.demo.database.po.UserLastVisitPo;
import com.demo.database.po.UserLastVisitPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserLastVisitPoMapper extends BaseMapper<UserLastVisitPo> {
    int countByExample(UserLastVisitPoExample example);

    int deleteByExample(UserLastVisitPoExample example);

    List<UserLastVisitPo> selectByExampleWithRowbounds(UserLastVisitPoExample example, RowBounds rowBounds);

    List<UserLastVisitPo> selectByExample(UserLastVisitPoExample example);

    int updateByExampleSelective(@Param("record") UserLastVisitPo record, @Param("example") UserLastVisitPoExample example);

    int updateByExample(@Param("record") UserLastVisitPo record, @Param("example") UserLastVisitPoExample example);
}