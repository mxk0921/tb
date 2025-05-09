package com.taobao.taolive.sdk.business.official.heartbeat;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.model.official.OfficialHeartbeatDO;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OfficialHeartbeatResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private OfficialHeartbeatDO data;

    static {
        t2o.a(806356035);
    }

    public static /* synthetic */ Object ipc$super(OfficialHeartbeatResponse officialHeartbeatResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/official/heartbeat/OfficialHeartbeatResponse");
    }

    public void setData(OfficialHeartbeatDO officialHeartbeatDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35110087", new Object[]{this, officialHeartbeatDO});
        } else {
            this.data = officialHeartbeatDO;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public OfficialHeartbeatDO getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OfficialHeartbeatDO) ipChange.ipc$dispatch("b1f30871", new Object[]{this}) : this.data;
    }
}
