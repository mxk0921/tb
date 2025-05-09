package tb;

import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xue {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static t9c c;

    /* renamed from: a  reason: collision with root package name */
    public oue f31611a;
    public n2c b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final arb f31612a;
        public qve b;

        static {
            t2o.a(486539270);
        }

        public b(arb arbVar) {
            this.f31612a = arbVar;
        }

        public static /* synthetic */ arb a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (arb) ipChange.ipc$dispatch("6e99362d", new Object[]{bVar});
            }
            return bVar.f31612a;
        }

        public static /* synthetic */ qve b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qve) ipChange.ipc$dispatch("dd8f3f12", new Object[]{bVar});
            }
            return bVar.b;
        }

        public xue c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xue) ipChange.ipc$dispatch("d5b155f8", new Object[]{this});
            }
            return new xue(this);
        }

        public b d(qve qveVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("43b4dc4e", new Object[]{this, qveVar});
            }
            this.b = qveVar;
            return this;
        }
    }

    static {
        t2o.a(486539268);
    }

    public static t9c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t9c) ipChange.ipc$dispatch("6e0b328c", new Object[0]);
        }
        if (c == null) {
            c = new kaa();
        }
        return c;
    }

    public static void e(dve dveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81bc3074", new Object[]{dveVar});
        } else {
            yue.a(dveVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f31611a.b();
        fve.e("InfoFlowEngine", "InfoFlowEngine destroy use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        Log.e("InfoFlowEngine", "InfoFlowEngine destroy ");
    }

    public n2c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n2c) ipChange.ipc$dispatch("80d2e897", new Object[]{this});
        }
        return this.b;
    }

    public final void d(arb arbVar, qve qveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a18a1", new Object[]{this, arbVar, qveVar});
            return;
        }
        this.f31611a = new oue(arbVar, qveVar);
        this.b = new re8(this.f31611a);
    }

    public xue(b bVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d(b.a(bVar), b.b(bVar));
        fve.e("InfoFlowEngine", "InfoFlowEngine init use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
