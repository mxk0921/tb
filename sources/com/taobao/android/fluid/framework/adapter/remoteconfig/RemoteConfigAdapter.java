package com.taobao.android.fluid.framework.adapter.remoteconfig;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter;
import tb.akt;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RemoteConfigAdapter implements IRemoteConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RemoteConfigAdapter";

    static {
        t2o.a(468713844);
        t2o.a(468713815);
    }

    private String appendKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ab0bdaa", new Object[]{this, str});
        }
        if (str == null || str.contains(".")) {
            return str;
        }
        return "ShortVideo.".concat(str);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public boolean getABTestBooleanConfig(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7686466", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return nwv.o(getABTestObjectConfig(str, Boolean.valueOf(z)), z);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public Object getABTestObjectConfig(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5438f4bb", new Object[]{this, str, obj});
        }
        return akt.B2(str, obj);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public String getABTestStringConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("feace2e9", new Object[]{this, str, str2});
        }
        return akt.G2(str, str2);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return IRemoteConfigAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public boolean getOrangeBooleanConfig(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83d28ce1", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return akt.p2(appendKey(str), z);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public int getOrangeIntConfig(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4e1ac98", new Object[]{this, str, new Integer(i)})).intValue();
        }
        return akt.w2(appendKey(str), i);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public long getOrangeLongConfig(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1479f6e5", new Object[]{this, str, new Long(j)})).longValue();
        }
        return akt.z2(appendKey(str), j);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public String getOrangeStringConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c6af5ce", new Object[]{this, str, str2});
        }
        return akt.H2(appendKey(str), str2);
    }
}
