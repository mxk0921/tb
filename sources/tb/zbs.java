package tb;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.utils.ApPathType;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import tb.iwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class zbs implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, iwd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_RECORD_PLAY_STATE = "isRecordAudioPlayState";
    public static final b Companion = new b(null);
    public static final HandlerThread y;
    public static final Handler z;

    /* renamed from: a  reason: collision with root package name */
    public final String f32670a;
    public final ITMSPage b;
    public iwd.a c;
    public String d;
    public boolean e;
    public boolean f;
    public volatile boolean g;
    public long h;
    public int i;
    public final MediaPlayer j;
    public final boolean k = true;
    public final boolean l = true;
    public final boolean m = true;
    public volatile boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public Timer t;
    public final boolean u;
    public boolean v;
    public final TimerTask w;
    public final Runnable x;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ITMSPage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.b(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b96e2075", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.c(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void g(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage.a.C0773a.a(this, iTMSPage);
            try {
                zbs.this.pause();
            } catch (Throwable th) {
                TMSLogger.c("TMSNewPlayerInstance", ckf.p("onPause, pause player error: ", th.getMessage()), th);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void h(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3516433", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.d(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void l(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7a6418b", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.e(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void n(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b526f91", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.f(this, iTMSPage);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(843055187);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final HandlerThread a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HandlerThread) ipChange.ipc$dispatch("63b6951c", new Object[]{this});
            }
            return zbs.o();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32672a;
        public final /* synthetic */ zbs b;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ zbs f32673a;

            public a(zbs zbsVar) {
                this.f32673a = zbsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                zbs.r(this.f32673a, true);
                try {
                    if (zbs.l(this.f32673a)) {
                        zbs.w(this.f32673a);
                    } else if (zbs.p(this.f32673a)) {
                        zbs.w(this.f32673a);
                        zbs.u(this.f32673a, false);
                    }
                } catch (Throwable th) {
                    TMSLogger.c("TMSNewPlayerInstance", "can not play audio", th);
                    zbs.j(this.f32673a, ckf.p("can not play audio: ", th.getMessage()));
                }
            }
        }

        public c(String str, zbs zbsVar) {
            this.f32672a = str;
            this.b = zbsVar;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
                if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.AUDIO)) != null) {
                    executor.execute(new a(this.b));
                }
            } else {
                TMSLogger.b("TMSNewPlayerInstance", ckf.p("cache local audio failed: ", this.f32672a));
                zbs.j(this.b, ckf.p("cache local audio failed:", this.f32672a));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                zbs.A(zbs.this, "onForegroundAudioSeeked", null, 2, null);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long C = zbs.this.C();
                long D = zbs.this.D();
                zbs zbsVar = zbs.this;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) tmu.CURRENT_TIME, (String) Float.valueOf(((float) C) / 1000.0f));
                jSONObject.put((JSONObject) "duration", (String) Float.valueOf(((float) D) / 1000.0f));
                xhv xhvVar = xhv.INSTANCE;
                zbs.k(zbsVar, "onForegroundAudioTimeUpdate", jSONObject);
            } catch (Exception e) {
                TMSLogger.c("TMSNewPlayerInstance", e.getMessage(), e);
            }
            zbs.q(zbs.this);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/zbs$g", "Ljava/util/TimerTask;", "Ltb/xhv;", "run", "()V", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/ability/audio/TMSNewPlayerInstance$onTimeUpdateTask$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long C = zbs.this.C();
                long D = zbs.this.D();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) tmu.CURRENT_TIME, (String) Float.valueOf(((float) C) / 1000.0f));
                jSONObject.put((JSONObject) "duration", (String) Float.valueOf(((float) D) / 1000.0f));
                zbs.k(zbs.this, "onForegroundAudioTimeUpdate", jSONObject);
            } catch (Exception e) {
                TMSLogger.c("TMSNewPlayerInstance", e.getMessage(), e);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/zbs$h", "Ljava/util/TimerTask;", "Ltb/xhv;", "run", "()V", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/ability/audio/TMSNewPlayerInstance$startOnTimeUpdate$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                zbs.m(zbs.this).run();
            }
        }
    }

    public zbs(String str, ITMSPage iTMSPage) {
        ckf.g(str, "mPlayerId");
        ckf.g(iTMSPage, "mPage");
        this.f32670a = str;
        this.b = iTMSPage;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.j = mediaPlayer;
        boolean C = q9s.C();
        this.u = C;
        mediaPlayer.setAudioStreamType(3);
        int i = Build.VERSION.SDK_INT;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(14);
        if (i >= 24) {
            builder.setFlags(256);
        }
        builder.setContentType(2);
        builder.setLegacyStreamType(3);
        mediaPlayer.setAudioAttributes(builder.build());
        if (!C) {
            this.t = new Timer("Themis-Audio-Time-Update-Timer");
        }
        x();
        iTMSPage.C(new a());
        this.w = new g();
        this.x = new f();
    }

    public static /* synthetic */ void A(zbs zbsVar, String str, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bbd5d4", new Object[]{zbsVar, str, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            jSONObject = new JSONObject();
        }
        zbsVar.z(str, jSONObject);
    }

    public static final /* synthetic */ void j(zbs zbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1141ede8", new Object[]{zbsVar, str});
        } else {
            zbsVar.y(str);
        }
    }

    public static final /* synthetic */ void k(zbs zbsVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37c435d", new Object[]{zbsVar, str, jSONObject});
        } else {
            zbsVar.B(str, jSONObject);
        }
    }

    public static final /* synthetic */ boolean l(zbs zbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d69bc0f0", new Object[]{zbsVar})).booleanValue();
        }
        return zbsVar.g;
    }

    public static final /* synthetic */ TimerTask m(zbs zbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimerTask) ipChange.ipc$dispatch("d9c054dc", new Object[]{zbsVar});
        }
        return zbsVar.w;
    }

    public static final /* synthetic */ long n(zbs zbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab9c3dc0", new Object[]{zbsVar})).longValue();
        }
        return zbsVar.h;
    }

    public static final /* synthetic */ HandlerThread o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("bc51cbd", new Object[0]);
        }
        return y;
    }

    public static final /* synthetic */ boolean p(zbs zbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8f068ec", new Object[]{zbsVar})).booleanValue();
        }
        return zbsVar.p;
    }

    public static final /* synthetic */ void q(zbs zbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b30bfc", new Object[]{zbsVar});
        } else {
            zbsVar.I();
        }
    }

    public static final /* synthetic */ void r(zbs zbsVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59baf39e", new Object[]{zbsVar, new Boolean(z2)});
        } else {
            zbsVar.n = z2;
        }
    }

    public static final /* synthetic */ void s(zbs zbsVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c265dadf", new Object[]{zbsVar, new Boolean(z2)});
        } else {
            zbsVar.e = z2;
        }
    }

    public static final /* synthetic */ void t(zbs zbsVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d552d33", new Object[]{zbsVar, new Boolean(z2)});
        } else {
            zbsVar.f = z2;
        }
    }

    public static final /* synthetic */ void u(zbs zbsVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ac8660", new Object[]{zbsVar, new Boolean(z2)});
        } else {
            zbsVar.p = z2;
        }
    }

    public static final /* synthetic */ void v(zbs zbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7455397a", new Object[]{zbsVar});
        } else {
            zbsVar.O();
        }
    }

    public static final /* synthetic */ void w(zbs zbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f607e0", new Object[]{zbsVar});
        } else {
            zbsVar.S();
        }
    }

    public final void B(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8423bd7", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put((JSONObject) "audioPlayerID", this.f32670a);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject2.put((JSONObject) "data", (String) jSONObject);
        if (F() != null) {
            iwd.a F = F();
            if (F != null) {
                F.fireEvent(str, jSONObject2);
                return;
            }
            return;
        }
        this.b.y(str, jSONObject2);
    }

    public final long C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e207", new Object[]{this})).longValue();
        }
        if (!this.q) {
            return 0L;
        }
        return this.j.getCurrentPosition();
    }

    public final long D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        if (!this.q) {
            return 0L;
        }
        return this.j.getDuration();
    }

    public final String E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9939c153", new Object[]{this, new Integer(i)});
        }
        if (i == -1010) {
            return "ERROR_UNSUPPORTED";
        }
        if (i == -1007) {
            return "ERROR_MALFORMED";
        }
        if (i == -1004) {
            return "IO_ERROR";
        }
        if (i == -110) {
            return "TIMED_OUT_ERROR";
        }
        if (i == 1) {
            return "UNKNOWN_ERROR";
        }
        if (i == 100) {
            return "SERVER_DIED";
        }
        if (i != 200) {
            return ckf.p("", Integer.valueOf(i));
        }
        return "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK";
    }

    public iwd.a F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwd.a) ipChange.ipc$dispatch("6016c9e", new Object[]{this});
        }
        return this.c;
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        try {
            return this.j.isPlaying();
        } catch (Exception e2) {
            TMSLogger.c("TMSNewPlayerInstance", e2.getMessage(), e2);
            return false;
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f847fc", new Object[]{this});
        } else {
            z.postDelayed(this.x, 500L);
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476526e5", new Object[]{this});
            return;
        }
        try {
            this.j.release();
        } catch (Exception e2) {
            TMSLogger.c("TMSNewPlayerInstance", e2.getMessage(), e2);
        }
        P();
        this.p = false;
        M();
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d4504", new Object[]{this});
            return;
        }
        this.j.setOnPreparedListener(null);
        this.j.setOnBufferingUpdateListener(null);
        this.j.setOnErrorListener(null);
        this.j.setOnSeekCompleteListener(null);
        this.j.setOnCompletionListener(null);
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b974a997", new Object[]{this});
            return;
        }
        try {
            this.j.reset();
        } catch (Throwable th) {
            TMSLogger.c("TMSNewPlayerInstance", ckf.p("resetPlayer error :", th.getMessage()), th);
        }
        M();
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54d76b9", new Object[]{this});
            return;
        }
        this.q = false;
        this.r = false;
        this.f = false;
        this.e = false;
        this.s = false;
    }

    public final void N(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d0031a", new Object[]{this, new Boolean(z2)});
        } else {
            this.q = z2;
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3452afbe", new Object[]{this});
            return;
        }
        try {
            P();
            if (this.u) {
                I();
            } else {
                this.t = new Timer("Themis-Audio-Time-Update-Timer");
                this.w.cancel();
                Timer timer = this.t;
                if (timer != null) {
                    timer.schedule(new h(), 100L, 500L);
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TMSNewPlayerInstance", ckf.p("onTimeUpdate failed : ", th.getMessage()), th);
        }
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5742b35e", new Object[]{this});
            return;
        }
        try {
            if (this.u) {
                Q();
            } else {
                Timer timer = this.t;
                if (timer != null) {
                    timer.cancel();
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TMSNewPlayerInstance", ckf.p("stopOnTimeUpdate failed : ", th.getMessage()), th);
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36603d1b", new Object[]{this});
            return;
        }
        try {
            z.removeCallbacks(this.x);
        } catch (Throwable th) {
            TMSLogger.c("TMSNewPlayerInstance", th.getMessage(), th);
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c05a98", new Object[]{this});
        } else if (!this.q && !this.r) {
            try {
                this.j.prepareAsync();
            } catch (Exception e2) {
                TMSLogger.c("TMSNewPlayerInstance", e2.getMessage(), e2);
            }
            this.r = true;
        }
    }

    @Override // tb.iwd
    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf1327", new Object[]{this})).floatValue();
        }
        return ((float) C()) / 1000.0f;
    }

    @Override // tb.iwd
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ce40d68", new Object[]{this})).intValue();
        }
        return this.i;
    }

    @Override // tb.iwd
    public void d(iwd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6046615a", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    @Override // tb.iwd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.v = true;
        stop();
        J();
        K();
    }

    @Override // tb.iwd
    public boolean f(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c175601b", new Object[]{this, new Boolean(z2)})).booleanValue();
        }
        return true;
    }

    @Override // tb.iwd
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue();
        }
        return true ^ H();
    }

    @Override // tb.iwd
    public float getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a81", new Object[]{this})).floatValue();
        }
        return ((float) D()) / 1000.0f;
    }

    @Override // tb.iwd
    public boolean h(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37d71591", new Object[]{this, new Boolean(z2)})).booleanValue();
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae0494f", new Object[]{this, mediaPlayer, new Integer(i)});
            return;
        }
        ckf.g(mediaPlayer, "mediaPlayer");
        this.i = i;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6fc624", new Object[]{this, mediaPlayer});
            return;
        }
        ckf.g(mediaPlayer, "mediaPlayer");
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.AUDIO)) != null) {
            executor.execute(new d(mediaPlayer));
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0048390", new Object[]{this, mediaPlayer});
            return;
        }
        ckf.g(mediaPlayer, "mediaPlayer");
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.AUDIO)) != null) {
            executor.execute(new e());
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fb81a1", new Object[]{this});
            return;
        }
        this.j.setOnPreparedListener(this);
        this.j.setOnBufferingUpdateListener(this);
        this.j.setOnErrorListener(this);
        this.j.setOnSeekCompleteListener(this);
        this.j.setOnCompletionListener(this);
    }

    public final void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e31764", new Object[]{this, str});
            return;
        }
        TMSLogger.b("TMSNewPlayerInstance", "broadcastError id=" + this.f32670a + ",error = " + str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "audioPlayerID", this.f32670a);
        jSONObject2.put((JSONObject) "error", str);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) "data", (String) jSONObject2);
        if (F() != null) {
            iwd.a F = F();
            if (F != null) {
                F.fireEvent("onForegroundAudioError", jSONObject);
                return;
            }
            return;
        }
        this.b.y("onForegroundAudioError", jSONObject);
    }

    public final void z(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb59fc06", new Object[]{this, str, jSONObject});
            return;
        }
        TMSLogger.b("TMSNewPlayerInstance", "broadcastEvent id=" + this.f32670a + ",event = " + str);
        B(str, jSONObject);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MediaPlayer b;

        public d(MediaPlayer mediaPlayer) {
            this.b = mediaPlayer;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                zbs.this.N(true);
                zbs.A(zbs.this, "onForegroundAudioCanPlay", null, 2, null);
                if (!zbs.l(zbs.this) && !zbs.p(zbs.this)) {
                    return;
                }
                zbs.u(zbs.this, false);
                if (!this.b.isPlaying()) {
                    if (zbs.n(zbs.this) != 0) {
                        this.b.seekTo((int) zbs.n(zbs.this));
                    }
                    this.b.start();
                    zbs.s(zbs.this, false);
                    zbs.t(zbs.this, false);
                    zbs.A(zbs.this, "onForegroundAudioPlay", null, 2, null);
                    zbs.v(zbs.this);
                }
            } catch (Exception e) {
                TMSLogger.c("TMSNewPlayerInstance", e.getMessage(), e);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3e3b6fb", new Object[]{this, mediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ckf.g(mediaPlayer, "mediaPlayer");
        String E = E(i);
        String E2 = E(i2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "what", E);
        jSONObject.put((JSONObject) "extra", E2);
        String jSONString = jSONObject.toJSONString();
        ckf.f(jSONString, "errorInfo.toJSONString()");
        y(jSONString);
        this.s = true;
        return true;
    }

    @Override // tb.iwd
    public boolean pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue();
        }
        if (H()) {
            MediaPlayer mediaPlayer = this.j;
            ckf.d(mediaPlayer);
            mediaPlayer.pause();
            this.e = true;
            A(this, "onForegroundAudioPause", null, 2, null);
            P();
        }
        return true;
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61c0d71", new Object[]{this});
        } else if (this.q) {
            long j = this.h;
            if (j != 0) {
                this.j.seekTo((int) j);
            }
            this.j.start();
            this.e = false;
            this.f = false;
            A(this, "onForegroundAudioPlay", null, 2, null);
            O();
        } else {
            this.p = true;
            S();
        }
    }

    @Override // tb.iwd
    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0c94373", new Object[]{this, new Integer(i)})).booleanValue();
        }
        TMSLogger.a("TMSNewPlayerInstance", "setStartTime: " + i + " id=" + this.f32670a);
        if (this.q || this.f) {
            y("startTime can not change after setting");
            return false;
        }
        this.h = i * 1000;
        return true;
    }

    @Override // tb.iwd
    public boolean i(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c396e4c", new Object[]{this, new Boolean(z2)})).booleanValue();
        }
        TMSLogger.a("TMSNewPlayerInstance", "setAutoPlay: " + z2 + " id=" + this.f32670a);
        if (this.q || this.f) {
            y("autoPlay can not change after setting");
            return false;
        }
        this.g = z2;
        if (this.d != null) {
            if (this.q) {
                this.j.start();
            } else {
                S();
            }
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer});
            return;
        }
        ckf.g(mediaPlayer, "mediaPlayer");
        if (this.m) {
            this.e = true;
        }
        A(this, "onForegroundAudioEnded", null, 2, null);
        P();
    }

    @Override // tb.iwd
    public boolean play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.d)) {
            y("src is null , can not play");
            return false;
        } else if (H()) {
            if (!this.l) {
                this.j.pause();
                this.e = true;
            }
            return true;
        } else {
            if (this.s) {
                L();
            }
            if (this.e) {
                this.j.start();
                this.e = false;
                this.f = false;
                A(this, "onForegroundAudioPlay", null, 2, null);
                O();
            } else {
                try {
                    if (!this.o) {
                        R();
                    } else if (!this.k || !this.n) {
                        this.p = true;
                    } else {
                        R();
                    }
                } catch (Exception e2) {
                    TMSLogger.c("TMSNewPlayerInstance", e2.getMessage(), e2);
                }
            }
            return true;
        }
    }

    @Override // tb.iwd
    public boolean setLoop(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d0b0cb", new Object[]{this, new Boolean(z2)})).booleanValue();
        }
        TMSLogger.a("TMSNewPlayerInstance", "setLoop: " + z2 + " id=" + this.f32670a);
        if (this.v) {
            TMSLogger.b("TMSNewPlayerInstance", "volume can not change after destroyed");
            y("volume can not change after destroyed");
            return false;
        }
        this.j.setLooping(z2);
        return true;
    }

    @Override // tb.iwd
    public boolean setVolume(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3942a781", new Object[]{this, new Float(f2)})).booleanValue();
        }
        TMSLogger.a("TMSNewPlayerInstance", "setVolume: " + f2 + " id=" + this.f32670a);
        if (f2 < 0.0f || f2 > 1.0f) {
            TMSLogger.a("TMSNewPlayerInstance", "setVolume invalid param.");
            y("setVolume invalid param.");
            return false;
        } else if (this.v) {
            TMSLogger.b("TMSNewPlayerInstance", "volume can not change after destroyed");
            y("volume can not change after destroyed");
            return false;
        } else {
            this.j.setVolume(f2, f2);
            return true;
        }
    }

    @Override // tb.iwd
    public boolean stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6623bb8d", new Object[]{this})).booleanValue();
        }
        if (this.f) {
            return true;
        }
        try {
            this.j.stop();
            this.e = false;
            this.f = true;
            this.q = false;
            this.r = false;
            this.p = false;
            this.h = 0L;
            A(this, "onForegroundAudioStop", null, 2, null);
            P();
            return true;
        } catch (IllegalStateException e2) {
            TMSLogger.c("TMSNewPlayerInstance", e2.getMessage(), e2);
            return true;
        }
    }

    static {
        t2o.a(843055185);
        t2o.a(839909483);
        HandlerThread handlerThread = new HandlerThread("themis-audio-timer");
        handlerThread.start();
        y = handlerThread;
        z = new Handler(handlerThread.getLooper());
    }

    public final String G(String str, ITMSPage iTMSPage) {
        String str2;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3808f0c", new Object[]{this, str, iTMSPage});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        ITMSPage iTMSPage2 = this.b;
        ApPathType d2 = iTMSPage2 == null ? null : ws4.d(str, iTMSPage2.getInstance());
        if (d2 == ApPathType.AP_PATH_TYPE_USR) {
            this.o = true;
            this.n = true;
            String a2 = ws4.a(TMSInstanceExtKt.f(iTMSPage.getInstance()), str, d2);
            return a2 == null ? "" : a2;
        }
        if (!tsq.I(str, h1p.HTTPS_PREFIX, false, 2, null) && !tsq.I(str, h1p.HTTP_PREFIX, false, 2, null)) {
            String L = iTMSPage.getInstance().L();
            if (L == null || L.length() == 0) {
                TMSLogger.b("TMSNewPlayerInstance", "page or app is invalid");
            } else {
                byte[] b2 = gcs.b(str, iTMSPage.getInstance());
                if (b2 == null) {
                    return str;
                }
                String a3 = vva.a(eoh.a(b2));
                if (a3.length() == 0) {
                    return str;
                }
                this.o = true;
                int e0 = wsq.e0(str, ".", 0, false, 6, null);
                if (e0 != -1) {
                    str2 = str.substring(e0);
                    ckf.f(str2, "this as java.lang.String).substring(startIndex)");
                } else {
                    str2 = ".mp3";
                }
                String f2 = TMSInstanceExtKt.f(iTMSPage.getInstance());
                String a4 = ws4.a(f2, "https://tmp/audio/" + a3 + str2, ApPathType.AP_PATH_TYPE_TEMP);
                if (a4 == null || a4.length() == 0) {
                    return str;
                }
                File file = new File(a4);
                if (!file.exists() || file.length() != b2.length) {
                    try {
                        parentFile = file.getParentFile();
                    } catch (Exception e2) {
                        TMSLogger.c("TMSNewPlayerInstance", "create local audio file failed: " + ((Object) a4) + ", " + ((Object) e2.getMessage()), e2);
                    }
                    if (parentFile != null && parentFile.exists()) {
                        file.createNewFile();
                        this.n = false;
                        wc9 wc9Var = wc9.INSTANCE;
                        bbs instance = iTMSPage.getInstance();
                        ByteBuffer wrap = ByteBuffer.wrap(b2);
                        ckf.f(wrap, "wrap(audioData)");
                        wc9Var.n(instance, a4, wrap, "ArrayBuffer", new c(str, this));
                        String absolutePath = file.getAbsolutePath();
                        ckf.f(absolutePath, "file.absolutePath");
                        return absolutePath;
                    }
                    File parentFile2 = file.getParentFile();
                    if (parentFile2 != null) {
                        parentFile2.mkdirs();
                    }
                    file.createNewFile();
                    this.n = false;
                    wc9 wc9Var2 = wc9.INSTANCE;
                    bbs instance2 = iTMSPage.getInstance();
                    ByteBuffer wrap2 = ByteBuffer.wrap(b2);
                    ckf.f(wrap2, "wrap(audioData)");
                    wc9Var2.n(instance2, a4, wrap2, "ArrayBuffer", new c(str, this));
                    String absolutePath2 = file.getAbsolutePath();
                    ckf.f(absolutePath2, "file.absolutePath");
                    return absolutePath2;
                }
                this.n = true;
                String absolutePath3 = file.getAbsolutePath();
                ckf.f(absolutePath3, "file.absolutePath");
                return absolutePath3;
            }
        }
        return str;
    }

    @Override // tb.iwd
    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dbfab37", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            y("src can not be null");
            return false;
        }
        ckf.d(str);
        TMSLogger.a("TMSNewPlayerInstance", "setSrc: " + str + " id=" + this.f32670a);
        if (!TextUtils.isEmpty(this.d)) {
            y("src can not change after setting");
            return false;
        }
        L();
        this.o = false;
        this.n = false;
        try {
            if (this.k) {
                str = G(str, this.b);
            }
        } catch (Throwable th) {
            TMSLogger.c("TMSNewPlayerInstance", "setSrc Error: " + str + " id=" + this.f32670a, th);
        }
        if (tsq.I(str, bit.PATH_PREFIX, false, 2, null) && (str = ws4.a(TMSInstanceExtKt.f(this.b.getInstance()), str, ApPathType.AP_PATH_TYPE_TEMP)) == null) {
            str = "";
        }
        this.d = str;
        try {
            this.j.setDataSource(str);
        } catch (Throwable th2) {
            TMSLogger.c("TMSNewPlayerInstance", th2.getMessage(), th2);
            A(this, "onForegroundAudioError", null, 2, null);
        }
        A(this, "onForegroundAudioWaiting", null, 2, null);
        if (this.g) {
            TMSLogger.a("TMSNewPlayerInstance", ckf.p("OnAutoPlay true,call play when setSrc = ", str));
            if (!this.o) {
                S();
            } else if (this.k && this.n) {
                S();
            }
        } else if (!this.o) {
            S();
        } else if (this.n) {
            S();
        }
        return true;
    }

    @Override // tb.iwd
    public boolean seek(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9bfbe8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.f) {
            y("call seek only support in play or paused status ,not stop");
            return false;
        } else if (!this.q) {
            TMSLogger.b("TMSNewPlayerInstance", "call not seek before onCanPlay");
            return false;
        } else {
            try {
                this.j.seekTo(i * 1000);
                A(this, "onForegroundAudioSeeking", null, 2, null);
                return true;
            } catch (Exception e2) {
                TMSLogger.c("TMSNewPlayerInstance", e2.getMessage(), e2);
                y("Exception happened when audio.seek");
                return false;
            }
        }
    }
}
