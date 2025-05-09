package com.taobao.vessel.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.Map;
import tb.cbo;
import tb.e4w;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VesselWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(967835681);
    }

    public static /* synthetic */ Object ipc$super(VesselWeexModule vesselWeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/vessel/weex/VesselWeexModule");
    }

    @WXModuleAnno
    public void vesselCall(Map<String, Object> map, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6979aa5e", new Object[]{this, map, jSCallback});
        } else {
            e4w.b().c(this.mWXSDKInstance, map, new cbo(jSCallback));
        }
    }
}
