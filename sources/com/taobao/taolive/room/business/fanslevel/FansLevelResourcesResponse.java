package com.taobao.taolive.room.business.fanslevel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FansLevelResourcesResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Map<String, String>> data;

    static {
        t2o.a(806355678);
    }

    public static /* synthetic */ Object ipc$super(FansLevelResourcesResponse fansLevelResourcesResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/fanslevel/FansLevelResourcesResponse");
    }

    public void setData(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else {
            this.data = map;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public Map<String, Map<String, String>> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this}) : this.data;
    }
}
