package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.init.WalleInitBridgeJava;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yww {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f32397a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final yww f32398a = new yww();

        static {
            t2o.a(1034944648);
        }

        public static /* synthetic */ yww a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yww) ipChange.ipc$dispatch("b3a68a8d", new Object[0]);
            }
            return f32398a;
        }
    }

    static {
        t2o.a(1034944646);
    }

    public static yww b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yww) ipChange.ipc$dispatch("24cc1967", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b747407c", new Object[0]);
        } else {
            WalleInitBridgeJava.a().nativeInitWalle();
        }
    }

    public synchronized boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cc33b6", new Object[]{this})).booleanValue();
        }
        this.f32397a.execute(new Runnable() { // from class: tb.xww
            @Override // java.lang.Runnable
            public final void run() {
                yww.d();
            }
        });
        return true;
    }

    public yww() {
        this.f32397a = t45.c().d();
    }
}
