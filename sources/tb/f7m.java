package tb;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.permission.check.TMSPermissionManager;
import com.taobao.themis.open.utils.ApPathType;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f7m implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_RECORD_PLAY_STATE = "isRecordAudioPlayState";
    public static final String ERROR_URL_NOT_IN_WHITE_LIST = "please insure your video source is in domain whitelist";

    /* renamed from: a  reason: collision with root package name */
    public final String f19077a;
    public BridgeCallback b;
    public ITMSPage c;
    public String d;
    public boolean e;
    public boolean f;
    public volatile boolean g;
    public boolean h;
    public boolean i;
    public long k;
    public int l;
    public final MediaPlayer m;
    public volatile boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public Timer w;
    public final boolean x;
    public final TimerTask y;
    public final Runnable z;
    public static final a Companion = new a(null);
    public static final Handler A = new Handler(zbs.Companion.a().getLooper());
    public float j = 1.0f;
    public final boolean n = true;
    public final boolean o = true;
    public final boolean p = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(843055170);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final Handler a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("170d21c4", new Object[]{this});
            }
            return f7m.f();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19078a;
        public final /* synthetic */ f7m b;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f7m f19079a;

            public a(f7m f7mVar) {
                this.f19079a = f7mVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                f7m.i(this.f19079a, true);
                try {
                    if (f7m.c(this.f19079a)) {
                        f7m.n(this.f19079a);
                    } else if (f7m.g(this.f19079a)) {
                        f7m.n(this.f19079a);
                        f7m.l(this.f19079a, false);
                    }
                } catch (Throwable th) {
                    TMSLogger.c("TMSPlayerInstance", "can not play audio", th);
                    f7m.a(this.f19079a, ckf.p("can not play audio: ", th.getMessage()));
                }
            }
        }

        public b(String str, f7m f7mVar) {
            this.f19078a = str;
            this.b = f7mVar;
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
                TMSLogger.b("TMSPlayerInstance", ckf.p("cache local audio failed: ", this.f19078a));
                f7m.a(this.b, ckf.p("cache local audio failed:", this.f19078a));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f7m.r(f7m.this, "onForegroundAudioSeeked", null, 2, null);
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
                return;
            }
            try {
                long x = f7m.this.x();
                long y = f7m.this.y();
                f7m f7mVar = f7m.this;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) tmu.CURRENT_TIME, (String) Float.valueOf(((float) x) / 1000.0f));
                jSONObject.put((JSONObject) "duration", (String) Float.valueOf(((float) y) / 1000.0f));
                xhv xhvVar = xhv.INSTANCE;
                f7m.b(f7mVar, "onForegroundAudioTimeUpdate", jSONObject);
            } catch (Exception e) {
                TMSLogger.c("TMSPlayerInstance", e.getMessage(), e);
            }
            f7m.h(f7m.this);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/f7m$f", "Ljava/util/TimerTask;", "Ltb/xhv;", "run", "()V", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/ability/audio/PlayerInstance$onTimeUpdateTask$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long x = f7m.this.x();
                long y = f7m.this.y();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) tmu.CURRENT_TIME, (String) Float.valueOf(((float) x) / 1000.0f));
                jSONObject.put((JSONObject) "duration", (String) Float.valueOf(((float) y) / 1000.0f));
                f7m.b(f7m.this, "onForegroundAudioTimeUpdate", jSONObject);
            } catch (Exception e) {
                TMSLogger.c("TMSPlayerInstance", e.getMessage(), e);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/f7m$g", "Ljava/util/TimerTask;", "Ltb/xhv;", "run", "()V", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/ability/audio/PlayerInstance$startOnTimeUpdate$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f7m.d(f7m.this).run();
            }
        }
    }

    static {
        t2o.a(843055169);
    }

    public f7m(String str) {
        ckf.g(str, "playerId");
        this.f19077a = str;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.m = mediaPlayer;
        boolean C = q9s.C();
        this.x = C;
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
            this.w = new Timer("Themis-Audio-Time-Update-Timer");
        }
        this.y = new f();
        this.z = new e();
    }

    public static final /* synthetic */ void a(f7m f7mVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f0fb6e", new Object[]{f7mVar, str});
        } else {
            f7mVar.p(str);
        }
    }

    public static final /* synthetic */ void b(f7m f7mVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b26257", new Object[]{f7mVar, str, jSONObject});
        } else {
            f7mVar.s(str, jSONObject);
        }
    }

    public static final /* synthetic */ boolean c(f7m f7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99a9d676", new Object[]{f7mVar})).booleanValue();
        }
        return f7mVar.g;
    }

    public static final /* synthetic */ TimerTask d(f7m f7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimerTask) ipChange.ipc$dispatch("31150622", new Object[]{f7mVar});
        }
        return f7mVar.y;
    }

    public static final /* synthetic */ long e(f7m f7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64817b46", new Object[]{f7mVar})).longValue();
        }
        return f7mVar.k;
    }

    public static final /* synthetic */ Handler f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("d64fe9", new Object[0]);
        }
        return A;
    }

    public static final /* synthetic */ boolean g(f7m f7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ab2b72", new Object[]{f7mVar})).booleanValue();
        }
        return f7mVar.s;
    }

    public static final /* synthetic */ void h(f7m f7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259aad82", new Object[]{f7mVar});
        } else {
            f7mVar.O();
        }
    }

    public static final /* synthetic */ void i(f7m f7mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce46f58", new Object[]{f7mVar, new Boolean(z)});
        } else {
            f7mVar.q = z;
        }
    }

    public static final /* synthetic */ void j(f7m f7mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9a1b59", new Object[]{f7mVar, new Boolean(z)});
        } else {
            f7mVar.e = z;
        }
    }

    public static final /* synthetic */ void k(f7m f7mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88babcad", new Object[]{f7mVar, new Boolean(z)});
        } else {
            f7mVar.f = z;
        }
    }

    public static final /* synthetic */ void l(f7m f7mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a23bb9a", new Object[]{f7mVar, new Boolean(z)});
        } else {
            f7mVar.s = z;
        }
    }

    public static final /* synthetic */ void m(f7m f7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd45180", new Object[]{f7mVar});
        } else {
            f7mVar.b0();
        }
    }

    public static final /* synthetic */ void n(f7m f7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13316466", new Object[]{f7mVar});
        } else {
            f7mVar.g0();
        }
    }

    public static /* synthetic */ void r(f7m f7mVar, String str, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74de1a", new Object[]{f7mVar, str, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            jSONObject = new JSONObject();
        }
        f7mVar.q(str, jSONObject);
    }

    public final void A(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7644529", new Object[]{this, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        TMSLogger.a("TMSPlayerInstance", "getIsRecordPlayState: " + this.k + " id=" + this.f19077a);
        JSONObject t = t();
        t.put((JSONObject) "isRecordAudioPlayState", (String) Boolean.valueOf(this.i));
        bridgeCallback.sendJSONResponse(t);
        this.b = bridgeCallback;
    }

    public final void C(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3db87b", new Object[]{this, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        TMSLogger.a("TMSPlayerInstance", "getLoop: " + this.h + " id=" + this.f19077a);
        JSONObject t = t();
        t.put((JSONObject) "loop", (String) Boolean.valueOf(this.h));
        bridgeCallback.sendJSONResponse(t);
        this.b = bridgeCallback;
    }

    public final MediaPlayer D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayer) ipChange.ipc$dispatch("d656d1ad", new Object[]{this});
        }
        return this.m;
    }

    public final void F(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e99f9c", new Object[]{this, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        TMSLogger.a("TMSPlayerInstance", "getStartTime: " + (((float) this.k) / 1000.0f) + " id=" + this.f19077a);
        JSONObject t = t();
        t.put((JSONObject) "startTime", (String) Float.valueOf(((float) this.k) / 1000.0f));
        bridgeCallback.sendJSONResponse(t);
        this.b = bridgeCallback;
    }

    public final void G(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183821c5", new Object[]{this, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        TMSLogger.a("TMSPlayerInstance", "getVolume: " + this.j + " id=" + this.f19077a);
        JSONObject t = t();
        t.put((JSONObject) Constant.PROP_TTS_VOLUME, (String) Float.valueOf(this.j));
        bridgeCallback.sendJSONResponse(t);
        this.b = bridgeCallback;
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50fa3600", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        try {
            return this.m.isPlaying();
        } catch (Exception e2) {
            TMSLogger.c("TMSPlayerInstance", e2.getMessage(), e2);
            return false;
        }
    }

    public final void J(BridgeCallback bridgeCallback, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ac02a4f", new Object[]{this, bridgeCallback, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "success", (String) Boolean.TRUE);
        jSONObject.put((JSONObject) "audioPlayerID", this.f19077a);
        jSONObject.put((JSONObject) str, str2);
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    public final void K(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4b12b6", new Object[]{this, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "c");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "success", (String) Boolean.FALSE);
        jSONObject.put((JSONObject) "errorCode", "INVALID_PARAM");
        jSONObject.put((JSONObject) "errorMessage", "INVALID_PARAM");
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    public final void L(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44153f1b", new Object[]{this, bridgeCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "success", (String) Boolean.TRUE);
        jSONObject.put((JSONObject) "audioPlayerID", this.f19077a);
        if (bridgeCallback != null) {
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f847fc", new Object[]{this});
        } else {
            A.postDelayed(this.z, 500L);
        }
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476526e5", new Object[]{this});
            return;
        }
        try {
            this.m.release();
        } catch (Exception e2) {
            TMSLogger.c("TMSPlayerInstance", e2.getMessage(), e2);
        }
        d0();
        this.s = false;
        S();
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d4504", new Object[]{this});
            return;
        }
        this.m.setOnPreparedListener(null);
        this.m.setOnBufferingUpdateListener(null);
        this.m.setOnErrorListener(null);
        this.m.setOnSeekCompleteListener(null);
        this.m.setOnCompletionListener(null);
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b974a997", new Object[]{this});
            return;
        }
        try {
            this.m.reset();
        } catch (Throwable th) {
            TMSLogger.c("TMSPlayerInstance", ckf.p("resetPlayer error :", th.getMessage()), th);
        }
        S();
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54d76b9", new Object[]{this});
            return;
        }
        this.t = false;
        this.u = false;
        this.f = false;
        this.e = false;
        this.v = false;
    }

    public final void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d0031a", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public final void V(BridgeCallback bridgeCallback, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2faa124", new Object[]{this, bridgeCallback, new Boolean(z)});
            return;
        }
        ckf.g(bridgeCallback, "c");
        TMSLogger.a("TMSPlayerInstance", "setAutoPlay: " + z + " id=" + this.f19077a);
        if (this.t || this.f) {
            p("autoPlay can not change after setting");
            K(bridgeCallback);
            return;
        }
        this.g = z;
        L(bridgeCallback);
        this.b = bridgeCallback;
        if (this.d == null) {
            return;
        }
        if (this.t) {
            this.m.start();
        } else {
            g0();
        }
    }

    public final void W(boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37150c0f", new Object[]{this, new Boolean(z), bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        this.i = z;
        K(bridgeCallback);
    }

    public final void X(boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4ef195", new Object[]{this, new Boolean(z), bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        TMSLogger.a("TMSPlayerInstance", "setLoop: " + z + " id=" + this.f19077a);
        this.h = z;
        this.m.setLooping(z);
        L(bridgeCallback);
        this.b = bridgeCallback;
    }

    public final void Z(int i, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1736a9ed", new Object[]{this, new Integer(i), bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        TMSLogger.a("TMSPlayerInstance", "setStartTime: " + i + " id=" + this.f19077a);
        if (this.t || this.f) {
            p("startTime can not change after setting");
            K(bridgeCallback);
            return;
        }
        this.k = i * 1000;
        L(bridgeCallback);
        this.b = bridgeCallback;
    }

    public final void a0(float f2, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226efc1f", new Object[]{this, new Float(f2), bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        TMSLogger.a("TMSPlayerInstance", "setVolume: " + f2 + " id=" + this.f19077a);
        if (f2 < 0.0f || f2 > 1.0f) {
            TMSLogger.a("TMSPlayerInstance", "setVolume invalid param.");
            K(bridgeCallback);
            return;
        }
        this.j = f2;
        this.m.setVolume(f2, f2);
        L(bridgeCallback);
        this.b = bridgeCallback;
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3452afbe", new Object[]{this});
            return;
        }
        try {
            d0();
            if (this.x) {
                O();
            } else {
                this.w = new Timer("Themis-Audio-Time-Update-Timer");
                this.y.cancel();
                Timer timer = this.w;
                if (timer != null) {
                    timer.schedule(new g(), 100L, 500L);
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TMSPlayerInstance", ckf.p("onTimeUpdate failed : ", th.getMessage()), th);
        }
    }

    public final void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5742b35e", new Object[]{this});
            return;
        }
        try {
            if (this.x) {
                e0();
            } else {
                Timer timer = this.w;
                if (timer != null) {
                    timer.cancel();
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TMSPlayerInstance", ckf.p("stopOnTimeUpdate failed : ", th.getMessage()), th);
        }
    }

    public final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36603d1b", new Object[]{this});
            return;
        }
        try {
            A.removeCallbacks(this.z);
        } catch (Throwable th) {
            TMSLogger.c("TMSPlayerInstance", th.getMessage(), th);
        }
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c05a98", new Object[]{this});
        } else if (!this.t && !this.u) {
            this.m.prepareAsync();
            this.u = true;
        }
    }

    public final void o(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52143a4c", new Object[]{this, iTMSPage});
            return;
        }
        this.m.setOnPreparedListener(this);
        this.m.setOnBufferingUpdateListener(this);
        this.m.setOnErrorListener(this);
        this.m.setOnSeekCompleteListener(this);
        this.m.setOnCompletionListener(this);
        this.c = iTMSPage;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae0494f", new Object[]{this, mediaPlayer, new Integer(i)});
            return;
        }
        ckf.g(mediaPlayer, "mediaPlayer");
        this.l = i;
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
            executor.execute(new c(mediaPlayer));
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
            executor.execute(new d());
        }
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e31764", new Object[]{this, str});
            return;
        }
        TMSLogger.b("TMSPlayerInstance", "broadcastError id=" + this.f19077a + ",error = " + str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "audioPlayerID", this.f19077a);
        jSONObject.put((JSONObject) "error", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "data", (String) jSONObject);
        ITMSPage iTMSPage = this.c;
        if (iTMSPage != null) {
            iTMSPage.y("onForegroundAudioError", jSONObject2);
        }
    }

    public final void q(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb59fc06", new Object[]{this, str, jSONObject});
            return;
        }
        TMSLogger.b("TMSPlayerInstance", "broadcastEvent id=" + this.f19077a + ",event = " + str);
        s(str, jSONObject);
    }

    public final void s(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8423bd7", new Object[]{this, str, jSONObject});
            return;
        }
        jSONObject.put((JSONObject) "audioPlayerID", this.f19077a);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "data", (String) jSONObject);
        ITMSPage iTMSPage = this.c;
        if (iTMSPage != null) {
            iTMSPage.y(str, jSONObject2);
        }
    }

    public final JSONObject t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("188b5149", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "success", (String) Boolean.TRUE);
        jSONObject.put((JSONObject) "audioPlayerID", this.f19077a);
        return jSONObject;
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b13dcf8a", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public final void v(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7343c", new Object[]{this, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        TMSLogger.a("TMSPlayerInstance", "getAutoPlay: " + this.g + " id=" + this.f19077a);
        JSONObject t = t();
        t.put((JSONObject) "autoplay", (String) Boolean.valueOf(this.g));
        bridgeCallback.sendJSONResponse(t);
        this.b = bridgeCallback;
    }

    public final int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cdcb31c", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public final long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e207", new Object[]{this})).longValue();
        }
        if (!this.t) {
            return 0L;
        }
        return this.m.getCurrentPosition();
    }

    public final long y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        if (!this.t) {
            return 0L;
        }
        return this.m.getDuration();
    }

    public final String z(int i) {
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

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MediaPlayer b;

        public c(MediaPlayer mediaPlayer) {
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
                f7m.this.U(true);
                f7m.r(f7m.this, "onForegroundAudioCanPlay", null, 2, null);
                if (!f7m.c(f7m.this) && !f7m.g(f7m.this)) {
                    return;
                }
                f7m.l(f7m.this, false);
                if (!this.b.isPlaying()) {
                    if (f7m.e(f7m.this) != 0) {
                        this.b.seekTo((int) f7m.e(f7m.this));
                    }
                    this.b.start();
                    f7m.j(f7m.this, false);
                    f7m.k(f7m.this, false);
                    f7m.r(f7m.this, "onForegroundAudioPlay", null, 2, null);
                    f7m.m(f7m.this);
                }
            } catch (Exception e) {
                TMSLogger.c("TMSPlayerInstance", e.getMessage(), e);
            }
        }
    }

    public final void T(int i, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9443b6d8", new Object[]{this, new Integer(i), bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "c");
        if (this.f) {
            p("call seek only support in play or paused status ,not stop");
            K(bridgeCallback);
        } else if (!this.t) {
            TMSLogger.b("TMSPlayerInstance", "call not seek before onCanPlay");
            K(bridgeCallback);
        } else {
            try {
                this.m.seekTo(i * 1000);
                L(bridgeCallback);
                r(this, "onForegroundAudioSeeking", null, 2, null);
            } catch (Exception e2) {
                TMSLogger.c("TMSPlayerInstance", e2.getMessage(), e2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "success", (String) Boolean.FALSE);
                jSONObject.put((JSONObject) "errorCode", (String) (-1));
                jSONObject.put((JSONObject) "audioPlayerID", this.f19077a);
                bridgeCallback.sendJSONResponse(jSONObject);
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
        String z = z(i);
        String z2 = z(i2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "what", z);
        jSONObject.put((JSONObject) "extra", z2);
        String jSONString = jSONObject.toJSONString();
        ckf.f(jSONString, "errorInfo.toJSONString()");
        p(jSONString);
        this.v = true;
        return true;
    }

    public final void E(BridgeCallback bridgeCallback) {
        ITMSPage iTMSPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c290067", new Object[]{this, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "c");
        TMSLogger.a("TMSPlayerInstance", "getSrc: " + ((Object) this.d) + " id=" + this.f19077a);
        String str = this.d;
        if (!(str == null || str.length() == 0 || tsq.I(str, "http", false, 2, null) || (iTMSPage = this.c) == null)) {
            str = ws4.f(TMSInstanceExtKt.f(iTMSPage.getInstance()), str, ApPathType.AP_PATH_TYPE_TEMP);
        }
        J(bridgeCallback, "src", str);
        this.b = bridgeCallback;
    }

    public final void M(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab50e41f", new Object[]{this, bridgeCallback});
        } else if (I()) {
            MediaPlayer mediaPlayer = this.m;
            ckf.d(mediaPlayer);
            mediaPlayer.pause();
            this.e = true;
            L(bridgeCallback);
            r(this, "onForegroundAudioPause", null, 2, null);
            d0();
        } else {
            L(bridgeCallback);
        }
    }

    public final void Y(String str, BridgeCallback bridgeCallback, boolean z, String str2, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c7d000", new Object[]{this, str, bridgeCallback, new Boolean(z), str2, iTMSPage});
            return;
        }
        ckf.g(str, "src");
        ckf.g(bridgeCallback, "c");
        ckf.g(iTMSPage, "page");
        TMSLogger.a("TMSPlayerInstance", "setSrc: " + str + " id=" + this.f19077a);
        if (!TextUtils.isEmpty(this.d)) {
            p("src can not change after setting");
            K(bridgeCallback);
            return;
        }
        R();
        this.r = false;
        this.q = false;
        try {
            if (this.n) {
                str = B(str, iTMSPage);
            }
        } catch (Throwable th) {
            TMSLogger.c("TMSPlayerInstance", "setSrc Error: " + str + " id=" + this.f19077a, th);
        }
        if (str.length() > 0) {
            if (tsq.I(str, bit.PATH_PREFIX, false, 2, null)) {
                str = ws4.a(TMSInstanceExtKt.f(iTMSPage.getInstance()), str, ApPathType.AP_PATH_TYPE_TEMP);
                if (str == null) {
                    str = "";
                }
            } else if (z && !this.r && !TMSPermissionManager.INSTANCE.d(iTMSPage.getInstance(), str, TMSPermissionManager.SpecialConfigType.RESOURCE)) {
                p(ERROR_URL_NOT_IN_WHITE_LIST);
                K(bridgeCallback);
                return;
            }
        }
        this.d = str;
        try {
            this.m.setDataSource(str);
        } catch (Throwable th2) {
            TMSLogger.c("TMSPlayerInstance", th2.getMessage(), th2);
            r(this, "onForegroundAudioError", null, 2, null);
        }
        r(this, "onForegroundAudioWaiting", null, 2, null);
        if (this.g) {
            TMSLogger.a("TMSPlayerInstance", ckf.p("OnAutoPlay true,call play when setSrc = ", str));
            if (!this.r) {
                g0();
            } else if (this.n && this.q) {
                g0();
            }
        } else if (!this.r) {
            g0();
        } else if (this.q) {
            g0();
        }
        L(bridgeCallback);
        this.b = bridgeCallback;
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61c0d71", new Object[]{this});
        } else if (this.t) {
            long j = this.k;
            if (j != 0) {
                this.m.seekTo((int) j);
            }
            this.m.start();
            this.e = false;
            this.f = false;
            r(this, "onForegroundAudioPlay", null, 2, null);
            b0();
        } else {
            this.s = true;
            g0();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer});
            return;
        }
        ckf.g(mediaPlayer, "mediaPlayer");
        if (this.p) {
            this.e = true;
        }
        r(this, "onForegroundAudioEnded", null, 2, null);
        d0();
    }

    public final String B(String str, ITMSPage iTMSPage) {
        String str2;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3808f0c", new Object[]{this, str, iTMSPage});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        ITMSPage iTMSPage2 = this.c;
        ApPathType d2 = iTMSPage2 == null ? null : ws4.d(str, iTMSPage2.getInstance());
        if (d2 == ApPathType.AP_PATH_TYPE_USR) {
            this.r = true;
            this.q = true;
            String a2 = ws4.a(TMSInstanceExtKt.f(iTMSPage.getInstance()), str, d2);
            return a2 == null ? "" : a2;
        }
        if (!tsq.I(str, h1p.HTTPS_PREFIX, false, 2, null) && !tsq.I(str, h1p.HTTP_PREFIX, false, 2, null)) {
            String L = iTMSPage.getInstance().L();
            if (L == null || L.length() == 0) {
                TMSLogger.b("TMSPlayerInstance", "page or app is invalid");
            } else {
                byte[] b2 = gcs.b(str, iTMSPage.getInstance());
                if (b2 == null) {
                    return str;
                }
                String a3 = vva.a(eoh.a(b2));
                if (a3.length() == 0) {
                    return str;
                }
                this.r = true;
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
                        TMSLogger.c("TMSPlayerInstance", "create local audio file failed: " + ((Object) a4) + ", " + ((Object) e2.getMessage()), e2);
                    }
                    if (parentFile != null && parentFile.exists()) {
                        file.createNewFile();
                        this.q = false;
                        wc9 wc9Var = wc9.INSTANCE;
                        bbs instance = iTMSPage.getInstance();
                        ByteBuffer wrap = ByteBuffer.wrap(b2);
                        ckf.f(wrap, "wrap(audioData)");
                        wc9Var.n(instance, a4, wrap, "ArrayBuffer", new b(str, this));
                        String absolutePath = file.getAbsolutePath();
                        ckf.f(absolutePath, "file.absolutePath");
                        return absolutePath;
                    }
                    File parentFile2 = file.getParentFile();
                    if (parentFile2 != null) {
                        parentFile2.mkdirs();
                    }
                    file.createNewFile();
                    this.q = false;
                    wc9 wc9Var2 = wc9.INSTANCE;
                    bbs instance2 = iTMSPage.getInstance();
                    ByteBuffer wrap2 = ByteBuffer.wrap(b2);
                    ckf.f(wrap2, "wrap(audioData)");
                    wc9Var2.n(instance2, a4, wrap2, "ArrayBuffer", new b(str, this));
                    String absolutePath2 = file.getAbsolutePath();
                    ckf.f(absolutePath2, "file.absolutePath");
                    return absolutePath2;
                }
                this.q = true;
                String absolutePath3 = file.getAbsolutePath();
                ckf.f(absolutePath3, "file.absolutePath");
                return absolutePath3;
            }
        }
        return str;
    }

    public final void N(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b297e21", new Object[]{this, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "callback");
        if (TextUtils.isEmpty(this.d)) {
            p("src is null , can not play");
            K(bridgeCallback);
        } else if (I()) {
            if (!this.o) {
                this.m.pause();
                this.e = true;
            }
            L(bridgeCallback);
        } else {
            if (this.v) {
                R();
            }
            if (this.e) {
                this.m.start();
                this.e = false;
                this.f = false;
                r(this, "onForegroundAudioPlay", null, 2, null);
                b0();
            } else {
                try {
                    if (!this.r) {
                        f0();
                    } else if (!this.n || !this.q) {
                        this.s = true;
                    } else {
                        f0();
                    }
                } catch (Exception e2) {
                    TMSLogger.c("TMSPlayerInstance", e2.getMessage(), e2);
                }
            }
            L(bridgeCallback);
            this.b = bridgeCallback;
        }
    }

    public final void c0(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e479693", new Object[]{this, bridgeCallback});
        } else if (this.f) {
            L(bridgeCallback);
        } else {
            try {
                this.m.stop();
                this.e = false;
                this.f = true;
                this.t = false;
                this.u = false;
                this.s = false;
                this.k = 0L;
                L(bridgeCallback);
                this.b = bridgeCallback;
                r(this, "onForegroundAudioStop", null, 2, null);
            } catch (IllegalStateException e2) {
                L(bridgeCallback);
                TMSLogger.c("TMSPlayerInstance", e2.getMessage(), e2);
            }
            d0();
        }
    }
}
