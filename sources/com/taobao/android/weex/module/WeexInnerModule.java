package com.taobao.android.weex.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import tb.d7x;
import tb.f4x;
import tb.hxh;
import tb.t2o;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class WeexInnerModule implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeexInstanceImpl mWeexInstance;

    static {
        t2o.a(982515926);
        t2o.a(982515802);
    }

    public void argCount(WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4525edac", new Object[]{this, weexValueArr, new Integer(i)});
            return;
        }
        while (i < weexValueArr.length) {
            WeexValue weexValue = weexValueArr[i];
            if (weexValue.getType() == WeexValue.Type.FUNCTION) {
                this.mWeexInstance.removeCallback(weexValue.getFunctionID());
            }
            i++;
        }
    }

    public abstract WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception;

    public final void executeInMain(yio yioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1e2686", new Object[]{this, yioVar});
        } else {
            hxh.d(yioVar);
        }
    }

    public WeexValue getArg(WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("91c9fc01", new Object[]{this, weexValueArr, new Integer(i)});
        }
        if (i >= weexValueArr.length) {
            return WeexValueImpl.ofUndefined();
        }
        return weexValueArr[i];
    }

    public f4x getCallback(WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("fd1d4d7a", new Object[]{this, weexValueArr, new Integer(i)});
        }
        return getArg(weexValueArr, i).toFunctionOrNull(getWeexInstance());
    }

    public WeexInstance getWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("e85302a1", new Object[]{this});
        }
        return this.mWeexInstance;
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
        } else {
            this.mWeexInstance = (WeexInstanceImpl) d7xVar.getInstance();
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        }
    }
}
