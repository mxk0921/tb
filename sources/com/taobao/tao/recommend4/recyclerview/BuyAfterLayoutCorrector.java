package com.taobao.tao.recommend4.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bqa;
import tb.e5e;
import tb.lhd;
import tb.m5a;
import tb.t2o;
import tb.wpk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BuyAfterLayoutCorrector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView.OnScrollListener f12690a;
    public wpk b;
    public e5e.a c;
    public final HomeChildRecyclerView d;
    public final lhd e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements wpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeChildRecyclerView f12691a;

        public a(HomeChildRecyclerView homeChildRecyclerView) {
            this.f12691a = homeChildRecyclerView;
        }

        @Override // tb.wpk
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
                return;
            }
            BuyAfterLayoutCorrector.a(BuyAfterLayoutCorrector.this, this.f12691a);
            bqa.d("BuyAfterCorrectLayoutController", "校准布局2");
        }

        @Override // tb.wpk
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements e5e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeChildRecyclerView f12692a;

        public b(HomeChildRecyclerView homeChildRecyclerView) {
            this.f12692a = homeChildRecyclerView;
        }

        @Override // tb.e5e.a
        public void a(boolean z, boolean z2, boolean z3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a612f0c9", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            } else if (!z) {
                BuyAfterLayoutCorrector.a(BuyAfterLayoutCorrector.this, this.f12692a);
                bqa.d("BuyAfterCorrectLayoutController", "校准布局3");
            }
        }

        @Override // tb.e5e.a
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeChildRecyclerView f12693a;

        public c(HomeChildRecyclerView homeChildRecyclerView) {
            this.f12693a = homeChildRecyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f12693a.invalidateItemDecorations();
            } catch (Throwable th) {
                bqa.d("BuyAfterCorrectLayoutController", "出现异常：" + th);
            }
        }
    }

    static {
        t2o.a(729810022);
    }

    public BuyAfterLayoutCorrector(HomeChildRecyclerView homeChildRecyclerView, lhd lhdVar) {
        this.d = homeChildRecyclerView;
        this.e = lhdVar;
        h(homeChildRecyclerView);
        g(homeChildRecyclerView);
        i(homeChildRecyclerView, lhdVar);
    }

    public static /* synthetic */ void a(BuyAfterLayoutCorrector buyAfterLayoutCorrector, HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc8caf", new Object[]{buyAfterLayoutCorrector, homeChildRecyclerView});
        } else {
            buyAfterLayoutCorrector.b(homeChildRecyclerView);
        }
    }

    public final void b(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e388eebd", new Object[]{this, homeChildRecyclerView});
        } else {
            m5a.a().g(new c(homeChildRecyclerView), 0L);
        }
    }

    public final wpk c(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wpk) ipChange.ipc$dispatch("db7e1e0f", new Object[]{this, homeChildRecyclerView});
        }
        return new a(homeChildRecyclerView);
    }

    public final RecyclerView.OnScrollListener d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("81c8a5c8", new Object[]{this});
        }
        return new RecyclerView.OnScrollListener(this) { // from class: com.taobao.tao.recommend4.recyclerview.BuyAfterLayoutCorrector.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/recyclerview/BuyAfterLayoutCorrector$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                try {
                    recyclerView.invalidateItemDecorations();
                    bqa.d("BuyAfterCorrectLayoutController", "布局校准1");
                } catch (Throwable th) {
                    bqa.b("BuyAfterCorrectLayoutController", "correctLayout error newState : " + i, th);
                }
            }
        };
    }

    public final e5e.a e(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e5e.a) ipChange.ipc$dispatch("faab02f2", new Object[]{this, homeChildRecyclerView});
        }
        return new b(homeChildRecyclerView);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        j(this.d);
        k(this.d);
        l(this.d, this.e);
    }

    public final void g(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee1caca", new Object[]{this, homeChildRecyclerView});
            return;
        }
        wpk c2 = c(homeChildRecyclerView);
        this.b = c2;
        homeChildRecyclerView.addLayoutListener(c2);
    }

    public final void h(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb945ec", new Object[]{this, homeChildRecyclerView});
            return;
        }
        RecyclerView.OnScrollListener d = d();
        this.f12690a = d;
        homeChildRecyclerView.addOnScrollListener(d);
    }

    public final void i(HomeChildRecyclerView homeChildRecyclerView, lhd lhdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33c73c4", new Object[]{this, homeChildRecyclerView, lhdVar});
            return;
        }
        e5e.a e = e(homeChildRecyclerView);
        this.c = e;
        lhdVar.c(e);
    }

    public final void j(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9ba83", new Object[]{this, homeChildRecyclerView});
            return;
        }
        wpk wpkVar = this.b;
        if (wpkVar != null) {
            homeChildRecyclerView.removeLayoutListener(wpkVar);
        }
    }

    public final void k(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4842b65", new Object[]{this, homeChildRecyclerView});
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = this.f12690a;
        if (onScrollListener != null) {
            homeChildRecyclerView.removeOnScrollListener(onScrollListener);
        }
    }

    public final void l(HomeChildRecyclerView homeChildRecyclerView, lhd lhdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5109ab", new Object[]{this, homeChildRecyclerView, lhdVar});
            return;
        }
        e5e.a aVar = this.c;
        if (aVar != null) {
            lhdVar.i(aVar);
        }
    }
}
