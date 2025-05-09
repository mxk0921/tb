package tb;

import android.app.Application;
import android.util.Log;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class eyn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final c f18896a = b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Random f18897a = new Random(System.currentTimeMillis());

        @Override // tb.eyn.c
        public void a(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("777af9a9", new Object[]{this, str, th});
            } else if (th != null) {
                try {
                    Application c = vvh.c();
                    if (c == null) {
                        Log.e("[Weex]ExceptionReport", "report before init");
                        return;
                    }
                    int m = w4x.m();
                    if (m <= 0) {
                        dwh.f("[Weex]ExceptionReport", "reportRemoteException disabled");
                        return;
                    }
                    int nextInt = this.f18897a.nextInt(m);
                    if (nextInt != 0) {
                        dwh.f("[Weex]ExceptionReport", "reportRemoteException skip: " + nextInt + " in " + m);
                        return;
                    }
                    ud2 ud2Var = new ud2();
                    ud2Var.b = AggregationType.STACK;
                    ud2Var.f29301a = "WEEX2_NATIVE_EXCEPTION";
                    ud2Var.d = "JavaException";
                    ud2Var.c = "0";
                    ud2Var.j = str == null ? "<empty>" : str;
                    ud2Var.e = "0.23.0.10-framework-android";
                    ud2Var.l = Thread.currentThread();
                    ud2Var.k = th;
                    vd2.a().c(c, ud2Var);
                    dwh.f("[Weex]ExceptionReport", "reportRemoteException: " + str + ", " + th);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(982516262);
            t2o.a(982516263);
        }

        public b() {
        }

        @Override // tb.eyn.c
        public void a(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("777af9a9", new Object[]{this, str, th});
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a(String str, Throwable th);
    }

    static {
        t2o.a(982516260);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("53e5d327", new Object[0]);
        }
        return f18896a;
    }

    public static c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ca5ffd8f", new Object[0]);
        }
        try {
            return new a();
        } catch (Throwable unused) {
            Log.e("[Weex]ExceptionReport", "no BizErrorModule");
            return new b(null);
        }
    }
}
