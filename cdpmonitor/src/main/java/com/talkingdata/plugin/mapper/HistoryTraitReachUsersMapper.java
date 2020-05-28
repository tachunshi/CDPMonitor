package com.talkingdata.plugin.mapper;

import com.talkingdata.plugin.entity.HistoryTraitReachUsers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HistoryTraitReachUsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HistoryTraitReachUsers record);

    int insertSelective(HistoryTraitReachUsers record);

    HistoryTraitReachUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HistoryTraitReachUsers record);

    int updateByPrimaryKey(HistoryTraitReachUsers record);
}