package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.aspect.bx.tracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class r7r extends ms implements wab {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public lo f;
    public final Map<String, String> g = new HashMap();
    public hbb h;
    public Boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f27169a;
        public final /* synthetic */ Map b;

        public a(Context context, Map map) {
            this.f27169a = context;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                r7r.P0(r7r.this, this.f27169a, this.b);
                x9r.d(this.f27169a, 2, this.b);
                r7r.Q0(r7r.this);
            } catch (Throwable th) {
                rbb g = ck.g();
                g.e("asyncEnterOrderBXTracker exception :" + th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27170a;

        public b(String str) {
            this.f27170a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                r7r.R0(r7r.this, this.f27170a);
            } catch (Throwable th) {
                rbb g = ck.g();
                g.e("asyncEnterOrderBXTracker exception :" + th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f27171a;

        public c(Map map) {
            this.f27171a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                r7r.S0(r7r.this, "Page_ConfirmOrder", sst.CREATE_ORDER, this.f27171a);
            } catch (Throwable th) {
                rbb g = ck.g();
                g.e("asyncEnterOrderBXTracker exception :" + th.toString());
            }
        }
    }

    static {
        t2o.a(708837480);
        t2o.a(79691951);
    }

    public static /* synthetic */ void P0(r7r r7rVar, Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aba0c28", new Object[]{r7rVar, context, map});
        } else {
            r7rVar.T0(context, map);
        }
    }

    public static /* synthetic */ void Q0(r7r r7rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e4368a", new Object[]{r7rVar});
        } else {
            r7rVar.Z0();
        }
    }

    public static /* synthetic */ void R0(r7r r7rVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad5233", new Object[]{r7rVar, str});
        } else {
            r7rVar.X0(str);
        }
    }

    public static /* synthetic */ void S0(r7r r7rVar, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997cac29", new Object[]{r7rVar, str, str2, map});
        } else {
            r7rVar.a1(str, str2, map);
        }
    }

    public static /* synthetic */ Object ipc$super(r7r r7rVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1162528052:
                super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
                return null;
            case -25033014:
                super.onCreate((lo) objArr[0], (yi) objArr[1]);
                return null;
            case 148614476:
                super.afterServiceExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 418368253:
                super.afterFlowExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/aspect/TBBuyBXTrackerExtension");
        }
    }

    @Override // tb.ms
    public boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void U0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c867de1", new Object[]{this, str});
        } else if (W0()) {
            dn.h(new b(str));
        } else {
            X0(str);
        }
    }

    public final void V0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbd3261", new Object[]{this, map});
        } else if (W0()) {
            dn.h(new c(map));
        } else {
            a1("Page_ConfirmOrder", sst.CREATE_ORDER, map);
        }
    }

    public final boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("380c5fa3", new Object[]{this})).booleanValue();
        }
        if (this.i == null) {
            this.i = (Boolean) this.f.h("enableAsyncUT", Boolean.class, Boolean.FALSE);
        }
        Boolean bool = this.i;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void X0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6408e4fd", new Object[]{this, str});
            return;
        }
        lo loVar = this.f;
        if (loVar != null) {
            Context f = loVar.f();
            Intent h = hh.h(f);
            if (h == null) {
                q8r.a("EMPTY_INTENT_FORM_(enterOrderBXTracker)", "intent is empty");
                return;
            }
            Map<String, String> a2 = sst.a(f, h);
            if (a2 == null) {
                a2 = new HashMap<>();
            }
            a2.put("status", str);
            a1("Page_ConfirmOrder", sst.ENTER_ORDER, a2);
        }
    }

    public final void a1(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9c07d", new Object[]{this, str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19999, str2, null, null, map).build());
        }
    }

    @Override // tb.ms, tb.xab
    public void afterFlowExecute(yk ykVar, cg cgVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18efcafd", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(ykVar, cgVar, z);
        if ((AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(cgVar.a()) || "aura.workflow.request".equals(cgVar.a())) && !z) {
            U0("0");
        } else if ("aura.workflow.submit".equals(cgVar.a())) {
            Map<String, String> map = this.g;
            if (z) {
                str = "createOrderFail";
            } else {
                str = "createOrderSuccess";
            }
            ((HashMap) map).put("status", str);
            V0(this.g);
        }
        Y0(ykVar, cgVar, z);
    }

    @Override // tb.ms, tb.xab
    public void afterServiceExecute(yk ykVar, cg cgVar, boolean z) {
        rl rlVar;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbad4c", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(ykVar, cgVar, z);
        if ("aura.workflow.submit".equals(cgVar.a()) && tk.NEXT_RPC_SERVICE_CODE.equals(cgVar.b())) {
            Serializable b2 = ykVar.b();
            if (b2 instanceof AURAParseIO) {
                List<rl> data = ((AURAParseIO) b2).getData();
                if (data.size() == 1 && (rlVar = data.get(0)) != null && (string = rlVar.b().getString("bizOrderId")) != null) {
                    ((HashMap) this.g).put("bizOrderId", string);
                    ((HashMap) this.g).put("bizOrderIdForBBA", string.replace(",", "."));
                }
            }
        }
    }

    @Override // tb.wab
    public void b(mi miVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            return;
        }
        ni a2 = miVar.a();
        if ((AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(a2.a()) || "aura.workflow.request".equals(a2.a())) && "AURANextRPCServiceDomain".equals(miVar.c()) && "-2000_REQUEST_EXCEPTION".equals(miVar.b())) {
            kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
            if (kkVar == null) {
                this.h.b(new mi(1, us.ERROR_DOMAIN, "emptyRemoteResponse", "RemoteResponse为空"));
                return;
            }
            MtopResponse e = kkVar.e();
            if (e == null) {
                this.h.b(new mi(1, us.ERROR_DOMAIN, "emptyMtopResponse", "MtopResponse为空"));
                return;
            }
            if (e.isApiLockedResult()) {
                str = "2";
            } else {
                str = "1";
            }
            U0(str);
        }
    }

    @Override // tb.ms, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.f = loVar;
    }

    @Override // tb.ms, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.h = hbbVar;
    }

    public final void T0(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661284f2", new Object[]{this, context, map});
            return;
        }
        Intent h = hh.h(context);
        if (h == null) {
            q8r.a("EMPTY_INTENT_FORM_(addPageTypeTracker)", "intent is empty");
            return;
        }
        map.put("purchase_from", String.valueOf(h.getIntExtra("purchase_from", 3)));
        Map<? extends String, ? extends String> map2 = (Map) this.f.g("page_info", Map.class);
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    public void Y0(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e01361", new Object[]{this, ykVar, cgVar, new Boolean(z)});
        } else if ((AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(cgVar.a()) || "aura.workflow.request".equals(cgVar.a())) && !z) {
            HashMap hashMap = new HashMap();
            hashMap.put("purchaseV2NewContainer", "true");
            Context f = this.f.f();
            Object f2 = hh.f(f);
            if (f2 instanceof mud) {
                Map<String, String> l1 = ((mud) f2).l1();
                if (!bh.b(l1)) {
                    hashMap.putAll(l1);
                }
            } else {
                q8r.a("EMPTY_CONTAINER_FORM_(TBBuyMonitorExtension)", "container is empty");
                if (th.c()) {
                    throw new IllegalStateException("必须实现接口类：ITBBuyPageContainer");
                }
            }
            if (W0()) {
                dn.h(new a(f, hashMap));
                return;
            }
            T0(f, hashMap);
            x9r.d(f, 2, hashMap);
            Z0();
        }
    }

    public final void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1802ce3", new Object[]{this});
        } else {
            nbq.d("purchase", "buy2", "E_NEW_BUY_2.0_NEW_CONTAINER", "default", true);
        }
    }
}
