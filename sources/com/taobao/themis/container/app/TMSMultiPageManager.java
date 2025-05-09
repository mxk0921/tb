package com.taobao.themis.container.app;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.container.app.page.TMSBaseFragment;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import tb.a07;
import tb.bbs;
import tb.ccs;
import tb.ckf;
import tb.dee;
import tb.dyd;
import tb.i04;
import tb.k8c;
import tb.kas;
import tb.ngb;
import tb.njg;
import tb.p8s;
import tb.q9s;
import tb.qml;
import tb.swd;
import tb.t2o;
import tb.tll;
import tb.vbs;
import tb.x4b;
import tb.x5d;
import tb.y0e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSMultiPageManager implements swd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f13485a;
    public final bbs b;
    public final swd.b c;
    public final njg d = kotlin.a.b(new TMSMultiPageManager$mFragmentManager$2(this));
    public final Deque<ITMSPage> e = new ArrayDeque();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715085);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements tll {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ x5d b;

        public b(x5d x5dVar) {
            this.b = x5dVar;
        }

        @Override // tb.tll
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
            }
            return TMSMultiPageManager.h(TMSMultiPageManager.this);
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
        t2o.a(835715084);
        t2o.a(839909871);
    }

    public TMSMultiPageManager(FragmentActivity fragmentActivity, bbs bbsVar, swd.b bVar) {
        ckf.g(fragmentActivity, "mActivity");
        ckf.g(bbsVar, "mInstance");
        ckf.g(bVar, "mPageStackStatusCallback");
        this.f13485a = fragmentActivity;
        this.b = bbsVar;
        this.c = bVar;
    }

    public static final /* synthetic */ FragmentActivity h(TMSMultiPageManager tMSMultiPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("de75df04", new Object[]{tMSMultiPageManager});
        }
        return tMSMultiPageManager.f13485a;
    }

    public static final /* synthetic */ kas i(TMSMultiPageManager tMSMultiPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kas) ipChange.ipc$dispatch("c560c4c7", new Object[]{tMSMultiPageManager});
        }
        return tMSMultiPageManager.j();
    }

    @Override // tb.swd
    public int c(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48de2872", new Object[]{this, iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "page");
        return i04.e0(this.e, iTMSPage);
    }

    @Override // tb.swd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        e();
        if (q9s.x0()) {
            l();
        }
        Iterator it = ((ArrayDeque) this.e).iterator();
        while (it.hasNext()) {
            ((ITMSPage) it.next()).destroy();
        }
        ((ArrayDeque) this.e).clear();
        kas j = j();
        if (j != null) {
            j.i();
        }
    }

    @Override // tb.swd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b26459", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    @Override // tb.swd
    public boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764f16b1", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (((ArrayDeque) this.e).size() > 1) {
            return k(true);
        }
        if (z) {
            this.c.a();
        }
        return false;
    }

    @Override // tb.swd
    public int getAlivePageCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26f55263", new Object[]{this})).intValue();
        }
        return ((ArrayDeque) this.e).size();
    }

    @Override // tb.swd
    public ITMSPage getPageByIndex(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("a28d109b", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < ((ArrayDeque) this.e).size()) {
            Iterator descendingIterator = ((ArrayDeque) this.e).descendingIterator();
            while (descendingIterator.hasNext()) {
                ITMSPage iTMSPage = (ITMSPage) descendingIterator.next();
                if (i2 == i) {
                    return iTMSPage;
                }
                i2++;
            }
        }
        return null;
    }

    @Override // tb.swd
    public ITMSPage getTopPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("5a383c0c", new Object[]{this});
        }
        ITMSPage iTMSPage = (ITMSPage) ((ArrayDeque) this.e).peek();
        if (iTMSPage == null) {
            return null;
        }
        dyd dydVar = (dyd) iTMSPage.getExtension(dyd.class);
        if (dydVar != null) {
            return dydVar.B();
        }
        return iTMSPage;
    }

    public final kas j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kas) ipChange.ipc$dispatch("a28686cd", new Object[]{this});
        }
        return (kas) this.d.getValue();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e38fb9", new Object[]{this});
            return;
        }
        View findViewById = this.f13485a.findViewById(R.id.tms_fragment_container);
        ckf.f(findViewById, "mActivity.findViewById(R…d.tms_fragment_container)");
        ((RelativeLayout) findViewById).removeAllViews();
    }

    @Override // tb.swd
    public boolean a(ITMSPage iTMSPage) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e400fe7f", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        if (((ArrayDeque) this.e).isEmpty()) {
            iTMSPage.getPageParams().b().put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) Boolean.TRUE);
            z = true;
        }
        ITMSPage topPage = getTopPage();
        k8c k8cVar = (k8c) iTMSPage.getExtension(k8c.class);
        View view = null;
        if (k8cVar != null) {
            k8cVar.Z(topPage == null ? null : topPage.c());
        }
        ((ArrayDeque) this.e).push(iTMSPage);
        if (z) {
            View findViewById = this.f13485a.findViewById(R.id.tms_fragment_container);
            ckf.f(findViewById, "mActivity.findViewById(R…d.tms_fragment_container)");
            RelativeLayout relativeLayout = (RelativeLayout) findViewById;
            IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
            x5d createPageContainer = iContainerViewFactory == null ? null : iContainerViewFactory.createPageContainer(this.f13485a, iTMSPage);
            if (!q9s.x1()) {
                Object extension = this.b.getExtension(ngb.class);
                x4b x4bVar = extension instanceof x4b ? (x4b) extension : null;
                if (x4bVar != null) {
                    x4bVar.t(iTMSPage);
                }
            }
            iTMSPage.B(new b(createPageContainer));
            iTMSPage.s();
            if (createPageContainer != null) {
                view = createPageContainer.getView();
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
            relativeLayout.addView(view);
        } else {
            if (topPage != null && qml.z(topPage)) {
                topPage.onPause();
                topPage.onStop();
            }
            TMSBaseFragment h = j().h();
            h.D2(iTMSPage);
            j().k(iTMSPage, h, true);
        }
        return true;
    }

    @Override // tb.swd
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7e21e34", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0) {
            TMSLogger.b("TMSPageManager", "popTo, index must be greater than 0");
            return false;
        } else if (((ArrayDeque) this.e).size() - 1 == i) {
            TMSLogger.b("TMSPageManager", "popTo, index must be less than page stack size");
            return false;
        } else {
            k(true);
            while (((ArrayDeque) this.e).size() - 1 > i) {
                k(false);
            }
            return true;
        }
    }

    @Override // tb.swd
    public boolean d(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a56d860", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        ITMSPage iTMSPage2 = (ITMSPage) ((ArrayDeque) this.e).peek();
        if (iTMSPage2 == null) {
            return false;
        }
        if (qml.z(iTMSPage2)) {
            dyd dydVar = (dyd) iTMSPage2.getExtension(dyd.class);
            ITMSPage B = dydVar == null ? null : dydVar.B();
            if (B != null) {
                B.onPause();
                B.onStop();
            } else {
                iTMSPage2.onPause();
                iTMSPage2.onStop();
            }
        }
        List<ITMSPage> B0 = i04.B0(this.e);
        if (B0.isEmpty()) {
            return false;
        }
        if (qml.z(iTMSPage2)) {
            iTMSPage2.onPause();
            iTMSPage2.onStop();
        }
        k8c k8cVar = (k8c) iTMSPage.getExtension(k8c.class);
        if (k8cVar != null) {
            k8cVar.Z(iTMSPage2.c());
        }
        ((ArrayDeque) this.e).push(iTMSPage);
        TMSBaseFragment h = j().h();
        h.D2(iTMSPage);
        j().k(iTMSPage, h, true);
        for (ITMSPage iTMSPage3 : B0) {
            CommonExtKt.q(new TMSMultiPageManager$resetTo$1(iTMSPage3, this), 300L);
            ((ArrayDeque) this.e).remove(iTMSPage3);
        }
        return true;
    }

    @Override // tb.swd
    public boolean g(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bed53ea", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        ITMSPage iTMSPage2 = (ITMSPage) ((ArrayDeque) this.e).peek();
        if (iTMSPage2 == null) {
            return false;
        }
        if (qml.z(iTMSPage2)) {
            dyd dydVar = (dyd) iTMSPage2.getExtension(dyd.class);
            ITMSPage B = dydVar == null ? null : dydVar.B();
            if (B != null) {
                B.onPause();
                B.onStop();
            } else {
                iTMSPage2.onPause();
                iTMSPage2.onStop();
            }
        }
        k8c k8cVar = (k8c) iTMSPage.getExtension(k8c.class);
        if (k8cVar != null) {
            k8cVar.Z(iTMSPage2.c());
        }
        ((ArrayDeque) this.e).push(iTMSPage);
        TMSBaseFragment h = j().h();
        h.D2(iTMSPage);
        j().k(iTMSPage, h, true);
        dee deeVar = (dee) iTMSPage2.getExtension(dee.class);
        if (deeVar != null) {
            deeVar.a1();
        }
        if (qml.z(iTMSPage2)) {
            CommonExtKt.q(new TMSMultiPageManager$replace$1(iTMSPage2, this), 300L);
        } else {
            j().j(iTMSPage2, false);
        }
        ((ArrayDeque) this.e).remove(iTMSPage2);
        return true;
    }

    public final boolean k(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7194e827", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ITMSPage iTMSPage = (ITMSPage) ((ArrayDeque) this.e).peek();
        if (iTMSPage == null) {
            return false;
        }
        dee deeVar = (dee) iTMSPage.getExtension(dee.class);
        if (deeVar != null) {
            deeVar.a1();
        }
        if (qml.z(iTMSPage)) {
            iTMSPage.destroy();
        } else {
            try {
                j().j(iTMSPage, z);
            } catch (Exception e) {
                TMSLogger.b("TMSPageManager", ckf.p("innerPopPage failed, exception: ", e.getMessage()));
                z2 = false;
            }
        }
        if (!z2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "pageUrl", iTMSPage.c());
            jSONObject.put((JSONObject) "pageStackIndex", (String) Integer.valueOf(((ArrayDeque) this.e).size()));
            jSONObject.put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) Boolean.valueOf(qml.z(iTMSPage)));
            jSONObject.put((JSONObject) "extraParams", (String) iTMSPage.getPageParams().b());
            vbs.e(this.b, "popPage", "failed to popup", jSONObject);
            TMSLogger.b("TMSPageManager", ckf.p("innerPopPage failed, args: ", jSONObject.toJSONString()));
        }
        ((ArrayDeque) this.e).poll();
        if (getAlivePageCount() == 0) {
            this.c.a();
        }
        return z2;
    }
}
