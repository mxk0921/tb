package com.alipay.security.mobile.util.log.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BicLogReportResponsePB extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ERRCODE = "";
    public static final String DEFAULT_ERRMSG = "";
    public static final Boolean DEFAULT_SUCCESS = Boolean.FALSE;
    public static final int TAG_ERRCODE = 2;
    public static final int TAG_ERRMSG = 3;
    public static final int TAG_EXTINFO = 4;
    public static final int TAG_SUCCESS = 1;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String errCode;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String errMsg;
    @ProtoField(tag = 4)
    public MapStringString extInfo;
    @ProtoField(tag = 1, type = Message.Datatype.BOOL)
    public Boolean success;

    public BicLogReportResponsePB(BicLogReportResponsePB bicLogReportResponsePB) {
        super(bicLogReportResponsePB);
        if (bicLogReportResponsePB != null) {
            this.success = bicLogReportResponsePB.success;
            this.errCode = bicLogReportResponsePB.errCode;
            this.errMsg = bicLogReportResponsePB.errMsg;
            this.extInfo = bicLogReportResponsePB.extInfo;
        }
    }

    public static /* synthetic */ Object ipc$super(BicLogReportResponsePB bicLogReportResponsePB, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/util/log/model/BicLogReportResponsePB");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BicLogReportResponsePB)) {
            return false;
        }
        BicLogReportResponsePB bicLogReportResponsePB = (BicLogReportResponsePB) obj;
        if (!equals(this.success, bicLogReportResponsePB.success) || !equals(this.errCode, bicLogReportResponsePB.errCode) || !equals(this.errMsg, bicLogReportResponsePB.errMsg) || !equals(this.extInfo, bicLogReportResponsePB.extInfo)) {
            return false;
        }
        return true;
    }

    public BicLogReportResponsePB fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BicLogReportResponsePB) ipChange.ipc$dispatch("e48708af", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.success = (Boolean) obj;
        } else if (i == 2) {
            this.errCode = (String) obj;
        } else if (i == 3) {
            this.errMsg = (String) obj;
        } else if (i == 4) {
            this.extInfo = (MapStringString) obj;
        }
        return this;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        Boolean bool = this.success;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 37;
        String str = this.errCode;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        String str2 = this.errMsg;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        MapStringString mapStringString = this.extInfo;
        if (mapStringString != null) {
            i4 = mapStringString.hashCode();
        }
        int i9 = i8 + i4;
        this.hashCode = i9;
        return i9;
    }

    public BicLogReportResponsePB() {
    }
}
