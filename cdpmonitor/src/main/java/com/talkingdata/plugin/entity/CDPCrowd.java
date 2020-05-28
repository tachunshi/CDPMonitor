package com.talkingdata.plugin.entity;

import java.util.Date;

public class CDPCrowd {
    private Integer id;

    private String channelId;

    private String crowdId;

    private String crowdName;

    private Integer crowdReachUsers;

    private Integer crowdStatus;

    private String crowdCreator;

    private String crowdOwer;

    private String crowdDirectory;

    private Integer quoteTraitNum;

    private Integer quoteCrowdNum;

    private Integer quotedTraitNum;

    private Integer quotedCrowdNum;

    private Integer exportTaskNum;

    private Date crowdActivatTime;

    private Date crowdUpdateTime;

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

    public String getCrowdId() {
        return crowdId;
    }

    public void setCrowdId(String crowdId) {
        this.crowdId = crowdId == null ? null : crowdId.trim();
    }

    public String getCrowdName() {
        return crowdName;
    }

    public void setCrowdName(String crowdName) {
        this.crowdName = crowdName == null ? null : crowdName.trim();
    }

    public Integer getCrowdReachUsers() {
        return crowdReachUsers;
    }

    public void setCrowdReachUsers(Integer crowdReachUsers) {
        this.crowdReachUsers = crowdReachUsers;
    }

    public Integer getCrowdStatus() {
        return crowdStatus;
    }

    public void setCrowdStatus(Integer crowdStatus) {
        this.crowdStatus = crowdStatus;
    }

    public String getCrowdCreator() {
        return crowdCreator;
    }

    public void setCrowdCreator(String crowdCreator) {
        this.crowdCreator = crowdCreator == null ? null : crowdCreator.trim();
    }

    public String getCrowdOwer() {
        return crowdOwer;
    }

    public void setCrowdOwer(String crowdOwer) {
        this.crowdOwer = crowdOwer == null ? null : crowdOwer.trim();
    }

    public String getCrowdDirectory() {
        return crowdDirectory;
    }

    public void setCrowdDirectory(String crowdDirectory) {
        this.crowdDirectory = crowdDirectory == null ? null : crowdDirectory.trim();
    }

    public Integer getQuoteTraitNum() {
        return quoteTraitNum;
    }

    public void setQuoteTraitNum(Integer quoteTraitNum) {
        this.quoteTraitNum = quoteTraitNum;
    }

    public Integer getQuoteCrowdNum() {
        return quoteCrowdNum;
    }

    public void setQuoteCrowdNum(Integer quoteCrowdNum) {
        this.quoteCrowdNum = quoteCrowdNum;
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

    public Date getCrowdActivatTime() {
        return crowdActivatTime;
    }

    public void setCrowdActivatTime(Date crowdActivatTime) {
        this.crowdActivatTime = crowdActivatTime;
    }

    public Date getCrowdUpdateTime() {
        return crowdUpdateTime;
    }

    public void setCrowdUpdateTime(Date crowdUpdateTime) {
        this.crowdUpdateTime = crowdUpdateTime;
    }

    public Date getCollectorTime() {
        return collectorTime;
    }

    public void setCollectorTime(Date collectorTime) {
        this.collectorTime = collectorTime;
    }
}