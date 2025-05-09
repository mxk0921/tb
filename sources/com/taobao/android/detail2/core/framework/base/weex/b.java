package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.util.HashMap;
import tb.bxj;
import tb.cxj;
import tb.o2r;
import tb.q0j;
import tb.qyj;
import tb.r19;
import tb.syj;
import tb.t2o;
import tb.txj;
import tb.vcd;
import tb.z4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b implements vcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public MUSDKInstance f7113a;

        static {
            t2o.a(352321751);
        }

        public a(b bVar) {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            MUSDKInstance mUSDKInstance = this.f7113a;
            if (mUSDKInstance != null) {
                mUSDKInstance.destroy();
            }
        }
    }

    static {
        t2o.a(352321750);
    }

    public void a(DetailWeexContainer detailWeexContainer, cxj cxjVar, z4x z4xVar, JSONObject jSONObject, boolean z, boolean z2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f524f54c", new Object[]{this, detailWeexContainer, cxjVar, z4xVar, jSONObject, new Boolean(z), new Boolean(z2)});
        } else if (detailWeexContainer != null && cxjVar != null && z4xVar != null) {
            if (!r19.G0() || !z) {
                if (!detailWeexContainer.v(z4xVar.c()) && z) {
                    qyj.a("weex_sync_delete_code", "findIdleInstance originWeexUrl:" + z4xVar.c());
                }
                aVar = null;
            } else {
                aVar = b(cxjVar, z4xVar);
            }
            o2r.a("weex_bindData_bindWeexContainerData");
            detailWeexContainer.s(z4xVar.c(), z4xVar.c, jSONObject, aVar, z2);
            o2r.b();
        }
    }

    public final a b(cxj cxjVar, z4x z4xVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d1545737", new Object[]{this, cxjVar, z4xVar});
        }
        if (cxjVar == null || z4xVar == null || cxjVar.i() == null) {
            return null;
        }
        a aVar = new a(this);
        MUSDKInstance g = syj.g(cxjVar.i(), z4xVar.c());
        bxj h = cxjVar.h();
        if (g == null) {
            str = "false";
        } else {
            str = "true";
        }
        q0j.a(h, "weexKeepLiveHit", str);
        e(g, cxjVar);
        aVar.f7113a = g;
        return aVar;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbe9ac15", new Object[]{this})).booleanValue();
        }
        return com.taobao.android.detail2.core.framework.data.global.a.w0();
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb11fb7", new Object[]{this, context});
        } else if (context != null) {
            if (!r19.G0()) {
                qyj.a("weex_sync_delete_code", "preloadWeex context:".concat(context.getClass().getSimpleName()));
            } else if (r19.J()) {
                txj.e(txj.TAG_TIP, "skipOutPreloadWeex for async.");
            } else {
                txj.e(txj.TAG_TIP, "startOutPreloadWeex for async.");
                syj.i(syj.PRELOAD_TYPE_OUT_PRE_WEEX);
            }
        }
    }

    public final void e(MUSDKInstance mUSDKInstance, cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda6b2c9", new Object[]{this, mUSDKInstance, cxjVar});
        } else if (mUSDKInstance != null && cxjVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isReady", String.valueOf(mUSDKInstance.isUIReady()));
            boolean isUIReady = mUSDKInstance.isUIReady();
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_WEEX_CACHE_HIT_SUCCESS, hashMap);
            q0j.a(cxjVar.h(), "weexKeepLiveReady", String.valueOf(isUIReady));
            txj.e(txj.TAG_RENDER, "命中预加载实例，是否已预加载好： " + isUIReady);
        }
    }
}
