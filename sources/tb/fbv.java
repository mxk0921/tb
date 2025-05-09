package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import tb.nbv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fbv implements t5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<String> f19177a;
    public final HashSet<String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19178a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;

        public a(String str, String str2, JSONObject jSONObject) {
            this.f19178a = str;
            this.b = str2;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fbv.b(fbv.this, false, this.f19178a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(157286856);
        t2o.a(157286824);
        t2o.a(157286825);
    }

    public fbv() {
        HashSet<String> hashSet = new HashSet<>();
        this.f19177a = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        this.b = hashSet2;
        hashSet.add("com.taobao.detail.rate.preload.AskListPreRequestManager");
        hashSet.add("com.taobao.detail.rate.preload.RateHomePreRequestManager");
        hashSet.add("com.taobao.android.order.core.weex2.LogisticsDetailHybridManager");
        hashSet2.add("com.taobao.android.order.bundle.weex2.TBRefundInstanceManager");
        hashSet2.add("com.taobao.android.icart.engine.CartVEngineFactory");
        hashSet2.add("com.taobao.android.purchase.preload.TBBuyPreloadFactory");
        hashSet2.add("com.taobao.android.order.core.performance.OrderUltronInstanceFactory");
    }

    public static /* synthetic */ void b(fbv fbvVar, boolean z, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4580f", new Object[]{fbvVar, new Boolean(z), str, str2, jSONObject});
        } else {
            fbvVar.f(z, str, str2, jSONObject);
        }
    }

    @Override // tb.t5e
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
        } else {
            d(str, str2, h(jSONObject));
        }
    }

    public final void c(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c6c1df", new Object[]{this, str, str2, jSONObject});
        } else {
            pav.k(new a(str, str2, jSONObject));
        }
    }

    public final void d(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122b7611", new Object[]{this, str, str2, jSONObject});
        } else if (!e(str2, null)) {
            hav.g("UltronTradeHybridCustomManager", "dispatchStage:", str2 + " switcher is off");
        } else if (!TextUtils.equals(str, UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER)) {
            g(str, str2, jSONObject);
            c(str, str2, jSONObject);
        }
    }

    public boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a25e695", new Object[]{this, str, str2})).booleanValue();
        }
        return UltronTradeHybridSwitcherHelper.a(str);
    }

    public final void f(boolean z, String str, String str2, JSONObject jSONObject) {
        HashSet<String> hashSet;
        Method[] declaredMethods;
        Context context = TBMainHost.b().getContext();
        if (!(context instanceof Activity)) {
            hav.g("UltronTradeHybridCustomManager", "dispatchStage", "activity is null");
            return;
        }
        if (z) {
            hashSet = this.f19177a;
        } else {
            hashSet = this.b;
        }
        if (!hashSet.isEmpty()) {
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                try {
                    for (Method method : Class.forName(it.next()).getDeclaredMethods()) {
                        if (method.isAnnotationPresent(TradeHybridCustomAnnotation.class)) {
                            method.invoke(null, context, str, str2, jSONObject);
                        }
                    }
                } catch (Throwable th) {
                    nbv.a(nbv.a.a("dispatchStage").success(false).message(th.toString()).sampling(1.0E-5f));
                }
            }
        }
    }

    public JSONObject h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("367da879", new Object[]{this, jSONObject});
        }
        return lbv.o(jSONObject);
    }

    public final void g(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ac83a0", new Object[]{this, str, str2, jSONObject});
        } else if (TextUtils.equals(UltronTradeHybridStage.ON_NAV_PROCESS, str) && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "enableSyncCustomCallback", true)) {
            f(true, str, str2, jSONObject);
        }
    }
}
