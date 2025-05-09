package com.alibaba.android.nextrpc.bridge;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.common.WXModule;
import tb.jhc;
import tb.kvf;
import tb.svf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NextRpcJsModule extends WXModule implements Destroyable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private jhc mJsRequest;

    public static /* synthetic */ Object ipc$super(NextRpcJsModule nextRpcJsModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/bridge/NextRpcJsModule");
    }

    @JSMethod
    public void bind(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7e30e", new Object[]{this, str});
        } else if (this.mJsRequest == null) {
            svf svfVar = new svf(this.mWXSDKInstance.getContext(), "NextRPC_JsModule");
            this.mJsRequest = svfVar;
            svfVar.b(str);
        }
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        jhc jhcVar = this.mJsRequest;
        if (jhcVar != null) {
            ((svf) jhcVar).f();
        }
    }

    @JSMethod
    public void request(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6575ca8", new Object[]{this, str, jSCallback});
            return;
        }
        jhc jhcVar = this.mJsRequest;
        if (jhcVar != null) {
            ((svf) jhcVar).i(str, new kvf(jSCallback));
        }
    }
}
