package com.taobao.android.weex_framework.module.builtin;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.MUSAppMonitor;
import tb.p6x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WXAppMonitorModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS = {"commitCustomError", "commitCustomPerf"};
    public static final String NAME = "MUSAppMonitor";

    static {
        t2o.a(982516099);
    }

    private void commitCustomError(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e891883e", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        String stringValueOrNull2 = getArg(weexValueArr, 1).toStringValueOrNull();
        p6x p6xVar = (p6x) getWeexInstance().getExtend(p6x.class);
        if (p6xVar != null) {
            MUSAppMonitor.g(p6xVar.getMonitorInfo(), stringValueOrNull, stringValueOrNull2);
        }
    }

    private void commitCustomPerf(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f37066f", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        float floatValue = getArg(weexValueArr, 1).toFloatValue();
        p6x p6xVar = (p6x) getWeexInstance().getExtend(p6x.class);
        if (p6xVar != null) {
            p6xVar.d().k(stringValueOrNull, Math.round(floatValue));
        }
    }

    public static /* synthetic */ Object ipc$super(WXAppMonitorModule wXAppMonitorModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAppMonitorModule");
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        str2.hashCode();
        if (str2.equals("commitCustomPerf")) {
            commitCustomPerf(weexValueArr);
            return null;
        } else if (!str2.equals("commitCustomError")) {
            return null;
        } else {
            commitCustomError(weexValueArr);
            return null;
        }
    }
}
