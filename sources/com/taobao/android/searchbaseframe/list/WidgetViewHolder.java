package com.taobao.android.searchbaseframe.list;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.abx;
import tb.acx;
import tb.hj8;
import tb.lib;
import tb.nde;
import tb.t2o;
import tb.ude;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class WidgetViewHolder<BEAN, MODEL> extends RecyclerView.ViewHolder implements nde {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f9341a;
    public final ude b;
    public final ListStyle d;
    public final int e;
    public BEAN f;
    public BEAN h;
    public final yko j;
    public final MODEL k;
    public final Set<Object> c = new HashSet();
    public int g = -1;
    public int i = -1;

    static {
        t2o.a(993001836);
        t2o.a(993002006);
    }

    public WidgetViewHolder(View view, Activity activity, ude udeVar, ListStyle listStyle, int i, MODEL model) {
        super(view);
        boolean z;
        this.f9341a = activity;
        this.b = udeVar;
        this.e = i;
        this.d = listStyle;
        this.k = model;
        this.j = udeVar.getCore();
        boolean z2 = false;
        if (udeVar instanceof abx) {
            abx abxVar = (abx) udeVar;
            abxVar.addChild(this);
            new HashSet(abxVar.getScopes().size()).addAll(abxVar.getScopes());
        } else {
            new HashSet(0);
        }
        if (listStyle == ListStyle.LIST) {
            z = true;
        } else {
            z = false;
        }
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(view.getLayoutParams());
        layoutParams.setFullSpan((z || !F0()) ? true : z2);
        view.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ Object ipc$super(WidgetViewHolder widgetViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/list/WidgetViewHolder");
    }

    public void A0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e40efd", new Object[]{this, obj});
        } else {
            o0().obtainScopeEventBus().k(obj);
        }
    }

    public /* bridge */ /* synthetic */ acx B() {
        return (acx) l0();
    }

    public boolean B0(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4c9cf17", new Object[]{this, obj, str})).booleanValue();
        }
        nde g0 = g0(str);
        if (g0 == null) {
            return false;
        }
        g0.obtainScopeEventBus().k(obj);
        return true;
    }

    public final void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f63ad7", new Object[]{this});
            return;
        }
        y0();
        this.f = null;
        this.g = -1;
        this.h = null;
        this.i = -1;
    }

    public void D0(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f943243c", new Object[]{this, bean});
        } else {
            z0(bean);
        }
    }

    public void E0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204d3013", new Object[]{this, obj});
            return;
        }
        o0().obtainScopeEventBus().o(obj);
        ((HashSet) this.c).add(obj);
    }

    public boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("865bfd0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void b0(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee10baa", new Object[]{this, new Integer(i), bean});
            return;
        }
        this.h = this.f;
        this.i = this.g;
        this.f = bean;
        this.g = i;
        u0(i, bean);
    }

    public final yko c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("827434f7", new Object[]{this});
        }
        return this.j;
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bc9fae", new Object[]{this});
        } else {
            C0();
        }
    }

    @Override // tb.nde
    public final void destroyAndRemoveFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cd83c", new Object[]{this});
            return;
        }
        e0();
        ude udeVar = this.b;
        if (udeVar instanceof abx) {
            ((abx) udeVar).removeChild(this);
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9743c3e9", new Object[]{this})).intValue();
        }
        return this.itemView.getTop();
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a20b12a", new Object[]{this});
            return;
        }
        hj8 obtainScopeEventBus = o0().obtainScopeEventBus();
        Iterator it = ((HashSet) this.c).iterator();
        while (it.hasNext()) {
            obtainScopeEventBus.s(it.next());
        }
        v0();
    }

    public JSONObject f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("980ff734", new Object[]{this});
        }
        return new JSONObject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [tb.nde] */
    /* JADX WARN: Type inference failed for: r0v3, types: [tb.nde] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [tb.nde] */
    public nde g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nde) ipChange.ipc$dispatch("d707514b", new Object[]{this, str});
        }
        WidgetViewHolder<BEAN, MODEL> widgetViewHolder = this;
        while (!TextUtils.equals(widgetViewHolder.getScopeTag(), str)) {
            ude parent = widgetViewHolder.getParent();
            if (parent instanceof nde) {
                widgetViewHolder = (nde) parent;
                continue;
            } else {
                widgetViewHolder = 0;
                continue;
            }
            if (widgetViewHolder == 0) {
                break;
            }
        }
        return widgetViewHolder;
    }

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f9341a;
    }

    public final yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return this.j;
    }

    public final BEAN getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BEAN) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.nde
    public final ude getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ude) ipChange.ipc$dispatch("65261d7c", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.nde
    public final String getScopeTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53eba25d", new Object[]{this});
        }
        return null;
    }

    public int h0() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b0a7360", new Object[]{this})).intValue();
        }
        if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE || this.d == ListStyle.LIST || (viewGroup = (ViewGroup) this.itemView.getParent()) == null || this.itemView.getLeft() + (this.itemView.getWidth() / 2) < viewGroup.getWidth() / 2) {
            return 0;
        }
        return 1;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
        }
    }

    public final int i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94dbdd63", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public final ListStyle j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("fbfbe301", new Object[]{this});
        }
        return this.d;
    }

    public abstract String k0();

    public MODEL l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MODEL) ipChange.ipc$dispatch("b4c825f8", new Object[]{this});
        }
        return this.k;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c591371", new Object[]{this});
        }
    }

    public BEAN m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BEAN) ipChange.ipc$dispatch("92adb230", new Object[]{this});
        }
        return this.h;
    }

    public int n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afbe16fe", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public nde o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nde) ipChange.ipc$dispatch("ce1f4f40", new Object[]{this});
        }
        nde ndeVar = this;
        while (true) {
            ude parent = ndeVar.getParent();
            if (!(parent instanceof nde)) {
                return ndeVar;
            }
            ndeVar = (nde) parent;
        }
    }

    @Override // tb.nde
    public final hj8 obtainScopeEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hj8) ipChange.ipc$dispatch("60092b94", new Object[]{this});
        }
        return null;
    }

    @Override // tb.nde
    public final void onCtxDestroyInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92298f6", new Object[]{this});
        } else {
            i();
        }
    }

    @Override // tb.nde
    public final void onCtxPauseInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690eaf2", new Object[]{this});
        } else {
            w0();
        }
    }

    @Override // tb.nde
    public final void onCtxResumeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd57b79", new Object[]{this});
        } else {
            r();
        }
    }

    @Override // tb.nde
    public void onCtxStopInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da57fdce", new Object[]{this});
        } else {
            m();
        }
    }

    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5366266", new Object[]{this});
            return;
        }
        this.itemView.setAlpha(0.0f);
        this.itemView.invalidate();
    }

    @Override // tb.nde
    public void printTree(StringBuilder sb, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bc8aa", new Object[]{this, sb, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append(k0());
        sb.append('\n');
    }

    public void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6f2d2b", new Object[]{this});
            return;
        }
        this.itemView.setAlpha(1.0f);
        this.itemView.invalidate();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
        }
    }

    public void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29fdff", new Object[]{this});
        } else {
            t0();
        }
    }

    public void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeeaee7c", new Object[]{this});
        } else {
            x0();
        }
    }

    @Override // tb.nde
    public final <T> T searchWidgetInSubTree(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ac60b709", new Object[]{this, cls});
        }
        if (cls.isInstance(this)) {
            return cls.cast(this);
        }
        return null;
    }

    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else if (getParent() instanceof lib) {
            ((lib) getParent()).n(this, i0());
        }
    }

    @Override // tb.nde
    public final boolean travel(nde.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d20179", new Object[]{this, aVar})).booleanValue();
        }
        return aVar.c(this);
    }

    public abstract void u0(int i, BEAN bean);

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d14e24b", new Object[]{this})).intValue();
        }
        return this.itemView.getBottom();
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
        }
    }

    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
        }
    }

    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else if (getParent() instanceof lib) {
            ((lib) getParent()).A(this, i0());
        }
    }

    public void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3dfe3b", new Object[]{this});
        }
    }

    public void z0(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971a19dd", new Object[]{this, bean});
        }
    }
}
