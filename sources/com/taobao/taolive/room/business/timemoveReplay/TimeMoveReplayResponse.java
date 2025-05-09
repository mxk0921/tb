package com.taobao.taolive.room.business.timemoveReplay;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TimeMoveReplayResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TimeMoveReplayResponseData data;

    static {
        t2o.a(779092838);
    }

    public static /* synthetic */ Object ipc$super(TimeMoveReplayResponse timeMoveReplayResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/timemoveReplay/TimeMoveReplayResponse");
    }

    public void setData(TimeMoveReplayResponseData timeMoveReplayResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677836b7", new Object[]{this, timeMoveReplayResponseData});
        } else {
            this.data = timeMoveReplayResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public TimeMoveReplayResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeMoveReplayResponseData) ipChange.ipc$dispatch("71266213", new Object[]{this}) : this.data;
    }
}
