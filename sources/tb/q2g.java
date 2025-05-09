package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final q2g b = new q2g("Invalid");
    public static final q2g c = new q2g("Any");
    public static final Map<String, q2g> d = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f26460a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438682);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final q2g a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q2g) ipChange.ipc$dispatch("23734ff", new Object[]{this, str});
            }
            ckf.g(str, "type");
            Map b = q2g.b();
            Object obj = b.get(str);
            if (obj == null) {
                obj = new q2g(str);
                b.put(str, obj);
            }
            return (q2g) obj;
        }

        public final q2g b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q2g) ipChange.ipc$dispatch("ace882a6", new Object[]{this});
            }
            return q2g.a();
        }

        public final q2g c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q2g) ipChange.ipc$dispatch("b9b77438", new Object[]{this});
            }
            return q2g.c();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438681);
        t2o.a(1002438675);
    }

    public q2g(String str) {
        ckf.g(str, "code");
        this.f26460a = str;
    }

    public static final /* synthetic */ q2g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q2g) ipChange.ipc$dispatch("dd2e364b", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83ba7cb6", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ q2g c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q2g) ipChange.ipc$dispatch("9629d3e0", new Object[0]);
        }
        return b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.f26460a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2g)) {
            return false;
        }
        return ckf.b(d(), ((q2g) obj).d());
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return d().hashCode();
    }
}
