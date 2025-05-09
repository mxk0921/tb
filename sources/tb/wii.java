package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.view.LoadingView;
import com.taobao.taobao.R;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wii implements omc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f30718a;
    public LoadingView b;
    public boolean c;
    public Runnable d;
    public Runnable e;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/wii$a", "Ljava/lang/Runnable;", "Ltb/xhv;", "run", "()V", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            wii.b(wii.this);
            hav.d(wii.d(wii.this), "超时强制隐藏Loading");
            ub3.d("hideLoadingWhenTimeout", "超时强制隐藏Loading", false, 1.0f);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;
        public final /* synthetic */ kmb c;

        public b(Context context, kmb kmbVar) {
            this.b = context;
            this.c = kmbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zxb P;
            DataBizContext B;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View findViewById = ((Activity) this.b).findViewById(R.id.status_container);
            wii.f(wii.this, findViewById);
            if (!(findViewById instanceof ViewGroup)) {
                hav.b(c9x.CART_BIZ_NAME, wii.d(wii.this), "无法找到Loading容器");
                return;
            }
            wii wiiVar = wii.this;
            Activity activity = (Activity) this.b;
            ViewGroup viewGroup = (ViewGroup) findViewById;
            kmb kmbVar = this.c;
            if (!(kmbVar == null || (P = kmbVar.d()) == null || (B = P.B()) == null)) {
                i = B.j();
            }
            wii.g(wiiVar, activity, viewGroup, i);
            wii.e(wii.this);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/wii$c", "Ljava/lang/Runnable;", "Ltb/xhv;", "run", "()V", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ ViewGroup c;

        public c(Activity activity, ViewGroup viewGroup) {
            this.b = activity;
            this.c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wii.c(wii.this, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(479199616);
        t2o.a(479199611);
    }

    public static final /* synthetic */ void b(wii wiiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f24cf7b", new Object[]{wiiVar});
        } else {
            wiiVar.h();
        }
    }

    public static final /* synthetic */ void c(wii wiiVar, Activity activity, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7497b1", new Object[]{wiiVar, activity, viewGroup});
        } else {
            wiiVar.i(activity, viewGroup);
        }
    }

    public static final /* synthetic */ String d(wii wiiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0180c44", new Object[]{wiiVar});
        }
        wiiVar.getClass();
        return "MegaLoadingHandler";
    }

    public static final /* synthetic */ void e(wii wiiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ccf375", new Object[]{wiiVar});
        } else {
            wiiVar.j();
        }
    }

    public static final /* synthetic */ void f(wii wiiVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665dbd98", new Object[]{wiiVar, view});
        } else {
            wiiVar.f30718a = view;
        }
    }

    public static final /* synthetic */ void g(wii wiiVar, Activity activity, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22519a2", new Object[]{wiiVar, activity, viewGroup, new Integer(i)});
        } else {
            wiiVar.p(activity, viewGroup, i);
        }
    }

    @Override // tb.omc
    public void a(kmb kmbVar, Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80afac57", new Object[]{this, kmbVar, context, new Integer(i), str});
        } else if (context instanceof Activity) {
            if (this.b == null) {
                this.b = new LoadingView(context);
            }
            LoadingView loadingView = this.b;
            if (loadingView != null) {
                loadingView.reset();
            }
            LoadingView loadingView2 = this.b;
            if (loadingView2 != null) {
                loadingView2.setMessage(str);
            }
            pav.i(new b(context, kmbVar), 0L);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85630410", new Object[]{this});
            return;
        }
        hav.d("MegaLoadingHandler", "hideLoadingDelay");
        m();
        a aVar = new a();
        this.e = aVar;
        pav.i(aVar, 30000L);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void l(kmb kmbVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("663512a3", new Object[]{this, kmbVar, context, new Integer(i)});
            return;
        }
        hav.d("MegaLoadingHandler", "onFinishLoading");
        o();
        h();
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3a0fed", new Object[]{this});
        } else if (this.e != null) {
            hav.d("MegaLoadingHandler", "removeDelayHideTask");
            pav.f(this.e);
            this.e = null;
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ef22a8", new Object[]{this});
        } else if (this.d != null) {
            hav.d("MegaLoadingHandler", "removeDelayShowTask");
            pav.f(this.d);
            this.d = null;
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1efa8076", new Object[]{this});
            return;
        }
        n();
        m();
        hav.d("MegaLoadingHandler", "removeDelayTasks");
    }

    public final void p(Activity activity, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8112867", new Object[]{this, activity, viewGroup, new Integer(i)});
            return;
        }
        hav.d("MegaLoadingHandler", "showLoadingDelay," + i);
        o();
        c cVar = new c(activity, viewGroup);
        this.d = cVar;
        pav.i(cVar, i);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4115916", new Object[]{this});
            return;
        }
        try {
            hav.d("MegaLoadingHandler", "doHideLoading");
            this.c = false;
            LoadingView loadingView = this.b;
            if (loadingView != null) {
                loadingView.hide();
            }
        } catch (Throwable th) {
            xh8 c2 = xh8.a("Ultron").c("MegaLoadingHandler");
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            f9v.q(c2.message(message));
        }
    }

    public final void i(Activity activity, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c736cc", new Object[]{this, activity, viewGroup});
            return;
        }
        try {
            LoadingView loadingView = this.b;
            if (loadingView != null) {
                hav.d("MegaLoadingHandler", "doShowLoading");
                this.c = true;
                loadingView.show(viewGroup);
            }
        } catch (Throwable th) {
            xh8 c2 = xh8.a("Ultron").c("MegaLoadingHandler");
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            f9v.q(c2.message(message));
        }
    }
}
