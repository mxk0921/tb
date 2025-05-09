package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IAdapter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class tr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, IAdapter> f28900a;
    public Context b;
    public String c;
    public String d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, IAdapter> f28901a = new HashMap();
        public Context b;
        public String c;
        public String d;
        public boolean e;

        static {
            t2o.a(468713476);
        }

        public b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("84befb8d", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("43bf2a78", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public tr9 c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tr9) ipChange.ipc$dispatch("a3ba929c", new Object[]{this});
            }
            tr9 tr9Var = new tr9();
            tr9.a(tr9Var, this.b);
            tr9.b(tr9Var, this.c);
            tr9.c(tr9Var, this.d);
            tr9.d(tr9Var, this.e);
            tr9.e(tr9Var).putAll(this.f28901a);
            return tr9Var;
        }

        public b d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4654cd82", new Object[]{this, context});
            }
            this.b = context;
            return this;
        }

        public b e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8a336934", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b f(Class<? extends IAdapter> cls, IAdapter iAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e032b738", new Object[]{this, cls, iAdapter});
            }
            ((HashMap) this.f28901a).put(cls.getName(), iAdapter);
            return this;
        }
    }

    static {
        t2o.a(468713474);
    }

    public static /* synthetic */ Context a(tr9 tr9Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9c6c223", new Object[]{tr9Var, context});
        }
        tr9Var.b = context;
        return context;
    }

    public static /* synthetic */ String b(tr9 tr9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25de3a7a", new Object[]{tr9Var, str});
        }
        tr9Var.c = str;
        return str;
    }

    public static /* synthetic */ String c(tr9 tr9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd5a143b", new Object[]{tr9Var, str});
        }
        tr9Var.d = str;
        return str;
    }

    public static /* synthetic */ boolean d(tr9 tr9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e10da23e", new Object[]{tr9Var, new Boolean(z)})).booleanValue();
        }
        tr9Var.e = z;
        return z;
    }

    public static /* synthetic */ Map e(tr9 tr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3df6b170", new Object[]{tr9Var});
        }
        return tr9Var.f28900a;
    }

    public static b k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fd57bc92", new Object[0]);
        }
        return new b();
    }

    public Map<String, IAdapter> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("106b2f3f", new Object[]{this});
        }
        return this.f28900a;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        return this.c;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return this.d;
    }

    public Context i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.b;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FluidSDKConfig{mAdapterMap=" + this.f28900a + ", mContext=" + this.b + ", mAppName='" + this.c + "', mAppVersion='" + this.d + "', mIsDebug=" + this.e + '}';
    }

    public tr9() {
        this.f28900a = new HashMap();
    }
}
