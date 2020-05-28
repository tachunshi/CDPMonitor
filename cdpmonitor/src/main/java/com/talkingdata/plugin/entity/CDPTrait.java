package com.talkingdata.plugin.entity;

import java.util.Date;

public class CDPTrait {
    private Integer id;

    private String channelId;

    private String traitId;

    private String traitName;

    private String traitType;

    private Integer traitReachUsers;

    private Integer traitStatus;

    private String traitCreator;

    private String traitDirectory;

    private Integer traitQuoteNum;

    private Integer quotedTraitNum;

    private Integer quotedCrowdNum;

    private Date traitActivatTime;

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

    public String getTraitId() {
        return traitId;
    }

    public void setTraitId(String traitId) {
        this.traitId = traitId == null ? null : traitId.trim();
    }

    public String getTraitName() {
        return traitName;
    }

    public void setTraitName(String traitName) {
        this.traitName = traitName == null ? null : traitName.trim();
    }

    public String getTraitType() {
        return traitType;
    }

    public void setTraitType(String traitType) {
        this.traitType = traitType == null ? null : traitType.trim();
    }

    public Integer getTraitReachUsers() {
        return traitReachUsers;
    }

    public void setTraitReachUsers(Integer traitReachUsers) {
        this.traitReachUsers = traitReachUsers;
    }

    public Integer getTraitStatus() {
        return traitStatus;
    }

    public void setTraitStatus(Integer traitStatus) {
        this.traitStatus = traitStatus;
    }

    public String getTraitCreator() {
        return traitCreator;
    }

    public void setTraitCreator(String traitCreator) {
        this.traitCreator = traitCreator == null ? null : traitCreator.trim();
    }

    public String getTraitDirectory() {
        return traitDirectory;
    }

    public void setTraitDirectory(String traitDirectory) {
        this.traitDirectory = traitDirectory == null ? null : traitDirectory.trim();
    }

    public Integer getTraitQuoteNum() {
        return traitQuoteNum;
    }

    public void setTraitQuoteNum(Integer traitQuoteNum) {
        this.traitQuoteNum = traitQuoteNum;
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

    public Date getTraitActivatTime() {
        return traitActivatTime;
    }

    public void setTraitActivatTime(Date traitActivatTime) {
        this.traitActivatTime = traitActivatTime;
    }

    public Date getCollectorTime() {
        return collectorTime;
    }

    public void setCollectorTime(Date collectorTime) {
        this.collectorTime = collectorTime;
    }
}