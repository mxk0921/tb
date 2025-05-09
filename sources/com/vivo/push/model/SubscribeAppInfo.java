package com.vivo.push.model;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SubscribeAppInfo {
    public static final int SUBSCIRBE = 1;
    public static final int SUBSCIRBE_CANCLE = 2;
    private int mActualStatus;
    private String mName;
    private int mTargetStatus;

    public SubscribeAppInfo(String str, int i, int i2) {
        this.mName = str;
        this.mTargetStatus = i;
        this.mActualStatus = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeAppInfo subscribeAppInfo = (SubscribeAppInfo) obj;
        String str = this.mName;
        if (str == null) {
            if (subscribeAppInfo.mName != null) {
                return false;
            }
        } else if (!str.equals(subscribeAppInfo.mName)) {
            return false;
        }
        if (this.mTargetStatus == subscribeAppInfo.mTargetStatus) {
            return true;
        }
        return false;
    }

    public int getActualStatus() {
        return this.mActualStatus;
    }

    public String getName() {
        return this.mName;
    }

    public int getTargetStatus() {
        return this.mTargetStatus;
    }

    public int hashCode() {
        int i;
        String str = this.mName;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((i + 31) * 31) + this.mTargetStatus;
    }

    public void setActualStatus(int i) {
        this.mActualStatus = i;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setTargetStatus(int i) {
        this.mTargetStatus = i;
    }

    public String toString() {
        return "SubscribeAppInfo [mName=" + this.mName + ", mTargetStatus=" + this.mTargetStatus + ", mActualStatus=" + this.mActualStatus + "]";
    }
}
