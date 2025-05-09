package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UltronServerConfigResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ServerConfigs data;

    static {
        t2o.a(295699190);
    }

    public static /* synthetic */ Object ipc$super(UltronServerConfigResponse ultronServerConfigResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/config/UltronServerConfigResponse");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public ServerConfigs getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServerConfigs) ipChange.ipc$dispatch("67b579e8", new Object[]{this}) : this.data;
    }
}
