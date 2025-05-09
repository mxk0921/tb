package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame;
import com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy;
import tb.dg6;
import tb.mvb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class OfficialLiveEntryProxyX implements IOfficialLiveEntryProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699613);
        t2o.a(806355206);
    }

    @Override // com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy
    public Pair<Long, mvb> getOfficialLiveEntryDXHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("58681682", new Object[]{this});
        }
        return Pair.create(Long.valueOf((long) dg6.DX_EVENT_TAOLIVEOFFICIALENTRYCLICK), new dg6());
    }

    @Override // com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy
    public Class<? extends BaseFrame> getOfficialLiveEntryFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("635734a4", new Object[]{this});
        }
        return OfficialLiveEntryFrame.class;
    }
}
