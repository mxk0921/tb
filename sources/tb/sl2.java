package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.themis.widget.broadcast.BroadcastMsg;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class sl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final sl2 c = new sl2();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, gl2> f28122a = new HashMap();
    public final ExecutorService b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onError(String str);

        void onSuccess();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(852492311);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final sl2 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sl2) ipChange.ipc$dispatch("7d8fe974", new Object[]{this});
            }
            return sl2.a();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ a c;
        public final /* synthetic */ String d;

        public c(String str, a aVar, String str2) {
            this.b = str;
            this.c = aVar;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            gl2 gl2Var = (gl2) sl2.b(sl2.this).get(this.b);
            if (gl2Var == null) {
                a aVar = this.c;
                if (aVar != null) {
                    aVar.onError("has not joined channel");
                    return;
                }
                return;
            }
            if (!gl2Var.b(this.d)) {
                a aVar2 = this.c;
                if (aVar2 != null) {
                    aVar2.onError("has not joined channel");
                }
            } else {
                a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.onSuccess();
                }
            }
            if (gl2Var.c()) {
                sl2.b(sl2.this).remove(this.b);
                gl2Var.a();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ tl2 c;
        public final /* synthetic */ a d;

        public d(String str, tl2 tl2Var, a aVar) {
            this.b = str;
            this.c = tl2Var;
            this.d = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            gl2 gl2Var = (gl2) sl2.b(sl2.this).get(this.b);
            if (gl2Var == null) {
                gl2Var = new gl2(this.b);
                sl2.b(sl2.this).put(this.b, gl2Var);
            }
            if (gl2Var.d(this.c)) {
                this.d.onSuccess();
            } else {
                this.d.onError("has joined same channel");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // tb.qqt
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "ThemisBroadcastThread";
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ a c;
        public final /* synthetic */ String d;
        public final /* synthetic */ BroadcastMsg e;

        public f(String str, a aVar, String str2, BroadcastMsg broadcastMsg) {
            this.b = str;
            this.c = aVar;
            this.d = str2;
            this.e = broadcastMsg;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            gl2 gl2Var = (gl2) sl2.b(sl2.this).get(this.b);
            if (gl2Var == null) {
                this.c.onError("has not joined channel");
            } else if (!gl2Var.e(this.d, this.e)) {
                this.c.onError("has not joined channel");
            } else {
                this.c.onSuccess();
            }
        }
    }

    static {
        t2o.a(852492309);
    }

    public sl2() {
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(e.INSTANCE);
        ckf.f(newSingleThreadExecutor, "newSingleThreadExecutor(…ThemisBroadcastThread\" })");
        this.b = newSingleThreadExecutor;
    }

    public static final /* synthetic */ sl2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sl2) ipChange.ipc$dispatch("c621934f", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ Map b(sl2 sl2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("20533204", new Object[]{sl2Var});
        }
        return sl2Var.f28122a;
    }

    public final void c(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2315a595", new Object[]{this, str, str2, aVar});
            return;
        }
        ckf.g(str, "channelToken");
        ckf.g(str2, "memberInstanceId");
        e(new c(str, aVar, str2));
    }

    public final void d(String str, tl2 tl2Var, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bd71d6", new Object[]{this, str, tl2Var, aVar});
            return;
        }
        ckf.g(str, "channelToken");
        ckf.g(tl2Var, "member");
        ckf.g(aVar, "callback");
        e(new d(str, tl2Var, aVar));
    }

    public final void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145ae71e", new Object[]{this, runnable});
        } else {
            this.b.execute(runnable);
        }
    }

    public final void f(String str, String str2, BroadcastMsg broadcastMsg, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c186c99", new Object[]{this, str, str2, broadcastMsg, aVar});
            return;
        }
        ckf.g(str, "instanceId");
        ckf.g(str2, "channelToken");
        ckf.g(broadcastMsg, "msg");
        ckf.g(aVar, "callback");
        e(new f(str2, aVar, str, broadcastMsg));
    }
}
