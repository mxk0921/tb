package com.alipay.security.mobile.util.log.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BicLogReportRequestPB extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TAG_REPORTDATA = 1;
    @ProtoField(tag = 1)
    public MapStringString reportData;

    public BicLogReportRequestPB(BicLogReportRequestPB bicLogReportRequestPB) {
        super(bicLogReportRequestPB);
        if (bicLogReportRequestPB != null) {
            this.reportData = bicLogReportRequestPB.reportData;
        }
    }

    public static /* synthetic */ Object ipc$super(BicLogReportRequestPB bicLogReportRequestPB, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/util/log/model/BicLogReportRequestPB");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BicLogReportRequestPB)) {
            return false;
        }
        return equals(this.reportData, ((BicLogReportRequestPB) obj).reportData);
    }

    public BicLogReportRequestPB fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BicLogReportRequestPB) ipChange.ipc$dispatch("a2ef0ab3", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.reportData = (MapStringString) obj;
        }
        return this;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        MapStringString mapStringString = this.reportData;
        if (mapStringString != null) {
            i = mapStringString.hashCode();
        }
        this.hashCode = i;
        return i;
    }

    public BicLogReportRequestPB() {
    }
}
