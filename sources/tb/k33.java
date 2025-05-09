package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvas;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class k33 implements ITMSPage.a, z5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(834666497);
        t2o.a(839909865);
        t2o.a(839909634);
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        z5d.a.b(this, iTMSPage);
        r(iTMSPage);
        iTMSPage.C(this);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage.a
    public void a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        r(iTMSPage);
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            z5d.a.c(this);
        }
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
            ckf.g(iTMSPage, "page");
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
        } else {
            ITMSPage.a.C0773a.e(this, iTMSPage);
        }
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

    public final void r(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed142e57", new Object[]{this, iTMSPage});
            return;
        }
        i9s.a().e(iTMSPage.getInstance().Q());
        if (q9s.W()) {
            FCanvas.installImageProviderOnce(i9s.a());
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            z5d.a.a(this);
        }
    }
}
