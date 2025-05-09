package com.taobao.themis.pub.extension;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub.menu.TMSTBMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.util.List;
import tb.bac;
import tb.btc;
import tb.ckf;
import tb.njg;
import tb.t2o;
import tb.tll;
import tb.y0e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBDefaultGlobalMenuPageExtension implements bac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f13682a;
    public final njg b = kotlin.a.b(new TBDefaultGlobalMenuPageExtension$menu$2(this));

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
            TBDefaultGlobalMenuPageExtension.a(TBDefaultGlobalMenuPageExtension.this, iTMSPage);
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b96e2075", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.c(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void g(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.a(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void h(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3516433", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.d(this, iTMSPage);
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
            TBDefaultGlobalMenuPageExtension.a(TBDefaultGlobalMenuPageExtension.this, iTMSPage);
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void n(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b526f91", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.f(this, iTMSPage);
            }
        }
    }

    static {
        t2o.a(844103684);
        t2o.a(839909518);
    }

    public TBDefaultGlobalMenuPageExtension(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f13682a = iTMSPage;
    }

    public static final /* synthetic */ void a(TBDefaultGlobalMenuPageExtension tBDefaultGlobalMenuPageExtension, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ab2aa0", new Object[]{tBDefaultGlobalMenuPageExtension, iTMSPage});
        } else {
            tBDefaultGlobalMenuPageExtension.g(iTMSPage);
        }
    }

    public static final /* synthetic */ ITMSPage f(TBDefaultGlobalMenuPageExtension tBDefaultGlobalMenuPageExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("56bdd3cd", new Object[]{tBDefaultGlobalMenuPageExtension});
        }
        return tBDefaultGlobalMenuPageExtension.f13682a;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        bac.a.b(this, iTMSPage);
        iTMSPage.C(new a());
    }

    @Override // tb.bac
    public void addItems(List<? extends bac.c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7485d997", new Object[]{this, list});
            return;
        }
        ckf.g(list, "item");
        h().b(list);
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            bac.a.c(this);
        }
    }

    public final void g(ITMSPage iTMSPage) {
        btc btcVar;
        y0e titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f86120c4", new Object[]{this, iTMSPage});
            return;
        }
        tll pageContext = iTMSPage.getPageContext();
        TBActionView tBActionView = null;
        if (pageContext == null || (titleBar = pageContext.getTitleBar()) == null) {
            btcVar = null;
        } else {
            btcVar = (btc) titleBar.getAction(btc.class);
        }
        if (btcVar != null) {
            TBPublicMenu publicMenu = h().getPublicMenu();
            View e = btcVar.e();
            if (e instanceof TBActionView) {
                tBActionView = (TBActionView) e;
            }
            if (tBActionView != null) {
                publicMenu.setCustomOverflow(tBActionView);
                btcVar.g();
            }
        }
    }

    public final TMSTBMenu h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSTBMenu) ipChange.ipc$dispatch("722102ea", new Object[]{this});
        }
        return (TMSTBMenu) this.b.getValue();
    }

    @Override // tb.bac
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        h().f();
        h().d();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0026 A[SYNTHETIC] */
    @Override // tb.z5d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w0() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.themis.pub.extension.TBDefaultGlobalMenuPageExtension.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "8fc5065a"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            tb.bac.a.a(r7)
            com.taobao.themis.kernel.page.ITMSPage r2 = r7.f13682a
            com.taobao.themis.kernel.container.Window$c r2 = tb.qml.g(r2)
            if (r2 != 0) goto L_0x001e
            goto L_0x007d
        L_0x001e:
            java.lang.String[] r2 = r2.a()
            if (r2 != 0) goto L_0x0025
            goto L_0x007d
        L_0x0025:
            int r3 = r2.length
        L_0x0026:
            if (r0 >= r3) goto L_0x007d
            r4 = r2[r0]
            int r0 = r0 + r1
            if (r4 == 0) goto L_0x0072
            int r5 = r4.hashCode()
            r6 = -934521548(0xffffffffc84c5534, float:-209236.81)
            if (r5 == r6) goto L_0x0061
            r6 = -191501435(0xfffffffff495eb85, float:-9.502309E31)
            if (r5 == r6) goto L_0x0051
            r6 = 3198785(0x30cf41, float:4.482453E-39)
            if (r5 == r6) goto L_0x0041
            goto L_0x0072
        L_0x0041:
            java.lang.String r5 = "help"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x004a
            goto L_0x0072
        L_0x004a:
            tb.sbs r4 = tb.sbs.INSTANCE
            java.lang.String r4 = r4.f()
            goto L_0x0073
        L_0x0051:
            java.lang.String r5 = "feedback"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x005a
            goto L_0x0072
        L_0x005a:
            tb.sbs r4 = tb.sbs.INSTANCE
            java.lang.String r4 = r4.e()
            goto L_0x0073
        L_0x0061:
            java.lang.String r5 = "report"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006b
            goto L_0x0072
        L_0x006b:
            tb.sbs r4 = tb.sbs.INSTANCE
            java.lang.String r4 = r4.h()
            goto L_0x0073
        L_0x0072:
            r4 = 0
        L_0x0073:
            if (r4 == 0) goto L_0x0026
            com.taobao.themis.pub.menu.TMSTBMenu r5 = r7.h()
            r5.e(r4)
            goto L_0x0026
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.pub.extension.TBDefaultGlobalMenuPageExtension.w0():void");
    }
}
