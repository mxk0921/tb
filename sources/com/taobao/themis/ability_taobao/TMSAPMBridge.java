package com.taobao.themis.ability_taobao;

import android.app.Activity;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import tb.j8s;
import tb.t2o;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSAPMBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(832569348);
        t2o.a(839909427);
    }

    @ThreadType(ExecutorType.IO)
    @AutoCallback
    @APIMethod
    public BridgeResponse addAPMStage(@BindingApiContext ApiContext apiContext, @BindingParam({"stage"}) String str, @BindingParam(longDefault = -1, value = {"systemUpTime "}) long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("4d265fc5", new Object[]{this, apiContext, str, new Long(j)});
        }
        Activity a2 = apiContext.a();
        if (a2 != null) {
            vxm vxmVar = vxm.b;
            vxmVar.a(a2).j(str, j);
            vxmVar.e().j(str, j);
        }
        return BridgeResponse.SUCCESS;
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }
}
