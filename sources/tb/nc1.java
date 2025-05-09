package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nc1 implements dbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dbn f24628a;
    public final cgd b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(nc1 nc1Var) {
        }

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
            } else {
                RSoLog.d("ArtcFetcherWrapper, fetchAsync avcodec finished");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements gk4<c, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24629a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f24630a;

            public a(c cVar) {
                this.f24630a = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    nc1.f(nc1.this).b(b.this.f24629a, this.f24630a);
                }
            }
        }

        public b(String str) {
            this.f24629a = str;
        }

        /* renamed from: b */
        public Void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("90def1be", new Object[]{this, cVar});
            }
            qbn.e(new a(cVar), 2000L);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final y69 f24631a;
        public final AtomicInteger b;
        public final gk4<c, Void> c;

        public c(y69 y69Var, AtomicInteger atomicInteger, gk4<c, Void> gk4Var) {
            this.f24631a = y69Var;
            this.b = atomicInteger;
            this.c = gk4Var;
        }

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
            } else if (b79Var.i() || this.b.decrementAndGet() <= 0) {
                RSoLog.d("ArtcFetcherWrapper, finish, , fetchResult = " + b79Var.i() + ", retryCounter = " + this.b.get());
                this.f24631a.onFetchFinished(b79Var);
            } else {
                RSoLog.d("ArtcFetcherWrapper, fetch failed, retryCounter=" + this.b.get() + " > 0, will schedule next fetch");
                this.c.a(this);
            }
        }
    }

    public nc1(dbn dbnVar, cgd cgdVar) {
        this.f24628a = dbnVar;
        this.b = cgdVar;
    }

    public static /* synthetic */ dbn f(nc1 nc1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbn) ipChange.ipc$dispatch("33e403b2", new Object[]{nc1Var});
        }
        return nc1Var.f24628a;
    }

    @Override // tb.dbn
    public d52 a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d52) ipChange.ipc$dispatch("b9db9619", new Object[]{this, list});
        }
        return this.f24628a.a(list);
    }

    @Override // tb.dbn
    public void b(String str, y69 y69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dc04a6", new Object[]{this, str, y69Var});
        } else if (!str.equals("artc_engine")) {
            this.f24628a.b(str, y69Var);
        } else {
            this.f24628a.b("avcodec", new a(this));
            long c2 = this.b.c("key_artc_fetch_retry_count", 10L);
            RSoLog.d("ArtcFetcherWrapper, fetchAsync start, retryCounter=" + c2);
            this.f24628a.b(str, new c(y69Var, new AtomicInteger((int) c2), new b(str)));
        }
    }

    @Override // tb.dbn
    public b79 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("b1bac3d7", new Object[]{this, str});
        }
        return this.f24628a.c(str);
    }

    @Override // tb.dbn
    public b79 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("d96d27dc", new Object[]{this, str});
        }
        return this.f24628a.d(str);
    }

    @Override // tb.dbn
    public void e(List<String> list, c52 c52Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7032327", new Object[]{this, list, c52Var});
        } else {
            this.f24628a.e(list, c52Var);
        }
    }
}
