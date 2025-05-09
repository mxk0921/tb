package com.taobao.themis.container.app.page.swiper;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.aud;
import tb.ckf;
import tb.cqc;
import tb.fds;
import tb.pl4;
import tb.q9s;
import tb.t2o;
import tb.tll;
import tb.unl;
import tb.wzq;
import tb.x5d;
import tb.y0e;
import tb.yxd;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/taobao/themis/container/app/page/swiper/TMSViewPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "a", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSViewPagerAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f13489a;
    public final wzq b;
    public final List<a> c;
    public int d;
    public final CopyOnWriteArrayList<aud> e = new CopyOnWriteArrayList<>();
    public boolean f;
    public a g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ITMSPage f13491a;
        public FrameLayout b;
        public final String c;

        static {
            t2o.a(835715141);
        }

        public a(ITMSPage iTMSPage, FrameLayout frameLayout, String str) {
            this.f13491a = iTMSPage;
            this.b = frameLayout;
            this.c = str;
        }

        public final FrameLayout a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("dcbf76e2", new Object[]{this});
            }
            return this.b;
        }

        public final ITMSPage b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
            }
            return this.f13491a;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
            }
            return this.c;
        }

        public final void d(FrameLayout frameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8428d0e", new Object[]{this, frameLayout});
            } else {
                this.b = frameLayout;
            }
        }

        public final void e(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11535bc3", new Object[]{this, iTMSPage});
            } else {
                this.f13491a = iTMSPage;
            }
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (ckf.b(this.f13491a, aVar.f13491a) && ckf.b(this.b, aVar.b) && ckf.b(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            ITMSPage iTMSPage = this.f13491a;
            if (iTMSPage == null) {
                i = 0;
            } else {
                i = iTMSPage.hashCode();
            }
            int i4 = i * 31;
            FrameLayout frameLayout = this.b;
            if (frameLayout == null) {
                i2 = 0;
            } else {
                i2 = frameLayout.hashCode();
            }
            int i5 = (i4 + i2) * 31;
            String str = this.c;
            if (str != null) {
                i3 = str.hashCode();
            }
            return i5 + i3;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ViewPagerItemData(page=" + this.f13491a + ", containerView=" + this.b + ", pageId=" + ((Object) this.c) + ')';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements tll {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$ObjectRef<fds> b;

        public b(Ref$ObjectRef<fds> ref$ObjectRef) {
            this.b = ref$ObjectRef;
        }

        @Override // tb.tll
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
            }
            return TMSViewPagerAdapter.j(TMSViewPagerAdapter.this).getInstance().I();
        }

        @Override // tb.tll
        public Fragment getCurrentFragment() {
            tll pageContext;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
            }
            if (!TMSViewPagerAdapter.j(TMSViewPagerAdapter.this).getInstance().c0().isFragmentContainer() || (pageContext = TMSViewPagerAdapter.j(TMSViewPagerAdapter.this).getPageContext()) == null) {
                return null;
            }
            return pageContext.getCurrentFragment();
        }

        @Override // tb.tll
        public x5d getPageContainer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x5d) ipChange.ipc$dispatch("9b384128", new Object[]{this});
            }
            if (q9s.V1()) {
                return this.b.element;
            }
            tll pageContext = TMSViewPagerAdapter.j(TMSViewPagerAdapter.this).getPageContext();
            if (pageContext == null) {
                return null;
            }
            return pageContext.getPageContainer();
        }

        @Override // tb.tll
        public y0e getTitleBar() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
            }
            if (q9s.V1()) {
                fds fdsVar = this.b.element;
                if (fdsVar == null) {
                    return null;
                }
                return fdsVar.getTitleBar();
            }
            tll pageContext = TMSViewPagerAdapter.j(TMSViewPagerAdapter.this).getPageContext();
            if (pageContext == null) {
                return null;
            }
            return pageContext.getTitleBar();
        }
    }

    static {
        t2o.a(835715138);
    }

    public TMSViewPagerAdapter(ITMSPage iTMSPage, wzq wzqVar) {
        ckf.g(iTMSPage, "mSwiperPage");
        ckf.g(wzqVar, "swiperAbility");
        this.f13489a = iTMSPage;
        this.b = wzqVar;
        unl e = iTMSPage.getPageParams().e();
        List<String> d = e.d();
        if (!e.o()) {
            TMSLogger.b("TMSViewPagerAdapter", "pageModel is not swiper");
            this.c = new ArrayList(0);
        } else {
            ckf.d(d);
            this.c = new ArrayList(d.size());
            List<String> d2 = e.d();
            if (d2 != null) {
                for (String str : d2) {
                    ((ArrayList) this.c).add(new a(null, null, str));
                }
            }
            this.g = (a) ((ArrayList) this.c).get(this.d);
        }
        double d3 = q9s.d3("themis_common_config", "renderNextPageThreshold", 0.5d);
        if (q9s.b3("themis_common_config", "enableSwiperThreshold", Boolean.FALSE)) {
            this.b.a(new ThresholdPageListener((float) d3) { // from class: com.taobao.themis.container.app.page.swiper.TMSViewPagerAdapter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/page/swiper/TMSViewPagerAdapter$2");
                }

                @Override // com.taobao.themis.container.app.page.swiper.ThresholdPageListener
                public void a(int i) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f5a4ec2c", new Object[]{this, new Integer(i)});
                    } else {
                        TMSViewPagerAdapter.m(TMSViewPagerAdapter.this, i);
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    int i2 = 0;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                        return;
                    }
                    if (q9s.o0()) {
                        a aVar = (i < 0 || i >= TMSViewPagerAdapter.l(TMSViewPagerAdapter.this).size()) ? null : (a) TMSViewPagerAdapter.l(TMSViewPagerAdapter.this).get(i);
                        if (ckf.b(TMSViewPagerAdapter.h(TMSViewPagerAdapter.this), aVar)) {
                            TMSLogger.f("TMSViewPagerAdapter", ckf.p("onPageSelected: currentSelectedItem is the same as targetItem, position: ", Integer.valueOf(i)));
                            return;
                        }
                        TMSViewPagerAdapter.n(TMSViewPagerAdapter.this, aVar);
                    }
                    yxd yxdVar = (yxd) TMSViewPagerAdapter.j(TMSViewPagerAdapter.this).getExtension(yxd.class);
                    if (yxdVar != null) {
                        i2 = yxdVar.V0();
                    }
                    TMSLogger.f("TMSViewPagerAdapter", "onPageSelected with tabIndex=" + i2 + ", swiperIndex=" + i);
                    ITMSPage b2 = ((a) TMSViewPagerAdapter.l(TMSViewPagerAdapter.this).get(TMSViewPagerAdapter.i(TMSViewPagerAdapter.this))).b();
                    if (b2 != null) {
                        b2.onViewDisappear();
                    }
                    TMSViewPagerAdapter.m(TMSViewPagerAdapter.this, i);
                    ITMSPage b3 = ((a) TMSViewPagerAdapter.l(TMSViewPagerAdapter.this).get(i)).b();
                    if (b3 != null) {
                        b3.onViewAppear();
                    }
                    TMSViewPagerAdapter.o(TMSViewPagerAdapter.this, i);
                    for (aud audVar : TMSViewPagerAdapter.k(TMSViewPagerAdapter.this)) {
                        audVar.a(i2, i);
                    }
                }
            });
        } else {
            this.b.a(new ViewPager.OnPageChangeListener() { // from class: com.taobao.themis.container.app.page.swiper.TMSViewPagerAdapter.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public int f13490a;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    } else {
                        this.f13490a = i;
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    } else if (this.f13490a != 1) {
                    } else {
                        if (f > 0.5f) {
                            TMSViewPagerAdapter.m(TMSViewPagerAdapter.this, i + 1);
                        } else {
                            TMSViewPagerAdapter.m(TMSViewPagerAdapter.this, i);
                        }
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    int i2 = 0;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                        return;
                    }
                    if (q9s.o0()) {
                        a aVar = (i < 0 || i >= TMSViewPagerAdapter.l(TMSViewPagerAdapter.this).size()) ? null : (a) TMSViewPagerAdapter.l(TMSViewPagerAdapter.this).get(i);
                        if (ckf.b(TMSViewPagerAdapter.h(TMSViewPagerAdapter.this), aVar)) {
                            TMSLogger.f("TMSViewPagerAdapter", ckf.p("onPageSelected: currentSelectedItem is the same as targetItem, position: ", Integer.valueOf(i)));
                            return;
                        }
                        TMSViewPagerAdapter.n(TMSViewPagerAdapter.this, aVar);
                    }
                    yxd yxdVar = (yxd) TMSViewPagerAdapter.j(TMSViewPagerAdapter.this).getExtension(yxd.class);
                    if (yxdVar != null) {
                        i2 = yxdVar.V0();
                    }
                    TMSLogger.f("TMSViewPagerAdapter", "onPageSelected with tabIndex=" + i2 + ", swiperIndex=" + i);
                    ITMSPage b2 = ((a) TMSViewPagerAdapter.l(TMSViewPagerAdapter.this).get(TMSViewPagerAdapter.i(TMSViewPagerAdapter.this))).b();
                    if (b2 != null) {
                        b2.onViewDisappear();
                    }
                    TMSViewPagerAdapter.m(TMSViewPagerAdapter.this, i);
                    ITMSPage b3 = ((a) TMSViewPagerAdapter.l(TMSViewPagerAdapter.this).get(i)).b();
                    if (b3 != null) {
                        b3.onViewAppear();
                    }
                    TMSViewPagerAdapter.o(TMSViewPagerAdapter.this, i);
                    for (aud audVar : TMSViewPagerAdapter.k(TMSViewPagerAdapter.this)) {
                        audVar.a(i2, i);
                    }
                }
            });
        }
    }

    public static final /* synthetic */ a h(TMSViewPagerAdapter tMSViewPagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("415b1514", new Object[]{tMSViewPagerAdapter});
        }
        return tMSViewPagerAdapter.g;
    }

    public static final /* synthetic */ int i(TMSViewPagerAdapter tMSViewPagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3049f63f", new Object[]{tMSViewPagerAdapter})).intValue();
        }
        return tMSViewPagerAdapter.d;
    }

    public static /* synthetic */ Object ipc$super(TMSViewPagerAdapter tMSViewPagerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/page/swiper/TMSViewPagerAdapter");
    }

    public static final /* synthetic */ ITMSPage j(TMSViewPagerAdapter tMSViewPagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("d29c1473", new Object[]{tMSViewPagerAdapter});
        }
        return tMSViewPagerAdapter.f13489a;
    }

    public static final /* synthetic */ CopyOnWriteArrayList k(TMSViewPagerAdapter tMSViewPagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("3cdc201d", new Object[]{tMSViewPagerAdapter});
        }
        return tMSViewPagerAdapter.e;
    }

    public static final /* synthetic */ List l(TMSViewPagerAdapter tMSViewPagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cd291d94", new Object[]{tMSViewPagerAdapter});
        }
        return tMSViewPagerAdapter.c;
    }

    public static final /* synthetic */ void m(TMSViewPagerAdapter tMSViewPagerAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43325a4", new Object[]{tMSViewPagerAdapter, new Integer(i)});
        } else {
            tMSViewPagerAdapter.v(i);
        }
    }

    public static final /* synthetic */ void n(TMSViewPagerAdapter tMSViewPagerAdapter, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d29e78", new Object[]{tMSViewPagerAdapter, aVar});
        } else {
            tMSViewPagerAdapter.g = aVar;
        }
    }

    public static final /* synthetic */ void o(TMSViewPagerAdapter tMSViewPagerAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5528243", new Object[]{tMSViewPagerAdapter, new Integer(i)});
        } else {
            tMSViewPagerAdapter.d = i;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.c).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        a aVar = (a) ((ArrayList) this.c).get(i);
        FrameLayout a2 = aVar.a();
        if (a2 == null) {
            a2 = new FrameLayout(this.f13489a.getInstance().I());
            aVar.d(a2);
            if (i == this.d) {
                v(i);
            }
        }
        ViewParent parent = a2.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(a2);
        }
        if (viewGroup != null) {
            viewGroup.addView(a2);
        }
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        return ckf.b(view, obj);
    }

    public final void q(aud audVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceed67f1", new Object[]{this, audVar});
            return;
        }
        ckf.g(audVar, DataReceiveMonitor.CB_LISTENER);
        this.e.add(audVar);
    }

    public final void r(ITMSPage iTMSPage, ITMSPage iTMSPage2) {
        cqc cqcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36227761", new Object[]{this, iTMSPage, iTMSPage2});
            return;
        }
        cqc cqcVar2 = (cqc) iTMSPage.getExtension(cqc.class);
        if (cqcVar2 != null) {
            if (!q9s.r0() && (cqcVar = (cqc) iTMSPage2.getExtension(cqc.class)) != null) {
                iTMSPage2.t(cqcVar);
            }
            iTMSPage2.x(cqcVar2);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (a aVar : this.c) {
            ITMSPage b2 = aVar.b();
            if (b2 != null) {
                b2.destroy();
            }
        }
    }

    public final ITMSPage t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("fca39868", new Object[]{this});
        }
        return ((a) ((ArrayList) this.c).get(this.d)).b();
    }

    public final boolean p(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3b0dd7e", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        ckf.g(str, pl4.KEY_PAGE_ID);
        if (i < -1 || i > ((ArrayList) this.c).size()) {
            return false;
        }
        int size = i == -1 ? ((ArrayList) this.c).size() : i;
        unl k = TMSInstanceExtKt.k(this.f13489a.getInstance(), str);
        if (k == null) {
            return false;
        }
        ((ArrayList) this.c).add(size, new a(null, null, str));
        int i2 = this.d;
        if (i2 >= size) {
            this.d = i2 + 1;
        }
        notifyDataSetChanged();
        int i3 = this.d;
        if (i3 >= size) {
            this.b.setCurrentItem(i3 + 1);
        }
        TMSLogger.f("TMSViewPagerAdapter", "addSwiperItem with index=" + i + ", url=" + ((Object) k.k()) + " and id=" + ((Object) k.g()));
        return true;
    }

    public final boolean u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c63a9d71", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || i >= ((ArrayList) this.c).size() || i == this.d || ((ArrayList) this.c).size() == 1) {
            return false;
        }
        TMSLogger.f("TMSViewPagerAdapter", ckf.p("removeSwiperItem with index=", Integer.valueOf(i)));
        int i2 = this.d;
        if (i2 > i) {
            this.b.setCurrentItem(i2 - 1);
        }
        ITMSPage b2 = ((a) ((ArrayList) this.c).remove(i)).b();
        if (b2 != null) {
            b2.destroy();
        }
        notifyDataSetChanged();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [T, tb.fds] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(int r21) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.app.page.swiper.TMSViewPagerAdapter.v(int):void");
    }
}
