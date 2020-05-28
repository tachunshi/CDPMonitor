package com.talkingdata.plugin.entity;

import java.util.Date;

public class HistoryCrowdReachUsers {
    private Integer id;

    private String channelId;

    private Long starttimeDay;

    private String crowdId;

    private Integer crowdReachUsers;

    private Integer quotedTraitNum;

    private Integer quotedCrowdNum;

    private Integer exportTaskNum;

    private Date collectorTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public Long getStarttimeDay() {
        return starttimeDay;
    }

    public void setStarttimeDay(Long starttimeDay) {
        this.starttimeDay = starttimeDay;
    }

    public String getCrowdId() {
        return crowdId;
    }

    public void setCrowdId(String crowdId) {
        this.crowdId = crowdId == null ? null : crowdId.trim();
    }

    public Integer getCrowdReachUsers() {
        return crowdReachUsers;
    }

    public void setCrowdReachUsers(Integer crowdReachUsers) {
        this.crowdReachUsers = crowdReachUsers;
    }

    public Integer getQuotedTraitNum() {
        return quotedTraitNum;
    }

    public void setQuotedTraitNum(Integer quotedTraitNum) {
        this.quotedTraitNum = quotedTraitNum;
    }

    public Integer getQuotedCrowdNum() {
        return quotedCrowdNum;
    }

    public void setQuotedCrowdNum(Integer quotedCrowdNum) {
        this.quotedCrowdNum = quotedCrowdNum;
    }

    public Integer getExportTaskNum() {
        return exportTaskNum;
    }

    public void setExportTaskNum(Integer exportTaskNum) {
        this.exportTaskNum = exportTaskNum;
    }

    public Date getCollectorTime() {
        return collectorTime;
    }

    public void setCollectorTime(Date collectorTime) {
        this.collectorTime = collectorTime;
    }
}