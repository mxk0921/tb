package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AtmosphereRealResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AtmosphereRealResponseData data;

    static {
        t2o.a(295699426);
    }

    public static /* synthetic */ Object ipc$super(AtmosphereRealResponse atmosphereRealResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/atmosphere/business/AtmosphereRealResponse");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public Object getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public void setData(AtmosphereRealResponseData atmosphereRealResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af121a4", new Object[]{this, atmosphereRealResponseData});
        } else {
            this.data = atmosphereRealResponseData;
        }
    }
}
