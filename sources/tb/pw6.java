package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.IDecodeTask;
import com.etao.feimagesearch.capture.scan.b;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "_scancode_DecodeManager";

    /* renamed from: a  reason: collision with root package name */
    public b f26351a;
    public final Handler c = new Handler(Looper.getMainLooper(), new e());
    public volatile boolean d;
    public final ExecutorService e;
    public static final a Companion = new a(null);
    public static final AtomicInteger f = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(730857584);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final AtomicInteger a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AtomicInteger) ipChange.ipc$dispatch("851a55f7", new Object[]{this});
            }
            return pw6.c();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ b b;
        public final /* synthetic */ long e;

        public c(b bVar, long j) {
            this.b = bVar;
            this.e = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!pw6.g(pw6.this, this.b)) {
                    if (pw6.h(pw6.this, this.b)) {
                    }
                    pw6 pw6Var = pw6.this;
                    b bVar = this.b;
                    pw6.i(pw6Var, bVar, bVar.r(), false);
                }
                b e = pw6.e(pw6.this);
                if (e != null) {
                    e.f(IDecodeTask.TaskStatus.CANCELLED);
                }
                pw6.j(pw6.this, this.b);
                pw6.b(pw6.this, this.e, this.b);
                pw6 pw6Var2 = pw6.this;
                b bVar2 = this.b;
                pw6.i(pw6Var2, bVar2, bVar2.r(), false);
            } catch (Exception e2) {
                agh.c(pw6.TAG, String.valueOf(e2.getMessage()));
                pw6.i(pw6.this, this.b, null, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "DecodeManager_" + hashCode() + '_' + pw6.Companion.a().getAndIncrement();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26354a;
        public final /* synthetic */ b b;
        public final /* synthetic */ pw6 c;
        public final /* synthetic */ lso d;

        public f(boolean z, b bVar, pw6 pw6Var, lso lsoVar) {
            this.f26354a = z;
            this.b = bVar;
            this.c = pw6Var;
            this.d = lsoVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f26354a) {
                qyb t = this.b.t();
                if (t != null) {
                    t.b(this.b);
                }
            } else {
                if (!this.b.A()) {
                    pw6.f(this.c).removeCallbacksAndMessages(null);
                }
                qyb t2 = this.b.t();
                if (t2 != null) {
                    t2.a(this.b, this.d);
                }
            }
        }
    }

    static {
        t2o.a(730857583);
    }

    public pw6(Activity activity) {
        ckf.g(activity, "activity");
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(new d());
        ckf.f(newSingleThreadExecutor, "newSingleThreadExecutor(…ement()\n        }\n    } )");
        this.e = newSingleThreadExecutor;
        AppMonitor.register("Plt_Scan", "loadAlbum", MeasureSet.create().addMeasure("loadCostTime"), DimensionSet.create().addDimension("deviceLevel"));
    }

    public static final /* synthetic */ void b(pw6 pw6Var, long j, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1919b6a", new Object[]{pw6Var, new Long(j), bVar});
        } else {
            pw6Var.l(j, bVar);
        }
    }

    public static final /* synthetic */ AtomicInteger c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("d4c0783c", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ boolean d(pw6 pw6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d08461ea", new Object[]{pw6Var})).booleanValue();
        }
        return pw6Var.d;
    }

    public static final /* synthetic */ b e(pw6 pw6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f41af8c1", new Object[]{pw6Var});
        }
        return pw6Var.f26351a;
    }

    public static final /* synthetic */ Handler f(pw6 pw6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("538159d8", new Object[]{pw6Var});
        }
        return pw6Var.c;
    }

    public static final /* synthetic */ boolean g(pw6 pw6Var, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7878fa33", new Object[]{pw6Var, bVar})).booleanValue();
        }
        return pw6Var.n(bVar);
    }

    public static final /* synthetic */ boolean h(pw6 pw6Var, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9c780ae", new Object[]{pw6Var, bVar})).booleanValue();
        }
        return pw6Var.o(bVar);
    }

    public static final /* synthetic */ void i(pw6 pw6Var, b bVar, lso lsoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946c9d2", new Object[]{pw6Var, bVar, lsoVar, new Boolean(z)});
        } else {
            pw6Var.r(bVar, lsoVar, z);
        }
    }

    public static final /* synthetic */ void j(pw6 pw6Var, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbf8e87", new Object[]{pw6Var, bVar});
        } else {
            pw6Var.f26351a = bVar;
        }
    }

    public final void a(b bVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3172fca", new Object[]{this, bVar, new Long(j)});
            return;
        }
        ckf.g(bVar, "decodeTaskV2");
        if (this.d) {
            agh.r("PltCameraScan", TAG, "DecodeManager destroyed");
        } else {
            this.e.execute(new c(bVar, j));
        }
    }

    public final void l(long j, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39787a16", new Object[]{this, new Long(j), bVar});
            return;
        }
        agh.h(TAG, "beginTimeoutTask: timeout=" + j + ", decodeTaskV2=" + bVar.u().hashCode());
        Message obtainMessage = this.c.obtainMessage(100001);
        ckf.f(obtainMessage, "mainHandler.obtainMessag…MSG_DECODE_ALBUM_TIMEOUT)");
        obtainMessage.obj = bVar;
        this.c.removeMessages(100001);
        this.c.sendMessageDelayed(obtainMessage, j);
    }

    public final boolean n(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("646b1845", new Object[]{this, bVar})).booleanValue();
        }
        return !TextUtils.isEmpty(bVar.u().e());
    }

    public final boolean o(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b90a9aa", new Object[]{this, bVar})).booleanValue();
        }
        if (n(bVar) || bVar.u().a() == null) {
            return false;
        }
        return true;
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        agh.h(TAG, "destroy");
        this.c.removeCallbacksAndMessages(null);
        this.f26351a = null;
        this.d = true;
        this.e.shutdown();
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        agh.h(TAG, "onPause");
        this.c.removeMessages(100001);
        b bVar = this.f26351a;
        if (bVar != null && !bVar.D()) {
            bVar.f(IDecodeTask.TaskStatus.CANCELLED);
            this.f26351a = null;
        }
    }

    public final void r(b bVar, lso lsoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161a3e62", new Object[]{this, bVar, lsoVar, new Boolean(z)});
            return;
        }
        if (ckf.b(this.f26351a, bVar)) {
            this.f26351a = null;
        }
        if (!bVar.z()) {
            this.c.post(new f(z, bVar, this, lsoVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            ckf.g(message, "msg");
            if (message.what != 100001) {
                return false;
            }
            Object obj = message.obj;
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj != null) {
                b bVar = (b) obj;
                if (pw6.d(pw6.this) || bVar.z()) {
                    return true;
                }
                agh.r("AutoDetect", pw6.TAG, "album decode timeout");
                jzu.i(p73.f25916a, "scanTimeout", "detectType", String.valueOf(bVar.i));
                pw6.i(pw6.this, bVar, null, true);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.capture.scan.DecoderTaskV2");
        }
    }
}
