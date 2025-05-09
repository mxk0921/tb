package tb;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oqp extends sxh<FrameLayout, nqp, mqp, Void, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public kqp c;
    public phw d;
    public lqp e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else if (oqp.this.getView() != 0) {
                ((FrameLayout) oqp.this.getView()).addView(view, new FrameLayout.LayoutParams(-1, oqp.this.getActivity().getResources().getDimensionPixelSize(R.dimen.tbsearch_searchbar_height)));
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else if (oqp.this.getView() != 0) {
                ((FrameLayout) oqp.this.getView()).addView(view, oqp.v2(oqp.this, true));
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else if (oqp.this.getView() != 0) {
                ((FrameLayout) oqp.this.getView()).addView(view, oqp.v2(oqp.this, true));
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else if (oqp.this.getView() != 0) {
                ((FrameLayout) oqp.this.getView()).addView(view, oqp.v2(oqp.this, false));
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements kzn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.kzn
        public void a(phw<?, ? extends View, ?> phwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa7e6235", new Object[]{this, phwVar});
                return;
            }
            oqp.x2(oqp.this, phwVar);
            oqp.w2(oqp.this).attachToContainer();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else if (oqp.this.getView() != 0) {
                ((FrameLayout) oqp.this.getView()).addView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    static {
        t2o.a(815793300);
    }

    public oqp(Activity activity, ude udeVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, null, viewGroup, vfwVar);
        attachToContainer();
        D2();
    }

    public static /* synthetic */ Object ipc$super(oqp oqpVar, String str, Object... objArr) {
        if (str.hashCode() == 299066517) {
            super.onCtxPause();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/shop/widget/ShopSearchDoorWidget");
    }

    public static /* synthetic */ ViewGroup.MarginLayoutParams v2(oqp oqpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.MarginLayoutParams) ipChange.ipc$dispatch("ed7f3fb0", new Object[]{oqpVar, new Boolean(z)});
        }
        return oqpVar.A2(z);
    }

    public static /* synthetic */ phw w2(oqp oqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("269ee13d", new Object[]{oqpVar});
        }
        return oqpVar.d;
    }

    public static /* synthetic */ phw x2(oqp oqpVar, phw phwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("8403216", new Object[]{oqpVar, phwVar});
        }
        oqpVar.d = phwVar;
        return phwVar;
    }

    public final ViewGroup.MarginLayoutParams A2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.MarginLayoutParams) ipChange.ipc$dispatch("4cfe2c59", new Object[]{this, new Boolean(z)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (z) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = getActivity().getResources().getDimensionPixelSize(R.dimen.tbsearch_searchbar_height);
        }
        return layoutParams;
    }

    public SearchDoorContext B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorContext) ipChange.ipc$dispatch("59a3e179", new Object[]{this});
        }
        lqp lqpVar = this.e;
        if (lqpVar != null) {
            return lqpVar.f23517a;
        }
        return null;
    }

    public Map<String, String> C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a6d251f", new Object[]{this});
        }
        lqp lqpVar = this.e;
        if (lqpVar == null) {
            return null;
        }
        return lqpVar.v2();
    }

    public final void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e5fc86", new Object[]{this});
            return;
        }
        this.c = new kqp(getActivity(), this, u2(), null, new a());
        this.e = new lqp(getActivity(), this, u2(), null, new b());
        new use(getActivity(), this, B2(), (ViewGroup) getView(), new c(), u2()).attachToContainer();
        if (!l3p.INSTANCE.b()) {
            bcq.a().f(getActivity(), "tbsearch_remote");
            lzn.INSTANCE.g(z9u.SOURCE_SPEECH, new mzn(getActivity(), this, rqp.a(u2()), null, new d()), new e());
        }
        if (c().e() != null && (c().e().a() || c().e().b())) {
            new dr3(getActivity(), this, null, new f());
        }
        subscribeEvent(this);
    }

    public void E2(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        u2().n0(intent);
        kqp kqpVar = this.c;
        if (kqpVar != null) {
            kqpVar.A2(intent);
        }
        lqp lqpVar = this.e;
        if (lqpVar != null) {
            lqpVar.A2();
        }
    }

    public void F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8a3e4f", new Object[]{this});
            return;
        }
        kqp kqpVar = this.c;
        if (kqpVar != null && !this.f) {
            kqpVar.B2();
        }
    }

    public void G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8210a55", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), u2().l0());
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return oqp.class.getSimpleName();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        rqp.i(getView());
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View] */
    public void onEventMainThread(h0p h0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a1e124", new Object[]{this, h0pVar});
        } else {
            rqp.i(getView());
        }
    }

    /* renamed from: y2 */
    public mqp q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqp) ipChange.ipc$dispatch("229fdd7e", new Object[]{this});
        }
        return new mqp();
    }

    /* renamed from: z2 */
    public nqp s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nqp) ipChange.ipc$dispatch("21107522", new Object[]{this});
        }
        return new nqp();
    }

    public void onEventMainThread(w1p w1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c594fd", new Object[]{this, w1pVar});
        } else {
            this.f = w1pVar.f30400a;
        }
    }

    public void onEventMainThread(fbq fbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52f952d", new Object[]{this, fbqVar});
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("query", fbqVar.f19174a);
        sen.f("voice", arrayMap);
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put("from", "voice");
        arrayMap2.put("asrrn", fbqVar.b);
        rqp.n(u2(), getActivity(), fbqVar.f19174a, arrayMap2, this);
    }
}
