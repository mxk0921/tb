package tb;

import android.content.Intent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import com.taobao.tao.topmultitab.service.searchbar.impl.searchview.SearchBarView;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b0p extends DXRootView.a implements IHomeViewService.b, IPageLifeCycle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16114a = false;
    public final SearchBarView b;
    public final u3b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f16115a;

        public a(DXRootView dXRootView) {
            this.f16115a = dXRootView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b0p.n(b0p.this).a(this.f16115a);
            }
        }
    }

    static {
        t2o.a(729810336);
        t2o.a(729810398);
        t2o.a(729810222);
    }

    public b0p(SearchBarView searchBarView, u3b u3bVar) {
        this.b = searchBarView;
        this.c = u3bVar;
    }

    public static /* synthetic */ Object ipc$super(b0p b0pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/searchbar/impl/searchview/SearchBarAppearStatus");
    }

    public static /* synthetic */ u3b n(b0p b0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3b) ipChange.ipc$dispatch("e3ddd29a", new Object[]{b0pVar});
        }
        return b0pVar.c;
    }

    @Override // com.taobao.android.dinamicx.DXRootView.a
    public void d(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0378a16", new Object[]{this, dXRootView});
            return;
        }
        s();
        fve.e("SearchBarAppearStatus", "onAttachedToWindow");
    }

    @Override // com.taobao.android.dinamicx.DXRootView.a
    public void f(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba36c13", new Object[]{this, dXRootView});
            return;
        }
        t();
        fve.e("SearchBarAppearStatus", "onDetachedFromWindow");
    }

    @Override // com.taobao.android.dinamicx.DXRootView.a
    public void k(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
        } else if (i != 0) {
            t();
            fve.e("SearchBarAppearStatus", "onVisibilityChanged GONE");
        } else if (!q()) {
            s();
            fve.e("SearchBarAppearStatus", "onVisibilityChanged VISIBLE");
        }
    }

    @Override // com.taobao.android.dinamicx.DXRootView.a
    public void m(DXRootView dXRootView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67771788", new Object[]{this, dXRootView, new Integer(i)});
        } else if (i != 0) {
            t();
            fve.e("SearchBarAppearStatus", "onWindowVisibilityChanged GONE");
        } else if (!q()) {
            s();
            fve.e("SearchBarAppearStatus", "onWindowVisibilityChanged VISIBLE");
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d88cfc", new Object[]{this});
        } else if (!this.f16114a) {
            fve.e("SearchBarAppearStatus", "commitRecommendLoopExceptionHomeLoopException");
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acffd587", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onLazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fcb0aa", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.b
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.b
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.b
    public void onPageSelected(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db26523d", new Object[]{this, new Integer(i), str});
        } else {
            p0p.a(str);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.f16114a = false;
        t();
        fve.e("SearchBarAppearStatus", "onPauseByHomePage");
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onResume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
            return;
        }
        this.f16114a = true;
        s();
        fve.e("SearchBarAppearStatus", "onResumeByHomePage");
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
        }
    }

    public final void p(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777840a", new Object[]{this, dXRootView});
        } else if (dXRootView == null) {
            fve.e("SearchBarAppearStatus", "doUiDetect rootView == null");
        } else {
            dXRootView.post(new a(dXRootView));
        }
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dde0d015", new Object[]{this})).booleanValue();
        }
        return h8x.a();
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8fb8b5c", new Object[]{this})).booleanValue();
        }
        if (!f4b.b("fix_home_searchbar_bg_loop_new_enable", true) || !kbq.h(Globals.getApplication())) {
            return false;
        }
        return true;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112f4c21", new Object[]{this});
            return;
        }
        if (!r() || this.f16114a) {
            this.b.onDxSearchBarViewAppear();
            fve.e("SearchBarAppearStatus", "onRootViewAppear");
        } else {
            o();
        }
        IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
        if (iHomeViewService != null) {
            iHomeViewService.postScrollToCurrentPosMessage();
        }
        p(this.b.getDX3SearchView());
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5305405", new Object[]{this});
            return;
        }
        this.b.onDxSearchBarViewDisAppear();
        fve.e("SearchBarAppearStatus", "onRootViewDisappear");
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.f16114a = true;
        fve.e("SearchBarAppearStatus", "onStartByHomePage");
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.f16114a = false;
        fve.e("SearchBarAppearStatus", "onStopByHomePage");
    }
}
