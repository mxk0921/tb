package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, fwt> b = new HashMap();
    public static String c;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<a> f19587a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19588a;
        public final Stack<a> b = new Stack<>();
        public final long c = System.nanoTime();
        public long d = -1;

        static {
            t2o.a(676331646);
        }

        public a(String str) {
            this.f19588a = str;
        }

        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8c90e80f", new Object[]{this})).longValue();
            }
            return this.d - this.c;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a02127e2", new Object[]{this});
            } else {
                this.d = System.nanoTime();
            }
        }

        public void c(int i, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25808b9", new Object[]{this, new Integer(i), aVar});
                return;
            }
            Log.e(fwt.a(), d(aVar));
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().c(i + 1, aVar);
            }
        }

        public String d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ecf3f352", new Object[]{this, aVar});
            }
            if (this == aVar) {
                return toString();
            }
            long a2 = (a() * 100) / aVar.a();
            return toString() + " (" + a2 + "%)";
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.f19588a + ": " + (a() / 1000000) + "ms.";
        }
    }

    static {
        t2o.a(676331645);
    }

    public fwt(String str) {
        Stack<a> stack = new Stack<>();
        this.f19587a = stack;
        stack.push(new a("Recorded timings for " + str));
        c = str;
        ((HashMap) b).put(str, this);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return c;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f003de7a", new Object[]{this, str});
            return;
        }
        a aVar = new a(str);
        this.f19587a.peek().b.add(aVar);
        this.f19587a.push(aVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
            return;
        }
        this.f19587a.peek().b();
        this.f19587a.pop();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
            return;
        }
        a peek = this.f19587a.peek();
        peek.b();
        peek.c(0, peek);
        ((HashMap) b).remove(peek.f19588a);
    }
}
