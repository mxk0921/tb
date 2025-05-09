package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.state.MiniLiveState;
import com.taobao.android.miniLive.ui.TBMiniLiveFloatController;
import com.taobao.tao.Globals;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.HashMap;
import java.util.Map;
import tb.i0m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mmr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBLiveService";
    public static mmr e;
    public TBMiniLiveFloatController b;
    public Handler c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24141a = false;
    public MiniLiveState d = MiniLiveState.LiveStatusClosed;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements i7c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.i7c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b958a2c5", new Object[]{this});
                return;
            }
            mmr.d(mmr.this, false);
            mmr.e(mmr.this, MiniLiveState.LiveStatusSmallWindow);
        }

        @Override // tb.i7c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f8c90d3", new Object[]{this});
                return;
            }
            mmr.d(mmr.this, true);
            mmr.e(mmr.this, MiniLiveState.LiveStatusSmallWindow);
        }

        @Override // tb.i7c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea02e898", new Object[]{this});
                return;
            }
            mmr.d(mmr.this, false);
            mmr.e(mmr.this, MiniLiveState.LiveStatusHidden);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24143a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ View.OnClickListener d;
        public final /* synthetic */ io9 e;
        public final /* synthetic */ so9 f;

        public b(Context context, String str, Map map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var) {
            this.f24143a = context;
            this.b = str;
            this.c = map;
            this.d = onClickListener;
            this.e = io9Var;
            this.f = so9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Context d = v74.d();
                efs.a("TBLiveService", "startMiniLive activity == " + d);
                if (d == null) {
                    d = this.f24143a;
                    efs.a("TBLiveService", "startMiniLive context == null ");
                } else {
                    efs.a("TBLiveService", "startMiniLive context is not root");
                }
                efs.a("TBLiveService", "threadPool thread " + Thread.currentThread().getName());
                if (!f3s.c(d)) {
                    return;
                }
                if (!(d instanceof Application)) {
                    mmr.c(mmr.this, d, this.b, this.c, this.d, this.e, this.f);
                } else if (!mmr.a(mmr.this, d)) {
                    efs.a("TBLiveService", "enablePreCheckPermission preCheckPermission ");
                    long b = v74.b(d);
                    if (b <= 0 || v74.f(f3s.i(), b)) {
                        mmr.b(mmr.this, d, this.b, this.c, this.d, this.e, this.f);
                    }
                } else {
                    mmr.b(mmr.this, d, this.b, this.c, this.d, this.e, this.f);
                }
            } catch (Exception e) {
                efs.a("TBLiveService", "threadPool thread e " + e.getLocalizedMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements i7c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.i7c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b958a2c5", new Object[]{this});
                return;
            }
            mmr.d(mmr.this, false);
            upr.f29549a = false;
            mmr.e(mmr.this, MiniLiveState.LiveStatusClosed);
        }

        @Override // tb.i7c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f8c90d3", new Object[]{this});
            } else {
                mmr.d(mmr.this, true);
            }
        }

        @Override // tb.i7c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea02e898", new Object[]{this});
                return;
            }
            mmr.d(mmr.this, false);
            upr.f29549a = false;
            mmr.e(mmr.this, MiniLiveState.LiveStatusClosed);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements IMediaPlayer.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.b
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
                return;
            }
            if (mmr.f(mmr.this) != null) {
                mmr.f(mmr.this).z();
            }
            mmr.g(mmr.this, null);
            mmr.e(mmr.this, MiniLiveState.LiveStatusClosed);
            upr.f29549a = false;
            mmr.d(mmr.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements IMediaPlayer.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.c
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (mmr.f(mmr.this) != null) {
                mmr.f(mmr.this).I(i);
            }
            if (mmr.f(mmr.this) != null) {
                mmr.f(mmr.this).z();
            }
            mmr.g(mmr.this, null);
            mmr.e(mmr.this, MiniLiveState.LiveStatusClosed);
            upr.f29549a = false;
            mmr.d(mmr.this, false);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements IMediaPlayer.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (j == 3 && mmr.f(mmr.this) != null) {
                mmr.f(mmr.this).J();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements i7c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.i7c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b958a2c5", new Object[]{this});
                return;
            }
            mmr.d(mmr.this, false);
            upr.f29549a = false;
            mmr.e(mmr.this, MiniLiveState.LiveStatusClosed);
        }

        @Override // tb.i7c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f8c90d3", new Object[]{this});
            } else {
                mmr.d(mmr.this, true);
            }
        }

        @Override // tb.i7c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea02e898", new Object[]{this});
                return;
            }
            mmr.d(mmr.this, false);
            upr.f29549a = false;
            mmr.e(mmr.this, MiniLiveState.LiveStatusClosed);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (mmr.f(mmr.this) != null) {
                mmr.f(mmr.this).z();
                mmr.g(mmr.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements i0m.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24150a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ View.OnClickListener d;
        public final /* synthetic */ io9 e;
        public final /* synthetic */ so9 f;
        public final /* synthetic */ String g;

        public i(Context context, String str, Map map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var, String str2) {
            this.f24150a = context;
            this.b = str;
            this.c = map;
            this.d = onClickListener;
            this.e = io9Var;
            this.f = so9Var;
            this.g = str2;
        }

        @Override // tb.i0m.b
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
            } else {
                v74.h(this.f24150a, this.g);
            }
        }

        @Override // tb.i0m.b
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
                return;
            }
            mmr.c(mmr.this, this.f24150a, this.b, this.c, this.d, this.e, this.f);
            HashMap hashMap = new HashMap();
            if (v2s.o().u() != null) {
                hashMap.put("userId", v2s.o().u().getUserId());
            }
            obu.a(this.g, "Grant_Permission", hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24151a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ View.OnClickListener d;
        public final /* synthetic */ io9 e;
        public final /* synthetic */ so9 f;

        public j(Context context, String str, Map map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var) {
            this.f24151a = context;
            this.b = str;
            this.c = map;
            this.d = onClickListener;
            this.e = io9Var;
            this.f = so9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mmr.h(mmr.this, this.f24151a, this.b, this.c, this.d, this.e, this.f);
            efs.a("TBLiveService", "doCheckPermission liveId = " + this.b);
        }
    }

    static {
        t2o.a(779091973);
    }

    public mmr() {
        Globals.getApplication().registerActivityLifecycleCallbacks(new gpr());
    }

    public static /* synthetic */ boolean a(mmr mmrVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe028fa4", new Object[]{mmrVar, context})).booleanValue();
        }
        return mmrVar.x(context);
    }

    public static /* synthetic */ void b(mmr mmrVar, Context context, String str, Map map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e24d628", new Object[]{mmrVar, context, str, map, onClickListener, io9Var, so9Var});
        } else {
            mmrVar.E(context, str, map, onClickListener, io9Var, so9Var);
        }
    }

    public static /* synthetic */ void c(mmr mmrVar, Context context, String str, Map map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b07cec7", new Object[]{mmrVar, context, str, map, onClickListener, io9Var, so9Var});
        } else {
            mmrVar.u(context, str, map, onClickListener, io9Var, so9Var);
        }
    }

    public static /* synthetic */ boolean d(mmr mmrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f94bf5", new Object[]{mmrVar, new Boolean(z)})).booleanValue();
        }
        mmrVar.f24141a = z;
        return z;
    }

    public static /* synthetic */ MiniLiveState e(mmr mmrVar, MiniLiveState miniLiveState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniLiveState) ipChange.ipc$dispatch("ef5b2962", new Object[]{mmrVar, miniLiveState});
        }
        mmrVar.d = miniLiveState;
        return miniLiveState;
    }

    public static /* synthetic */ TBMiniLiveFloatController f(mmr mmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMiniLiveFloatController) ipChange.ipc$dispatch("fb669cdd", new Object[]{mmrVar});
        }
        return mmrVar.b;
    }

    public static /* synthetic */ TBMiniLiveFloatController g(mmr mmrVar, TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMiniLiveFloatController) ipChange.ipc$dispatch("f0c09df5", new Object[]{mmrVar, tBMiniLiveFloatController});
        }
        mmrVar.b = tBMiniLiveFloatController;
        return tBMiniLiveFloatController;
    }

    public static /* synthetic */ void h(mmr mmrVar, Context context, String str, Map map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce93b143", new Object[]{mmrVar, context, str, map, onClickListener, io9Var, so9Var});
        } else {
            mmrVar.k(context, str, map, onClickListener, io9Var, so9Var);
        }
    }

    public static mmr p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mmr) ipChange.ipc$dispatch("65910741", new Object[0]);
        }
        if (e == null) {
            synchronized (mmr.class) {
                try {
                    if (e == null) {
                        e = new mmr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final void A(Context context, Map<String, String> map, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3909709f", new Object[]{this, context, map, onClickListener});
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.T(onClickListener);
        }
    }

    public final void B(io9 io9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee02dc56", new Object[]{this, io9Var});
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.Q(io9Var);
        }
    }

    public final void C(so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3ae4e9", new Object[]{this, so9Var});
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.R(so9Var);
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
            return;
        }
        MiniLiveState miniLiveState = this.d;
        if (miniLiveState != MiniLiveState.LiveStatusGlobalWindow && miniLiveState != MiniLiveState.LiveStatusZoomWindow) {
            TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
            if (tBMiniLiveFloatController != null) {
                tBMiniLiveFloatController.z();
            }
            u4q.b().i();
            this.f24141a = false;
            this.d = MiniLiveState.LiveStatusClosed;
        }
    }

    public final void E(Context context, String str, Map<String, String> map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd66efd6", new Object[]{this, context, str, map, onClickListener, io9Var, so9Var});
            return;
        }
        Handler handler = this.c;
        if (handler != null && context != null) {
            handler.post(new j(context, str, map, onClickListener, io9Var, so9Var));
        }
    }

    public void G(so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d153b76", new Object[]{this, so9Var});
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.R(so9Var);
        }
        u4q.b().e(so9Var);
    }

    public void H(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a0aed6", new Object[]{this, onClickListener});
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.T(onClickListener);
        }
        u4q.b().f(onClickListener);
    }

    public void J(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c3491f", new Object[]{this, context, str, map});
        } else {
            K(context, str, map, null);
        }
    }

    public void K(Context context, String str, Map<String, String> map, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26beaaba", new Object[]{this, context, str, map, onClickListener});
        } else {
            L(context, str, map, onClickListener, null);
        }
    }

    public void L(Context context, String str, Map<String, String> map, View.OnClickListener onClickListener, io9 io9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44cbce5", new Object[]{this, context, str, map, onClickListener, io9Var});
        } else {
            M(context, str, map, onClickListener, io9Var, null);
        }
    }

    public void N(String str, String str2) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5fd4430", new Object[]{this, str, str2});
            return;
        }
        try {
            if (this.b != null) {
                if (TextUtils.isEmpty(str)) {
                    i2 = 0;
                } else {
                    i2 = Integer.valueOf(str).intValue();
                }
                if (!TextUtils.isEmpty(str2)) {
                    i3 = Integer.valueOf(str2).intValue();
                }
                this.b.X(i2, i3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d066bf33", new Object[]{this})).booleanValue();
        }
        efs.a("TBLiveService", "addMiniWindow miniLiveState = " + this.d + " miniLiveFloatController = " + this.b);
        if (this.d == MiniLiveState.LiveStatusZoomWindow) {
            return false;
        }
        upr.f29549a = true;
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController != null) {
            return tBMiniLiveFloatController.w();
        }
        u4q.b().a();
        return false;
    }

    public final boolean j(String str) {
        TBMiniLiveFloatController tBMiniLiveFloatController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87cd1034", new Object[]{this, str})).booleanValue();
        }
        if (f3s.v() && (tBMiniLiveFloatController = this.b) != null) {
            TBMiniLiveFloatController.ControllerStatus D = tBMiniLiveFloatController.D();
            if (D != TBMiniLiveFloatController.ControllerStatus.error && D != TBMiniLiveFloatController.ControllerStatus.destroy) {
                return true;
            }
            s();
        }
        return false;
    }

    public final void k(Context context, String str, Map<String, String> map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var) {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb7fb5f", new Object[]{this, context, str, map, onClickListener, io9Var, so9Var});
        } else if (!TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT >= 24) {
                canDrawOverlays = Settings.canDrawOverlays(context);
                if (canDrawOverlays) {
                    u(context, str, map, onClickListener, io9Var, so9Var);
                } else {
                    i0m.a(context, new i(context, str, map, onClickListener, io9Var, so9Var, gsq.b(map, "bizCode")));
                }
            } else {
                u(context, str, map, onClickListener, io9Var, so9Var);
            }
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.d != MiniLiveState.LiveStatusZoomWindow) {
            u4q.b().j();
            this.d = MiniLiveState.LiveStatusClosed;
            this.f24141a = false;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b68f1cb", new Object[]{this});
            return;
        }
        efs.a("TBLiveService", "destroyGlobalMiniWindow init");
        if (upr.f29549a || this.f24141a) {
            TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
            if (tBMiniLiveFloatController != null) {
                tBMiniLiveFloatController.z();
            }
            u4q.b().i();
            this.b = null;
            this.d = MiniLiveState.LiveStatusClosed;
        }
        this.f24141a = false;
        upr.f29549a = false;
        efs.a("TBLiveService", "destroyGlobalMiniWindow finish");
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8775ee04", new Object[]{this});
            return;
        }
        efs.a("TBLiveService", "destroyMiniLive init");
        MiniLiveState miniLiveState = this.d;
        if (miniLiveState != MiniLiveState.LiveStatusGlobalWindow && miniLiveState != MiniLiveState.LiveStatusZoomWindow) {
            Handler handler = this.c;
            if (!(handler == null || this.b == null)) {
                handler.post(new h());
            }
            u4q.b().i();
            this.d = MiniLiveState.LiveStatusClosed;
            this.f24141a = false;
            efs.a("TBLiveService", "destroyMiniLive finish");
        }
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController == null) {
            return "";
        }
        return tBMiniLiveFloatController.C();
    }

    public View q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController != null) {
            return tBMiniLiveFloatController.G();
        }
        return u4q.b().c();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a6f389", new Object[]{this});
            return;
        }
        efs.a("TBLiveService", "hideAllMiniLive init");
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.z();
            this.b = null;
        }
        u4q.b().i();
        this.f24141a = false;
        efs.a("TBLiveService", "hideAllMiniLive finish");
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b97f4c", new Object[]{this});
            return;
        }
        efs.a("TBLiveService", "hideMiniLive init");
        MiniLiveState miniLiveState = this.d;
        if (miniLiveState != MiniLiveState.LiveStatusGlobalWindow && miniLiveState != MiniLiveState.LiveStatusZoomWindow) {
            TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
            if (tBMiniLiveFloatController != null) {
                tBMiniLiveFloatController.z();
                this.b = null;
            }
            u4q.b().i();
            this.f24141a = false;
            efs.a("TBLiveService", "hideMiniLive finish");
        }
    }

    public final void u(Context context, String str, Map<String, String> map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b853410", new Object[]{this, context, str, map, onClickListener, io9Var, so9Var});
        } else if (this.f24141a || map == null || TextUtils.isEmpty(str)) {
            efs.a("TBLiveService", "internalStartMiniLive condition was not satisfied");
        } else {
            efs.a("TBLiveService", "isShowFloatWindow = " + this.f24141a);
            String b2 = gsq.b(map, "bizCode");
            String b3 = gsq.b(map, "algParams");
            if (!TextUtils.isEmpty(b2)) {
                if (j(str)) {
                    efs.a("TBLiveService", "internalStartMiniLive checkMiniLiveFloatControllerStatus return");
                    return;
                }
                TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
                if (tBMiniLiveFloatController == null) {
                    this.d = MiniLiveState.LiveStatusSmallWindow;
                    TBMiniLiveFloatController tBMiniLiveFloatController2 = new TBMiniLiveFloatController(context, str, b2, b3, pg1.ATOM_EXT_window, map);
                    this.b = tBMiniLiveFloatController2;
                    tBMiniLiveFloatController2.S(new a());
                    efs.a("TBLiveService", "internalStartMiniLive");
                } else {
                    MiniLiveState miniLiveState = this.d;
                    if (miniLiveState == MiniLiveState.LiveStatusClosed) {
                        tBMiniLiveFloatController.P(context, str, b2, b3, pg1.ATOM_EXT_window, map);
                    } else if (miniLiveState == MiniLiveState.LiveStatusSmallWindow) {
                        tBMiniLiveFloatController.P(context, str, b2, b3, pg1.ATOM_EXT_window, map);
                    }
                    efs.a("TBLiveService", "internalStartMiniLive  miniLiveState = " + this.d);
                }
                A(context, map, onClickListener);
                B(io9Var);
                C(so9Var);
            }
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController == null || !tBMiniLiveFloatController.H()) {
            return false;
        }
        return true;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("247b4db0", new Object[]{this})).booleanValue();
        }
        return this.f24141a;
    }

    public final boolean x(Context context) {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("102df5d1", new Object[]{this, context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        canDrawOverlays = Settings.canDrawOverlays(context);
        return canDrawOverlays;
    }

    public void y(htn htnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f836655", new Object[]{this, htnVar});
        } else {
            u4q.b().d(htnVar);
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e82b7d54", new Object[]{this})).booleanValue();
        }
        if (this.d == MiniLiveState.LiveStatusZoomWindow) {
            return false;
        }
        u4q.b().j();
        upr.f29549a = false;
        TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
        if (tBMiniLiveFloatController != null) {
            return tBMiniLiveFloatController.N();
        }
        return false;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7de7039", new Object[]{this});
            return;
        }
        efs.a("TBLiveService", "scrollHideMiniLive init");
        MiniLiveState miniLiveState = this.d;
        if (miniLiveState != MiniLiveState.LiveStatusGlobalWindow && miniLiveState != MiniLiveState.LiveStatusZoomWindow) {
            TBMiniLiveFloatController tBMiniLiveFloatController = this.b;
            if (tBMiniLiveFloatController != null) {
                tBMiniLiveFloatController.z();
                this.b = null;
            }
            u4q.b().i();
            this.f24141a = false;
            efs.a("TBLiveService", "scrollHideMiniLive finish");
        }
    }

    public void M(Context context, String str, Map<String, String> map, View.OnClickListener onClickListener, io9 io9Var, so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f0d0cd", new Object[]{this, context, str, map, onClickListener, io9Var, so9Var});
            return;
        }
        MiniLiveState miniLiveState = this.d;
        if (miniLiveState != MiniLiveState.LiveStatusGlobalWindow && miniLiveState != MiniLiveState.LiveStatusZoomWindow) {
            if (f3s.n()) {
                boolean z = upr.f29549a;
            }
            if (upr.b && !upr.f29549a) {
                efs.a("TBLiveService", "startMiniLive init");
                if (this.c == null) {
                    this.c = new Handler(Looper.getMainLooper());
                }
                this.c.removeCallbacksAndMessages(null);
                vpr.b().a(new b(context, str, map, onClickListener, io9Var, so9Var));
            }
        }
    }

    public void I(Context context, VideoInfo videoInfo, String str, String str2, Map<String, String> map, tjl tjlVar) {
        String str3;
        Context context2 = context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202a205b", new Object[]{this, context2, videoInfo, str, str2, map, tjlVar});
            return;
        }
        efs.a("TBLiveService", "startMiniLive init");
        if (videoInfo != null) {
            this.d = MiniLiveState.LiveStatusZoomWindow;
            if (context2 instanceof Activity) {
                context2 = context.getApplicationContext();
            }
            r4d f2 = s7t.j().f(new PreloadParams.a(context2).F("TBMiniLive").N(false).h0(videoInfo).j0(map).U(PreloadParams.PlayerType.LIVE_ZOOM_WINDOW_TYPE).a0(pvs.x1()).G());
            f2.s(new d());
            f2.d(new e());
            f2.f(new f());
            if (map == null || map.get("triggerMode") == null) {
                str3 = "ZoomBtn";
            } else {
                str3 = map.get("triggerMode");
            }
            String str4 = "unknown";
            String str5 = (map == null || map.get("liveSource") == null) ? str4 : map.get("liveSource");
            if (!(map == null || map.get("entryLiveSource") == null)) {
                str4 = map.get("entryLiveSource");
            }
            if (!(map == null || map.get("spm") == null)) {
                str4 = map.get("spm");
            }
            if (!(map == null || map.get("trackInfo") == null)) {
                str4 = map.get("trackInfo");
            }
            u4q.b().g(context2, f2, videoInfo, str, str2, str3, str5, str4, "unknown", "unknown", (map == null || map.get(yj4.PARAM_IS_LIVE_MUTE) == null) ? false : zqq.c(map.get(yj4.PARAM_IS_LIVE_MUTE)), (map == null || map.get(sya.IS_REPLAY_UPDATE) == null) ? false : zqq.c(map.get(sya.IS_REPLAY_UPDATE)), new g(), tjlVar);
        }
    }

    public void t(Context context, IPlayPublicService iPlayPublicService, VideoInfo videoInfo, String str, boolean z, boolean z2, Map<String, String> map, tjl tjlVar) {
        Context context2 = context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5080b8", new Object[]{this, context2, iPlayPublicService, videoInfo, str, new Boolean(z), new Boolean(z2), map, tjlVar});
            return;
        }
        efs.a("TBLiveService", "startMiniLive init");
        if (this.d != MiniLiveState.LiveStatusZoomWindow) {
            if (!ejr.e() || !up6.u0(vx9.d()) || !up6.z0(vx9.d())) {
                this.d = MiniLiveState.LiveStatusGlobalWindow;
                if ((context2 instanceof Activity) && z2) {
                    context2 = context.getApplicationContext();
                }
                String str2 = "unknown";
                String str3 = (map == null || map.get("liveSource") == null) ? str2 : map.get("liveSource");
                if (!(map == null || map.get("entryLiveSource") == null)) {
                    str2 = map.get("entryLiveSource");
                }
                if (!(map == null || map.get("spm") == null)) {
                    str2 = map.get("spm");
                }
                if (!(map == null || map.get("trackInfo") == null)) {
                    str2 = map.get("trackInfo");
                }
                u4q.b().h(context2, iPlayPublicService, videoInfo, str, null, str3, str2, "unknown", "unknown", (map == null || map.get(yj4.PARAM_IS_LIVE_MUTE) == null) ? false : zqq.c(map.get(yj4.PARAM_IS_LIVE_MUTE)), new c(), tjlVar);
                return;
            }
            efs.a("TBLiveService", "addMiniView isUserCloseSmallWindow");
        }
    }
}
