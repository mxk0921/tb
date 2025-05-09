package com.alibaba.android.aura.service.render;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.render.layout.AURARenderContainerAdapter;
import com.alibaba.android.aura.service.render.layout.AURAVlayoutManager;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.bo;
import tb.ck;
import tb.fk;
import tb.hbb;
import tb.mcb;
import tb.mi;
import tb.ncb;
import tb.rbb;
import tb.t2o;
import tb.tcb;
import tb.th;
import tb.ucb;
import tb.vj;
import tb.wv;
import tb.yi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARecyclerViewProvider implements AURAVlayoutManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f2133a;
    public yi b;
    public AURARenderComponent c;
    public AURAGlobalData d;
    public hbb e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends wv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/AURARecyclerViewProvider$1");
        }

        @Override // tb.wv
        public void a(RecyclerView.LayoutManager layoutManager, Exception exc) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d965c85", new Object[]{this, layoutManager, exc});
            } else if (AURARecyclerViewProvider.a(AURARecyclerViewProvider.this) != null) {
                if (exc == null) {
                    str = "";
                } else {
                    str = exc.getMessage();
                }
                mi miVar = new mi(1, VirtualLayoutManager.TAG, "VirtualLayoutManagerException", str);
                miVar.g("itemCount", Integer.valueOf(layoutManager.getItemCount()));
                miVar.g("childCount", Integer.valueOf(layoutManager.getChildCount()));
                AURARecyclerViewProvider.a(AURARecyclerViewProvider.this).b(miVar);
            }
        }
    }

    static {
        t2o.a(80740528);
        t2o.a(80740568);
    }

    public static /* synthetic */ hbb a(AURARecyclerViewProvider aURARecyclerViewProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbb) ipChange.ipc$dispatch("689f9b8b", new Object[]{aURARecyclerViewProvider});
        }
        return aURARecyclerViewProvider.e;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e2d7ad", new Object[]{this});
        } else {
            p();
        }
    }

    public final void c(RecyclerView.OnScrollListener onScrollListener) {
        List<RecyclerView.OnScrollListener> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ac5107", new Object[]{this, onScrollListener});
        } else if (this.d != null && (h = h()) != null && !h.contains(onScrollListener)) {
            h.add(onScrollListener);
        }
    }

    public final RecyclerView d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("56b5b79e", new Object[]{this, context});
        }
        yi yiVar = this.b;
        if (yiVar != null) {
            for (ncb ncbVar : yiVar.f(ncb.class)) {
                RecyclerView containerView = ncbVar.getContainerView(context);
                if (containerView != null) {
                    return containerView;
                }
            }
        }
        return new RecyclerView(context);
    }

    public final RecyclerView e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("4aea47ae", new Object[]{this, context});
        }
        AURAVlayoutManager aURAVlayoutManager = new AURAVlayoutManager(context);
        aURAVlayoutManager.y0(this);
        AURARenderContainerAdapter aURARenderContainerAdapter = new AURARenderContainerAdapter(aURAVlayoutManager);
        RecyclerView d = d(context);
        r(d, aURAVlayoutManager);
        if (d.getLayoutParams() == null) {
            d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        d.setItemAnimator(null);
        d.setLayoutManager(aURAVlayoutManager.z0(d));
        d.setAdapter(aURARenderContainerAdapter);
        return d;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.d = null;
        g();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3462a25", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.f2133a;
        if (recyclerView != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof mcb) {
                ((mcb) adapter).destroy();
                this.f2133a = null;
            }
        }
    }

    public final List<RecyclerView.OnScrollListener> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("11434af", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData == null) {
            return null;
        }
        List<RecyclerView.OnScrollListener> list = (List) aURAGlobalData.get("renderRecyclerViewScrollListener", List.class);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.d.update("renderRecyclerViewScrollListener", arrayList);
        return arrayList;
    }

    public void i(yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a6e58e", new Object[]{this, yiVar});
        } else {
            this.b = yiVar;
        }
    }

    public void j(List<AURARenderComponent> list, List<com.alibaba.android.ultron.ext.vlayout.a> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af11b9ef", new Object[]{this, list, list2});
            return;
        }
        RecyclerView recyclerView = this.f2133a;
        if (recyclerView != null) {
            AURARenderContainerAdapter aURARenderContainerAdapter = (AURARenderContainerAdapter) recyclerView.getAdapter();
            aURARenderContainerAdapter.setData(list);
            aURARenderContainerAdapter.N(list2);
            aURARenderContainerAdapter.notifyDataSetChanged();
        }
    }

    public void k(AURARenderComponent aURARenderComponent, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d06add", new Object[]{this, aURARenderComponent, aURAGlobalData});
            return;
        }
        this.c = aURARenderComponent;
        this.d = aURAGlobalData;
    }

    public void l(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd702081", new Object[]{this, state});
            return;
        }
        yi yiVar = this.b;
        if (!(yiVar == null || this.f2133a == null)) {
            for (ucb ucbVar : yiVar.f(ucb.class)) {
                ucbVar.z(this.f2133a, state);
            }
        }
    }

    public View m(Context context, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("81217a95", new Object[]{this, context, recyclerView});
        }
        if (this.f2133a == null) {
            if (recyclerView == null) {
                this.f2133a = e(context);
            } else {
                this.f2133a = recyclerView;
            }
        }
        RecyclerView.LayoutManager layoutManager = this.f2133a.getLayoutManager();
        if (layoutManager instanceof AURAVlayoutManager) {
            AURAVlayoutManager aURAVlayoutManager = (AURAVlayoutManager) layoutManager;
            aURAVlayoutManager.y0(this);
            aURAVlayoutManager.Z(new a());
        } else if (th.c()) {
            throw new IllegalArgumentException("RecyclerView的LayoutManager必须设置AURAVlayoutManager类型");
        }
        n(this.f2133a);
        RecyclerView.Adapter adapter = this.f2133a.getAdapter();
        if (adapter instanceof AURARenderContainerAdapter) {
            ((AURARenderContainerAdapter) adapter).a0(this.b);
        }
        return this.f2133a;
    }

    public final void n(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ae80ec", new Object[]{this, recyclerView});
            return;
        }
        yi yiVar = this.b;
        if (yiVar != null) {
            final List f = yiVar.f(tcb.class);
            if (!f.isEmpty()) {
                o(recyclerView);
                RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener(this) { // from class: com.alibaba.android.aura.service.render.AURARecyclerViewProvider.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r5, String str, Object... objArr) {
                        int hashCode = str.hashCode();
                        if (hashCode == -1177043419) {
                            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                            return null;
                        } else if (hashCode == 1361287682) {
                            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                            return null;
                        } else {
                            int hashCode2 = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/render/AURARecyclerViewProvider$2");
                        }
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i)});
                            return;
                        }
                        super.onScrollStateChanged(recyclerView2, i);
                        for (tcb tcbVar : f) {
                            tcbVar.onScrollStateChanged(recyclerView2, i);
                        }
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                            return;
                        }
                        super.onScrolled(recyclerView2, i, i2);
                        for (tcb tcbVar : f) {
                            tcbVar.onScrolled(recyclerView2, i, i2);
                        }
                    }
                };
                recyclerView.addOnScrollListener(onScrollListener);
                c(onScrollListener);
            }
        }
    }

    public final void o(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8472ab", new Object[]{this, recyclerView});
            return;
        }
        List<RecyclerView.OnScrollListener> h = h();
        if (h != null) {
            for (RecyclerView.OnScrollListener onScrollListener : h) {
                recyclerView.removeOnScrollListener(onScrollListener);
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4ae7cf", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.f2133a;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof VirtualLayoutManager) {
                ((VirtualLayoutManager) layoutManager).x0(new vj(this.b, this.f2133a));
            }
        }
    }

    public void q(hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c400e61", new Object[]{this, hbbVar});
        } else {
            this.e = hbbVar;
        }
    }

    public final void r(RecyclerView recyclerView, VirtualLayoutManager virtualLayoutManager) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738727cf", new Object[]{this, recyclerView, virtualLayoutManager});
            return;
        }
        AURARenderComponent aURARenderComponent = this.c;
        if (aURARenderComponent != null && (aURARenderComponentData = aURARenderComponent.data) != null && (map = aURARenderComponentData.fields) != null) {
            String str = (String) fk.b(map, "direction", String.class, "");
            if ("horizontal".equalsIgnoreCase(str)) {
                virtualLayoutManager.setOrientation(0);
                virtualLayoutManager.s(false);
                virtualLayoutManager.u0(true);
            } else if ("vertical".equalsIgnoreCase(str)) {
                virtualLayoutManager.setOrientation(1);
                virtualLayoutManager.u0(false);
                virtualLayoutManager.s(true);
            }
            String str2 = (String) fk.b(map, "scrollMode", String.class, "");
            if ("page".equalsIgnoreCase(str2)) {
                if (th.c()) {
                    Context context = recyclerView.getContext();
                    bo.c(context, "已经不支持page模式：" + str2, 0);
                }
                rbb g = ck.g();
                g.e("已经不支持page模式：" + str2);
            }
        }
    }
}
