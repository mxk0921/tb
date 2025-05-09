package com.taobao.share.core.contacts.mtop.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NewShareFriendsApi implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.aris.share.sendfriendshare";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String sharePicUrl = null;
    private String sharePrice = null;
    private String shareItemId = null;
    private String friendName = null;
    private String taoFriends = null;
    private String groupIds = null;
    private String shareRemark = null;
    private String shareUrl = null;
    private String shareDesc = null;
    private String msgType = null;
    private String extendInfo = null;
    private String shareSendName = null;
    private String shareType = null;
    private String contacts = null;
    private String activityId = null;
    private String shareRequestId = null;

    static {
        t2o.a(664797228);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getActivityId() {
        return this.activityId;
    }

    public String getContacts() {
        return this.contacts;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public String getFriendName() {
        return this.friendName;
    }

    public String getGroupIds() {
        return this.groupIds;
    }

    public String getMsgType() {
        return this.msgType;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public String getShareItemId() {
        return this.shareItemId;
    }

    public String getSharePicUrl() {
        return this.sharePicUrl;
    }

    public String getSharePrice() {
        return this.sharePrice;
    }

    public String getShareRemark() {
        return this.shareRemark;
    }

    public String getShareRequestId() {
        return this.shareRequestId;
    }

    public String getShareSendName() {
        return this.shareSendName;
    }

    public String getShareType() {
        return this.shareType;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getTaoFriends() {
        return this.taoFriends;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setContacts(String str) {
        this.contacts = str;
    }

    public void setExtendInfo(String str) {
        this.extendInfo = str;
    }

    public void setFriendName(String str) {
        this.friendName = str;
    }

    public void setGroupIds(String str) {
        this.groupIds = str;
    }

    public void setMsgType(String str) {
        this.msgType = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareItemId(String str) {
        this.shareItemId = str;
    }

    public void setSharePicUrl(String str) {
        this.sharePicUrl = str;
    }

    public void setSharePrice(String str) {
        this.sharePrice = str;
    }

    public void setShareRemark(String str) {
        this.shareRemark = str;
    }

    public void setShareRequestId(String str) {
        this.shareRequestId = str;
    }

    public void setShareSendName(String str) {
        this.shareSendName = str;
    }

    public void setShareType(String str) {
        this.shareType = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setTaoFriends(String str) {
        this.taoFriends = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
