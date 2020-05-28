package com.talkingdata.plugin.mapper;

import com.talkingdata.plugin.entity.CDPTrait;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CDPTraitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CDPTrait record);

    int insertSelective(CDPTrait record);

    CDPTrait selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CDPTrait record);

    int updateByPrimaryKey(CDPTrait record);
}