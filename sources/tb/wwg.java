package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import java.util.Map;
import tb.trc;
import tb.vlc;
import tb.wlb;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class wwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k5h f30966a;
    public long b;
    public long c = 0;
    public long d = 0;
    public boolean e = false;
    public long f = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends trc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/livecard/LiveCardTrackManager$1");
        }

        @Override // tb.trc.a, tb.trc
        public void onRequestMediaPlayer(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
            } else {
                ryr.b(wwg.a(wwg.this).R(), pto.b(wwg.a(wwg.this).U()), "gg_videoMutiTab_livePlay");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends vlc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/livecard/LiveCardTrackManager$3");
        }

        @Override // tb.vlc.a, tb.vlc
        public void onPrepared(uq9 uq9Var, IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a78defb6", new Object[]{this, uq9Var, iMediaPlayer});
            } else {
                s19.d(wwg.a(wwg.this), "prepared");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends vlc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/livecard/LiveCardTrackManager$4");
        }

        @Override // tb.vlc.a, tb.vlc
        public boolean onError(uq9 uq9Var, IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9aa6fc07", new Object[]{this, uq9Var, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            k5h a2 = wwg.a(wwg.this);
            s19.d(a2, "error(" + i + f7l.BRACKET_END_STR);
            wq9.f(wwg.a(wwg.this), "finished");
            ryr.c(wwg.a(wwg.this).R(), pto.b(wwg.a(wwg.this).U()), "liveError", "gg_videoMutiTab_livePlay", null);
            com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().w(pto.b(wwg.a(wwg.this).U()), com.taobao.tao.flexbox.layoutmanager.usertracker.a.FIRST_FRAME_RENDER_FINISH);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/livecard/LiveCardTrackManager$5");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
                return;
            }
            wwg.e(wwg.this, System.currentTimeMillis());
            ir9.b("tbVideoSdkLiveCard", "doActive 时间=" + wwg.d(wwg.this));
            wwg.this.l();
        }
    }

    static {
        t2o.a(468713600);
    }

    public wwg(FluidContext fluidContext, k5h k5hVar) {
        this.f30966a = k5hVar;
        h();
    }

    public static /* synthetic */ k5h a(wwg wwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k5h) ipChange.ipc$dispatch("b968a4d5", new Object[]{wwgVar});
        }
        return wwgVar.f30966a;
    }

    public static /* synthetic */ long b(wwg wwgVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aad888a9", new Object[]{wwgVar, new Long(j)})).longValue();
        }
        wwgVar.d = j;
        return j;
    }

    public static /* synthetic */ long c(wwg wwgVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da8fbcaa", new Object[]{wwgVar, new Long(j)})).longValue();
        }
        wwgVar.c = j;
        return j;
    }

    public static /* synthetic */ long d(wwg wwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71589463", new Object[]{wwgVar})).longValue();
        }
        return wwgVar.b;
    }

    public static /* synthetic */ long e(wwg wwgVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a46f0ab", new Object[]{wwgVar, new Long(j)})).longValue();
        }
        wwgVar.b = j;
        return j;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9d621af", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a6a7381", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
            return;
        }
        this.f30966a.E0().addMediaLifecycleListener((trc.a) new a());
        this.f30966a.F0().addLivePlayerListener((vlc.a) new b());
        this.f30966a.F0().addLivePlayerListener((vlc.a) new c());
        this.f30966a.F0().addLivePlayerListener((vlc.a) new d());
        this.f30966a.N().addCardLifecycleListener((wlb.a) new e());
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb41dc9", new Object[]{this});
            return;
        }
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        ir9.b("tbVideoSdkLiveCard", "onRequestMediaPlayer 重置 业务开始 时间=" + this.b);
    }

    public void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971e71dd", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63dfb07", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends vlc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/livecard/LiveCardTrackManager$2");
        }

        @Override // tb.vlc.a, tb.vlc
        public boolean onInfo(uq9 uq9Var, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b531195d", new Object[]{this, uq9Var, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (3 == j) {
                ir9.a("tbVideoSdkLiveCard", "IDWVideoLifecycleListener onVideoFirstFrame ");
                if (obj instanceof Map) {
                    try {
                        wwg.b(wwg.this, ((Long) ((Map) obj).get("RENDER_START_TIME")).longValue());
                        wwg.c(wwg.this, ((Long) ((Map) obj).get("RENDER_END_TIME")).longValue());
                        wwg.this.l();
                    } catch (Exception unused) {
                    }
                }
                ryr.d(wwg.a(wwg.this).R(), pto.b(wwg.a(wwg.this).U()), "gg_videoMutiTab_livePlay", null);
                com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().w(pto.b(wwg.a(wwg.this).U()), com.taobao.tao.flexbox.layoutmanager.usertracker.a.FIRST_FRAME_RENDER_FINISH);
                s19.d(wwg.a(wwg.this), ImageLoader.Scene.FIRST_FRAME);
                d5w.s(wwg.a(wwg.this).U(), 3, wwg.a(wwg.this).T().f());
            }
            return false;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440620cf", new Object[]{this});
        } else if (!this.e) {
            long j = this.f;
            long j2 = 0;
            if (j > 0) {
                long j3 = this.c;
                if (j3 > 0) {
                    long j4 = j3 - this.d;
                    long j5 = j3 - j;
                    long j6 = this.b;
                    long j7 = j6 > 0 ? j3 - j6 : 0L;
                    k5h k5hVar = this.f30966a;
                    String valueOf = String.valueOf(j5);
                    if (j7 >= 0) {
                        j2 = j7;
                    }
                    com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.I(k5hVar, "live_start_play", valueOf, String.valueOf(j2), String.valueOf(j4), "");
                    this.e = true;
                    ir9.b("tbVideoSdkLiveCard", "真实加载时长=" + j5 + "业务开始时间=" + this.b + " 体验时长 = " + j7 + " 渲染时长=" + j4);
                }
            }
        }
    }
}
