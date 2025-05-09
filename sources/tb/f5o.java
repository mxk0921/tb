package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19030a;
    public final Map<String, String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19031a;
        public int b = 3;
        public int c;
        public int d;
        public Map<String, String> e;

        static {
            t2o.a(283115573);
        }

        public a(String str) {
            this.f19031a = str;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5633dbea", new Object[]{aVar});
            }
            return aVar.f19031a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4f9f2308", new Object[]{aVar})).intValue();
            }
            return aVar.b;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e3dd92a7", new Object[]{aVar})).intValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("781c0246", new Object[]{aVar})).intValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ Map e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a7dd34a7", new Object[]{aVar});
            }
            return aVar.e;
        }

        public a f(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6e46ea66", new Object[]{this, str, str2});
            }
            if (this.e == null) {
                this.e = new HashMap(16);
            }
            this.e.put(str, str2);
            return this;
        }

        public f5o g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f5o) ipChange.ipc$dispatch("f21780a9", new Object[]{this});
            }
            return new f5o(this);
        }

        public a h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("380fd520", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8996e010", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public a j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b0c6cb59", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }
    }

    static {
        t2o.a(283115572);
    }

    public f5o(a aVar) {
        this.f19030a = a.a(aVar);
        a.b(aVar);
        a.c(aVar);
        a.d(aVar);
        this.b = a.e(aVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f19030a;
    }
}
