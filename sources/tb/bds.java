package tb;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.tll;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bds implements swd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f16334a;
    public final bbs b;
    public ITMSPage c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements tll {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f16335a;
        public final /* synthetic */ x5d b;

        public a(Activity activity, x5d x5dVar) {
            this.f16335a = activity;
            this.b = x5dVar;
        }

        @Override // tb.tll
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
            }
            return this.f16335a;
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
        t2o.a(835715090);
        t2o.a(839909871);
    }

    public bds(Activity activity, bbs bbsVar) {
        ckf.g(activity, "mActivity");
        ckf.g(bbsVar, "mInstance");
        this.f16334a = activity;
        this.b = bbsVar;
    }

    @Override // tb.swd
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7e21e34", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.swd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ITMSPage iTMSPage = this.c;
        if (iTMSPage != null) {
            iTMSPage.destroy();
        }
    }

    @Override // tb.swd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b26459", new Object[]{this});
        } else {
            this.f16334a.finish();
        }
    }

    @Override // tb.swd
    public boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764f16b1", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!z) {
            return false;
        }
        this.f16334a.finish();
        return true;
    }

    @Override // tb.swd
    public int getAlivePageCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26f55263", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // tb.swd
    public ITMSPage getPageByIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("a28d109b", new Object[]{this, new Integer(i)});
        }
        return this.c;
    }

    @Override // tb.swd
    public ITMSPage getTopPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("5a383c0c", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.swd
    public boolean a(ITMSPage iTMSPage) {
        x5d x5dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e400fe7f", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        iTMSPage.getPageParams().b().put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) Boolean.TRUE);
        Activity I = this.b.I();
        ckf.f(I, "mInstance.activity");
        iTMSPage.s();
        x4b x4bVar = null;
        if (q9s.F0()) {
            x5dVar = new bcs(this.f16334a, iTMSPage);
        } else {
            x5dVar = q9s.l2() ? new zcs(this.f16334a) : null;
        }
        if (!q9s.x1()) {
            Object extension = this.b.getExtension(ngb.class);
            if (extension instanceof x4b) {
                x4bVar = (x4b) extension;
            }
            if (x4bVar != null) {
                x4bVar.t(iTMSPage);
            }
        }
        iTMSPage.B(new a(I, x5dVar));
        if (x5dVar != null) {
            View view = iTMSPage.getView();
            if (view != null) {
                x5dVar.d(view);
            }
            this.f16334a.setContentView(x5dVar.getView());
        } else {
            this.f16334a.setContentView(iTMSPage.getView());
        }
        this.c = iTMSPage;
        return true;
    }

    @Override // tb.swd
    public int c(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48de2872", new Object[]{this, iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "page");
        return 0;
    }

    @Override // tb.swd
    public boolean d(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a56d860", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        return false;
    }

    @Override // tb.swd
    public boolean g(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bed53ea", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        return false;
    }
}
