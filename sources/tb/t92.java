package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import tb.hgb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t92 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseStatePlayer f28573a;
    public Handler b;
    public int c;
    public boolean d;
    public final hgb.a e = new a();
    public final Runnable f = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements hgb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hgb.a
        public void onAppInBackgroud() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c87472c", new Object[]{this});
                return;
            }
            o3s.b("BgMuteTrack_TBLive", "MediaPlayerProxy, onAppInBackgroud");
            t92.a(t92.this, true);
            if (t92.b(t92.this) != null) {
                t92.b(t92.this).postDelayed(t92.c(t92.this), TimeUnit.SECONDS.toMillis(t92.d(t92.this)));
            }
        }

        @Override // tb.hgb.a
        public void onAppInForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
                return;
            }
            o3s.b("BgMuteTrack_TBLive", "MediaPlayerProxy, onAppInForeground");
            t92.a(t92.this, false);
            if (t92.b(t92.this) != null) {
                t92.b(t92.this).removeCallbacks(t92.c(t92.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (t92.e(t92.this) != null && t92.e(t92.this).x0() && t92.e(t92.this).y0() && t92.e(t92.this).e0() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("subBusinessType", t92.e(t92.this).e0().o);
                hashMap.put("bgDelaySeconds", Integer.toString(t92.d(t92.this)));
                hashMap.put("isVideoLoop", Boolean.toString(t92.e(t92.this).e0().A));
                hashMap.put("playToken", t92.e(t92.this).Y());
                hashMap.put(yj4.PARAM_PLAY_URL, t92.e(t92.this).c0());
                hashMap.put("isMiniWindow", String.valueOf(t92.f(t92.this)));
                if (v2s.o().s() != null) {
                    v2s.o().s().a(z9u.KEY_BG_MUTE_STREAMING_LEAK_REPORT, "Page_TaobaoLiveWatch", hashMap);
                }
                t92.e(t92.this).A(RoomPlayerObserver.CommonRoomPlayerEventType.BACKGROUND_MUTE, null);
                o3s.b("BgMuteTrack_TBLive", "MediaPlayerProxy,BgMuteStreamingLeakReport: subBusinessType= " + t92.e(t92.this).e0().o + " , isMiniWindow= " + t92.f(t92.this));
                t92.this.k();
            }
        }
    }

    static {
        t2o.a(779093086);
    }

    public t92(BaseStatePlayer baseStatePlayer) {
        this.f28573a = baseStatePlayer;
        g();
    }

    public static /* synthetic */ boolean a(t92 t92Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94a0bd95", new Object[]{t92Var, new Boolean(z)})).booleanValue();
        }
        t92Var.getClass();
        return z;
    }

    public static /* synthetic */ Handler b(t92 t92Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("d5a5c102", new Object[]{t92Var});
        }
        return t92Var.b;
    }

    public static /* synthetic */ Runnable c(t92 t92Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("eee2e291", new Object[]{t92Var});
        }
        return t92Var.f;
    }

    public static /* synthetic */ int d(t92 t92Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb7124f5", new Object[]{t92Var})).intValue();
        }
        return t92Var.c;
    }

    public static /* synthetic */ BaseStatePlayer e(t92 t92Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("dfcec693", new Object[]{t92Var});
        }
        return t92Var.f28573a;
    }

    public static /* synthetic */ boolean f(t92 t92Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdddcac4", new Object[]{t92Var})).booleanValue();
        }
        return t92Var.d;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        try {
            this.c = sr4.b(sbt.t(), 10);
        } catch (NumberFormatException e) {
            o3s.c("BgMuteTrack_TBLive", "MediaPlayerProxy初始化", e);
        }
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62974b0c", new Object[]{this, new Boolean(z)});
        } else if (!pvs.m1()) {
        } else {
            if (z) {
                v2s.o().f().a(this.e);
            } else {
                v2s.o().f().b(this.e);
            }
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad3159a", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        o3s.b("BgMuteTrack_TBLive", "start注册前后台监听，mStatePlayer= " + this.f28573a);
        h(true);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        o3s.b("BgMuteTrack_TBLive", "stop解注册前后台监听，mStatePlayer= " + this.f28573a);
        h(false);
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacks(this.f, Integer.valueOf(this.c));
        }
        this.f28573a = null;
    }
}
