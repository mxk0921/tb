package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import com.taobao.tao.topmultitab.service.viewresue.HomeViewReuseServiceImpl;
import com.taobao.tao.topmultitab.service.viewresue.IHomeViewReuseService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wbo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final wbo f30590a = new wbo();

        static {
            t2o.a(729809362);
        }

        public static /* synthetic */ wbo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wbo) ipChange.ipc$dispatch("8fb8f69c", new Object[0]);
            }
            return f30590a;
        }
    }

    static {
        t2o.a(729809360);
    }

    public static wbo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbo) ipChange.ipc$dispatch("3cdbb702", new Object[0]);
        }
        return b.a();
    }

    public View b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f35f4d9b", new Object[]{this, activity});
        }
        IHomeViewReuseService iHomeViewReuseService = (IHomeViewReuseService) c4b.i().h(IHomeViewReuseService.class);
        if (iHomeViewReuseService != null) {
            return iHomeViewReuseService.inflateRocketView(activity);
        }
        fve.e("RevisionReuseView", "viewReuseService is null");
        return new HomeViewReuseServiceImpl().inflateRocketView(activity);
    }

    public View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ad748b30", new Object[]{this, layoutInflater, viewGroup});
        }
        IHomeViewReuseService iHomeViewReuseService = (IHomeViewReuseService) c4b.i().h(IHomeViewReuseService.class);
        if (iHomeViewReuseService != null) {
            return iHomeViewReuseService.inflateView(layoutInflater, viewGroup);
        }
        fve.e("RevisionReuseView", "viewReuseService is null");
        return new HomeViewReuseServiceImpl().inflateView(layoutInflater, viewGroup);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e34ecd", new Object[]{this});
            return;
        }
        IHomeViewReuseService iHomeViewReuseService = (IHomeViewReuseService) c4b.i().h(IHomeViewReuseService.class);
        IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
        if (iHomeViewReuseService != null && iHomeViewService != null) {
            iHomeViewReuseService.preCreateRootView(iHomeViewService);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5839d311", new Object[]{this});
            return;
        }
        IHomeViewReuseService iHomeViewReuseService = (IHomeViewReuseService) c4b.i().h(IHomeViewReuseService.class);
        if (iHomeViewReuseService != null) {
            iHomeViewReuseService.preCreateTheme();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffe423a", new Object[]{this});
            return;
        }
        IHomeViewReuseService iHomeViewReuseService = (IHomeViewReuseService) c4b.i().h(IHomeViewReuseService.class);
        if (iHomeViewReuseService != null) {
            iHomeViewReuseService.preCreateRocket();
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117690ec", new Object[]{this, new Integer(i)});
            return;
        }
        IHomeViewReuseService iHomeViewReuseService = (IHomeViewReuseService) c4b.i().h(IHomeViewReuseService.class);
        if (iHomeViewReuseService != null) {
            iHomeViewReuseService.setAsyncTaskCount(i);
        }
    }

    public wbo() {
    }
}
