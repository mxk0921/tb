package com.taobao.android.turbo.service.multitab.handler;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.service.multitab.adapter.MultiTabAdapter;
import com.taobao.android.turbo.utils.DeviceUtil;
import com.taobao.android.turbo.view.ScrollControlViewPager;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import tb.a07;
import tb.bbj;
import tb.c1c;
import tb.ckf;
import tb.did;
import tb.f2e;
import tb.jpu;
import tb.k1e;
import tb.kqs;
import tb.mqu;
import tb.nuo;
import tb.q2c;
import tb.qpu;
import tb.t2o;
import tb.tjb;
import tb.tpu;
import tb.vmd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TabLifecycleHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public ScrollControlViewPager f9764a;
    public MultiTabAdapter b;
    public final qpu c;
    public final kqs d;
    public final bbj e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455559);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455558);
    }

    public TabLifecycleHandler(qpu qpuVar, kqs kqsVar, bbj bbjVar) {
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(kqsVar, "tabComponentManager");
        ckf.g(bbjVar, "multiTabRegistry");
        this.c = qpuVar;
        this.d = kqsVar;
        this.e = bbjVar;
    }

    public final String a() {
        int i;
        TabModel tabModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a5d090c", new Object[]{this});
        }
        ScrollControlViewPager scrollControlViewPager = this.f9764a;
        if (scrollControlViewPager != null) {
            i = scrollControlViewPager.getCurrentItem();
        } else {
            i = -1;
        }
        MultiTabAdapter multiTabAdapter = this.b;
        if (multiTabAdapter != null) {
            tabModel = multiTabAdapter.i(i);
        } else {
            tabModel = null;
        }
        if (tabModel != null) {
            return tabModel.getId();
        }
        return null;
    }

    public final void b(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75066bd6", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        this.d.i(iComponentLifecycle$TriggerType);
        MultiTabAdapter multiTabAdapter = this.b;
        if (multiTabAdapter != null) {
            set = multiTabAdapter.j();
        } else {
            set = null;
        }
        if (set != null) {
            for (String str : set) {
                this.e.d(str, iComponentLifecycle$TriggerType);
            }
        }
    }

    public final void c(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fc1b48", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        MultiTabAdapter multiTabAdapter = this.b;
        if (multiTabAdapter == null || (set = multiTabAdapter.j()) == null) {
            set = new LinkedHashSet<>();
        }
        for (String str : this.d.m(set, iComponentLifecycle$TriggerType)) {
            this.e.d(str, iComponentLifecycle$TriggerType);
        }
    }

    public final void d(TabModel tabModel, BaseSubPageComponent<TabModel, ?> baseSubPageComponent, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfeb5384", new Object[]{this, tabModel, baseSubPageComponent, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(tabModel, "tabData");
        ckf.g(baseSubPageComponent, "tabComponent");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        this.d.j(tabModel, baseSubPageComponent, iComponentLifecycle$TriggerType);
        this.e.b(tabModel, iComponentLifecycle$TriggerType);
    }

    public final void e(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555cd1a1", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        this.d.l(str, iComponentLifecycle$TriggerType);
        this.e.e(str, iComponentLifecycle$TriggerType);
    }

    public final void f(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f41a010", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        this.d.n(str, iComponentLifecycle$TriggerType);
        this.e.f(str, iComponentLifecycle$TriggerType);
        k(str);
    }

    public final void h(boolean z, String str, BaseComponent.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc8c577", new Object[]{this, new Boolean(z), str, state});
        } else if (str != null) {
            IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.TAB_SELECT;
            if (z) {
                BaseComponent.State.a aVar = BaseComponent.State.Companion;
                if (aVar.a(state)) {
                    e(str, iComponentLifecycle$TriggerType);
                    t();
                }
                if (aVar.d(state)) {
                    j(str, iComponentLifecycle$TriggerType);
                    return;
                }
                return;
            }
            BaseComponent.State.a aVar2 = BaseComponent.State.Companion;
            if (aVar2.c(state)) {
                i(str, iComponentLifecycle$TriggerType);
            }
            if (aVar2.b(state)) {
                q(str);
                u(str, iComponentLifecycle$TriggerType);
                f(str, iComponentLifecycle$TriggerType);
            }
        }
    }

    public final void i(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f06c5b5", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        this.d.o(str, iComponentLifecycle$TriggerType);
        this.e.i(str, iComponentLifecycle$TriggerType);
    }

    public final void j(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313dd65b", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        this.d.p(str, iComponentLifecycle$TriggerType);
        this.e.j(str, iComponentLifecycle$TriggerType);
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143c7766", new Object[]{this, str});
            return;
        }
        BaseSubPageComponent<TabModel, ?> b = this.d.b(str);
        if (b != null) {
            nuo X0 = ((vmd) this.c.getService(vmd.class)).X0(new TabLifecycleHandler$notifySubPageRefresh$schedulerMessage$1(str));
            if (X0 != null) {
                b.onRefresh(X0.a());
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "TabLifecycleNotifier", "notifySubPageRefresh " + X0, null, 4, null);
                return;
            }
            tpu.a.b(tpu.Companion, "TabLifecycleNotifier", "notifySubPageRefresh schedulerMessage is null", null, 4, null);
        }
    }

    public final void l(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51886595", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        b(iComponentLifecycle$TriggerType);
    }

    public final void m(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270cebd9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        String a2 = a();
        if (a2 != null) {
            e(a2, iComponentLifecycle$TriggerType);
            t();
        }
    }

    public final void n(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4486e6c", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        String a2 = a();
        if (a2 != null) {
            q(a2);
            u(a2, iComponentLifecycle$TriggerType);
            f(a2, iComponentLifecycle$TriggerType);
        }
    }

    public final void o(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75097ced", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        String a2 = a();
        if (a2 != null) {
            i(a2, iComponentLifecycle$TriggerType);
        }
    }

    public final void p(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87d8df7", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        String a2 = a();
        if (a2 != null) {
            j(a2, iComponentLifecycle$TriggerType);
        }
    }

    public final void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bbbbc5", new Object[]{this, str});
            return;
        }
        c1c c1cVar = (c1c) this.c.getService(c1c.class);
        k1e k1eVar = (k1e) this.c.getService(k1e.class);
        tjb tjbVar = (tjb) this.c.getService(tjb.class);
        c1cVar.k(true);
        c1cVar.V0();
        k1eVar.O();
        BaseSubPageComponent<TabModel, ?> b = this.d.b(str);
        if (b != null && !b.isCustomShareIcon()) {
            k1eVar.a();
        }
        if (this.c.a().r()) {
            k1eVar.showBackButton();
            return;
        }
        k1eVar.hideBackButton();
        tjb.a.a(tjbVar, true, false, 2, null);
    }

    public final void r(MultiTabAdapter multiTabAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d8ac0b", new Object[]{this, multiTabAdapter});
        } else {
            this.b = multiTabAdapter;
        }
    }

    public final void s(ScrollControlViewPager scrollControlViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b46cfe", new Object[]{this, scrollControlViewPager});
        } else {
            this.f9764a = scrollControlViewPager;
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62438112", new Object[]{this});
        } else {
            ((f2e) this.c.getService(f2e.class)).q0();
        }
    }

    public final void g(String str, String str2, BaseComponent.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe1043", new Object[]{this, str, str2, state});
            return;
        }
        ckf.g(state, "parentState");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TabLifecycleNotifier", "在Tab选中时通知，lastTabId=" + str + "，currentTabId=" + str2 + "，parentState=" + state, null, 4, null);
        if (!ckf.b(str, str2)) {
            h(true, str, state);
            h(false, str2, state);
        }
    }

    public final void u(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5474792", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        MultiTabAdapter multiTabAdapter = this.b;
        int h = multiTabAdapter != null ? multiTabAdapter.h(str) : -1;
        MultiTabAdapter multiTabAdapter2 = this.b;
        TabModel i = multiTabAdapter2 != null ? multiTabAdapter2.i(h) : null;
        int c = this.d.c(str);
        q2c q2cVar = (q2c) this.c.getService(q2c.class);
        did didVar = (did) this.c.getService(did.class);
        f2e f2eVar = (f2e) this.c.getService(f2e.class);
        Map k = kotlin.collections.a.k(jpu.a("id", i != null ? i.getId() : null), jpu.a("name", i != null ? i.getName() : null));
        k.putAll(this.c.a().h());
        k.putAll(f2eVar.M0());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) k).entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!mqu.Companion.k(value)) {
                if (value instanceof String) {
                    str2 = (String) value;
                } else {
                    str2 = JSON.toJSONString(value);
                }
                linkedHashMap.put(str3, str2);
            } else if (value != null) {
                linkedHashMap.put(str3, URLEncoder.encode((String) value, "UTF-8"));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        int i2 = c + 1;
        f2eVar.f1(kotlin.collections.a.j(jpu.a("scm", this.c.a().i()), jpu.a("tab_position", Integer.valueOf(h + 1)), jpu.a("tabURL", i != null ? i.getUrl() : null), jpu.a("preload", Boolean.valueOf(q2cVar.P0())), jpu.a("appearNum", Integer.valueOf(i2)), jpu.a("c_pv_id", Integer.valueOf(i2)), jpu.a("slide_down_cnt", 0), jpu.a("device_level", Integer.valueOf(DeviceUtil.Companion.a())), jpu.a("serverBottomTabType", didVar.F0()), jpu.a("utLogMap", JSON.toJSONString(linkedHashMap))), iComponentLifecycle$TriggerType);
    }
}
