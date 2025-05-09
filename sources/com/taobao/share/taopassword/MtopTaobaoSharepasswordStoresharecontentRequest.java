package com.taobao.share.taopassword;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoSharepasswordStoresharecontentRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.sharepassword.storesharecontent";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String shareRequestId = null;
    private String shareUniqueId = null;
    private String bizId = null;
    private String shareChannelType = null;
    private String msgType = "1";
    private String shareRemark = null;
    private String shareType = null;
    private String shareDesc = null;
    private String sharePicUrl = null;
    private String shareUrl = null;
    private String shareSendName = null;
    private String extendInfo = null;

    static {
        t2o.a(665845839);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getBizId() {
        return this.bizId;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public String getMsgType() {
        return this.msgType;
    }

    public String getShareChannelType() {
        return this.shareChannelType;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public String getSharePicUrl() {
        return this.sharePicUrl;
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

    public String getShareUniqueId() {
        return this.shareUniqueId;
    }

    public String getShareUrl() {
        return this.shareUrl;
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

    public void setBizId(String str) {
        this.bizId = str;
    }

    public void setExtendInfo(String str) {
        this.extendInfo = str;
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

    public void setShareChannelType(String str) {
        this.shareChannelType = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setSharePicUrl(String str) {
        this.sharePicUrl = str;
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

    public void setShareUniqueId(String str) {
        this.shareUniqueId = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
