package tb;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.kernel.extension.page.tab.TabSwitchSource;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cqc;
import tb.lxd;
import tb.tll;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class crs implements dyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f17267a;
    public lxd e;
    public View h;
    public boolean i;
    public xqs j;
    public int b = -1;
    public final List<ecs> c = new ArrayList();
    public int d = -1;
    public final ArrayList<u1a<Integer, String, xhv>> f = new ArrayList<>();
    public final AtomicBoolean g = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ITMSPage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage.a.C0773a.b(this, iTMSPage);
            ITMSPage B = crs.this.B();
            if (B != null) {
                B.onResume();
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
            ITMSPage B = crs.this.B();
            if (B != null) {
                B.onStart();
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
            ITMSPage.a.C0773a.a(this, iTMSPage);
            ITMSPage B = crs.this.B();
            if (B != null) {
                B.onPause();
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
            ITMSPage B = crs.this.B();
            if (B != null) {
                B.onStop();
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
            ITMSPage B = crs.this.B();
            if (B != null) {
                B.onViewAppear();
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
            ITMSPage B = crs.this.B();
            if (B != null) {
                B.onViewDisappear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        static {
            t2o.a(835715125);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements lxd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.lxd.b
        public void D(int i) {
            ecs ecsVar;
            ITMSPage b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75f7b8aa", new Object[]{this, new Integer(i)});
            } else if (crs.f(crs.this)) {
                String str = null;
                if (crs.a(crs.this) < 0 || crs.a(crs.this) >= crs.h(crs.this).size()) {
                    ecsVar = null;
                } else {
                    ecsVar = (ecs) crs.h(crs.this).get(crs.a(crs.this));
                }
                xqs g = crs.g(crs.this);
                if (g != null) {
                    if (!(ecsVar == null || (b = ecsVar.b()) == null)) {
                        str = b.c();
                    }
                    g.a(i, str);
                }
            } else {
                crs.this.N0(i, TabSwitchSource.USER_CLICK);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements tll {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ x5d b;

        public d(x5d x5dVar) {
            this.b = x5dVar;
        }

        @Override // tb.tll
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
            }
            return crs.this.r().getInstance().I();
        }

        @Override // tb.tll
        public Fragment getCurrentFragment() {
            tll pageContext;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
            }
            if (!crs.this.r().getInstance().c0().isFragmentContainer() || (pageContext = crs.this.r().getPageContext()) == null) {
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
            return this.b;
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
        t2o.a(835715123);
        t2o.a(839909691);
    }

    public crs(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f17267a = iTMSPage;
        iTMSPage.C(new a());
    }

    public static final /* synthetic */ int a(crs crsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("237ac1c9", new Object[]{crsVar})).intValue();
        }
        return crsVar.b;
    }

    public static final /* synthetic */ boolean f(crs crsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("410d6cc", new Object[]{crsVar})).booleanValue();
        }
        return crsVar.i;
    }

    public static final /* synthetic */ xqs g(crs crsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xqs) ipChange.ipc$dispatch("cd9af76f", new Object[]{crsVar});
        }
        return crsVar.j;
    }

    public static final /* synthetic */ List h(crs crsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("80476132", new Object[]{crsVar});
        }
        return crsVar.c;
    }

    @Override // tb.lae
    public ITMSPage B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("8e90c6e", new Object[]{this});
        }
        int i = this.b;
        if (i < 0 || i >= ((ArrayList) this.c).size()) {
            return null;
        }
        return ((ecs) ((ArrayList) this.c).get(this.b)).b();
    }

    @Override // tb.dyd
    public void C(u1a<? super Integer, ? super String, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec07908", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, DataReceiveMonitor.CB_LISTENER);
        this.f.add(u1aVar);
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            ckf.g(iTMSPage, "page");
        }
    }

    @Override // tb.dyd
    public void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9f287", new Object[]{this});
        } else {
            this.f.clear();
        }
    }

    @Override // tb.dyd
    public ITMSPage b1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("941fc9e6", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= ((ArrayList) this.c).size()) {
            return null;
        }
        return ((ecs) ((ArrayList) this.c).get(i)).b();
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
            return;
        }
        for (ecs ecsVar : this.c) {
            ITMSPage b2 = ecsVar.b();
            if (b2 != null) {
                b2.destroy();
            }
        }
        ((ArrayList) this.c).clear();
    }

    @Override // tb.dyd
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e67f5875", new Object[]{this})).intValue();
        }
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            return lxdVar.getHeight();
        }
        ckf.y("mTabBar");
        throw null;
    }

    @Override // tb.dyd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a9b4a2", new Object[]{this});
            return;
        }
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            lxdVar.e();
        } else {
            ckf.y("mTabBar");
            throw null;
        }
    }

    @Override // tb.dyd
    public lxd getTabBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxd) ipChange.ipc$dispatch("a50b5c06", new Object[]{this});
        }
        if (!this.g.get()) {
            return null;
        }
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            return lxdVar;
        }
        ckf.y("mTabBar");
        throw null;
    }

    @Override // tb.dyd
    public View h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8b993042", new Object[]{this});
        }
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            return lxdVar.getContentView();
        }
        ckf.y("mTabBar");
        throw null;
    }

    @Override // tb.dyd
    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d084b58", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "mode");
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            return lxdVar.i(str);
        }
        ckf.y("mTabBar");
        throw null;
    }

    public final void l(ITMSPage iTMSPage, ITMSPage iTMSPage2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36227761", new Object[]{this, iTMSPage, iTMSPage2});
            return;
        }
        cqc cqcVar = (cqc) iTMSPage2.getExtension(cqc.class);
        if (cqcVar != null) {
            iTMSPage.x(cqcVar);
        }
    }

    public final ITMSPage n(ITMSPage iTMSPage, String str, boolean z, int i) {
        Object obj;
        String str2;
        ITMSPage iTMSPage2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("a34f613b", new Object[]{this, iTMSPage, str, new Boolean(z), new Integer(i)});
        }
        unl k = TMSInstanceExtKt.k(iTMSPage.getInstance(), str);
        if (k == null) {
            return null;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ckf.b(((ecs) obj).c(), str)) {
                break;
            }
        }
        ecs ecsVar = (ecs) obj;
        TabBarItem a2 = ecsVar == null ? null : ecsVar.a();
        if (a2 == null) {
            return null;
        }
        if (!k.o()) {
            String k2 = k.k();
            if (k2 == null) {
                return null;
            }
            QueryPass i2 = k.i();
            if (i2 == null) {
                i2 = a2.getQueryPass();
            }
            if (z) {
                str2 = ges.c(k2, ies.g(iTMSPage.getInstance().e0()).getEncodedQuery(), null, null, 12, null);
            } else {
                str2 = ges.INSTANCE.l(k2, i2, ies.g(iTMSPage.getInstance().e0()).getEncodedQuery());
            }
            if (str2 == null) {
                return null;
            }
        } else {
            str2 = k.k();
        }
        zbd zbdVar = (zbd) iTMSPage.getInstance().getExtension(zbd.class);
        if (str2 == null || zbdVar == null || (iTMSPage2 = zbdVar.L(str2)) == null) {
            iTMSPage2 = null;
        } else {
            JSONObject b2 = iTMSPage2.getPageParams().b();
            Boolean bool = Boolean.TRUE;
            b2.put((JSONObject) ccs.KEY_IS_TAB_ITEM_PAGE, (String) bool);
            iTMSPage2.getPageParams().b().put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) bool);
        }
        if (iTMSPage2 == null) {
            rwd V = this.f17267a.getInstance().V();
            JSONObject jSONObject = new JSONObject();
            Boolean bool2 = Boolean.TRUE;
            jSONObject.put((JSONObject) ccs.KEY_IS_TAB_ITEM_PAGE, (String) bool2);
            jSONObject.put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) bool2);
            xhv xhvVar = xhv.INSTANCE;
            iTMSPage2 = V.b(str, null, str2, jSONObject);
            if (iTMSPage2 == null) {
                return null;
            }
        }
        kwd kwdVar = (kwd) iTMSPage2.getExtension(kwd.class);
        if (kwdVar != null) {
            kwdVar.K0(z);
        }
        iTMSPage2.x(new yqs(iTMSPage2, this.f17267a));
        iTMSPage2.x(new yql(iTMSPage2, iTMSPage));
        if (!z) {
            cqc cqcVar = (cqc) iTMSPage2.getExtension(cqc.class);
            if (cqcVar != null) {
                cqc.a.b(cqcVar, null, null, null, null, null, null, 63, null);
            }
        } else {
            l(iTMSPage2, iTMSPage);
        }
        return iTMSPage2;
    }

    @Override // tb.dyd
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beee64a7", new Object[]{this});
            return;
        }
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            lxdVar.o();
        } else {
            ckf.y("mTabBar");
            throw null;
        }
    }

    @Override // tb.dyd
    public boolean q(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd19b287", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        ckf.g(str, "text");
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            return lxdVar.q(i, str);
        }
        ckf.y("mTabBar");
        throw null;
    }

    public final ITMSPage r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
        }
        return this.f17267a;
    }

    @Override // tb.dyd
    public boolean removeTabBarBadge(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c312d1f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            return lxdVar.removeTabBarBadge(i);
        }
        ckf.y("mTabBar");
        throw null;
    }

    public final boolean s(ITMSPage iTMSPage, TabBarItem tabBarItem) {
        unl k;
        String k2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e72ec36f", new Object[]{this, iTMSPage, tabBarItem})).booleanValue();
        }
        String pageId = tabBarItem.getPageId();
        if (pageId == null || (k = TMSInstanceExtKt.k(this.f17267a.getInstance(), pageId)) == null || (k2 = k.k()) == null) {
            return false;
        }
        return !ckf.b(iTMSPage.c(), ges.INSTANCE.l(k2, tabBarItem.getQueryPass(), ies.g(iTMSPage.getInstance().e0()).getEncodedQuery()));
    }

    @Override // tb.z5d
    public void w0() {
        tll pageContext;
        x5d pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
            return;
        }
        View view = this.h;
        if (view != null && (pageContext = r().getPageContext()) != null && (pageContainer = pageContext.getPageContainer()) != null) {
            pageContainer.d(view);
        }
    }

    @Override // tb.dyd
    public void m0(xqs xqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40397c7c", new Object[]{this, xqsVar});
            return;
        }
        ckf.g(xqsVar, DataReceiveMonitor.CB_LISTENER);
        this.i = true;
        this.j = xqsVar;
    }

    @Override // tb.dyd
    public boolean N0(int i, TabSwitchSource tabSwitchSource) {
        x5d pageContainer;
        x5d x5dVar;
        ITMSPage b2;
        jnd jndVar;
        x5d pageContainer2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("850750a2", new Object[]{this, new Integer(i), tabSwitchSource})).booleanValue();
        }
        tll pageContext = this.f17267a.getPageContext();
        if (!(pageContext == null || (pageContainer2 = pageContext.getPageContainer()) == null)) {
            pageContainer2.a();
        }
        if (i < 0 || i >= ((ArrayList) this.c).size()) {
            return false;
        }
        if (i == this.b) {
            if (!(tabSwitchSource != TabSwitchSource.USER_CLICK || (b2 = ((ecs) ((ArrayList) this.c).get(i)).b()) == null || (jndVar = (jnd) b2.getExtension(jnd.class)) == null)) {
                jndVar.scrollToTop();
            }
            return false;
        }
        int i2 = this.d;
        if (i != i2 && i2 >= 0 && i2 < ((ArrayList) this.c).size()) {
            ITMSPage b3 = ((ecs) ((ArrayList) this.c).get(this.d)).b();
            if (b3 != null) {
                b3.destroy();
            }
            ((ecs) ((ArrayList) this.c).get(this.d)).e(null);
            this.d = -1;
        }
        int i3 = this.b;
        ITMSPage b4 = (i3 < 0 || i3 >= ((ArrayList) this.c).size()) ? null : ((ecs) ((ArrayList) this.c).get(this.b)).b();
        boolean z = b4 == null;
        String c2 = b4 == null ? null : b4.c();
        ecs ecsVar = (ecs) ((ArrayList) this.c).get(i);
        ITMSPage b5 = ecsVar.b();
        if (b5 == null) {
            String c3 = ecsVar.c();
            if (c3 == null) {
                return false;
            }
            b5 = n(this.f17267a, c3, z, i);
            if (b5 == null) {
                this.f17267a.getInstance().x0(eas.h);
                return false;
            }
            k8c k8cVar = (k8c) b5.getExtension(k8c.class);
            if (k8cVar != null) {
                k8cVar.Z(c2);
            }
            IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
            if (iContainerViewFactory == null) {
                x5dVar = null;
            } else {
                Activity I = this.f17267a.getInstance().I();
                ckf.f(I, "page.getInstance().activity");
                x5dVar = iContainerViewFactory.createPageContainer(I, b5);
            }
            if (x5dVar == null) {
                return false;
            }
            b5.B(new d(x5dVar));
            if (b4 != null) {
                b4.onViewDisappear();
                b5.onViewAppear();
            }
            b5.s();
            ((ecs) ((ArrayList) this.c).get(i)).e(b5);
        } else if (b4 != null) {
            b4.onViewDisappear();
            b5.onViewAppear();
        }
        this.b = i;
        tll pageContext2 = b5.getPageContext();
        View view = (pageContext2 == null || (pageContainer = pageContext2.getPageContainer()) == null) ? null : pageContainer.getView();
        if (view == null) {
            return false;
        }
        tll pageContext3 = this.f17267a.getPageContext();
        x5d pageContainer3 = pageContext3 == null ? null : pageContext3.getPageContainer();
        if (pageContainer3 == null) {
            this.h = view;
        } else {
            pageContainer3.d(view);
        }
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            lxdVar.r(i);
            Iterator<u1a<Integer, String, xhv>> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().invoke(Integer.valueOf(i), c2);
            }
            return true;
        }
        ckf.y("mTabBar");
        throw null;
    }

    @Override // tb.dyd
    public int O0(ITMSPage iTMSPage) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a108eb05", new Object[]{this, iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "page");
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            if (ckf.b(((ecs) it.next()).b(), iTMSPage)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // tb.dyd
    public boolean j(int i, TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83744cc", new Object[]{this, new Integer(i), tabBarItem})).booleanValue();
        }
        ckf.g(tabBarItem, "model");
        if (i < 0 || i >= ((ArrayList) this.c).size()) {
            return false;
        }
        TabBarItem a2 = ((ecs) ((ArrayList) this.c).get(i)).a();
        TabBarItem tabBarItem2 = new TabBarItem();
        String pageId = tabBarItem.getPageId();
        if (pageId == null) {
            pageId = a2 == null ? null : a2.getPageId();
        }
        tabBarItem2.setPageId(pageId);
        String iconNormal = tabBarItem.getIconNormal();
        if (iconNormal == null) {
            iconNormal = a2 == null ? null : a2.getIconNormal();
        }
        tabBarItem2.setIconNormal(iconNormal);
        String iconSelected = tabBarItem.getIconSelected();
        if (iconSelected == null) {
            iconSelected = a2 == null ? null : a2.getIconSelected();
        }
        tabBarItem2.setIconSelected(iconSelected);
        QueryPass queryPass = tabBarItem.getQueryPass();
        if (queryPass == null) {
            queryPass = a2 == null ? null : a2.getQueryPass();
        }
        tabBarItem2.setQueryPass(queryPass);
        String label = tabBarItem.getLabel();
        if (label == null) {
            label = a2 == null ? null : a2.getLabel();
        }
        tabBarItem2.setLabel(label);
        lxd lxdVar = this.e;
        if (lxdVar == null) {
            ckf.y("mTabBar");
            throw null;
        } else if (!lxdVar.j(i, tabBarItem2)) {
            return false;
        } else {
            ((ecs) ((ArrayList) this.c).get(i)).d(tabBarItem2);
            String pageId2 = tabBarItem.getPageId();
            if (!(pageId2 == null || pageId2.length() == 0)) {
                ((ecs) ((ArrayList) this.c).get(i)).f(tabBarItem.getPageId());
            }
            if (i == this.b) {
                ITMSPage b2 = ((ecs) ((ArrayList) this.c).get(i)).b();
                ckf.d(b2);
                TabBarItem a3 = ((ecs) ((ArrayList) this.c).get(i)).a();
                ckf.d(a3);
                if (s(b2, a3)) {
                    this.d = i;
                }
                return true;
            }
            if (((ecs) ((ArrayList) this.c).get(i)).b() != null) {
                ITMSPage b3 = ((ecs) ((ArrayList) this.c).get(i)).b();
                ckf.d(b3);
                TabBarItem a4 = ((ecs) ((ArrayList) this.c).get(i)).a();
                ckf.d(a4);
                if (s(b3, a4)) {
                    ITMSPage b4 = ((ecs) ((ArrayList) this.c).get(i)).b();
                    if (b4 != null) {
                        b4.destroy();
                    }
                    ((ecs) ((ArrayList) this.c).get(i)).e(null);
                }
            }
            return true;
        }
    }

    @Override // tb.dyd
    public boolean k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7c9afe2", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i < 0 || i >= ((ArrayList) this.c).size() || i2 < 0 || i2 >= ((ArrayList) this.c).size()) {
            return false;
        }
        if (i == i2) {
            return true;
        }
        ((ArrayList) this.c).set(i, (ecs) ((ArrayList) this.c).get(i2));
        ((ArrayList) this.c).set(i2, (ecs) ((ArrayList) this.c).get(i));
        int i3 = this.b;
        if (i3 == i) {
            this.b = i2;
        } else if (i3 == i2) {
            this.b = i;
        }
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            lxdVar.k(i, i2);
            return true;
        }
        ckf.y("mTabBar");
        throw null;
    }

    @Override // tb.dyd
    public boolean m(int i, TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2b87fff", new Object[]{this, new Integer(i), tabBarItem})).booleanValue();
        }
        ckf.g(tabBarItem, "tabBarItemModel");
        if (!q9s.j2() || i < -1 || i > ((ArrayList) this.c).size()) {
            return false;
        }
        if (i == -1) {
            i = ((ArrayList) this.c).size();
        }
        String pageId = tabBarItem.getPageId();
        if ((pageId == null ? null : TMSInstanceExtKt.k(r().getInstance(), pageId)) == null) {
            return false;
        }
        lxd lxdVar = this.e;
        if (lxdVar == null) {
            ckf.y("mTabBar");
            throw null;
        } else if (!lxdVar.m(i, tabBarItem)) {
            return false;
        } else {
            int i2 = this.b;
            if (i <= i2) {
                this.b = i2 + 1;
            }
            List<ecs> list = this.c;
            ecs ecsVar = new ecs();
            ecsVar.f(tabBarItem.getPageId());
            ecsVar.d(tabBarItem);
            xhv xhvVar = xhv.INSTANCE;
            ((ArrayList) list).add(i, ecsVar);
            return true;
        }
    }

    @Override // tb.dyd
    public boolean removeTabItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd32b6bc", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!q9s.j2() || i < 0 || i >= ((ArrayList) this.c).size() || i == this.b) {
            return false;
        }
        lxd lxdVar = this.e;
        if (lxdVar == null) {
            ckf.y("mTabBar");
            throw null;
        } else if (!lxdVar.removeTabItem(i)) {
            return false;
        } else {
            int i2 = this.b;
            if (i < i2) {
                this.b = i2 - 1;
            }
            ITMSPage b2 = ((ecs) ((ArrayList) this.c).remove(i)).b();
            if (b2 != null) {
                b2.destroy();
            }
            return true;
        }
    }

    @Override // tb.dyd
    public boolean v0(TabBar tabBar) {
        lxd lxdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a19c5190", new Object[]{this, tabBar})).booleanValue();
        }
        ckf.g(tabBar, "tabBar");
        if (tabBar.getItems() == null || !this.g.compareAndSet(false, true)) {
            return false;
        }
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
        if (iContainerViewFactory == null) {
            lxdVar = null;
        } else {
            Activity I = this.f17267a.getInstance().I();
            ckf.f(I, "page.getInstance().activity");
            lxdVar = iContainerViewFactory.createTabBar(I, this.f17267a);
        }
        if (lxdVar == null) {
            return false;
        }
        this.e = lxdVar;
        lxdVar.t(new c());
        List<TabBarItem> items = tabBar.getItems();
        ckf.d(items);
        for (TabBarItem tabBarItem : items) {
            List<ecs> list = this.c;
            ecs ecsVar = new ecs();
            ecsVar.f(tabBarItem.getPageId());
            TabBarItem tabBarItem2 = new TabBarItem();
            tabBarItem2.setPageId(tabBarItem.getPageId());
            tabBarItem2.setIconNormal(tabBarItem.getIconNormal());
            tabBarItem2.setIconSelected(tabBarItem.getIconSelected());
            tabBarItem2.setQueryPass(tabBarItem.getQueryPass());
            ecsVar.d(tabBarItem2);
            ((ArrayList) list).add(ecsVar);
        }
        return true;
    }
}
