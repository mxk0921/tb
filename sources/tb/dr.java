package tb;

import android.app.Activity;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dr INSTANCE = new dr();

    /* renamed from: a */
    public static final AbilityHubAdapter f18022a = new AbilityHubAdapter(new zq("Megability", "KMP"));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final g1a<Object, xhv> f18023a;

        static {
            t2o.a(1022361999);
            t2o.a(144703517);
        }

        public a(g1a<Object, xhv> g1aVar) {
            ckf.g(g1aVar, "callback");
            this.f18023a = g1aVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            this.f18023a.invoke(executeResult);
        }
    }

    static {
        t2o.a(1022361998);
    }

    public static /* synthetic */ void d(dr drVar, String str, String str2, Map map, Activity activity, g1a g1aVar, int i, Object obj) {
        Activity activity2;
        g1a g1aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd5c2f", new Object[]{drVar, str, str2, map, activity, g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            activity2 = null;
        } else {
            activity2 = activity;
        }
        if ((i & 16) != 0) {
            g1aVar2 = null;
        } else {
            g1aVar2 = g1aVar;
        }
        drVar.c(str, str2, map, activity2, g1aVar2);
    }

    public static final xhv e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e8bfa95f", new Object[]{obj});
        }
        ckf.g(obj, AdvanceSetting.NETWORK_TYPE);
        return xhv.INSTANCE;
    }

    public static /* synthetic */ Object g(dr drVar, String str, String str2, Map map, Activity activity, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b779433c", new Object[]{drVar, str, str2, map, activity, new Integer(i), obj});
        }
        if ((i & 8) != 0) {
            activity = null;
        }
        return drVar.f(str, str2, map, activity);
    }

    public static final xhv h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f085eb21", new Object[]{obj});
        }
        ckf.g(obj, AdvanceSetting.NETWORK_TYPE);
        return xhv.INSTANCE;
    }

    public final void c(String str, String str2, Map<String, ? extends Object> map, Activity activity, g1a<Object, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8619ce8", new Object[]{this, str, str2, map, activity, g1aVar});
            return;
        }
        ckf.g(str, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(str2, "action");
        zq zqVar = new zq("Megability", "KMP");
        zqVar.d(new WeakReference<>(activity));
        xq xqVar = new xq(zqVar);
        AbilityHubAdapter abilityHubAdapter = f18022a;
        if (g1aVar == null) {
            g1aVar = new g1a() { // from class: tb.cr
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv e;
                    e = dr.e(obj);
                    return e;
                }
            };
        }
        abilityHubAdapter.j(str, str2, xqVar, map, new a(g1aVar));
    }

    public final Object f(String str, String str2, Map<String, ? extends Object> map, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8c9f00af", new Object[]{this, str, str2, map, activity});
        }
        ckf.g(str, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(str2, "action");
        zq zqVar = new zq("Megability", "KMP");
        zqVar.d(new WeakReference<>(activity));
        ExecuteResult z = f18022a.z(str, str2, new xq(zqVar), map, new a(new g1a() { // from class: tb.br
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv h;
                h = dr.h(obj);
                return h;
            }
        }));
        ckf.f(z, "syncCall(...)");
        return z;
    }
}
