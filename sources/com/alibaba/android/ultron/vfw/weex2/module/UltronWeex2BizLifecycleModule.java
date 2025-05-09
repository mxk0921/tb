package com.alibaba.android.ultron.vfw.weex2.module;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.qbv;
import tb.t2o;
import tb.xcv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2BizLifecycleModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "tradeBizLifecycle";

    static {
        t2o.a(157286956);
    }

    public UltronWeex2BizLifecycleModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2BizLifecycleModule ultronWeex2BizLifecycleModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/module/UltronWeex2BizLifecycleModule");
    }

    @MUSMethod(uiThread = true)
    public void onBizFailed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1435fd2c", new Object[]{this, str, str2});
            return;
        }
        a instance = getInstance();
        if (instance == null) {
            UnifyLog.e("UltronWeex2BizLifecycleModule.onBizFailed", "instance is null");
            return;
        }
        Object tag = instance.getTag("bizLifecycleListener");
        if (!(tag instanceof xcv)) {
            UnifyLog.e("UltronWeex2BizLifecycleModule.onBizFailed", "listener is not a UltronWeex2BizLifecycleListener");
        } else {
            ((xcv) tag).n0(str, str2);
        }
    }

    @MUSMethod(uiThread = true)
    public void onBizReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a730856", new Object[]{this});
            return;
        }
        a instance = getInstance();
        if (instance == null) {
            UnifyLog.e("UltronWeex2BizLifecycleModule.onBizReady", "instance is null");
            return;
        }
        qbv.j().p().f(instance, null);
        Object tag = instance.getTag("bizLifecycleListener");
        if (!(tag instanceof xcv)) {
            UnifyLog.e("UltronWeex2BizLifecycleModule.onBizReady", "listener is not a UltronWeex2BizLifecycleListener");
        } else {
            ((xcv) tag).S();
        }
    }
}
