package com.taobao.taolive.message_sdk.mtop.heart;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HeartbeatReportResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HeartbeatReportResponseData data;

    public static /* synthetic */ Object ipc$super(HeartbeatReportResponse heartbeatReportResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/mtop/heart/HeartbeatReportResponse");
    }

    public void setData(HeartbeatReportResponseData heartbeatReportResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1cf522", new Object[]{this, heartbeatReportResponseData});
        } else {
            this.data = heartbeatReportResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public HeartbeatReportResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HeartbeatReportResponseData) ipChange.ipc$dispatch("f12a0d4c", new Object[]{this}) : this.data;
    }
}
