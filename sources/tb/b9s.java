package tb;

import android.app.Activity;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.adapter.ITMSRUMAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.extension.page.AppAPMPageExtension;
import com.taobao.themis.kernel.extension.page.SystemWindowPageExtension;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.page.TMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import tb.bbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b9s implements rwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f16268a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(839909878);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.UNIAPP.ordinal()] = 1;
            iArr[TMSSolutionType.MINIGAME.ordinal()] = 2;
            iArr[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 3;
            iArr[TMSSolutionType.MIX.ordinal()] = 4;
            iArr[TMSSolutionType.WEEX.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements ITMSPage.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.page.ITMSPage.b
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d0ee080", new Object[]{this, iTMSPage});
            } else {
                ckf.g(iTMSPage, "page");
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.b
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70e2d820", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            mab mabVar = (mab) iTMSPage.getExtension(mab.class);
            if (mabVar != null) {
                mabVar.k0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements bbs.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f16269a;

        public c(ITMSPage iTMSPage) {
            this.f16269a = iTMSPage;
        }

        @Override // tb.bbs.b
        public final void a(Activity activity) {
            pgd rumPageExtension;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa6966c4", new Object[]{this, activity});
                return;
            }
            ITMSRUMAdapter iTMSRUMAdapter = (ITMSRUMAdapter) p8s.b(ITMSRUMAdapter.class);
            if (iTMSRUMAdapter != null && (rumPageExtension = iTMSRUMAdapter.getRumPageExtension(this.f16269a)) != null) {
                this.f16269a.x(rumPageExtension);
            }
        }
    }

    static {
        t2o.a(839909877);
        t2o.a(839909869);
    }

    public b9s(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f16268a = bbsVar;
    }

    public final bbs d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.f16268a;
    }

    public void e(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5248520", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if (q9s.B1() || iTMSPage.getInstance().a0() == TMSSolutionType.UNIAPP) {
            iTMSPage.C(new hfl());
        }
        iTMSPage.C(new lc());
        iTMSPage.C(new ccn());
        iTMSPage.C(new nep());
        iTMSPage.C(new m1v());
        iTMSPage.C(new kxt());
    }

    public void f(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aea63f1", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if (iTMSPage.getInstance().c0().isFragmentContainer()) {
            iTMSPage.v(new b());
        }
    }

    public void g(ITMSPage iTMSPage) {
        bac globalMenu;
        pgd rumPageExtension;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecdda0e", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if (TMSInstanceExtKt.e(this.f16268a)) {
            this.f16268a.J(new c(iTMSPage));
        } else {
            ITMSRUMAdapter iTMSRUMAdapter = (ITMSRUMAdapter) p8s.b(ITMSRUMAdapter.class);
            if (!(iTMSRUMAdapter == null || (rumPageExtension = iTMSRUMAdapter.getRumPageExtension(iTMSPage)) == null)) {
                iTMSPage.x(rumPageExtension);
            }
        }
        if (iTMSPage.getPageParams().o()) {
            iTMSPage.x(new ruy(iTMSPage));
        }
        iTMSPage.x(new col(iTMSPage));
        iTMSPage.x(new fas(iTMSPage));
        iTMSPage.x(new cex(iTMSPage));
        iTMSPage.x(new mz9(iTMSPage));
        iTMSPage.x(new e17(iTMSPage));
        iTMSPage.x(new wgv(iTMSPage));
        if (iTMSPage.getInstance().O() == TMSContainerType.GENERIC) {
            iTMSPage.x(new AppAPMPageExtension(iTMSPage));
            iTMSPage.x(new SystemWindowPageExtension(iTMSPage));
            iTMSPage.x(new ifl(iTMSPage));
            iTMSPage.x(new c81(iTMSPage));
            iTMSPage.x(new o21(iTMSPage));
            IGlobalMenuAdapter iGlobalMenuAdapter = (IGlobalMenuAdapter) p8s.b(IGlobalMenuAdapter.class);
            if (!(iGlobalMenuAdapter == null || (globalMenu = iGlobalMenuAdapter.getGlobalMenu(iTMSPage)) == null)) {
                iTMSPage.x(globalMenu);
            }
        }
        iTMSPage.x(new g67(iTMSPage));
        if (iTMSPage.getInstance().O() == TMSContainerType.EMBEDDED) {
            iTMSPage.x(new qb8(iTMSPage));
        }
    }

    @Override // tb.rwd
    public ITMSPage a(String str, Window window, JSONObject jSONObject, String str2) {
        Window window2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("75015e30", new Object[]{this, str, window, jSONObject, str2});
        }
        ckf.g(str, "url");
        if (window == null) {
            mm4 N = this.f16268a.N();
            window2 = N == null ? null : N.f();
        } else {
            window2 = window;
        }
        return c(this.f16268a, new unl(null, str, null, null, false, window2, null, false, null, null, null, null, false, 8157, null), jSONObject == null ? new JSONObject() : jSONObject);
    }

    public ITMSPage c(bbs bbsVar, unl unlVar, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b572675e", new Object[]{this, bbsVar, unlVar, jSONObject});
        }
        ckf.g(bbsVar, "instance");
        ckf.g(unlVar, "pageModel");
        ckf.g(jSONObject, "extraPrams");
        try {
            gld m = CommonExtKt.m(bbsVar);
            if (m != null) {
                m.C("firstPageStartCreate");
            }
            TMSSolutionType a0 = bbsVar.a0();
            int i = a0 == null ? -1 : a.$EnumSwitchMapping$0[a0.ordinal()];
            if (!(i == 1 || i == 2)) {
                String str = null;
                if (i == 3) {
                    Uri g = ies.g(bbsVar.e0());
                    if (g != null) {
                        str = g.getQueryParameter("status_bar_transparent");
                    }
                    z = ckf.b("true", str);
                } else if (i != 4) {
                    if (i == 5) {
                        Uri g2 = ies.g(bbsVar.e0());
                        if (!ckf.b(g2 == null ? null : g2.getQueryParameter("_wx_statusbar_hidden"), "true")) {
                            if (g2 != null) {
                                str = g2.getQueryParameter("wx_statusbar_hidden");
                            }
                            if (ckf.b(str, "true")) {
                            }
                        }
                    }
                    z = false;
                }
            }
            jSONObject.put((JSONObject) ccs.KEY_STATUS_BAR_IMMERSIVE_ENABLE, (String) Boolean.valueOf(z));
            TMSPage tMSPage = new TMSPage(bbsVar, unlVar, jSONObject);
            if (q9s.L()) {
                g(tMSPage);
                e(tMSPage);
                f(tMSPage);
                tMSPage.i();
            } else {
                tMSPage.i();
                g(tMSPage);
                e(tMSPage);
                f(tMSPage);
            }
            gld m2 = CommonExtKt.m(bbsVar);
            if (m2 != null) {
                m2.C("pageCreateEnd");
            }
            return tMSPage;
        } catch (Throwable th) {
            gld m3 = CommonExtKt.m(bbsVar);
            if (m3 != null) {
                m3.C("pageCreateEnd");
            }
            throw th;
        }
    }

    @Override // tb.rwd
    public ITMSPage b(String str, Window window, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("28203f94", new Object[]{this, str, window, str2, jSONObject});
        }
        ckf.g(str, pl4.KEY_PAGE_ID);
        unl k = TMSInstanceExtKt.k(this.f16268a, str);
        if (k == null) {
            return null;
        }
        return c(this.f16268a, unl.b(k, null, str2 == null ? k.k() : str2, null, null, false, TMSInstanceExtKt.n(this.f16268a, str, window), null, false, null, null, null, null, false, 8157, null), jSONObject == null ? new JSONObject() : jSONObject);
    }
}
