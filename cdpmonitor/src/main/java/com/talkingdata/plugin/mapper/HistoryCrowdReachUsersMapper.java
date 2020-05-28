package com.talkingdata.plugin.mapper;

import com.talkingdata.plugin.entity.HistoryCrowdReachUsers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HistoryCrowdReachUsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HistoryCrowdReachUsers record);

    int insertSelective(HistoryCrowdReachUsers record);

    HistoryCrowdReachUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HistoryCrowdReachUsers record);

    int updateByPrimaryKey(HistoryCrowdReachUsers record);
}