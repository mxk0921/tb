package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AFC_PLUGIN_MODE_ASYNC = 0;
    public static final int AFC_PLUGIN_MODE_SYNC = 1;
    public static final int AFC_PLUGIN_TYPE_POST = 1;
    public static final int AFC_PLUGIN_TYPE_PRE = 0;

    /* renamed from: a  reason: collision with root package name */
    public final List<wg0> f31368a;
    public final List<wg0> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final xg0 f31369a = new xg0();

        static {
            t2o.a(467664949);
        }

        public static /* synthetic */ xg0 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xg0) ipChange.ipc$dispatch("1396dfb5", new Object[0]);
            }
            return f31369a;
        }
    }

    static {
        t2o.a(467664947);
    }

    public static xg0 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xg0) ipChange.ipc$dispatch("89931070", new Object[0]);
        }
        return b.a();
    }

    public void b(wg0 wg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2627927", new Object[]{this, wg0Var});
        } else if (wg0Var.c() == 0) {
            ((CopyOnWriteArrayList) this.f31368a).add(wg0Var);
        } else {
            ((CopyOnWriteArrayList) this.b).add(wg0Var);
        }
    }

    public xg0() {
        this.f31368a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
    }
}
