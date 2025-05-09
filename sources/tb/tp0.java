package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tp0 extends ow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final Map<String, String> l;
    public final Map<String, String> m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f28853a;
        public final jsj c;
        public Map<String, String> h;
        public String b = "NONE";
        public boolean d = true;
        public int e = 3;
        public int f = 30000;
        public int g = 30000;
        public Map<String, String> i = new HashMap();

        static {
            t2o.a(1018167345);
        }

        public a(String str, jsj jsjVar) {
            this.f28853a = str;
            this.c = jsjVar;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7ef9c0a3", new Object[]{aVar});
            }
            return aVar.f28853a;
        }

        public static /* synthetic */ jsj b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jsj) ipChange.ipc$dispatch("4393e2c5", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ Map c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("bd695150", new Object[]{aVar});
            }
            return aVar.i;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a6bf0926", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea91f31d", new Object[]{aVar})).booleanValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ int f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("86ffef6b", new Object[]{aVar})).intValue();
            }
            return aVar.e;
        }

        public static /* synthetic */ int g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("236debca", new Object[]{aVar})).intValue();
            }
            return aVar.f;
        }

        public static /* synthetic */ int h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bfdbe829", new Object[]{aVar})).intValue();
            }
            return aVar.g;
        }

        public static /* synthetic */ Map i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d591ce0a", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ Map j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4433829", new Object[]{aVar});
            }
            return aVar.h;
        }

        public a k(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c31f3ba4", new Object[]{this, map});
            }
            this.i = map;
            return this;
        }

        public a l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d020dba0", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a m(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7edc648d", new Object[]{this, str, str2});
            }
            if (this.h == null) {
                this.h = new HashMap(4);
            }
            this.h.put(str, str2);
            return this;
        }

        public a n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b414dbc7", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public a o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1b302142", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cdf7d4e", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public a q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1a83f2b7", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }
    }

    static {
        t2o.a(1018167344);
    }

    public tp0(a aVar) {
        super(a.a(aVar), a.b(aVar), a.c(aVar), a.d(aVar));
        this.h = a.e(aVar);
        this.i = a.f(aVar);
        this.j = a.g(aVar);
        this.k = a.h(aVar);
        this.l = a.i(aVar);
        this.m = Collections.unmodifiableMap(a.j(aVar));
    }

    public static /* synthetic */ Object ipc$super(tp0 tp0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/net/core/task/AliHttpRequestTask");
    }

    @Override // tb.ow
    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("583a1653", new Object[]{this, str})).booleanValue();
        }
        return "200".equals(str);
    }

    @Override // tb.ow
    public boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a244169", new Object[]{this, str})).booleanValue();
        }
        return str.startsWith("-");
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5824f407", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public Map<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("322c1748", new Object[]{this});
        }
        return this.m;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58b4bfee", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3a20b1", new Object[]{this})).booleanValue();
        }
        return this.h;
    }
}
