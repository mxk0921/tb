package com.taobao.android.detail2.core.framework.floatwindow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.utils.Global;
import tb.c21;
import tb.ec7;
import tb.jp9;
import tb.pg1;
import tb.qtb;
import tb.t2o;
import tb.txj;
import tb.u11;
import tb.vu3;
import tb.x8e;
import tb.zn9;
import tb.zxc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FloatingVideoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_START_ACTION = "action.com.taobao.taolive.room.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";

    /* renamed from: a  reason: collision with root package name */
    public Context f7131a;
    public final x8e b;
    public int d;
    public int e;
    public final FloatWindow f;
    public boolean c = false;
    public final u11 g = new a();
    public final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.android.detail2.core.framework.floatwindow.FloatingVideoManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/floatwindow/FloatingVideoManager$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            txj.a("FloatingVideoManager", "mVideoReceiver: " + intent.getAction());
            FloatingVideoManager.this.k();
            if (FloatingVideoManager.a(FloatingVideoManager.this) != null) {
                FloatingVideoManager.a(FloatingVideoManager.this).b();
            }
            FloatingVideoManager.this.g();
        }
    };
    public final qtb i = new b();
    public final View.OnClickListener j = new c();
    public final View.OnClickListener k = new d();
    public final View.OnClickListener l = new e();
    public final zxc m = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail2.core.framework.floatwindow.FloatingVideoManager$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0391a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0391a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FloatingVideoManager.this.k();
                if (FloatingVideoManager.a(FloatingVideoManager.this) != null) {
                    FloatingVideoManager.a(FloatingVideoManager.this).b();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FloatingVideoManager.c(FloatingVideoManager.this);
                FloatingVideoManager.this.w();
            }
        }

        public a() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                return;
            }
            txj.a("FloatingVideoManager", "addApmEventListener: " + i);
            if (i == 1) {
                FloatingVideoManager.b(FloatingVideoManager.this).post(new RunnableC0391a());
            } else if (i == 2) {
                FloatingVideoManager.b(FloatingVideoManager.this).post(new b());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements qtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.qtb
        public boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            FloatingVideoManager.d(FloatingVideoManager.this);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FloatingVideoManager.d(FloatingVideoManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
            FloatingVideoManager.this.k();
            if (FloatingVideoManager.a(FloatingVideoManager.this) != null) {
                FloatingVideoManager.a(FloatingVideoManager.this).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (FloatingVideoManager.a(FloatingVideoManager.this) != null) {
                FloatingVideoManager.a(FloatingVideoManager.this).onClick();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements zxc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.zxc
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                txj.a("FloatingVideoManager", "onVideoClose");
            }
        }

        @Override // tb.zxc
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else {
                txj.a("FloatingVideoManager", "onVideoComplete");
            }
        }

        @Override // tb.zxc
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            txj.a("FloatingVideoManager", "onVideoError: " + i + "," + i2);
        }

        @Override // tb.zxc
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            }
        }

        @Override // tb.zxc
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else if (FloatingVideoManager.b(FloatingVideoManager.this) != null && !z) {
                FloatingVideoManager.b(FloatingVideoManager.this).onPauseStatus();
            }
        }

        @Override // tb.zxc
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else if (FloatingVideoManager.b(FloatingVideoManager.this) != null) {
                FloatingVideoManager.b(FloatingVideoManager.this).onPlayStatus();
            }
        }

        @Override // tb.zxc
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            txj.a("FloatingVideoManager", "onVideoPrepared " + obj);
        }

        @Override // tb.zxc
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (FloatingVideoManager.b(FloatingVideoManager.this) != null) {
                FloatingVideoManager.b(FloatingVideoManager.this).setProgress(i, i3);
            }
        }

        @Override // tb.zxc
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            }
        }

        @Override // tb.zxc
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                return;
            }
            txj.a("FloatingVideoManager", "onVideoSeekTo:" + i);
        }

        @Override // tb.zxc
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else if (FloatingVideoManager.b(FloatingVideoManager.this) != null) {
                FloatingVideoManager.b(FloatingVideoManager.this).onPlayStatus();
            }
        }
    }

    static {
        t2o.a(352321834);
    }

    public FloatingVideoManager(Context context, x8e x8eVar) {
        this.f7131a = context;
        this.b = x8eVar;
        this.f = new FloatWindow(context.getApplicationContext());
    }

    public static /* synthetic */ x8e a(FloatingVideoManager floatingVideoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x8e) ipChange.ipc$dispatch("f71f9f3e", new Object[]{floatingVideoManager});
        }
        return floatingVideoManager.b;
    }

    public static /* synthetic */ FloatWindow b(FloatingVideoManager floatingVideoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatWindow) ipChange.ipc$dispatch("38bf71f4", new Object[]{floatingVideoManager});
        }
        return floatingVideoManager.f;
    }

    public static /* synthetic */ void c(FloatingVideoManager floatingVideoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b9b5cd", new Object[]{floatingVideoManager});
        } else {
            floatingVideoManager.p();
        }
    }

    public static /* synthetic */ void d(FloatingVideoManager floatingVideoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48358f8e", new Object[]{floatingVideoManager});
        } else {
            floatingVideoManager.f();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4057a408", new Object[]{this});
            return;
        }
        try {
            WindowManager windowManager = (WindowManager) Global.getApplication().getSystemService(pg1.ATOM_EXT_window);
            if (windowManager != null) {
                q(this.f);
                windowManager.addView(this.f, h());
            }
        } catch (Exception e2) {
            txj.f("FloatingVideoManager", "showFloatingView fail", e2);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6721973e", new Object[]{this});
        } else if (this.f7131a != null) {
            Context context = this.f7131a;
            Intent intent = new Intent(context, context.getClass());
            intent.setFlags(603979776);
            this.f7131a.startActivity(intent);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42911cea", new Object[]{this});
            return;
        }
        try {
            WindowManager windowManager = (WindowManager) Global.getApplication().getSystemService(pg1.ATOM_EXT_window);
            if (windowManager != null) {
                q(this.b.getView());
                windowManager.removeView(this.f);
            }
        } catch (Exception e2) {
            txj.f("FloatingVideoManager", "closeFloatingView fail", e2);
        }
        y();
        x();
        FloatWindow floatWindow = this.f;
        if (floatWindow != null) {
            floatWindow.destroy();
        }
        this.f7131a = null;
    }

    public final WindowManager.LayoutParams h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("e16b84ad", new Object[]{this});
        }
        return jp9.a(this.d, this.e);
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[]{this})).intValue();
        }
        return ec7.b(Global.getApplication());
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
        }
        return ec7.c(Global.getApplication());
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95737d62", new Object[]{this});
            return;
        }
        FloatWindow floatWindow = this.f;
        if (floatWindow != null) {
            floatWindow.setVisibility(8);
        }
        x8e x8eVar = this.b;
        if (x8eVar != null) {
            x8eVar.pauseVideo();
        }
        IpChange ipChange2 = zn9.$ipChange;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d71c04", new Object[]{this});
        } else {
            c21.c(this.g);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aae848b1", new Object[]{this});
            return;
        }
        n();
        l();
        v();
        t();
        r();
        s();
        e();
        w();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae603e1", new Object[]{this});
        } else if (!this.c) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.avplayer.start");
            intentFilter.addAction("action.com.taobao.taolive.room.start");
            Global.getApplication().registerReceiver(this.h, intentFilter);
            this.c = true;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        k();
        g();
        x8e x8eVar = this.b;
        if (x8eVar != null) {
            x8eVar.a();
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        x8e x8eVar = this.b;
        if (x8eVar != null) {
            x8eVar.playVideo();
        }
    }

    public final void q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eee00ee", new Object[]{this, view});
        } else if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a68e117", new Object[]{this});
            return;
        }
        x8e x8eVar = this.b;
        if (x8eVar != null) {
            x8eVar.e(this.m);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb40c8e", new Object[]{this});
            return;
        }
        x8e x8eVar = this.b;
        if (x8eVar != null) {
            x8eVar.d(this.i);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f8c997", new Object[]{this});
            return;
        }
        this.f.setOnClickListener(this.j);
        this.f.setCloseOnClickListener(this.k);
        this.f.setPlayPauseOnClickListener(this.l);
    }

    public final void u() {
        double d2;
        double d3;
        double d4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b76c61", new Object[]{this});
            return;
        }
        x8e x8eVar = this.b;
        if (x8eVar != null) {
            d3 = x8eVar.getView().getWidth();
            d2 = this.b.getView().getHeight();
        } else {
            d3 = 0.0d;
            d2 = 0.0d;
        }
        if (d2 == vu3.b.GEO_NOT_SUPPORT || d3 == vu3.b.GEO_NOT_SUPPORT) {
            d2 = i();
            d3 = j();
        }
        double j = (j() * 4.0d) / 15.0d;
        double d5 = d3 / d2;
        if (Math.abs(d5 - 1.7777777777777777d) < 0.1d) {
            d4 = j;
            j = (16.0d * j) / 9.0d;
        } else {
            if (Math.abs(d5 - 1.0d) < 0.1d) {
                j = (j * 6.0d) / 5.0d;
            } else if (Math.abs(d5 - 0.075d) < 0.1d) {
                d4 = (4.0d * j) / 3.0d;
            } else if (Math.abs(d5 - 0.5625d) < 0.1d) {
                d4 = (16.0d * j) / 9.0d;
            }
            d4 = j;
        }
        int i = (int) j;
        this.d = i;
        int i2 = (int) d4;
        this.e = i2;
        x8e x8eVar2 = this.b;
        if (x8eVar2 != null) {
            x8eVar2.f(i, i2);
        }
    }

    public final void v() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8782d505", new Object[]{this});
            return;
        }
        x8e x8eVar = this.b;
        if (x8eVar != null) {
            view = x8eVar.getView();
        } else {
            view = null;
        }
        if (view != null) {
            u();
            q(view);
            FloatWindow floatWindow = this.f;
            if (floatWindow != null) {
                floatWindow.addVideoView(view);
            }
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba88a25d", new Object[]{this});
            return;
        }
        FloatWindow floatWindow = this.f;
        if (floatWindow != null) {
            floatWindow.setVisibility(0);
            x8e x8eVar = this.b;
            if (x8eVar != null) {
                if (x8eVar.getVideoState() == 1) {
                    this.f.onPlayStatus();
                } else {
                    this.f.onPauseStatus();
                }
            }
            IpChange ipChange2 = zn9.$ipChange;
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d361150", new Object[]{this});
        } else {
            c21.k(this.g);
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2ff215", new Object[]{this});
        } else if (this.c) {
            Global.getApplication().unregisterReceiver(this.h);
            this.c = false;
        }
    }
}
