package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m1v implements ITMSPage.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23726a = true;

    static {
        t2o.a(839909893);
        t2o.a(839909865);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage.a
    public void a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if ((iTMSPage.getInstance().getExtension(x9b.class) == null || !this.f23726a) && iTMSPage.getInstance().O() != TMSContainerType.EMBEDDED) {
            if (iTMSPage.getInstance().a0() != TMSSolutionType.UNIAPP || iTMSPage.getInstance().c0().isFragmentContainer()) {
                IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
                if (iUserTrackerAdapter != null) {
                    iUserTrackerAdapter.pageAppear(iTMSPage.getInstance().I());
                }
            } else {
                IUserTrackerAdapter iUserTrackerAdapter2 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
                if (iUserTrackerAdapter2 != null) {
                    iUserTrackerAdapter2.pageAppearWithRouter(iTMSPage.getInstance().I(), iTMSPage.getInstance().W().getAlivePageCount());
                }
            }
            jes.e(iTMSPage.getInstance());
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
        a(iTMSPage);
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

    @Override // com.taobao.themis.kernel.page.ITMSPage.a
    public void g(ITMSPage iTMSPage) {
        IUserTrackerAdapter iUserTrackerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if (!((iTMSPage.getInstance().getExtension(x9b.class) != null && this.f23726a) || iTMSPage.getInstance().O() == TMSContainerType.EMBEDDED || (iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class)) == null)) {
            iUserTrackerAdapter.pageDisappear(iTMSPage.getInstance().I());
        }
        this.f23726a = false;
    }
}
