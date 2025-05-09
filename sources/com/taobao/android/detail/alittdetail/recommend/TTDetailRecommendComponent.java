package com.taobao.android.detail.alittdetail.recommend;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.RecommendRecyclerAdapter;
import tb.aos;
import tb.d11;
import tb.fnn;
import tb.hrj;
import tb.khd;
import tb.nb4;
import tb.nj7;
import tb.t2o;
import tb.tgh;
import tb.z4a;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailRecommendComponent extends hrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context c;
    public aos d;
    public fnn e;
    public RecyclerView f;
    public khd j;
    public boolean g = false;
    public final boolean h = true;
    public boolean i = false;
    public final RecyclerView.OnScrollListener k = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.detail.alittdetail.recommend.TTDetailRecommendComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            if (str.hashCode() == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alittdetail/recommend/TTDetailRecommendComponent$1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            TTDetailRecommendComponent.this.F();
        }
    };
    public final View.OnLayoutChangeListener l = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i3 - i;
            int i10 = i7 - i5;
            if (i9 != 0 && i9 != i10 && nj7.i(TTDetailRecommendComponent.y(TTDetailRecommendComponent.this))) {
                TTDetailRecommendComponent.z(TTDetailRecommendComponent.this).C(i9);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements khd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.khd
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            tgh.b("TTDetailRecommendComponent", "IRecommendCallback onError");
            TTDetailRecommendComponent.B(TTDetailRecommendComponent.this, false);
        }

        @Override // tb.khd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            TTDetailRecommendComponent.A(TTDetailRecommendComponent.this);
            TTDetailRecommendComponent.this.getClass();
        }
    }

    static {
        t2o.a(354418770);
    }

    public TTDetailRecommendComponent(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        this.c = context;
        D(nb4Var);
    }

    public static /* synthetic */ void A(TTDetailRecommendComponent tTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e323db98", new Object[]{tTDetailRecommendComponent});
        } else {
            tTDetailRecommendComponent.H();
        }
    }

    public static /* synthetic */ boolean B(TTDetailRecommendComponent tTDetailRecommendComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ba7cdd", new Object[]{tTDetailRecommendComponent, new Boolean(z)})).booleanValue();
        }
        tTDetailRecommendComponent.g = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(TTDetailRecommendComponent tTDetailRecommendComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alittdetail/recommend/TTDetailRecommendComponent");
    }

    public static /* synthetic */ Context y(TTDetailRecommendComponent tTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9867250e", new Object[]{tTDetailRecommendComponent});
        }
        return tTDetailRecommendComponent.c;
    }

    public static /* synthetic */ fnn z(TTDetailRecommendComponent tTDetailRecommendComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnn) ipChange.ipc$dispatch("828290d2", new Object[]{tTDetailRecommendComponent});
        }
        return tTDetailRecommendComponent.e;
    }

    public final khd C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khd) ipChange.ipc$dispatch("7208f50a", new Object[]{this});
        }
        return new b();
    }

    public void D(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63be2b8b", new Object[]{this, nb4Var});
            return;
        }
        JSONObject f = nb4Var.f();
        if (f != null) {
            aos a2 = aos.a(f);
            this.d = a2;
            if (a2 != null) {
                z4a d = z4a.d(a2.c);
                if (d == null) {
                    d = z4a.REC_DETAIL;
                    tgh.b("TTDetailRecommendComponent", "containerType is null, use default. channel : " + this.d.c);
                }
                E(this.c, d);
            }
        }
    }

    public final void E(Context context, z4a z4aVar) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4be65e", new Object[]{this, context, z4aVar});
        } else if (this.e == null) {
            try {
                this.e = fnn.e(z4aVar);
            } catch (Throwable unused) {
            }
            if (this.e != null) {
                if (this.j == null) {
                    this.j = C();
                }
                this.e.y(this.j);
                if (this.f == null) {
                    RecyclerView a2 = this.e.a(context);
                    this.f = a2;
                    a2.setOverScrollMode(2);
                    this.f.setVerticalScrollBarEnabled(false);
                    this.f.setFocusable(false);
                    this.f.setDescendantFocusability(393216);
                }
                if (this.h && (adapter = this.f.getAdapter()) != null && (adapter instanceof RecommendRecyclerAdapter)) {
                    ((RecommendRecyclerAdapter) this.f.getAdapter()).c0(0);
                }
            }
            H();
            if (nj7.i(this.c) && (recyclerView = this.f) != null) {
                recyclerView.addOnLayoutChangeListener(this.l);
            }
            RecyclerView recyclerView2 = this.f;
            if (recyclerView2 != null) {
                recyclerView2.addOnScrollListener(this.k);
            }
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafe9c13", new Object[]{this});
            return;
        }
        try {
            RecyclerView recyclerView = this.f;
            if (recyclerView instanceof ChildRecyclerView) {
                ((ChildRecyclerView) recyclerView).onScrolledByNestedParent(null);
            }
        } catch (Exception unused) {
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1e6e0", new Object[]{this});
            return;
        }
        aos aosVar = this.d;
        if (aosVar != null && !TextUtils.isEmpty(aosVar.d)) {
            aos aosVar2 = this.d;
            this.e.w(new d11(aosVar2.f15907a, aosVar2.b), aosVar2.e);
            this.g = true;
            this.i = true;
        }
    }

    public final void H() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
        } else if (this.e != null && (recyclerView = this.f) != null) {
            recyclerView.setVisibility(0);
            this.f.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // tb.hrj, tb.ozc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
        } else if (!this.i && !this.g && this.d != null) {
            G();
        }
    }

    @Override // tb.hrj, tb.ozc
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView recyclerView = this.f;
        if (recyclerView != null && recyclerView.getAdapter() != null && this.f.getAdapter().getItemCount() > 0) {
            if (i == Integer.MAX_VALUE) {
                RecyclerView recyclerView2 = this.f;
                recyclerView2.scrollToPosition(recyclerView2.getAdapter().getItemCount() - 1);
                return;
            }
            this.f.scrollToPosition(i);
        }
    }

    @Override // tb.oa4
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        fnn fnnVar = this.e;
        if (fnnVar != null) {
            fnnVar.c();
            this.j = null;
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                recyclerView.removeOnLayoutChangeListener(this.l);
            }
            RecyclerView recyclerView2 = this.f;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.k);
            }
        }
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
        } else if (!this.i) {
            a();
        }
    }

    @Override // tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return this.f;
    }

    @Override // tb.hrj, tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.hrj
    public TTDetailScrollerLayout.LayoutParams u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("99746aed", new Object[]{this});
        }
        return new TTDetailScrollerLayout.LayoutParams(-1, -1);
    }
}
