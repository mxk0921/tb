package com.taobao.taolive.room.business.mess;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveDetailMessinfoResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveDetailMessinfoResponseData data;

    static {
        t2o.a(779092823);
    }

    public static /* synthetic */ Object ipc$super(LiveDetailMessinfoResponse liveDetailMessinfoResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/mess/LiveDetailMessinfoResponse");
    }

    public void setData(LiveDetailMessinfoResponseData liveDetailMessinfoResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106a39ec", new Object[]{this, liveDetailMessinfoResponseData});
        } else {
            this.data = liveDetailMessinfoResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public LiveDetailMessinfoResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveDetailMessinfoResponseData) ipChange.ipc$dispatch("77a1c148", new Object[]{this}) : this.data;
    }
}
