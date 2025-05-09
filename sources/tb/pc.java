package tb;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.service.apm.APMService$buildABBucketTag$result$1;
import com.taobao.monitor.procedure.IPage;
import java.util.HashMap;
import kotlin.Metadata;
import tb.pab;
import tb.tpu;
import tb.ud0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class pc implements pab, byd, rjb, s4c, pxd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String MTS_INTERACT_METRIC_NAME = "interactFirstFrame";
    public static final String MTS_NAME_ALL = "all";
    public static final String MTS_NAME_INTERACT = "interact";
    public static final String SCENE_NAME = "Tab2";

    /* renamed from: a  reason: collision with root package name */
    public qpu f26007a;
    public Boolean d;
    public zoc h;
    public zoc i;
    public final HashMap<String, IPage> b = new HashMap<>();
    public boolean c = true;
    public boolean e = true;
    public final HashMap<String, String> f = new HashMap<>();
    public final HashMap<String, String> g = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455498);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                pc.this.C0("onStop", "all");
                pc.this.n("tab2EndType", "onStop", "all");
                pc.this.j(false, "onStop", "all");
                pc.this.U0("all");
            } catch (Throwable th) {
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "APMService", "onTabStop error, " + th.getMessage(), null, 4, null);
            }
        }
    }

    static {
        t2o.a(916455497);
        t2o.a(919601255);
        t2o.a(916455448);
        t2o.a(916455433);
        t2o.a(919601319);
        t2o.a(916455447);
    }

    @Override // tb.s4c
    public void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492c9b54", new Object[]{this});
        }
    }

    @Override // tb.pxd
    public void B(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeec9dd", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // tb.pab
    public void C0(String str, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc225e4", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "eventName");
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.b(str);
                return;
            }
            return;
        }
        int hashCode = str2.hashCode();
        if (hashCode != 96673) {
            if (hashCode == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
                K1.b(str);
            }
        } else if (str2.equals("all")) {
            zoc L12 = L1();
            if (L12 != null) {
                L12.b(str);
            }
            zoc K12 = K1();
            if (K12 != null) {
                K12.b(str);
            }
        }
    }

    @Override // tb.pab
    public void G0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c45459bc", new Object[]{this, new Long(j)});
            return;
        }
        N1(this.h, j);
        N1(this.i, j);
    }

    @Override // tb.s4c
    public void G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff8fd50", new Object[]{this});
        } else {
            z0("page_on_create", "all");
        }
    }

    @Override // tb.pab
    public String I1(String str) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dd2ea7", new Object[]{this, str});
        }
        if (str == null) {
            zoc L1 = L1();
            if (L1 != null) {
                return L1.h();
            }
            return null;
        } else if (str.hashCode() == 570398262 && str.equals("interact") && (K1 = K1()) != null) {
            return K1.h();
        } else {
            return null;
        }
    }

    public final zoc K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zoc) ipChange.ipc$dispatch("acee9778", new Object[]{this});
        }
        return this.i;
    }

    @Override // tb.s4c
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5830247c", new Object[]{this});
        } else {
            z0("page_on_start", "all");
        }
    }

    public final zoc L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zoc) ipChange.ipc$dispatch("6c280e8e", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.vpj
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2918e2c9", new Object[]{this});
        }
    }

    public final void M1(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c683137", new Object[]{this, iPage});
        } else if (e1()) {
            try {
                qpu qpuVar = this.f26007a;
                if (qpuVar == null) {
                    ckf.y("context");
                    throw null;
                } else if (iPage != null) {
                    new w5r(qpuVar, (cll) iPage);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.monitor.impl.processor.custom.Page");
                }
            } catch (Exception e) {
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "APMService", "APM_INIT error, " + e.getMessage(), null, 4, null);
            }
        }
    }

    public final void N1(zoc zocVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9991f4", new Object[]{this, zocVar, new Long(j)});
            return;
        }
        if (zocVar != null) {
            zocVar.m(j);
        }
        if (zocVar != null) {
            zocVar.d("biz_nav_pre", j);
        }
        if (zocVar != null) {
            zocVar.j("biz_nav_pre", true);
        }
    }

    public final String T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c1d698", new Object[]{this});
        }
        String j0 = i04.j0(qau.r().values(), "_", null, null, 0, null, APMService$buildABBucketTag$result$1.INSTANCE, 30, null);
        tpu.a aVar = tpu.Companion;
        aVar.c("APMService", "buildABBucketTag:" + j0);
        return j0;
    }

    public void U0(String str) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d3813a", new Object[]{this, str});
        } else if (str == null) {
            zoc L1 = L1();
            if (L1 != null) {
                huh.h().f(L1.h());
            }
        } else {
            int hashCode = str.hashCode();
            if (hashCode != 96673) {
                if (hashCode == 570398262 && str.equals("interact") && (K1 = K1()) != null) {
                    huh.h().f(K1.h());
                }
            } else if (str.equals("all")) {
                zoc L12 = L1();
                if (L12 != null) {
                    huh.h().f(L12.h());
                }
                zoc K12 = K1();
                if (K12 != null) {
                    huh.h().f(K12.h());
                }
            }
        }
    }

    @Override // tb.s4c
    public void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86f8096", new Object[]{this});
        }
    }

    @Override // tb.pab
    public void a(String str, boolean z, long j, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a06141", new Object[]{this, str, new Boolean(z), new Long(j), str2});
            return;
        }
        ckf.g(str, "stageName");
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.o(str, z, j);
                return;
            }
            return;
        }
        int hashCode = str2.hashCode();
        if (hashCode != 96673) {
            if (hashCode == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
                K1.o(str, z, j);
            }
        } else if (str2.equals("all")) {
            zoc L12 = L1();
            if (L12 != null) {
                L12.o(str, z, j);
            }
            zoc K12 = K1();
            if (K12 != null) {
                K12.o(str, z, j);
            }
        }
    }

    @Override // tb.pab
    public String c(String str, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f4d1846", new Object[]{this, str, str2});
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                String p = L1.p(str);
                HashMap<String, String> hashMap = this.f;
                ckf.f(p, "metricsTaskId");
                hashMap.put(str, p);
                return p;
            }
        } else if (str2.hashCode() == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
            String p2 = K1.p(str);
            HashMap<String, String> hashMap2 = this.g;
            ckf.f(p2, "metricsTaskId");
            hashMap2.put(str, p2);
            return p2;
        }
        return null;
    }

    @Override // tb.s4c
    public void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a9c10", new Object[]{this});
        }
    }

    @Override // tb.pab
    public void g(String str, long j, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a033a99", new Object[]{this, str, new Long(j), str2});
            return;
        }
        ckf.g(str, "stageName");
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.d(str, j);
                return;
            }
            return;
        }
        int hashCode = str2.hashCode();
        if (hashCode != 96673) {
            if (hashCode == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
                K1.d(str, j);
            }
        } else if (str2.equals("all")) {
            zoc L12 = L1();
            if (L12 != null) {
                L12.d(str, j);
            }
            zoc K12 = K1();
            if (K12 != null) {
                K12.d(str, j);
            }
        }
    }

    @Override // tb.pab
    public void g0(String str, String str2, String str3) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34002bdb", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "stageName");
        ckf.g(str2, BaseMnnRunUnit.KEY_TASK_NAME);
        if (str3 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.i(str, this.f.get(str2));
            }
        } else if (str3.hashCode() == 570398262 && str3.equals("interact") && (K1 = K1()) != null) {
            K1.i(str, this.g.get(str2));
        }
    }

    public final String g1(TabModel tabModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a71ca157", new Object[]{this, tabModel});
        }
        return tabModel.getPageName() + "@" + tabModel.getId();
    }

    @Override // tb.pab
    public void h(String str, boolean z, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829d2b00", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.f(this.f.get(str), z);
            }
        } else if (str2.hashCode() == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
            K1.f(this.g.get(str), z);
        }
    }

    @Override // tb.pab
    public void j(boolean z, String str, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63875880", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        ckf.g(str, "code");
        pab.b.g(this, "abtest_bucket", T0(), null, 4, null);
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.q(z, str);
                return;
            }
            return;
        }
        int hashCode = str2.hashCode();
        if (hashCode != 96673) {
            if (hashCode == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
                K1.q(z, str);
            }
        } else if (str2.equals("all")) {
            zoc L12 = L1();
            if (L12 != null) {
                L12.q(z, str);
            }
            zoc K12 = K1();
            if (K12 != null) {
                K12.q(z, str);
            }
        }
    }

    @Override // tb.pab
    public void k0(String str, String str2, boolean z, String str3) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7739bb", new Object[]{this, str, str2, new Boolean(z), str3});
            return;
        }
        ckf.g(str, "stageName");
        ckf.g(str2, BaseMnnRunUnit.KEY_TASK_NAME);
        if (str3 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.t(str, z, this.f.get(str2));
            }
        } else if (str3.hashCode() == 570398262 && str3.equals("interact") && (K1 = K1()) != null) {
            K1.t(str, z, this.g.get(str2));
        }
    }

    @Override // tb.pab
    public void l(String str, boolean z, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548e3db7", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        ckf.g(str, "stageName");
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.j(str, z);
                return;
            }
            return;
        }
        int hashCode = str2.hashCode();
        if (hashCode != 96673) {
            if (hashCode == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
                K1.j(str, z);
            }
        } else if (str2.equals("all")) {
            zoc L12 = L1();
            if (L12 != null) {
                L12.j(str, z);
            }
            zoc K12 = K1();
            if (K12 != null) {
                K12.j(str, z);
            }
        }
    }

    @Override // tb.pab
    public void m(boolean z, String str, long j, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ca9f98", new Object[]{this, new Boolean(z), str, new Long(j), str2});
            return;
        }
        ckf.g(str, "code");
        pab.b.g(this, "abtest_bucket", T0(), null, 4, null);
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.e(z, j, str);
                return;
            }
            return;
        }
        int hashCode = str2.hashCode();
        if (hashCode != 96673) {
            if (hashCode == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
                K1.e(z, j, str);
            }
        } else if (str2.equals("all")) {
            zoc L12 = L1();
            if (L12 != null) {
                L12.e(z, j, str);
            }
            zoc K12 = K1();
            if (K12 != null) {
                K12.e(z, j, str);
            }
        }
    }

    @Override // tb.s4c
    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed282401", new Object[]{this});
        } else {
            z0("page_on_appear", "all");
        }
    }

    @Override // tb.pab
    public void n(String str, Object obj, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3117006", new Object[]{this, str, obj, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(obj, "value");
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.k(str, obj);
                return;
            }
            return;
        }
        int hashCode = str2.hashCode();
        if (hashCode != 96673) {
            if (hashCode == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
                K1.k(str, obj);
            }
        } else if (str2.equals("all")) {
            zoc L12 = L1();
            if (L12 != null) {
                L12.k(str, obj);
            }
            zoc K12 = K1();
            if (K12 != null) {
                K12.k(str, obj);
            }
        }
    }

    @Override // tb.pab
    public IPage o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("c71f6329", new Object[]{this, str});
        }
        ckf.g(str, pl4.KEY_PAGE_ID);
        return this.b.get(str);
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f26007a = qpuVar;
        xwc xwcVar = (xwc) qpuVar.getService(xwc.class);
        xwcVar.Y().t(this);
        xwcVar.Y().u(this);
        ((tjb) qpuVar.getService(tjb.class)).B(this);
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
        ud0.a aVar = ud0.Companion;
        lpb b2 = aVar.b();
        Boolean bool = Boolean.FALSE;
        if (((Boolean) b2.c("tnode.enableMtsMeter", bool)).booleanValue()) {
            this.h = huh.h().c(SCENE_NAME, "firstScreen", null);
        }
        if (((Boolean) aVar.b().c("tnode.enableInteractMtsMeter", bool)).booleanValue()) {
            this.i = huh.h().c(SCENE_NAME, MTS_INTERACT_METRIC_NAME, null);
        }
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        xwc xwcVar = (xwc) qpuVar.getService(xwc.class);
        xwcVar.Y().v(this);
        xwcVar.Y().w(this);
        ((tjb) qpuVar.getService(tjb.class)).L(this);
        ((b7d) qpuVar.getService(b7d.class)).T0(this);
        for (IPage iPage : this.b.values()) {
            ckf.f(iPage, "page");
            iPage.e().onPageDestroy();
        }
        this.b.clear();
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        } else {
            com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().m("video");
        }
    }

    @Override // tb.hvd
    public void onTabChanged(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
        } else if (i == 1) {
            f21.f18953a = System.currentTimeMillis();
            f21.i(f21.TASK_ICON_CLICK);
            od0 D = od0.D();
            ckf.f(D, "AdapterFactory.instance()");
            fhb f = D.f();
            ckf.f(f, "application");
            f21.o(f21.TASK_ICON_CLICK, new JSONObject(f.P()));
        }
    }

    @Override // tb.byd
    public void onTabDestroy(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238822e6", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        IPage iPage = this.b.get(str);
        if (iPage != null) {
            iPage.e().onPageDestroy();
        } else {
            tpu.a.b(tpu.Companion, "APMService", "onAPMPageDisappear, page is null, tabId: ".concat(str), null, 4, null);
        }
    }

    @Override // tb.byd
    public void onTabPause(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e8faea", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        IPage iPage = this.b.get(str);
        if (iPage != null) {
            iPage.e().onPageDisappear();
        } else {
            tpu.a.b(tpu.Companion, "APMService", "onAPMPageDisappear, page is null, tabId: ".concat(str), null, 4, null);
        }
    }

    @Override // tb.byd
    public void onTabResume(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13a9fe7", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        IPage iPage = this.b.get(str);
        if (iPage != null) {
            iPage.e().onPageAppear();
        } else {
            tpu.a.b(tpu.Companion, "APMService", "onAPMPageAppear, page is null, tabId: ".concat(str), null, 4, null);
        }
    }

    @Override // tb.byd
    public void onTabStart(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e92eefe", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
    }

    @Override // tb.byd
    public void onTabStop(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2452dff2", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        if (((Boolean) ud0.Companion.b().c("tnode.enableMTSTrack", Boolean.TRUE)).booleanValue()) {
            zrt.Companion.b(new b());
        }
    }

    @Override // tb.ujb
    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cacfd02", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.tao.navigation.a.g
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        }
    }

    public void z0(String str, String str2) {
        zoc K1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3ed95f", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "stageName");
        if (str2 == null) {
            zoc L1 = L1();
            if (L1 != null) {
                L1.g(str);
                return;
            }
            return;
        }
        int hashCode = str2.hashCode();
        if (hashCode != 96673) {
            if (hashCode == 570398262 && str2.equals("interact") && (K1 = K1()) != null) {
                K1.g(str);
            }
        } else if (str2.equals("all")) {
            zoc L12 = L1();
            if (L12 != null) {
                L12.g(str);
            }
            zoc K12 = K1();
            if (K12 != null) {
                K12.g(str);
            }
        }
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
            return;
        }
        f21.i(f21.TASK_PAGE_INIT);
        oy3.Companion.c();
        qpu qpuVar = this.f26007a;
        if (qpuVar != null) {
            n("enginePreload", Boolean.valueOf(((q2c) qpuVar.getService(q2c.class)).P0()), "all");
            l("page_on_create", true, "all");
            return;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        } else {
            l("page_on_start", true, "all");
        }
    }

    @Override // tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
            return;
        }
        C0("onStop", "all");
        n("tab2EndType", "onStop", "all");
        j(false, "onStop", "all");
        U0("all");
    }

    @Override // tb.pxd
    public void x(int i, String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d51c6d8", new Object[]{this, new Integer(i), str, new Integer(i2), str2});
        } else if (i != -1) {
            qpu qpuVar = this.f26007a;
            if (qpuVar != null) {
                TabModel d0 = ((xwc) qpuVar.getService(xwc.class)).d0(i2);
                if (d0 != null && ((Boolean) ud0.Companion.b().c("tnode.enableMTSTrack", Boolean.TRUE)).booleanValue()) {
                    try {
                        C0("changeTab", "all");
                        n("targetTab", d0.getId(), "all");
                        n("tab2EndType", "changeTab", "all");
                        j(false, "changeTab", "all");
                    } catch (Throwable th) {
                        tpu.a aVar = tpu.Companion;
                        tpu.a.b(aVar, "APMService", "onTabSelected error, " + th.getMessage(), null, 4, null);
                    }
                }
            } else {
                ckf.y("context");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e1() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.pc.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "36ffea91"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            java.lang.Boolean r2 = r7.d
            if (r2 != 0) goto L_0x0098
            java.lang.String r2 = tb.nca.h
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0082
            java.lang.String r3 = "appVersion"
            tb.ckf.f(r2, r3)
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = "\\."
            r3.<init>(r4)
            java.util.List r2 = r3.split(r2, r0)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0062
            int r3 = r2.size()
            java.util.ListIterator r3 = r2.listIterator(r3)
        L_0x0043:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r3.previous()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0056
            goto L_0x0043
        L_0x0056:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r3 = r3.nextIndex()
            int r3 = r3 + r1
            java.util.List r2 = tb.i04.v0(r2, r3)
            goto L_0x0066
        L_0x0062:
            java.util.List r2 = tb.yz3.i()
        L_0x0066:
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.Object[] r2 = r2.toArray(r3)
            if (r2 == 0) goto L_0x0079
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r2 = r2.length
            r3 = 4
            if (r2 < r3) goto L_0x0082
            r2 = 200(0xc8, float:2.8E-43)
            goto L_0x0083
        L_0x0079:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x0082:
            r2 = 1
        L_0x0083:
            double r3 = java.lang.Math.random()
            r5 = 1000(0x3e8, float:1.401E-42)
            double r5 = (double) r5
            double r3 = r3 * r5
            double r5 = (double) r2
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0092
            r0 = 1
        L_0x0092:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.d = r0
        L_0x0098:
            java.lang.Boolean r0 = r7.d
            tb.ckf.d(r0)
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pc.e1():boolean");
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
            return;
        }
        l("page_on_appear", true, "all");
        z0("first_frame", "all");
        if (this.e) {
            this.e = false;
            f21.o(f21.TASK_PAGE_INIT, null);
            qpu qpuVar = this.f26007a;
            if (qpuVar != null) {
                xwc xwcVar = (xwc) qpuVar.getService(xwc.class);
                TabModel d0 = xwcVar.d0(xwcVar.getCurrentIndex());
                if (d0 != null) {
                    n("initTab", d0.getId(), "all");
                    return;
                }
                return;
            }
            ckf.y("context");
            throw null;
        }
    }

    @Override // tb.byd
    public void onTabCreate(TabModel tabModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447fb771", new Object[]{this, tabModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(tabModel, "tabData");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        qpu qpuVar = this.f26007a;
        if (qpuVar != null) {
            String n = qpuVar.a().n();
            HashMap hashMap = new HashMap();
            boolean z = this.c;
            qpu qpuVar2 = this.f26007a;
            if (qpuVar2 != null) {
                Object f = qpuVar2.a().f();
                qpu qpuVar3 = this.f26007a;
                if (qpuVar3 != null) {
                    View b1 = ((xwc) qpuVar3.getService(xwc.class)).b1(tabModel.getId());
                    if (b1 == null) {
                        tpu.a aVar = tpu.Companion;
                        tpu.a.b(aVar, "APMService", "onTabCreate, rootView is null, tabId: " + tabModel.getId(), null, 4, null);
                        return;
                    }
                    if (!z || !(f instanceof Fragment)) {
                        IPage a2 = uml.c().a(b1, true);
                        M1(a2);
                        a2.e().a(g1(tabModel), n, hashMap);
                        iPage = a2;
                    } else {
                        iPage = uml.c().b((Fragment) f, g1(tabModel), n, b1, true);
                        M1(iPage);
                    }
                    if (z) {
                        iPage.d().a("isTNodeFirstPage", Boolean.TRUE);
                    }
                    if (f instanceof Fragment) {
                        iPage.d().a("isTNodeFragmentMode", Boolean.TRUE);
                        Bundle arguments = ((Fragment) f).getArguments();
                        ckf.d(arguments);
                        iPage.d().a("isTNodeRecovery", Boolean.valueOf(arguments.getBoolean("isTNodeRecovery", false)));
                    }
                    this.c = false;
                    this.b.put(tabModel.getId(), iPage);
                    b1.setTag(dgw.APM_PAGE_ROOT_VIEW, Boolean.TRUE);
                    return;
                }
                ckf.y("context");
                throw null;
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }
}
