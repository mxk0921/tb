package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vbf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements tbf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ubf f29907a;

        static {
            t2o.a(438304809);
            t2o.a(912262025);
        }

        public a(ubf ubfVar) {
            this.f29907a = ubfVar;
        }

        @Override // tb.tbf
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("130a9b02", new Object[]{this});
                return;
            }
            ubf ubfVar = this.f29907a;
            if (ubfVar != null) {
                ((nxj) ubfVar).g();
            }
        }

        @Override // tb.tbf
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62b0236e", new Object[]{this});
                return;
            }
            ubf ubfVar = this.f29907a;
            if (ubfVar != null) {
                ((nxj) ubfVar).i();
            }
        }

        @Override // tb.tbf
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3a8a5c6", new Object[]{this});
                return;
            }
            ubf ubfVar = this.f29907a;
            if (ubfVar != null) {
                ((nxj) ubfVar).e();
            }
        }

        @Override // tb.tbf
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b5adb64", new Object[]{this});
                return;
            }
            ubf ubfVar = this.f29907a;
            if (ubfVar != null) {
                ((nxj) ubfVar).j();
            }
        }

        @Override // tb.tbf
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32a8034f", new Object[]{this});
                return;
            }
            ubf ubfVar = this.f29907a;
            if (ubfVar != null) {
                ((nxj) ubfVar).h();
            }
        }

        @Override // tb.tbf
        public void f(float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c97f77c0", new Object[]{this, new Float(f), new Integer(i)});
                return;
            }
            ubf ubfVar = this.f29907a;
            if (ubfVar != null) {
                ((nxj) ubfVar).f(f, i);
            }
        }

        @Override // tb.tbf
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a578dc9e", new Object[]{this});
                return;
            }
            ubf ubfVar = this.f29907a;
            if (ubfVar != null) {
                ((nxj) ubfVar).d();
            }
        }
    }

    static {
        t2o.a(438304808);
    }

    public static void a(String str, ubf ubfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b35f39", new Object[]{str, ubfVar});
            return;
        }
        wg7.a("InsideLifecycleRegistrar", "registerInsideLifecycleObserver : " + str);
        if (str != null) {
            wbf.b(str, new a(ubfVar));
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9109879", new Object[]{str});
            return;
        }
        wg7.a("InsideLifecycleRegistrar", "unregisterInsideLifecycleObserver : " + str);
        wbf.c(str);
    }
}
