package com.taobao.android.fluid.framework.media.miniwindow;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.avplayer.DWVideoScreenType;
import java.util.HashMap;
import java.util.Map;
import tb.atb;
import tb.csp;
import tb.jo9;
import tb.p91;
import tb.pb0;
import tb.pg1;
import tb.qtb;
import tb.r8e;
import tb.s81;
import tb.t2o;
import tb.tmu;
import tb.vrp;
import tb.xau;
import tb.ytb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FloatingVideoManager implements ytb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_START_ACTION = "action.com.taobao.taolive.room.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";
    public static volatile FloatingVideoManager m;
    public FluidContext b;
    public Activity c;
    public jo9 d;
    public atb e;
    public int k;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f7867a = new HashMap();
    public boolean f = false;
    public boolean g = false;
    public final pb0 h = new a();
    public final BroadcastReceiver i = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.media.miniwindow.FloatingVideoManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/media/miniwindow/FloatingVideoManager$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if (!"android.intent.action.SCREEN_ON".equals(action)) {
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    if (!FloatingVideoManager.a(FloatingVideoManager.this)) {
                        if (FloatingVideoManager.e(FloatingVideoManager.this) != null && FloatingVideoManager.e(FloatingVideoManager.this).getVideoState() == 1) {
                            FloatingVideoManager.d(FloatingVideoManager.this, true);
                        }
                        FloatingVideoManager.this.j();
                    }
                } else if ("android.intent.action.USER_PRESENT".equals(action) && !FloatingVideoManager.a(FloatingVideoManager.this)) {
                    if (FloatingVideoManager.c(FloatingVideoManager.this) && FloatingVideoManager.e(FloatingVideoManager.this) != null) {
                        FloatingVideoManager.e(FloatingVideoManager.this).playVideo();
                        FloatingVideoManager.d(FloatingVideoManager.this, false);
                    }
                    FloatingVideoManager.this.m();
                }
            }
        }
    };
    public boolean j = false;
    public final BroadcastReceiver l = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.media.miniwindow.FloatingVideoManager.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/media/miniwindow/FloatingVideoManager$3");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            FloatingVideoManager.this.j();
            FloatingVideoManager.this.h();
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends pb0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/media/miniwindow/FloatingVideoManager$1");
        }

        @Override // tb.pb0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (!s81.a(activity) && FloatingVideoManager.a(FloatingVideoManager.this)) {
                if (FloatingVideoManager.c(FloatingVideoManager.this) && FloatingVideoManager.e(FloatingVideoManager.this) != null) {
                    FloatingVideoManager.e(FloatingVideoManager.this).playVideo();
                    FloatingVideoManager.d(FloatingVideoManager.this, false);
                }
                FloatingVideoManager.this.m();
                FloatingVideoManager.b(FloatingVideoManager.this, false);
            }
        }

        @Override // tb.pb0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else if (s81.a(activity) && !FloatingVideoManager.a(FloatingVideoManager.this)) {
                if (FloatingVideoManager.e(FloatingVideoManager.this) != null && FloatingVideoManager.e(FloatingVideoManager.this).getVideoState() == 1) {
                    FloatingVideoManager.d(FloatingVideoManager.this, true);
                }
                FloatingVideoManager.this.j();
                FloatingVideoManager.b(FloatingVideoManager.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7871a;
        public final /* synthetic */ Activity b;

        public b(Context context, Activity activity) {
            this.f7871a = context;
            this.b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (FloatingVideoManager.f(FloatingVideoManager.this) != null) {
                Intent intent = new Intent(this.f7871a, this.b.getClass());
                intent.setFlags(603979776);
                FloatingVideoManager.f(FloatingVideoManager.this).startActivity(intent);
            }
            xau.d(FloatingVideoManager.g(FloatingVideoManager.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements qtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7872a;
        public final /* synthetic */ Activity b;

        public c(Context context, Activity activity) {
            this.f7872a = context;
            this.b = activity;
        }

        @Override // tb.qtb
        public boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            if (FloatingVideoManager.f(FloatingVideoManager.this) != null) {
                Intent intent = new Intent(this.f7872a, this.b.getClass());
                intent.setFlags(603979776);
                FloatingVideoManager.f(FloatingVideoManager.this).startActivity(intent);
            }
            xau.d(FloatingVideoManager.g(FloatingVideoManager.this));
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            FloatingVideoManager.this.j();
            xau.e(FloatingVideoManager.g(FloatingVideoManager.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ atb f7874a;

        public e(atb atbVar) {
            this.f7874a = atbVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (this.f7874a.getVideoState() == 1) {
                this.f7874a.pauseVideo();
                xau.f(FloatingVideoManager.g(FloatingVideoManager.this), true);
            } else {
                this.f7874a.playVideo();
                xau.f(FloatingVideoManager.g(FloatingVideoManager.this), false);
            }
        }
    }

    static {
        t2o.a(468714547);
        t2o.a(452985011);
    }

    public static /* synthetic */ boolean a(FloatingVideoManager floatingVideoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1966ddde", new Object[]{floatingVideoManager})).booleanValue();
        }
        return floatingVideoManager.f;
    }

    public static /* synthetic */ boolean b(FloatingVideoManager floatingVideoManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf5c5bfc", new Object[]{floatingVideoManager, new Boolean(z)})).booleanValue();
        }
        floatingVideoManager.f = z;
        return z;
    }

    public static /* synthetic */ boolean c(FloatingVideoManager floatingVideoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9e033df", new Object[]{floatingVideoManager})).booleanValue();
        }
        return floatingVideoManager.g;
    }

    public static /* synthetic */ boolean d(FloatingVideoManager floatingVideoManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe0dc61b", new Object[]{floatingVideoManager, new Boolean(z)})).booleanValue();
        }
        floatingVideoManager.g = z;
        return z;
    }

    public static /* synthetic */ atb e(FloatingVideoManager floatingVideoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("2e0c38af", new Object[]{floatingVideoManager});
        }
        return floatingVideoManager.e;
    }

    public static /* synthetic */ Activity f(FloatingVideoManager floatingVideoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("75b076eb", new Object[]{floatingVideoManager});
        }
        return floatingVideoManager.c;
    }

    public static /* synthetic */ FluidContext g(FloatingVideoManager floatingVideoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("164481aa", new Object[]{floatingVideoManager});
        }
        return floatingVideoManager.b;
    }

    public static FloatingVideoManager i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingVideoManager) ipChange.ipc$dispatch("b8874a67", new Object[0]);
        }
        if (m == null) {
            synchronized (FloatingVideoManager.class) {
                try {
                    if (m == null) {
                        m = new FloatingVideoManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95737d62", new Object[]{this});
            return;
        }
        jo9 jo9Var = this.d;
        if (!(jo9Var == null || jo9Var.b() == null)) {
            this.d.b().setVisibility(8);
        }
        atb atbVar = this.e;
        if (atbVar != null) {
            atbVar.pauseVideo();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae603e1", new Object[]{this});
            return;
        }
        Application a2 = p91.a();
        if (!this.j) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.avplayer.start");
            intentFilter.addAction("action.com.taobao.taolive.room.start");
            a2.registerReceiver(this.l, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.SCREEN_ON");
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            intentFilter2.addAction("android.intent.action.USER_PRESENT");
            a2.registerReceiver(this.i, intentFilter2);
            p91.a().registerActivityLifecycleCallbacks(this.h);
            this.j = true;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba88a25d", new Object[]{this});
            return;
        }
        jo9 jo9Var = this.d;
        if (jo9Var != null && jo9Var.b() != null) {
            this.d.b().setVisibility(0);
            atb atbVar = this.e;
            if (atbVar == null) {
                return;
            }
            if (atbVar.getVideoState() == 1) {
                this.d.b().play();
            } else {
                this.d.b().pause();
            }
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        jo9 jo9Var = this.d;
        if (jo9Var != null && jo9Var.b() != null && !z) {
            this.d.b().pause();
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        jo9 jo9Var = this.d;
        if (jo9Var != null && jo9Var.b() != null) {
            this.d.b().play();
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        a.d e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        jo9 jo9Var = this.d;
        if (!(jo9Var == null || jo9Var.b() == null)) {
            this.d.b().setProgress(i, i3);
        }
        int i4 = i / 1000;
        if (this.k != i4) {
            this.k = i4;
            com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.b.getService(IDataService.class)).getCurrentMediaSetData();
            if (currentMediaSetData != null && (e2 = currentMediaSetData.e()) != null) {
                String str = e2.c;
                if (!TextUtils.isEmpty(str)) {
                    ((HashMap) this.f7867a).put("state", csp.VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE);
                    ((HashMap) this.f7867a).put("totalTime", String.valueOf(i3 / 1000));
                    ((HashMap) this.f7867a).put(tmu.CURRENT_TIME, String.valueOf(this.k));
                    ((IMessageService) this.b.getService(IMessageService.class)).sendMessage(new vrp(csp.VIDEO_STATE_CHANGE_NAME, str, this.f7867a));
                }
            }
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        jo9 jo9Var = this.d;
        if (jo9Var != null && jo9Var.b() != null) {
            this.d.b().play();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42911cea", new Object[]{this});
            return;
        }
        Application a2 = p91.a();
        try {
            WindowManager windowManager = (WindowManager) a2.getSystemService(pg1.ATOM_EXT_window);
            if (windowManager != null) {
                ViewGroup view = this.e.getView();
                if (!(view == null || view.getParent() == null)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                windowManager.removeView(this.d.b());
            }
        } catch (Throwable th) {
            Log.e(FloatingVideoManager.class.getSimpleName(), th.toString());
        }
        if (this.j) {
            a2.unregisterReceiver(this.l);
            a2.unregisterReceiver(this.i);
            p91.a().unregisterActivityLifecycleCallbacks(this.h);
            this.j = false;
        }
        jo9 jo9Var = this.d;
        if (jo9Var != null) {
            jo9Var.a();
            this.d = null;
        }
        this.c = null;
        m = null;
    }

    public void l(Activity activity, atb atbVar, FluidContext fluidContext) {
        r8e r8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ffb5c34", new Object[]{this, activity, atbVar, fluidContext});
            return;
        }
        this.c = activity;
        this.b = fluidContext;
        k();
        if (atbVar != null) {
            this.e = atbVar;
            Application a2 = p91.a();
            if (this.d == null) {
                this.d = new jo9(a2);
            }
            com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.b.getService(IDataService.class)).getCurrentMediaSetData();
            a.d e2 = currentMediaSetData != null ? currentMediaSetData.e() : null;
            if (e2 == null) {
                r8eVar = new r8e(fluidContext, 0, 0);
            } else {
                r8eVar = new r8e(fluidContext, e2.P(), e2.v());
            }
            this.d.d(atbVar, r8eVar);
            FloatWindow b2 = this.d.b();
            if (b2 != null) {
                b2.setOnClickListener(new b(a2, activity));
                this.e.d(new c(a2, activity));
                b2.setCloseOnClickListener(new d());
                b2.setPlayPauseOnClickListener(new e(atbVar));
            }
            atbVar.D(this);
            try {
                WindowManager windowManager = (WindowManager) a2.getSystemService(pg1.ATOM_EXT_window);
                if (windowManager != null) {
                    FloatWindow b3 = this.d.b();
                    if (b3.getParent() != null) {
                        ((ViewGroup) b3.getParent()).removeView(b3);
                    }
                    windowManager.addView(this.d.b(), this.d.c());
                }
            } catch (Throwable th) {
                Log.e(FloatingVideoManager.class.getSimpleName(), th.toString());
            }
            m();
            xau.a0(this.b);
        }
    }
}
