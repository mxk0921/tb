package com.taobao.android.fluid.framework.deprecated.message.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.proxy.ShortVideoWeexV2ModuleProxy;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.ir9;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShortVideoWeexV2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShortVideoWeexV2Module";
    private final ShortVideoWeexV2ModuleProxy mFluidSDKProxy = new ShortVideoWeexV2ModuleProxy(this);

    static {
        t2o.a(468714341);
    }

    public ShortVideoWeexV2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        ir9.b(TAG, "初始化 ShortVideoWeexV2Module");
    }

    public static /* synthetic */ Object ipc$super(ShortVideoWeexV2Module shortVideoWeexV2Module, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/deprecated/message/module/ShortVideoWeexV2Module");
    }

    @MUSMethod(uiThread = true)
    public void offNotify(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4b20b1", new Object[]{this, jSONObject});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy != null) {
            shortVideoWeexV2ModuleProxy.offNotify(jSONObject);
        }
    }

    @MUSMethod(uiThread = true)
    public void onNotify(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e398aea", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy != null) {
            shortVideoWeexV2ModuleProxy.onNotify(jSONObject, pvhVar);
        }
    }

    @MUSMethod(uiThread = true)
    public void postNotify(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d380e0", new Object[]{this, jSONObject});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy != null) {
            shortVideoWeexV2ModuleProxy.postNotify(jSONObject);
        }
    }

    @MUSMethod(uiThread = true)
    public void sendMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6326634a", new Object[]{this, jSONObject});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy != null) {
            shortVideoWeexV2ModuleProxy.sendMessage(jSONObject);
        }
    }

    @MUSMethod(uiThread = true)
    public void sendMessageAsync(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcb7d75", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy != null) {
            shortVideoWeexV2ModuleProxy.sendMessageAsync(jSONObject, pvhVar);
        }
    }

    @MUSMethod(uiThread = true)
    public void snapShotVideo(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a22a9b", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy != null) {
            shortVideoWeexV2ModuleProxy.snapShotVideo(jSONObject, pvhVar);
        }
    }
}
