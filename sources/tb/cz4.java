package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.media.miniwindow.FloatingVideoManager;
import com.taobao.android.fluid.framework.permission.PermissionManager;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cz4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_NAME = "CURRENT_PLAYVIDEO_MGR";
    public static final int DELAY_MILLIS = 1000;
    public final FluidContext c;
    public Activity d;
    public atb e;
    public IMediaService.a f;
    public boolean g;
    public boolean h;
    public boolean j;
    public Handler k;

    /* renamed from: a  reason: collision with root package name */
    public final PermissionManager f17462a = new PermissionManager();
    public final c b = new c(null);
    public boolean i = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (cz4.a(cz4.this) != null && kfj.b(cz4.b(cz4.this)) && !mfj.u(cz4.b(cz4.this))) {
                cz4.a(cz4.this).z(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements PermissionManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.fluid.framework.permission.PermissionManager.a
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
            } else {
                cz4.this.u();
            }
        }

        @Override // com.taobao.android.fluid.framework.permission.PermissionManager.a
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
            } else if (cz4.a(cz4.this) != null) {
                if (cz4.a(cz4.this).getView() != null && cz4.a(cz4.this).getVideoState() == 2 && !cz4.c(cz4.this) && cz4.d(cz4.this)) {
                    cz4.this.v();
                }
                if (cz4.e(cz4.this).c(cz4.a(cz4.this))) {
                    FloatingVideoManager.i().l(cz4.f(cz4.this), cz4.a(cz4.this), cz4.b(cz4.this));
                    cz4.g(cz4.this, true);
                    cz4.h(cz4.this, true);
                }
            }
        }

        @Override // com.taobao.android.fluid.framework.permission.PermissionManager.a
        public void onStartRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
            } else {
                cz4.this.u();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17465a;
        public int b;
        public ViewGroup c;
        public ViewGroup.LayoutParams d;
        public boolean e;

        static {
            t2o.a(468714542);
        }

        public c() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            this.f17465a = 0;
            this.b = 0;
            this.c = null;
            this.d = null;
            this.e = false;
        }

        public void b(atb atbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3abfc6e", new Object[]{this, atbVar});
            } else if (atbVar != null && this.c != null && this.e) {
                atbVar.f(this.f17465a, this.b);
                ViewGroup view = atbVar.getView();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    this.c.addView(view, 0, this.d);
                }
            }
        }

        public boolean c(atb atbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a67002e3", new Object[]{this, atbVar})).booleanValue();
            }
            if (atbVar.getView() == null) {
                this.e = false;
                return false;
            }
            this.f17465a = atbVar.getView().getWidth();
            this.b = atbVar.getView().getHeight();
            this.c = (ViewGroup) atbVar.getView().getParent();
            this.d = atbVar.getView().getLayoutParams();
            this.e = true;
            return true;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        t2o.a(468714539);
    }

    public cz4(FluidContext fluidContext) {
        this.c = fluidContext;
    }

    public static /* synthetic */ atb a(cz4 cz4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("7657da93", new Object[]{cz4Var});
        }
        return cz4Var.e;
    }

    public static /* synthetic */ FluidContext b(cz4 cz4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("f49fd6e7", new Object[]{cz4Var});
        }
        return cz4Var.c;
    }

    public static /* synthetic */ boolean c(cz4 cz4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb5d5c6", new Object[]{cz4Var})).booleanValue();
        }
        return cz4Var.j;
    }

    public static /* synthetic */ boolean d(cz4 cz4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5bd9ac7", new Object[]{cz4Var})).booleanValue();
        }
        return cz4Var.i();
    }

    public static /* synthetic */ c e(cz4 cz4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f9da1dad", new Object[]{cz4Var});
        }
        return cz4Var.b;
    }

    public static /* synthetic */ Activity f(cz4 cz4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("e7b9d303", new Object[]{cz4Var});
        }
        return cz4Var.d;
    }

    public static /* synthetic */ boolean g(cz4 cz4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e7f2f90", new Object[]{cz4Var, new Boolean(z)})).booleanValue();
        }
        cz4Var.h = z;
        return z;
    }

    public static /* synthetic */ void h(cz4 cz4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b9dced", new Object[]{cz4Var, new Boolean(z)});
        } else {
            cz4Var.x(z);
        }
    }

    public void A(IMediaService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4efd99e0", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public final void B() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86c0df0", new Object[]{this});
            return;
        }
        atb atbVar = this.e;
        if (atbVar != null) {
            if (atbVar.getVideoState() == 2) {
                z = true;
            }
            atbVar.C(z);
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d7069af", new Object[]{this})).booleanValue();
        }
        atb atbVar = this.e;
        if (atbVar == null || atbVar.E() || !j()) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        d3a d3aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89437814", new Object[]{this})).booleanValue();
        }
        anl pageInterface = ((IHostPageInterfaceService) this.c.getService(IHostPageInterfaceService.class)).getPageInterface();
        if (pageInterface != null) {
            d3aVar = c3a.a((bod) pageInterface);
        } else {
            Activity activity = this.d;
            if (activity instanceof bod) {
                d3aVar = c3a.a((bod) activity);
            } else {
                d3aVar = null;
            }
        }
        if ((d3aVar == null || !d3aVar.g()) && !((ISceneConfigService) this.c.getService(ISceneConfigService.class)).getSlidePageLockConfigure().c() && !((ISceneConfigService) this.c.getService(ISceneConfigService.class)).isItemRecognizeShowing()) {
            return true;
        }
        return false;
    }

    public atb k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("6464626", new Object[]{this});
        }
        return this.e;
    }

    public final void l() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21208674", new Object[]{this});
            return;
        }
        atb atbVar = this.e;
        if (atbVar != null) {
            atbVar.getVideoState();
        }
        if (!l9f.f().g(this.c) || !l9f.f().m()) {
            z = false;
        } else {
            z = true;
        }
        this.i = z;
        if (this.g && !s81.a(this.d)) {
            atb atbVar2 = this.e;
            if (atbVar2 != null) {
                if (atbVar2.getVideoState() == 2) {
                    z2 = true;
                }
                this.j = z2;
                this.f17462a.e(this.d, new b());
            }
        } else if (!this.i) {
            u();
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be0528d", new Object[]{this});
            return;
        }
        this.g = false;
        if (this.h) {
            FloatingVideoManager.i().h();
            atb atbVar = this.e;
            if (atbVar != null) {
                this.b.b(atbVar);
                IMediaService.a aVar = this.f;
                if (aVar != null) {
                    aVar.l();
                }
            }
            this.h = false;
            x(false);
        }
        if (!pcw.d(this.c)) {
            if (this.e != null && kfj.b(this.c) && !mfj.u(this.c)) {
                Handler handler = this.k;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                this.e.z(true);
            }
            w();
        }
    }

    public void n(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dadc094", new Object[]{this, activity});
        } else {
            this.d = activity;
        }
    }

    public void o(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed21f1f4", new Object[]{this, activity});
            return;
        }
        this.b.a();
        if (this.h) {
            FloatingVideoManager.i().h();
            this.h = false;
        }
        this.f17462a.f(activity);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (this.d != null && this.e != null) {
            B();
            if (this.d.isFinishing()) {
                this.e.pauseVideo();
            }
            l();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.i = false;
        m();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        atb atbVar = this.e;
        if (atbVar != null && atbVar.getVideoState() == 1) {
            this.e.pauseVideo();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        atb atbVar = this.e;
        if (atbVar != null && atbVar.getVideoState() == 1) {
            t();
        }
        if (this.k == null) {
            this.k = new Handler(Looper.getMainLooper());
        }
        this.k.postDelayed(new a(), 1000L);
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        atb atbVar = this.e;
        if (atbVar != null && atbVar.getVideoState() != 1) {
            if (this.e.getVideoState() != 2) {
                this.e.start();
            } else {
                this.e.playVideo();
            }
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        atb atbVar = this.e;
        if (atbVar != null && atbVar.getView() != null && this.e.getVideoState() != 1 && i()) {
            this.e.mute(mfj.u(this.c));
            v();
        }
    }

    public final void x(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd657f8", new Object[]{this, new Boolean(z)});
            return;
        }
        IMessageService iMessageService = (IMessageService) this.c.getService(IMessageService.class);
        a.d currentMediaDetail = ((IDataService) this.c.getService(IDataService.class)).getCurrentMediaDetail();
        if (iMessageService != null && currentMediaDetail != null) {
            HashMap hashMap = new HashMap();
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("state", str);
            iMessageService.sendMessage(new vrp("VSMSG_miniWindowStateChanged", currentMediaDetail.c, hashMap));
        }
    }

    public void y(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd0cdfc", new Object[]{this, atbVar});
        } else {
            this.e = atbVar;
        }
    }

    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18425979", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }
}
