package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.y49;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final r5c f25137a;
    public final dlq b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final o49 f25138a = new o49();

        static {
            t2o.a(676331672);
        }

        public static /* synthetic */ o49 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o49) ipChange.ipc$dispatch("e785485c", new Object[0]);
            }
            return f25138a;
        }
    }

    static {
        t2o.a(676331671);
    }

    public o49() {
        p49 p49Var = new p49();
        this.f25137a = p49Var;
        this.b = new elq(p49Var);
    }

    public static o49 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o49) ipChange.ipc$dispatch("132077b7", new Object[0]);
        }
        return a.a();
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ce3d3d6", new Object[]{this, str})).intValue();
        }
        return ((p49) this.f25137a).d(str);
    }

    public dlq c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dlq) ipChange.ipc$dispatch("340f2227", new Object[]{this});
        }
        return this.b;
    }

    public void d(String str, y49.a aVar, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fd7e5", new Object[]{this, str, aVar, executor});
        } else {
            ((p49) this.f25137a).e(str, aVar, executor);
        }
    }

    public void e(y49 y49Var, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d2a1", new Object[]{this, y49Var, executor});
        } else {
            ((p49) this.f25137a).f(y49Var, executor);
        }
    }

    public void f(y49.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5619e1e2", new Object[]{this, aVar});
        } else {
            ((p49) this.f25137a).g(aVar);
        }
    }
}
