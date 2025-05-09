package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.pipeline.RequestMethod;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class c3o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f16829a;
    public g5o b;
    public String c;
    public RequestMethod d = RequestMethod.GET;
    public Class e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c3o f16830a;

        static {
            t2o.a(961544415);
        }

        public a(String str) {
            bpm.c(!TextUtils.isEmpty(str), "Url cannot be empty");
            c3o c3oVar = new c3o();
            this.f16830a = c3oVar;
            c3o.a(c3oVar, str);
        }

        public c3o a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c3o) ipChange.ipc$dispatch("2701db01", new Object[]{this});
            }
            return this.f16830a;
        }

        public a b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("43fe6985", new Object[]{this, map});
            }
            if (c3o.c(this.f16830a) == null) {
                c3o.d(this.f16830a, new HashMap());
            } else {
                c3o.c(this.f16830a).clear();
            }
            c3o.c(this.f16830a).putAll(map);
            return this;
        }

        public a c(RequestMethod requestMethod) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b9e93f36", new Object[]{this, requestMethod});
            }
            c3o.e(this.f16830a, requestMethod);
            return this;
        }

        public a d(g5o g5oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d66da4cb", new Object[]{this, g5oVar});
            }
            c3o.b(this.f16830a, g5oVar);
            return this;
        }

        public a e(Class cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c527973e", new Object[]{this, cls});
            }
            c3o.f(this.f16830a, cls);
            return this;
        }
    }

    static {
        t2o.a(961544414);
    }

    public static /* synthetic */ String a(c3o c3oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5544f7d", new Object[]{c3oVar, str});
        }
        c3oVar.c = str;
        return str;
    }

    public static /* synthetic */ g5o b(c3o c3oVar, g5o g5oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g5o) ipChange.ipc$dispatch("19ce81fc", new Object[]{c3oVar, g5oVar});
        }
        c3oVar.b = g5oVar;
        return g5oVar;
    }

    public static /* synthetic */ Map c(c3o c3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c53e0fee", new Object[]{c3oVar});
        }
        return c3oVar.f16829a;
    }

    public static /* synthetic */ Map d(c3o c3oVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57cc8c5f", new Object[]{c3oVar, map});
        }
        c3oVar.f16829a = map;
        return map;
    }

    public static /* synthetic */ RequestMethod e(c3o c3oVar, RequestMethod requestMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestMethod) ipChange.ipc$dispatch("8e6981ba", new Object[]{c3oVar, requestMethod});
        }
        c3oVar.d = requestMethod;
        return requestMethod;
    }

    public static /* synthetic */ Class f(c3o c3oVar, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("abd8706c", new Object[]{c3oVar, cls});
        }
        c3oVar.e = cls;
        return cls;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.f16829a;
    }

    public RequestMethod h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestMethod) ipChange.ipc$dispatch("969ca757", new Object[]{this});
        }
        return this.d;
    }

    public g5o i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g5o) ipChange.ipc$dispatch("5d117ff6", new Object[]{this});
        }
        return this.b;
    }

    public Object j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("340f8235", new Object[]{this});
        }
        return null;
    }

    public Class k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("57a5feb5", new Object[]{this});
        }
        return this.e;
    }

    public Type l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("5090bad", new Object[]{this});
        }
        return null;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + " { url=" + m() + ", method=" + h() + ", headers=" + g() + ", params=" + i() + ", requestContext=" + j() + "}";
    }
}
