package com.taobao.themis.inside.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IDeviceInfoAdapter;
import kotlin.Metadata;
import tb.ai7;
import tb.c21;
import tb.chb;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/inside/adapter/DeviceInfoAdapter;", "Lcom/taobao/themis/kernel/adapter/IDeviceInfoAdapter;", "()V", "getDeviceScore", "", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DeviceInfoAdapter implements IDeviceInfoAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(837812262);
        t2o.a(839909465);
    }

    @Override // com.taobao.themis.kernel.adapter.IDeviceInfoAdapter
    public int getDeviceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be20", new Object[]{this})).intValue();
        }
        chb g = c21.g();
        ckf.f(g, "getAppPreferences()");
        return (int) g.getFloat(ai7.KEY_NEW_SCORE, 0.0f);
    }
}
