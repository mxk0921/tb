package com.taobao.android.fluid.framework.adapter;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EnvAdapter implements IEnvAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713798);
        t2o.a(468713801);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return IEnvAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IEnvAdapter
    public boolean isOnline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6971d628", new Object[]{this})).booleanValue();
        }
        if (EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.OnLINE.getValue()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IEnvAdapter
    public boolean isPre() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca587524", new Object[]{this})).booleanValue();
        }
        if (EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.PRE.getValue()) {
            return true;
        }
        return false;
    }
}
