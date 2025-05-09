package com.taobao.android.fluid.business.videocollection.dramacollection;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.business.videocollection.PopupDialog;
import com.taobao.android.fluid.business.videocollection.common.view.CollectionTabLayout;
import com.taobao.android.fluid.business.videocollection.dramacollection.a;
import com.taobao.android.fluid.business.videocollection.dramacollection.view.DramaCollectionAdapter;
import com.taobao.android.fluid.business.videocollection.dramacollection.view.TopSlowSmoothScroller;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bob;
import tb.kon;
import tb.nwv;
import tb.nz3;
import tb.sv2;
import tb.sz3;
import tb.t2o;
import tb.yao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DramaPopContent implements bob, DramaCollectionAdapter.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f7718a;
    public final PopupDialog b;
    public TUrlImageView c;
    public TextView d;
    public TextView e;
    public View f;
    public ImageView g;
    public View h;
    public CollectionTabLayout i;
    public RecyclerView j;
    public DramaCollectionAdapter k;
    public com.taobao.android.fluid.framework.data.datamodel.a n;
    public List<Pair<Integer, Integer>> l = new ArrayList();
    public final DramaCollectionDataManager m = new DramaCollectionDataManager();
    public final CollectionTabLayout.g o = new e();
    public boolean p = true;
    public final RecyclerView.OnScrollListener q = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.fluid.business.videocollection.dramacollection.DramaPopContent.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass6 r5, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/videocollection/dramacollection/DramaPopContent$6");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 || i == 1) {
                DramaPopContent.r(DramaPopContent.this, false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (!DramaPopContent.q(DramaPopContent.this)) {
                int h = DramaPopContent.h(DramaPopContent.this, ((GridLayoutManager) DramaPopContent.g(DramaPopContent.this).getLayoutManager()).findFirstVisibleItemPosition());
                for (int i3 = 0; i3 < DramaPopContent.n(DramaPopContent.this).size(); i3++) {
                    Pair pair = (Pair) DramaPopContent.n(DramaPopContent.this).get(i3);
                    if (h >= ((Integer) pair.first).intValue() && h <= ((Integer) pair.second).intValue()) {
                        DramaPopContent.i(DramaPopContent.this).setScrollPosition(i3, true);
                        return;
                    }
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                DramaPopContent.e(DramaPopContent.this).s2(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                DramaPopContent.f(DramaPopContent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DramaPopContent dramaPopContent = DramaPopContent.this;
            DramaPopContent.k(dramaPopContent, DramaPopContent.j(dramaPopContent).d());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements sv2<yao<com.taobao.android.fluid.business.videocollection.dramacollection.a>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: b */
        public void a(yao<com.taobao.android.fluid.business.videocollection.dramacollection.a> yaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("850591d8", new Object[]{this, yaoVar});
            } else if (yaoVar.g()) {
                DramaPopContent.l(DramaPopContent.this, yaoVar.c());
                DramaPopContent.m(DramaPopContent.this, 1);
            } else {
                DramaPopContent.m(DramaPopContent.this, -1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements CollectionTabLayout.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.android.fluid.business.videocollection.common.view.CollectionTabLayout.g
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eec0d40b", new Object[]{this, new Integer(i)});
            } else if (i >= 0 && i < DramaPopContent.n(DramaPopContent.this).size()) {
                int intValue = ((Integer) ((Pair) DramaPopContent.n(DramaPopContent.this).get(i)).first).intValue();
                DramaPopContent dramaPopContent = DramaPopContent.this;
                DramaPopContent.p(dramaPopContent, DramaPopContent.o(dramaPopContent, intValue), true);
            }
        }
    }

    static {
        t2o.a(468713703);
        t2o.a(468713663);
        t2o.a(468713712);
    }

    public DramaPopContent(FluidContext fluidContext, PopupDialog popupDialog) {
        this.f7718a = fluidContext;
        this.b = popupDialog;
    }

    public static /* synthetic */ PopupDialog e(DramaPopContent dramaPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupDialog) ipChange.ipc$dispatch("db171c", new Object[]{dramaPopContent});
        }
        return dramaPopContent.b;
    }

    public static /* synthetic */ void f(DramaPopContent dramaPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988d22d1", new Object[]{dramaPopContent});
        } else {
            dramaPopContent.v();
        }
    }

    public static /* synthetic */ RecyclerView g(DramaPopContent dramaPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("ff94148a", new Object[]{dramaPopContent});
        }
        return dramaPopContent.j;
    }

    public static /* synthetic */ int h(DramaPopContent dramaPopContent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5f431f4", new Object[]{dramaPopContent, new Integer(i)})).intValue();
        }
        return dramaPopContent.u(i);
    }

    public static /* synthetic */ CollectionTabLayout i(DramaPopContent dramaPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectionTabLayout) ipChange.ipc$dispatch("e44ca424", new Object[]{dramaPopContent});
        }
        return dramaPopContent.i;
    }

    public static /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a j(DramaPopContent dramaPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("15147cc1", new Object[]{dramaPopContent});
        }
        return dramaPopContent.n;
    }

    public static /* synthetic */ void k(DramaPopContent dramaPopContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b7d19", new Object[]{dramaPopContent, str});
        } else {
            dramaPopContent.x(str);
        }
    }

    public static /* synthetic */ void l(DramaPopContent dramaPopContent, com.taobao.android.fluid.business.videocollection.dramacollection.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b186ec1", new Object[]{dramaPopContent, aVar});
        } else {
            dramaPopContent.t(aVar);
        }
    }

    public static /* synthetic */ void m(DramaPopContent dramaPopContent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c1cd56", new Object[]{dramaPopContent, new Integer(i)});
        } else {
            dramaPopContent.y(i);
        }
    }

    public static /* synthetic */ List n(DramaPopContent dramaPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("758cc25b", new Object[]{dramaPopContent});
        }
        return dramaPopContent.l;
    }

    public static /* synthetic */ int o(DramaPopContent dramaPopContent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e16decb", new Object[]{dramaPopContent, new Integer(i)})).intValue();
        }
        return dramaPopContent.s(i);
    }

    public static /* synthetic */ void p(DramaPopContent dramaPopContent, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ec3e5b", new Object[]{dramaPopContent, new Integer(i), new Boolean(z)});
        } else {
            dramaPopContent.w(i, z);
        }
    }

    public static /* synthetic */ boolean q(DramaPopContent dramaPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5813fbcd", new Object[]{dramaPopContent})).booleanValue();
        }
        return dramaPopContent.p;
    }

    public static /* synthetic */ boolean r(DramaPopContent dramaPopContent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c7bba31", new Object[]{dramaPopContent, new Boolean(z)})).booleanValue();
        }
        dramaPopContent.p = z;
        return z;
    }

    @Override // com.taobao.android.fluid.business.videocollection.dramacollection.view.DramaCollectionAdapter.b
    public void a(int i, a.C0415a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9157798d", new Object[]{this, new Integer(i), aVar});
            return;
        }
        String a2 = aVar.a();
        int b2 = aVar.b();
        nz3.l(this.f7718a, i, aVar.b());
        if (nz3.g(((IDataService) this.f7718a.getService(IDataService.class)).getCurrentMediaSetData()) == b2) {
            this.b.s2(false);
            return;
        }
        ((ICollectionService) this.f7718a.getService(ICollectionService.class)).updateDetailListAndScrollTo(a2, b2);
        this.b.s2(true);
    }

    @Override // tb.bob
    public void b(com.taobao.android.fluid.framework.data.datamodel.a aVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46dbb5f", new Object[]{this, aVar, map});
        } else if (aVar != null) {
            this.n = aVar;
            t(this.m.d(aVar));
            v();
        }
    }

    @Override // tb.bob
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f66f029", new Object[]{this});
            return;
        }
        DramaCollectionDataManager dramaCollectionDataManager = this.m;
        if (dramaCollectionDataManager != null) {
            dramaCollectionDataManager.c();
        }
    }

    @Override // tb.bob
    public void d(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e030105a", new Object[]{this, hVar});
        }
    }

    @Override // tb.bob
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.bob
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.fluid_sdk_collection_drama_dialog, viewGroup, false);
        ((ImageView) inflate.findViewById(R.id.collectionDialog_close)).setOnClickListener(new a());
        this.c = (TUrlImageView) inflate.findViewById(R.id.img_cover);
        this.d = (TextView) inflate.findViewById(R.id.tv_title);
        this.e = (TextView) inflate.findViewById(R.id.tv_subTitle);
        this.g = (ImageView) inflate.findViewById(R.id.img_listLoading);
        View findViewById = inflate.findViewById(R.id.layout_listError);
        this.f = findViewById;
        ViewProxy.setOnClickListener(findViewById, new b());
        this.h = inflate.findViewById(R.id.layout_listContent);
        CollectionTabLayout collectionTabLayout = (CollectionTabLayout) inflate.findViewById(R.id.tabbar);
        this.i = collectionTabLayout;
        collectionTabLayout.setOnTabSelectedListener(this.o);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv);
        this.j = recyclerView;
        recyclerView.addOnScrollListener(this.q);
        return inflate;
    }

    @Override // tb.bob
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final int s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2d3cd37", new Object[]{this, new Integer(i)})).intValue();
        }
        return i - 1;
    }

    public final int u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41c7b337", new Object[]{this, new Integer(i)})).intValue();
        }
        return i + 1;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9baa423b", new Object[]{this});
            return;
        }
        com.taobao.android.fluid.framework.data.datamodel.a aVar = this.n;
        if (aVar == null) {
            return;
        }
        if (this.m.f(aVar.d(), new d())) {
            y(1);
        } else {
            y(0);
        }
    }

    public final void w(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c3fb406", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            return;
        }
        if (z) {
            TopSlowSmoothScroller topSlowSmoothScroller = new TopSlowSmoothScroller(this.j.getContext());
            topSlowSmoothScroller.setTargetPosition(i);
            this.p = true;
            ((GridLayoutManager) this.j.getLayoutManager()).startSmoothScroll(topSlowSmoothScroller);
            return;
        }
        ((GridLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(i, 0);
    }

    public final void x(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649b47cb", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !sz3.a(this.m.e()) && this.j != null) {
            Iterator<a.C0415a> it = this.m.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    break;
                }
                a.C0415a next = it.next();
                if (TextUtils.equals(next.a(), str)) {
                    i = next.b();
                    break;
                }
            }
            if (i > 0) {
                this.k.Q(str);
                this.k.notifyDataSetChanged();
                w(s(i), false);
                for (int i2 = 0; i2 < ((ArrayList) this.l).size(); i2++) {
                    Pair pair = (Pair) ((ArrayList) this.l).get(i2);
                    if (i >= ((Integer) pair.first).intValue() && i <= ((Integer) pair.second).intValue()) {
                        this.i.setScrollPosition(i2, false);
                        return;
                    }
                }
            }
        }
    }

    public final void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d7384d", new Object[]{this, new Integer(i)});
        } else if (i == -1) {
            this.g.setVisibility(8);
            this.f.setVisibility(0);
            this.h.setVisibility(8);
        } else if (i == 0) {
            this.g.setVisibility(0);
            this.f.setVisibility(8);
            this.h.setVisibility(8);
        } else if (i == 1) {
            this.g.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(0);
        }
    }

    public final void t(com.taobao.android.fluid.business.videocollection.dramacollection.a aVar) {
        TUrlImageView tUrlImageView;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813dbf22", new Object[]{this, aVar});
        } else if (aVar != null && (tUrlImageView = this.c) != null) {
            tUrlImageView.setImageUrl(aVar.b());
            this.d.setText(aVar.d());
            if (aVar.a() > 0) {
                str = "共" + aVar.a() + "集";
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(aVar.c())) {
                str = str + " " + aVar.c();
            }
            this.e.setText(str);
            List<a.C0415a> e2 = aVar.e();
            if (!(e2 == null || e2.isEmpty() || this.j.getAdapter() != null)) {
                this.l = new ArrayList();
                int size = e2.size();
                int ceil = (int) Math.ceil((size * 1.0f) / 30.0f);
                for (int i = 1; i <= ceil; i++) {
                    ((ArrayList) this.l).add(new Pair(Integer.valueOf(((i - 1) * 30) + 1), Integer.valueOf(Math.min(size, i * 30))));
                }
                Iterator it = ((ArrayList) this.l).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    this.i.addTab(pair.first + "-" + pair.second);
                }
                if (aVar.a() <= 1) {
                    this.i.setVisibility(8);
                }
                DramaCollectionAdapter dramaCollectionAdapter = new DramaCollectionAdapter(e2, this);
                this.k = dramaCollectionAdapter;
                this.j.setAdapter(dramaCollectionAdapter);
                this.j.setLayoutManager(new GridLayoutManager(this.f7718a.getContext(), 6));
                if (this.n != null) {
                    nwv.y0(new c());
                }
            }
        }
    }
}
