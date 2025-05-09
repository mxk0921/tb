package tb;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.container.app.page.swiper.TMSViewPagerAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.List;
import tb.tll;
import tb.vu3;
import tb.ztd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class yzq implements ztd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f32434a;
    public final gds b;
    public final TMSViewPagerAdapter c;
    public ITMSPage d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements aud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.aud
        public void a(int i, int i2) {
            tll pageContext;
            y0e titleBar;
            List<aud> h;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40cb1832", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            ytd ytdVar = (ytd) yzq.this.g().getInstance().getExtension(ytd.class);
            if (!(ytdVar == null || (h = ytdVar.h()) == null)) {
                for (aud audVar : h) {
                    audVar.a(i, i2);
                }
            }
            ITMSPage B = yzq.this.B();
            if (!(B == null || (pageContext = yzq.this.g().getPageContext()) == null || (titleBar = pageContext.getTitleBar()) == null)) {
                titleBar.resetTitle(B);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements ITMSPage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage B = yzq.this.B();
            if (B != null) {
                B.onResume();
            }
            ITMSPage a2 = yzq.a(yzq.this);
            if (a2 != null) {
                a2.onResume();
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b96e2075", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage.a.C0773a.c(this, iTMSPage);
            ITMSPage B = yzq.this.B();
            if (B != null) {
                B.onStart();
            }
            ITMSPage a2 = yzq.a(yzq.this);
            if (a2 != null) {
                a2.onStart();
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void g(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage B = yzq.this.B();
            if (B != null) {
                B.onPause();
            }
            ITMSPage a2 = yzq.a(yzq.this);
            if (a2 != null) {
                a2.onPause();
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void h(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3516433", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage.a.C0773a.d(this, iTMSPage);
            ITMSPage B = yzq.this.B();
            if (B != null) {
                B.onStop();
            }
            ITMSPage a2 = yzq.a(yzq.this);
            if (a2 != null) {
                a2.onStop();
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void l(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7a6418b", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage.a.C0773a.e(this, iTMSPage);
            ITMSPage B = yzq.this.B();
            if (B != null) {
                B.onViewAppear();
            }
            ITMSPage a2 = yzq.a(yzq.this);
            if (a2 != null) {
                a2.onViewAppear();
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void n(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b526f91", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage.a.C0773a.f(this, iTMSPage);
            ITMSPage B = yzq.this.B();
            if (B != null) {
                B.onViewDisappear();
            }
            ITMSPage a2 = yzq.a(yzq.this);
            if (a2 != null) {
                a2.onViewDisappear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements wzq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.wzq
        public void a(ViewPager.OnPageChangeListener onPageChangeListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32a6ce3d", new Object[]{this, onPageChangeListener});
                return;
            }
            ckf.g(onPageChangeListener, DataReceiveMonitor.CB_LISTENER);
            yzq.f(yzq.this).f().addOnPageChangeListener(onPageChangeListener);
        }

        @Override // tb.wzq
        public void setCurrentItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            } else {
                yzq.f(yzq.this).f().setCurrentItem(i, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements tll {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.tll
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
            }
            return yzq.this.g().getInstance().I();
        }

        @Override // tb.tll
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
            }
            return null;
        }

        @Override // tb.tll
        public x5d getPageContainer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x5d) ipChange.ipc$dispatch("9b384128", new Object[]{this});
            }
            return null;
        }

        @Override // tb.tll
        public y0e getTitleBar() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
            }
            return tll.a.a(this);
        }
    }

    static {
        t2o.a(835715130);
        t2o.a(839909684);
    }

    public yzq(ITMSPage iTMSPage) {
        int f0;
        ckf.g(iTMSPage, "page");
        this.f32434a = iTMSPage;
        Activity I = iTMSPage.getInstance().I();
        ckf.f(I, "page.getInstance().activity");
        gds gdsVar = new gds(I, iTMSPage);
        this.b = gdsVar;
        TMSViewPagerAdapter tMSViewPagerAdapter = new TMSViewPagerAdapter(iTMSPage, new c());
        this.c = tMSViewPagerAdapter;
        gdsVar.f().setAdapter(tMSViewPagerAdapter);
        tMSViewPagerAdapter.q(new a());
        unl e = iTMSPage.getPageParams().e();
        kwd kwdVar = (kwd) iTMSPage.getExtension(kwd.class);
        boolean isFirstPage = kwdVar == null ? false : kwdVar.isFirstPage();
        int e2 = e.e();
        if (isFirstPage && q9s.g2()) {
            String e0 = iTMSPage.getInstance().e0();
            List<String> d2 = e.d();
            if (d2 != null) {
                ckf.f(e0, "instanceUrl");
                if (wsq.O(e0, "uniapp_sub_page", false, 2, null) && (f0 = i04.f0(d2, Uri.parse(e0).getQueryParameter("uniapp_sub_page"))) >= 0 && f0 < d2.size()) {
                    e2 = f0;
                }
            }
        }
        gdsVar.f().setCurrentItem(e2);
        iTMSPage.C(new b());
    }

    public static final /* synthetic */ ITMSPage a(yzq yzqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("48675555", new Object[]{yzqVar});
        }
        return yzqVar.d;
    }

    public static final /* synthetic */ gds f(yzq yzqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gds) ipChange.ipc$dispatch("f34eb6cf", new Object[]{yzqVar});
        }
        return yzqVar.b;
    }

    @Override // tb.lae
    public ITMSPage B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("8e90c6e", new Object[]{this});
        }
        return this.c.t();
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            ztd.a.b(this, iTMSPage);
        }
    }

    @Override // tb.ztd
    public int X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71f545ab", new Object[]{this})).intValue();
        }
        return this.b.f().getCurrentItem();
    }

    @Override // tb.ztd
    public boolean b0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c63a9d71", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.c.u(i);
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else if (!this.e) {
            this.e = true;
            ITMSPage iTMSPage = this.d;
            if (iTMSPage != null) {
                iTMSPage.destroy();
            }
            this.c.s();
            this.b.f().removeAllViews();
        }
    }

    public final ITMSPage g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
        }
        return this.f32434a;
    }

    @Override // tb.ztd
    public x5d getPageContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x5d) ipChange.ipc$dispatch("9b384128", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ztd
    public void k1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8425abb0", new Object[]{this, new Boolean(z)});
        } else {
            this.b.f().setAcceptTouchEvent(z);
        }
    }

    @Override // tb.ztd
    public void l0(aud audVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceed67f1", new Object[]{this, audVar});
            return;
        }
        ckf.g(audVar, DataReceiveMonitor.CB_LISTENER);
        this.c.q(audVar);
    }

    @Override // tb.ztd
    public boolean v(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3b0dd7e", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        ckf.g(str, pl4.KEY_PAGE_ID);
        return this.c.p(i, str);
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            ztd.a.a(this);
        }
    }

    @Override // tb.ztd
    public boolean x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("798b06d4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || i >= this.c.getCount()) {
            return false;
        }
        this.b.f().setCurrentItem(i);
        return true;
    }

    @Override // tb.ztd
    public boolean y0() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38c20492", new Object[]{this})).booleanValue();
        }
        ITMSPage iTMSPage = this.d;
        if (iTMSPage == null || (view = iTMSPage.getView()) == null) {
            return false;
        }
        view.setVisibility(8);
        return true;
    }

    @Override // tb.ztd
    public boolean a0(String str, double d2) {
        String k;
        String g;
        kwd kwdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b5ce4cf", new Object[]{this, str, new Double(d2)})).booleanValue();
        }
        ckf.g(str, "headerPageId");
        if (d2 <= vu3.b.GEO_NOT_SUPPORT) {
            return false;
        }
        ITMSPage iTMSPage = this.d;
        if (iTMSPage != null) {
            iTMSPage.destroy();
        }
        unl k2 = TMSInstanceExtKt.k(this.f32434a.getInstance(), str);
        if (k2 == null || (k = k2.k()) == null || (g = k2.g()) == null) {
            return false;
        }
        String l = ges.INSTANCE.l(k, k2.i(), ies.g(this.f32434a.getInstance().e0()).getEncodedQuery());
        rwd V = this.f32434a.getInstance().V();
        JSONObject jSONObject = new JSONObject();
        Boolean bool = Boolean.TRUE;
        jSONObject.put((JSONObject) ccs.KEY_IS_TAB_ITEM_PAGE, (String) bool);
        jSONObject.put((JSONObject) ccs.KEY_IS_HEADER_PAGE, (String) bool);
        xhv xhvVar = xhv.INSTANCE;
        ITMSPage b2 = V.b(g, null, l, jSONObject);
        this.d = b2;
        if (b2 == null) {
            return false;
        }
        if (q9s.a2() && (kwdVar = (kwd) b2.getExtension(kwd.class)) != null) {
            kwdVar.K0(false);
        }
        b2.x(new yql(b2, g()));
        yxd yxdVar = (yxd) g().getExtension(yxd.class);
        if (yxdVar != null) {
            b2.x(yxdVar);
        }
        b2.s();
        b2.B(new d());
        View view = b2.getView();
        if (view != null) {
            view.setBackgroundColor(0);
            this.b.g(view, xcs.a(g().getInstance().I(), (float) d2));
        }
        return true;
    }
}
