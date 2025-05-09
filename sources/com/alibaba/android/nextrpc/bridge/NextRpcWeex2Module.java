package com.alibaba.android.nextrpc.bridge;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.jhc;
import tb.kvf;
import tb.pvh;
import tb.svf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NextRpcWeex2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private jhc mJsRequest;

    public NextRpcWeex2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(NextRpcWeex2Module nextRpcWeex2Module, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/bridge/NextRpcWeex2Module");
    }

    @MUSMethod
    public void bind(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7e30e", new Object[]{this, str});
        } else if (this.mJsRequest == null) {
            svf svfVar = new svf(getInstance().getUIContext(), "NextRPC_weex2JsModule");
            this.mJsRequest = svfVar;
            svfVar.b(str);
        }
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        jhc jhcVar = this.mJsRequest;
        if (jhcVar != null) {
            ((svf) jhcVar).f();
        }
    }

    @MUSMethod
    public void request(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d252b49", new Object[]{this, str, pvhVar});
            return;
        }
        jhc jhcVar = this.mJsRequest;
        if (jhcVar != null) {
            ((svf) jhcVar).i(str, new kvf(pvhVar));
        }
    }
}
