package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.list;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractiveNeedShowListResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap<String, InteractiveShowInfo> data;

    static {
        t2o.a(295699845);
    }

    public static /* synthetic */ Object ipc$super(InteractiveNeedShowListResponse interactiveNeedShowListResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/business/list/InteractiveNeedShowListResponse");
    }

    public void setData(HashMap<String, InteractiveShowInfo> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fd2920", new Object[]{this, hashMap});
        } else {
            this.data = hashMap;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public HashMap<String, InteractiveShowInfo> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("1d90c64a", new Object[]{this}) : this.data;
    }
}
