package com.taobao.android.detail.ttdetail.content;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.data.meta.Content;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.widget.TTDetailViewPager;
import com.taobao.taobao.R;
import tb.bq6;
import tb.bvk;
import tb.hi3;
import tb.nj7;
import tb.ntc;
import tb.pur;
import tb.q84;
import tb.t2o;
import tb.tq4;
import tb.tua;
import tb.yis;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HorizontalPageController implements ntc<hi3> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONTENT_PAGE_INDEX = 1;
    public static final int DETAIL_PAGE_INDEX = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6735a;
    public final ze7 b;
    public final View c;
    public final TTDetailViewPager d;
    public final HPagerAdapter e;
    public final b f;
    public yis g;
    public boolean h;
    public final bvk i = new a();
    public final SimpleEntry<Integer, Float> j;
    public final SimpleEntry<Integer, Float> k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class HPagerAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261524);
        }

        public HPagerAdapter() {
        }

        public static /* synthetic */ Object ipc$super(HPagerAdapter hPagerAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/content/HorizontalPageController$HPagerAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (obj instanceof View) {
                viewGroup.removeView((View) obj);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (HorizontalPageController.d(HorizontalPageController.this)) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            if (obj == HorizontalPageController.e(HorizontalPageController.this).a()) {
                return 0;
            }
            if (obj != HorizontalPageController.f(HorizontalPageController.this).a() || !HorizontalPageController.d(HorizontalPageController.this)) {
                return -2;
            }
            return 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            if (i == 0) {
                view = HorizontalPageController.e(HorizontalPageController.this).a();
            } else if (i == 1) {
                view = HorizontalPageController.f(HorizontalPageController.this).a();
            } else {
                view = null;
            }
            if (view != null) {
                viewGroup.addView(view);
            }
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            if (view == obj) {
                return true;
            }
            return false;
        }

        public /* synthetic */ HPagerAdapter(HorizontalPageController horizontalPageController, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
            } else if (obj2 instanceof Integer) {
                if (((Integer) obj2).intValue() == 1) {
                    HorizontalPageController.this.m();
                } else {
                    HorizontalPageController.this.o();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        View a();
    }

    static {
        t2o.a(912261521);
        t2o.a(912261362);
    }

    public HorizontalPageController(Context context, ze7 ze7Var, b bVar) {
        Float valueOf = Float.valueOf(0.0f);
        this.j = new SimpleEntry<>(0, valueOf);
        this.k = new SimpleEntry<>(0, valueOf);
        this.f6735a = context;
        this.b = ze7Var;
        this.f = bVar;
        A(context);
        if (!nj7.i(context)) {
            this.c = PreRenderManager.g(context).j(context, R.layout.tt_detail_horizontal_page_manager, null, true);
        } else {
            this.c = PreRenderManager.g(context).j(context, R.layout.tt_detail_horizontal_page_manager_pad, null, true);
        }
        TTDetailViewPager tTDetailViewPager = (TTDetailViewPager) this.c.findViewById(R.id.vp_hscroll_container);
        this.d = tTDetailViewPager;
        HPagerAdapter hPagerAdapter = new HPagerAdapter(this, null);
        this.e = hPagerAdapter;
        tTDetailViewPager.setAdapter(hPagerAdapter);
        tTDetailViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.android.detail.ttdetail.content.HorizontalPageController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f6736a = -1;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/content/HorizontalPageController$2");
            }

            public final SimpleEntry<Integer, Float> a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SimpleEntry) ipChange.ipc$dispatch("36caafb9", new Object[]{this});
                }
                if (((SimpleEntry) HorizontalPageController.a(HorizontalPageController.this).i().c("scrollOffset")) == HorizontalPageController.b(HorizontalPageController.this)) {
                    return HorizontalPageController.c(HorizontalPageController.this);
                }
                return HorizontalPageController.b(HorizontalPageController.this);
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    return;
                }
                if (i2 == 0 && this.f6736a != i) {
                    this.f6736a = i;
                    HorizontalPageController.a(HorizontalPageController.this).i().f("pageType", Integer.valueOf(i));
                    if (i == 0) {
                        HorizontalPageController.this.s();
                        HorizontalPageController.this.u();
                    } else if (i == 1) {
                        HorizontalPageController.this.B();
                        HorizontalPageController.this.r();
                        HorizontalPageController.this.v();
                    }
                }
                SimpleEntry<Integer, Float> a2 = a();
                a2.setKey(Integer.valueOf(i));
                a2.setValue(Float.valueOf(f));
                HorizontalPageController.a(HorizontalPageController.this).i().f("scrollOffset", a2);
            }
        });
    }

    public static /* synthetic */ ze7 a(HorizontalPageController horizontalPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("e5fe9b69", new Object[]{horizontalPageController});
        }
        return horizontalPageController.b;
    }

    public static /* synthetic */ SimpleEntry b(HorizontalPageController horizontalPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleEntry) ipChange.ipc$dispatch("8d36d87", new Object[]{horizontalPageController});
        }
        return horizontalPageController.j;
    }

    public static /* synthetic */ SimpleEntry c(HorizontalPageController horizontalPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleEntry) ipChange.ipc$dispatch("b28498c8", new Object[]{horizontalPageController});
        }
        return horizontalPageController.k;
    }

    public static /* synthetic */ boolean d(HorizontalPageController horizontalPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf4562d2", new Object[]{horizontalPageController})).booleanValue();
        }
        return horizontalPageController.h;
    }

    public static /* synthetic */ b e(HorizontalPageController horizontalPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7e754d33", new Object[]{horizontalPageController});
        }
        return horizontalPageController.f;
    }

    public static /* synthetic */ yis f(HorizontalPageController horizontalPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yis) ipChange.ipc$dispatch("eda041b7", new Object[]{horizontalPageController});
        }
        return horizontalPageController.g;
    }

    public final void A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712fdbbd", new Object[]{this, context});
            return;
        }
        q84.i(context, hi3.class, this);
        this.b.i().e("pageType", this.i);
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940e810a", new Object[]{this});
            return;
        }
        yis yisVar = this.g;
        if (yisVar != null && this.h) {
            yisVar.h();
        }
    }

    public final void C(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4859fcf6", new Object[]{this, context});
            return;
        }
        q84.l(context, hi3.class);
        this.b.i().g("pageType", this.i);
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[]{this});
        } else {
            this.h = false;
        }
    }

    public final yis h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yis) ipChange.ipc$dispatch("99a86a22", new Object[]{this});
        }
        bq6 e = this.b.e();
        Item item = (Item) e.f(Item.class);
        Content content = (Content) e.f(Content.class);
        pur purVar = new pur();
        if (item != null) {
            purVar.d(item.getCategoryId());
            purVar.f(item.getItemId());
        }
        if (content != null) {
            purVar.e((JSONObject) JSON.toJSON(content));
            purVar.g(content.getTitle());
        }
        return new yis(this.b, purVar);
    }

    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.c;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("179f5421", new Object[]{this})).booleanValue();
        }
        Content content = (Content) this.b.e().f(Content.class);
        Feature feature = (Feature) this.b.e().f(Feature.class);
        if (feature == null || !feature.isDetail3() || content == null) {
            return false;
        }
        return true;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd21a6f9", new Object[]{this});
        } else if (!tq4.e(this.f6735a)) {
            g();
            boolean j = j();
            this.h = j;
            if (j && this.g == null) {
                this.g = h();
            }
            yis yisVar = this.g;
            if (yisVar != null) {
                yisVar.g(this.h);
            }
        }
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1db91f44", new Object[]{this})).booleanValue();
        }
        TTDetailViewPager tTDetailViewPager = this.d;
        if (tTDetailViewPager == null || tTDetailViewPager.getCurrentItem() != 1) {
            return false;
        }
        return true;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa35daa6", new Object[]{this})).booleanValue();
        }
        PagerAdapter adapter = this.d.getAdapter();
        if (adapter == null || adapter.getCount() <= 1) {
            return false;
        }
        this.d.setCurrentItem(1, true);
        return true;
    }

    public boolean n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e67e6ba", new Object[]{this, str, str2})).booleanValue();
        }
        yis yisVar = this.g;
        if (yisVar != null) {
            yisVar.i(str, str2);
        }
        return m();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7024b9fa", new Object[]{this})).booleanValue();
        }
        PagerAdapter adapter = this.d.getAdapter();
        if (adapter == null || adapter.getCount() <= 0) {
            return false;
        }
        this.d.setCurrentItem(0, true);
        return true;
    }

    public void p(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        if (l()) {
            return o();
        }
        return false;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4483d8d6", new Object[]{this});
            return;
        }
        yis yisVar = this.g;
        if (yisVar != null && this.h) {
            yisVar.b();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51528f30", new Object[]{this});
            return;
        }
        yis yisVar = this.g;
        if (yisVar != null && this.h) {
            yisVar.d();
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        g();
        yis yisVar = this.g;
        if (yisVar != null) {
            yisVar.c();
        }
        C(this.f6735a);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40141ada", new Object[]{this});
            return;
        }
        tua tuaVar = (tua) this.b.h().d("headerPic");
        if (tuaVar != null) {
            tuaVar.G(true);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c4deac", new Object[]{this});
            return;
        }
        tua tuaVar = (tua) this.b.h().d("headerPic");
        if (tuaVar != null) {
            tuaVar.F(true);
        }
    }

    public void w() {
        yis yisVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (this.h && (yisVar = this.g) != null) {
            yisVar.e();
        }
    }

    public void x() {
        yis yisVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (this.h && (yisVar = this.g) != null) {
            yisVar.f();
        }
    }

    /* renamed from: y */
    public boolean y1(hi3 hi3Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc23708c", new Object[]{this, hi3Var})).booleanValue();
        }
        if (hi3Var.a() || l()) {
            z = true;
        }
        this.d.setDisableHorizontalScroll(!z);
        return true;
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        k();
        this.e.notifyDataSetChanged();
        if (this.d.getCurrentItem() == 1) {
            o();
        }
    }
}
