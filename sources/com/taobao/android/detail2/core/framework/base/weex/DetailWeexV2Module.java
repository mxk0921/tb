package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.ArrayList;
import java.util.List;
import tb.pvh;
import tb.t2o;
import tb.uce;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailWeexV2Module extends MUSModule implements uce {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<pvh> mCallbacks = new ArrayList();

    static {
        t2o.a(352321746);
        t2o.a(352321747);
    }

    public DetailWeexV2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(DetailWeexV2Module detailWeexV2Module, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/weex/DetailWeexV2Module");
    }

    @MUSMethod
    public void dispatchMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f83b53c", new Object[]{this, jSONObject});
        } else {
            DetailWeexModule.dispatchMessage(jSONObject, this);
        }
    }

    @Override // tb.uce
    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
        } else if (getInstance() != null) {
            getInstance().fireEvent(2, str, jSONObject);
        }
    }

    @Override // tb.uce
    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        if (getInstance() instanceof MUSDKInstance) {
            return ((MUSDKInstance) getInstance()).getInstanceEnv("bundleUrl");
        }
        return "";
    }

    @Override // tb.uce
    public View getContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3268c19", new Object[]{this});
        }
        if (getInstance() != null) {
            return getInstance().getRenderRoot();
        }
        return null;
    }

    @Override // tb.uce
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (getInstance() != null) {
            return getInstance().getUIContext();
        }
        return null;
    }

    @MUSMethod
    public void onMessage(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa81c3d8", new Object[]{this, pvhVar});
        } else {
            this.mCallbacks.add(pvhVar);
        }
    }
}
