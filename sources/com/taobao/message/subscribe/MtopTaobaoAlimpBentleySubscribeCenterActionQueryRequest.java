package com.taobao.message.subscribe;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.alimp.bentley.subscribe.center.action.query";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String topicIds = null;
    private String activityType = null;
    private long version = 0;
    private String sdkVersion = "";
    private String subFrom = null;

    static {
        t2o.a(530579476);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public String getActivityType() {
        return this.activityType;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSubFrom() {
        return this.subFrom;
    }

    public String getTopicIds() {
        return this.topicIds;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public long getVersion() {
        return this.version;
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

    public void setActivityType(String str) {
        this.activityType = str;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setSubFrom(String str) {
        this.subFrom = str;
    }

    public void setTopicIds(String str) {
        this.topicIds = str;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public void setVersion(long j) {
        this.version = j;
    }
}
