package com.talkingdata.plugin.entity;

import java.util.Date;

public class HistoryTraitReachUsers {
    private Integer id;

    private String channelId;

    private Long starttimeDay;

    private String traitId;

    private Integer traitReachUsers;

    private Integer quotedTraitNum;

    private Integer quotedCrowdNum;

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

    public String getTraitId() {
        return traitId;
    }

    public void setTraitId(String traitId) {
        this.traitId = traitId == null ? null : traitId.trim();
    }

    public Integer getTraitReachUsers() {
        return traitReachUsers;
    }

    public void setTraitReachUsers(Integer traitReachUsers) {
        this.traitReachUsers = traitReachUsers;
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

    public Date getCollectorTime() {
        return collectorTime;
    }

    public void setCollectorTime(Date collectorTime) {
        this.collectorTime = collectorTime;
    }
}