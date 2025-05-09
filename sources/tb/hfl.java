package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class hfl implements ITMSPage.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(839909889);
            int[] iArr = new int[Window.Orientation.values().length];
            iArr[Window.Orientation.PORTRAIT.ordinal()] = 1;
            iArr[Window.Orientation.LANDSCAPE.ordinal()] = 2;
            iArr[Window.Orientation.UNSPECIFIED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(839909888);
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
        if (b(iTMSPage)) {
            c(iTMSPage);
        }
    }

    public final boolean b(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee036bdb", new Object[]{this, iTMSPage})).booleanValue();
        }
        if (iTMSPage.getExtension(yxd.class) != null || iTMSPage.getInstance().O() == TMSContainerType.EMBEDDED) {
            return false;
        }
        if (!q9s.t0() || !o9s.j(iTMSPage.getInstance().I()) || ckf.b(iTMSPage.f(), "FANVAS")) {
            return true;
        }
        return false;
    }

    public final void c(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4476cd73", new Object[]{this, iTMSPage});
            return;
        }
        int i = a.$EnumSwitchMapping$0[qml.o(iTMSPage).ordinal()];
        if (i == 1) {
            iTMSPage.getInstance().I().setRequestedOrientation(1);
        } else if (i == 2) {
            iTMSPage.getInstance().I().setRequestedOrientation(0);
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
        ITMSPage topPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if (b(iTMSPage) && (topPage = iTMSPage.getInstance().W().getTopPage()) != null && !ckf.b(topPage, iTMSPage)) {
            c(topPage);
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
}
