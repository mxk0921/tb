package com.taobao.android.livehome.plugin.atype.flexalocal;

import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bl9;
import tb.p5c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveHomeInitial implements p5c, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = LiveHomeInitial.class.getName();
    private static final AtomicBoolean ONCE = new AtomicBoolean(false);

    static {
        t2o.a(310378498);
    }

    @Override // tb.p5c
    public void init(Application application, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d5e6ac", new Object[]{this, application, bundle});
            return;
        }
        FlexaLiveX.w("[LiveHomeInitial] init");
        if (ONCE.compareAndSet(false, true)) {
            HashMap hashMap = new HashMap();
            hashMap.put(ITaoLiveHomePageProxy.KEY, new TaoLiveHomePageX());
            for (Map.Entry entry : hashMap.entrySet()) {
                FlexaLiveX.w("[LiveHomeInitial] init, class load success: ".concat(((IProxy) entry.getValue()).getClass().getName()));
            }
            bl9.g().k(hashMap);
            bl9.g().j(true);
        }
    }
}
