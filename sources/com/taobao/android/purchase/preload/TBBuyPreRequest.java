package com.taobao.android.purchase.preload;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.lightbuy.performance.LightBuyStage;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ck;
import tb.g4o;
import tb.hog;
import tb.kk;
import tb.ln0;
import tb.pk;
import tb.t2o;
import tb.ubb;
import tb.wnj;
import tb.xal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyPreRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9229a;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface PreRequestState {
        public static final int BUSY = 2;
        public static final int IDLE = 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends pk.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ubb.a... aVarArr) {
            super(aVarArr);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/preload/TBBuyPreRequest$1");
        }

        @Override // tb.pk.a, tb.ubb.a
        public <T extends kk> void c(T t, List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef42949a", new Object[]{this, t, list});
            } else {
                wnj.d(true);
            }
        }
    }

    static {
        t2o.a(708837584);
    }

    public static void b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230e84eb", new Object[]{context, intent});
        } else if (f9229a) {
            ck.g().e("预请求已经发送，不用预请求V2", ck.b.b().i("AURA/performance").a());
        } else {
            ck.g().e("开始预请求V2", ck.b.b().i("AURA/performance").d("time", System.currentTimeMillis()).a());
            new ln0.b(context, intent).l(RequestConfig.e(context)).h().e(g4o.KEY_SERVICE_NAME);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
        } else {
            f9229a = false;
        }
    }

    public static void a(Context context, Intent intent, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55001f6d", new Object[]{context, intent, new Boolean(z)});
        } else if (f9229a) {
            ck.g().e("预请求已经发送，不用重复", ck.b.b().i("AURA/performance").a());
        } else {
            ck.g().e("开始预请求", ck.b.b().i("AURA/performance").d("time", System.currentTimeMillis()).a());
            f9229a = true;
            wnj.c();
            Map<String, String> e = RequestConfig.e(context);
            hog.c().f(LightBuyStage.MTOP_REQ_START);
            HashMap hashMap = new HashMap();
            if (xal.a("enableAppendLivingParams", true)) {
                hashMap.putAll(RequestConfig.f(intent, Arrays.asList("liveId", RequestConfig.KEY_ANCHOR_ID)));
            }
            boolean z3 = z && (AliBuyPerfSwitcher.enableStreamResponse() || AliBuyPerfSwitcher.enablePopupWindowStreamResponse());
            if (!AliBuyPerfSwitcher.enableThreadPerf() && !z3) {
                z2 = false;
            }
            AliBuyPerfSwitcher.updatePerfSwitch("enablePopupWindowStreamResponse", z3);
            AliBuyPerfSwitcher.updatePerfSwitch("enableThreadPerf", z2);
            new ln0.b(context, intent).k(hashMap).l(e).j(z2).m(z3).i(new a(new ubb.a[0])).h().f(g4o.KEY_SERVICE_NAME);
        }
    }
}
