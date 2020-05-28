package com.talkingdata.plugin.mapper;

import com.talkingdata.plugin.entity.CDPCrowd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CDPCrowdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CDPCrowd record);

    int insertSelective(CDPCrowd record);

    CDPCrowd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CDPCrowd record);

    int updateByPrimaryKey(CDPCrowd record);
}