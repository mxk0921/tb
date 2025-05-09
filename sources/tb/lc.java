package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lc implements ITMSPage.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909887);
        t2o.a(839909865);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage.a
    public void a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
        } else {
            ckf.g(iTMSPage, "page");
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
        mab mabVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if (!iTMSPage.getInstance().c0().isFragmentContainer() && (mabVar = (mab) iTMSPage.getExtension(mab.class)) != null) {
            mabVar.k0();
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
            return;
        }
        ckf.g(iTMSPage, "page");
        ITMSPage.a.C0773a.f(this, iTMSPage);
        g(iTMSPage);
    }
}
