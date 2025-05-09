package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.rank.RankEntranceFrame;
import com.taobao.android.live.plugin.proxy.rank.IRankProxy;
import tb.j96;
import tb.mvb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RankProxyX implements IRankProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699615);
        t2o.a(806355223);
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Pair<Long, mvb> getRankEntranceDXHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4eabf62f", new Object[]{this});
        }
        return Pair.create(Long.valueOf((long) j96.DX_EVENT_RANKENTRANCETAP), new j96());
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Class<? extends BaseFrame> getRankEntranceFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("10722b57", new Object[]{this});
        }
        return RankEntranceFrame.class;
    }
}
