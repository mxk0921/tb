package tb;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.view.EnhancedTabLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.f2e;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ops extends xv1<List<? extends TabModel>, FrameLayout> implements EnhancedTabLayout.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public EnhancedTabLayout c;
    public final List<tps> d = new ArrayList();
    public int e = -1;
    public TabModel f;
    public List<TabModel> g;
    public final l3u h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455694);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455693);
        t2o.a(916455773);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ops(qpu qpuVar, l3u l3uVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(l3uVar, "topBarRegistry");
        this.h = l3uVar;
    }

    public static /* synthetic */ Object ipc$super(ops opsVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1502133455:
                super.onStart((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 316403507:
                super.onStop((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/topbar/component/TabBarComponent");
        }
    }

    @Override // com.taobao.android.turbo.view.EnhancedTabLayout.c
    public void g(EnhancedTabLayout.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6d15dc", new Object[]{this, eVar});
        }
    }

    @Override // com.taobao.android.turbo.view.EnhancedTabLayout.c
    public void h(EnhancedTabLayout.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07cd982", new Object[]{this, eVar});
        } else if (eVar != null) {
            int d = eVar.d();
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "TabBarComponent", "Tab重复选中的时机，position=" + d, null, 4, null);
        }
    }

    public final tps m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tps) ipChange.ipc$dispatch("5f7cbfd2", new Object[]{this, new Integer(i)});
        }
        int size = ((ArrayList) this.d).size();
        if (i >= 0 && i < size) {
            return (tps) ((ArrayList) this.d).get(i);
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TabBarComponent", "获取子项组件时越界，position=" + i + ", size=" + size, null, 4, null);
        return null;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9954731f", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.d).size();
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        for (tps tpsVar : this.d) {
            tpsVar.onPause(iComponentLifecycle$TriggerType);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onResume(iComponentLifecycle$TriggerType);
        for (tps tpsVar : this.d) {
            tpsVar.onResume(iComponentLifecycle$TriggerType);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStart(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6774331", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStart(iComponentLifecycle$TriggerType);
        for (tps tpsVar : this.d) {
            tpsVar.onStart(iComponentLifecycle$TriggerType);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStop(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dbef33", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStop(iComponentLifecycle$TriggerType);
        for (tps tpsVar : this.d) {
            tpsVar.onStop(iComponentLifecycle$TriggerType);
        }
    }

    public final Map<String, Object> p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3c3217ad", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(mop.KEY_SELECTED_INDEX, (Object) Integer.valueOf(i));
        return v3i.f(jpu.a("utLogMap", jSONObject));
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edce44f6", new Object[]{this});
            return;
        }
        EnhancedTabLayout enhancedTabLayout = this.c;
        if (enhancedTabLayout != null) {
            enhancedTabLayout.setSelectedTabIndicatorHeight(0);
            enhancedTabLayout.addOnTabSelectedListener(this);
            if (this.g != null) {
                r(enhancedTabLayout);
                List<TabModel> list = this.g;
                ckf.d(list);
                l(enhancedTabLayout, list);
                this.g = null;
            }
        }
    }

    public final void r(EnhancedTabLayout enhancedTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b94ca7b", new Object[]{this, enhancedTabLayout});
            return;
        }
        tpu.a.b(tpu.Companion, "TabBarComponent", "移除子项", null, 4, null);
        enhancedTabLayout.removeAllTabs();
        for (tps tpsVar : this.d) {
            BaseComponent.State.a aVar = BaseComponent.State.Companion;
            if (aVar.a(getState())) {
                tpsVar.onPause(IComponentLifecycle$TriggerType.UNSPECIFIED);
            }
            if (aVar.d(getState())) {
                tpsVar.onStop(IComponentLifecycle$TriggerType.UNSPECIFIED);
            }
            tpsVar.onDestroy(IComponentLifecycle$TriggerType.UNSPECIFIED);
        }
        ((ArrayList) this.d).clear();
    }

    public final void t(int i, TabModel tabModel, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170f2392", new Object[]{this, new Integer(i), tabModel, new Integer(i2)});
        } else {
            f2e.a.a((f2e) k().getService(f2e.class), tabModel != null ? tabModel.getPageName() : null, "tab", n(i, tabModel, i2), tabModel != null ? tabModel.getSpm() : null, "topbar.11", false, 32, null);
        }
    }

    /* renamed from: v */
    public void updateDataImpl(List<TabModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36420cb", new Object[]{this, list});
            return;
        }
        ckf.g(list, "data");
        EnhancedTabLayout enhancedTabLayout = this.c;
        if (enhancedTabLayout != null) {
            r(enhancedTabLayout);
            l(enhancedTabLayout, list);
            return;
        }
        this.g = list;
    }

    public final void w(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2904ff2e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        aVar.c("TabBarComponent", "更新子项颜色，position=" + i + "，color=" + i2);
        tps m = m(i);
        if (m != null) {
            m.l(i2);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LayoutInflater.from(getContext()).inflate(R.layout.top_bar_tab_bar_layout, frameLayout);
        View findViewById = frameLayout.findViewById(R.id.tab_layout);
        if (findViewById != null) {
            this.c = (EnhancedTabLayout) findViewById;
            q();
            return frameLayout;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.view.EnhancedTabLayout");
    }

    public final void l(EnhancedTabLayout enhancedTabLayout, List<TabModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e5949", new Object[]{this, enhancedTabLayout, list});
            return;
        }
        tpu.a.b(tpu.Companion, "TabBarComponent", "添加子项", null, 4, null);
        for (TabModel tabModel : list) {
            tps tpsVar = new tps(k());
            IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.UNSPECIFIED;
            tpsVar.onCreate(tabModel, iComponentLifecycle$TriggerType);
            enhancedTabLayout.addTab(enhancedTabLayout.newTab((FrameLayout) tpsVar.createView()), false);
            BaseComponent.State.a aVar = BaseComponent.State.Companion;
            if (aVar.c(getState())) {
                tpsVar.onStart(iComponentLifecycle$TriggerType);
            }
            if (aVar.b(getState())) {
                tpsVar.onResume(iComponentLifecycle$TriggerType);
            }
            ((ArrayList) this.d).add(tpsVar);
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "TabBarComponent", "添加一个子项完成，itemComponent=" + tpsVar + "，id=" + tabModel.getId(), null, 4, null);
        }
    }

    public final Map<String, Object> n(int i, TabModel tabModel, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71b47852", new Object[]{this, new Integer(i), tabModel, new Integer(i2)});
        }
        JSONObject jSONObject = new JSONObject();
        String str = null;
        jSONObject.put("id", (Object) (tabModel != null ? tabModel.getId() : null));
        if (tabModel != null) {
            str = tabModel.getName();
        }
        jSONObject.put("name", (Object) str);
        jSONObject.put(nz3.X_POSITION, (Object) Integer.valueOf(i + 1));
        jSONObject.put(mop.KEY_SELECTED_INDEX, (Object) Integer.valueOf(i2));
        return v3i.f(jpu.a("utLogMap", jSONObject));
    }

    @Override // com.taobao.android.turbo.view.EnhancedTabLayout.c
    public void f(EnhancedTabLayout.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f4bbd5", new Object[]{this, eVar});
        } else if (eVar != null) {
            int d = eVar.d();
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "TabBarComponent", "Tab选中的时机，lastPosition=" + this.e + "，position=" + d, null, 4, null);
            tps m = m(this.e);
            tps m2 = m(d);
            if (m != null) {
                m.n(false);
            }
            if (m2 != null) {
                m2.n(true);
            }
            int i = this.e;
            if (i != d) {
                this.h.a(i, d);
                ((xwc) k().getService(xwc.class)).selectTab(d);
            }
            int i2 = this.e;
            if (i2 == -1) {
                u(d);
            } else {
                t(i2, this.f, d);
            }
            this.e = d;
            this.f = m2 != null ? m2.getData() : null;
        }
    }

    public final boolean s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d23be91", new Object[]{this, new Integer(i)})).booleanValue();
        }
        EnhancedTabLayout enhancedTabLayout = this.c;
        EnhancedTabLayout.e tabAt = enhancedTabLayout != null ? enhancedTabLayout.getTabAt(i) : null;
        if (tabAt == null) {
            tpu.a.b(tpu.Companion, "TabBarComponent", "选择指定子项，tab为空", null, 4, null);
            return false;
        } else if (tabAt.f()) {
            tpu.a.b(tpu.Companion, "TabBarComponent", "选择指定子项，指定子项已选中", null, 4, null);
            return false;
        } else {
            tabAt.h();
            return true;
        }
    }

    public final void u(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230d4857", new Object[]{this, new Integer(i)});
            return;
        }
        f2e f2eVar = (f2e) k().getService(f2e.class);
        List<? extends TabModel> data = getData();
        if (data != null) {
            for (Object obj : data) {
                i2++;
                if (i2 >= 0) {
                    f2eVar.D0("tab", n(i2, (TabModel) obj, i), "topbar.11");
                } else {
                    yz3.p();
                    throw null;
                }
            }
        }
        f2eVar.D0("picktab", p(i), "topbar.11");
    }
}
