package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.replayshifttext.ReplayShiftTextFrame;
import com.taobao.android.live.plugin.proxy.replayshifttext.IReplaySiftTextProxy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReplayShiftTextProxyX implements IReplaySiftTextProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699616);
        t2o.a(806355227);
    }

    @Override // com.taobao.android.live.plugin.proxy.replayshifttext.IReplaySiftTextProxy
    public Class<? extends BaseFrame> getReplaySiftTextFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2fb19e4d", new Object[]{this});
        }
        return ReplayShiftTextFrame.class;
    }
}
