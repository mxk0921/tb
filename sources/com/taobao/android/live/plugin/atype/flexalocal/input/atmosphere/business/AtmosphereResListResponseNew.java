package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AtmosphereResListResponseNew extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AtmosphereResListResponseDataNew2 data;

    static {
        t2o.a(295699431);
    }

    public static /* synthetic */ Object ipc$super(AtmosphereResListResponseNew atmosphereResListResponseNew, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/atmosphere/business/AtmosphereResListResponseNew");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public Object getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public void setData(AtmosphereResListResponseDataNew2 atmosphereResListResponseDataNew2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d74e748", new Object[]{this, atmosphereResListResponseDataNew2});
        } else {
            this.data = atmosphereResListResponseDataNew2;
        }
    }
}
