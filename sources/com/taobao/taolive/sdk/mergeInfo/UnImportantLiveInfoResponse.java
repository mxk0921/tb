package com.taobao.taolive.sdk.mergeInfo;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UnImportantLiveInfoResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UnImportantLiveInfoResponseData data;

    static {
        t2o.a(806356146);
    }

    public static /* synthetic */ Object ipc$super(UnImportantLiveInfoResponse unImportantLiveInfoResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/mergeInfo/UnImportantLiveInfoResponse");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public Object getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public void setData(UnImportantLiveInfoResponseData unImportantLiveInfoResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a82a6", new Object[]{this, unImportantLiveInfoResponseData});
        } else {
            this.data = unImportantLiveInfoResponseData;
        }
    }
}
