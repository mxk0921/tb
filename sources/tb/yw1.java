package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.acx;
import tb.jib;
import tb.kib;
import tb.nde;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class yw1<V extends View, IV extends kib, IP extends jib, MODEL extends acx<? extends o02<? extends BaseSearchResult, ?>>> extends b12<V, IV, IP, acx<? extends o02<? extends BaseSearchResult, ?>>, Void> implements lib<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public nde c;
    public nde d;
    public nde e;
    public nde f;
    public final List<PartnerRecyclerView.a> g = new ArrayList();
    public boolean h = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                ((kib) yw1.this.t2()).addHeaderView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
                return;
            }
            throw new IllegalStateException("don't remove header");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                ((kib) yw1.this.t2()).addFooterView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
                return;
            }
            throw new IllegalStateException("don't remove footer");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                ((kib) yw1.this.t2()).addFooterView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
                return;
            }
            throw new IllegalStateException("don't remove footer");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                ((kib) yw1.this.t2()).addFooterView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
                return;
            }
            throw new IllegalStateException("don't remove footer");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends nde.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f32384a = 0;

        public e(yw1 yw1Var) {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/common/list/BaseListWidget$5");
        }

        @Override // tb.nde.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31e4270d", new Object[]{this});
            } else {
                this.f32384a--;
            }
        }

        @Override // tb.nde.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b35649e9", new Object[]{this});
            } else {
                this.f32384a++;
            }
        }

        @Override // tb.nde.a
        public boolean c(nde ndeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ede06a15", new Object[]{this, ndeVar})).booleanValue();
            }
            if (this.f32384a == 1 && (ndeVar instanceof WidgetViewHolder)) {
                ((WidgetViewHolder) ndeVar).p0();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends nde.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f32385a = 0;

        public f(yw1 yw1Var) {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/common/list/BaseListWidget$6");
        }

        @Override // tb.nde.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31e4270d", new Object[]{this});
            } else {
                this.f32385a--;
            }
        }

        @Override // tb.nde.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b35649e9", new Object[]{this});
            } else {
                this.f32385a++;
            }
        }

        @Override // tb.nde.a
        public boolean c(nde ndeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ede06a15", new Object[]{this, ndeVar})).booleanValue();
            }
            if (this.f32385a == 1 && (ndeVar instanceof WidgetViewHolder)) {
                ((WidgetViewHolder) ndeVar).q0();
            }
            return true;
        }
    }

    static {
        t2o.a(993001641);
        t2o.a(993001650);
    }

    public yw1(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(yw1 yw1Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else if (hashCode == 1782635559) {
            super.onChildAdded((nde) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/business/common/list/BaseListWidget");
        }
    }

    @Override // tb.lib
    public void A(WidgetViewHolder<?, ?> widgetViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b489a3", new Object[]{this, widgetViewHolder, new Integer(i)});
        } else {
            ((jib) u2()).A(widgetViewHolder, i);
        }
    }

    public RecyclerView A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return ((kib) t2()).getRecyclerView();
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void B0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d87361", new Object[]{this, new Integer(i)});
            return;
        }
        postEvent(wxo.a(i));
        if (!((ArrayList) this.g).isEmpty()) {
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                ((PartnerRecyclerView.a) it.next()).B0(i);
            }
        }
    }

    public void B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2790f97", new Object[]{this});
            return;
        }
        this.h = true;
        travel(new e(this));
    }

    public abstract nde C2(x02 x02Var);

    public abstract nde D2(x02 x02Var);

    public abstract nde E2(x02 x02Var);

    public abstract nde F2(x02 x02Var);

    public void G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c4ccb5", new Object[]{this});
            return;
        }
        this.h = false;
        travel(new f(this));
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2386c72a", new Object[]{this});
        } else {
            ((jib) u2()).Q();
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92702da1", new Object[]{this, new Integer(i)});
        } else if (!((ArrayList) this.g).isEmpty()) {
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                ((PartnerRecyclerView.a) it.next()).U(i);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58927bd", new Object[]{this});
        } else if (!((ArrayList) this.g).isEmpty()) {
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                ((PartnerRecyclerView.a) it.next()).a();
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c87e87", new Object[]{this});
        } else if (!((ArrayList) this.g).isEmpty()) {
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                ((PartnerRecyclerView.a) it.next()).c1();
            }
        }
    }

    public void g(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd62a2c", new Object[]{this, wg3Var, new Integer(i)});
        } else {
            ((jib) u2()).g(wg3Var, i);
        }
    }

    public RecyclerView.Adapter getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("95b4241c", new Object[]{this});
        }
        return ((jib) u2()).getAdapter();
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "BaseListWidget";
    }

    public void j0(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3991fd42", new Object[]{this, wg3Var, new Integer(i)});
        } else {
            ((jib) u2()).j0(wg3Var, i);
        }
    }

    @Override // tb.lib
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115262f", new Object[]{this});
        } else {
            ((jib) u2()).k();
        }
    }

    @Override // tb.lib
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b927a9", new Object[]{this});
        } else {
            ((jib) u2()).l();
        }
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f18e32", new Object[]{this});
        } else if (!((ArrayList) this.g).isEmpty()) {
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                ((PartnerRecyclerView.a) it.next()).m0();
            }
        }
    }

    @Override // tb.lib
    public void n(WidgetViewHolder<?, ?> widgetViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c571931", new Object[]{this, widgetViewHolder, new Integer(i)});
        } else {
            ((jib) u2()).n(widgetViewHolder, i);
        }
    }

    @Override // tb.abx
    public void onChildAdded(nde ndeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40dc27", new Object[]{this, ndeVar});
            return;
        }
        super.onChildAdded(ndeVar);
        if ((ndeVar instanceof WidgetViewHolder) && this.h) {
            ((WidgetViewHolder) ndeVar).p0();
        }
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        ((jib) u2()).onPause();
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        ((jib) u2()).onResume();
    }

    public void q0(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78238e5e", new Object[]{this, wg3Var, new Integer(i)});
        } else {
            ((jib) u2()).q0(wg3Var, i);
        }
    }

    public void q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b3f7ae", new Object[]{this});
        } else if (!((ArrayList) this.g).isEmpty()) {
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                ((PartnerRecyclerView.a) it.next()).q1();
            }
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4389135", new Object[]{this});
            return;
        }
        postEvent(ayo.a(((kib) t2()).y()));
        if (!((ArrayList) this.g).isEmpty()) {
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                ((PartnerRecyclerView.a) it.next()).r();
            }
        }
    }

    @Override // tb.lib
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73091392", new Object[]{this});
        } else {
            ((jib) u2()).s();
        }
    }

    public void w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcb6057", new Object[]{this});
        } else {
            this.f = C2(v2().a(((kib) t2()).D()).b(new d()));
        }
    }

    public void x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("394915e2", new Object[]{this});
        } else {
            this.d = D2(v2().a(((kib) t2()).D()).b(new b()));
        }
    }

    public void y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37893c54", new Object[]{this});
        } else {
            this.c = E2(v2().a(((kib) t2()).B()).b(new a()));
        }
    }

    public void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a22b58b", new Object[]{this});
        } else {
            this.e = F2(v2().a(((kib) t2()).D()).b(new c()));
        }
    }
}
