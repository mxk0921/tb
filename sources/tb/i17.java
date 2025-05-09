package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.tabs.TabLayout;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i17 implements r8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21030a;
    public final ze7 b;
    public final GalleryCore c;
    public boolean d;
    public TabLayout e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements TabLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1c8ee3b", new Object[]{this, fVar});
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c48ba408", new Object[]{this, fVar});
            } else if (!i17.d(i17.this)) {
                i17.e(i17.this).Q0(((och) fVar.h()).a());
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eca6e1a1", new Object[]{this, fVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f21032a;

        public b(View view) {
            this.f21032a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f21032a.requestLayout();
            }
        }
    }

    static {
        t2o.a(354418750);
        t2o.a(912262021);
    }

    public i17(Context context, ze7 ze7Var, GalleryCore galleryCore) {
        this.f21030a = context;
        this.b = ze7Var;
        this.c = galleryCore;
        f();
    }

    public static /* synthetic */ boolean d(i17 i17Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69e726bb", new Object[]{i17Var})).booleanValue();
        }
        return i17Var.d;
    }

    public static /* synthetic */ GalleryCore e(i17 i17Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GalleryCore) ipChange.ipc$dispatch("37a36bff", new Object[]{i17Var});
        }
        return i17Var.c;
    }

    @Override // tb.r8c
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ef110827", new Object[]{this});
        }
        return this.e;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        int i = R.layout.tt_detail_default_gallery_indicator;
        if (b5m.H().isI18nEdition()) {
            i = R.layout.i18n_tt_detail_default_gallery_indicator;
        }
        TabLayout tabLayout = (TabLayout) LayoutInflater.from(this.f21030a).inflate(i, (ViewGroup) this.c.h0().findViewById(R.id.fl_indicator_container), true).findViewById(R.id.tl_indicator_container);
        this.e = tabLayout;
        tabLayout.addOnTabSelectedListener((TabLayout.d) new a());
    }

    @Override // tb.r8c
    public void a(List<och> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963e28d7", new Object[]{this, list});
            return;
        }
        this.e.removeAllTabs();
        Feature feature = (Feature) this.b.e().f(Feature.class);
        boolean z = DataUtils.X(feature) || DataUtils.W(feature);
        this.d = z;
        if (z) {
            this.e.setVisibility(8);
        } else if (list == null || list.isEmpty() || list.size() == 1) {
            this.e.setVisibility(8);
        } else {
            String V = this.c.V();
            String X = this.c.X();
            int W = this.c.W();
            int i = R.layout.tt_detail_frame_indicator_item;
            if (b5m.H().isI18nEdition()) {
                i = R.layout.i18n_tt_detail_frame_indicator_item;
            }
            for (och ochVar : list) {
                String b2 = ochVar.b();
                if (W > 1 && TextUtils.equals(ochVar.a(), V) && !TextUtils.isEmpty(X)) {
                    b2 = b2 + "·" + X;
                }
                TabLayout tabLayout = this.e;
                TabLayout.f newTab = tabLayout.newTab();
                newTab.n(i);
                newTab.s(b2);
                newTab.r(ochVar);
                tabLayout.addTab(newTab);
            }
            this.e.setVisibility(0);
        }
    }

    @Override // tb.r8c
    public void c(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9a84ac", new Object[]{this, str});
        } else if (!this.d) {
            String X = this.c.X();
            int W = this.c.W();
            int tabCount = this.e.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                TabLayout.f tabAt = this.e.getTabAt(i);
                if (tabAt != null) {
                    och ochVar = (och) tabAt.h();
                    if (TextUtils.equals(ochVar.a(), str)) {
                        if (W > 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(ochVar.b());
                            if (!TextUtils.isEmpty(X)) {
                                str3 = "·" + X;
                            } else {
                                str3 = "";
                            }
                            sb.append(str3);
                            str2 = sb.toString();
                        } else {
                            str2 = ochVar.b();
                        }
                        if (!TextUtils.equals(tabAt.i(), str2)) {
                            tabAt.s(str2);
                            View d = tabAt.d();
                            if (d != null) {
                                d.post(new b(d));
                            }
                        }
                        if (!tabAt.j()) {
                            tabAt.l();
                        }
                    } else {
                        tabAt.s(ochVar.b());
                    }
                }
            }
        }
    }
}
