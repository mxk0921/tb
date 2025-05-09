package tb;

import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class m9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Long> f23868a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151056);
        }

        public a() {
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f003de7a", new Object[]{this, str});
                return;
            }
            ckf.g(str, "name");
            if (cw6.b()) {
                m9u.a().put(str, Long.valueOf(System.currentTimeMillis()));
                Trace.beginSection(str);
            }
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41f4dd2c", new Object[]{this, str});
                return;
            }
            ckf.g(str, "name");
            if (cw6.b() && m9u.a().containsKey(str)) {
                Long l = (Long) m9u.a().remove(str);
                if (l == null) {
                    l = 0L;
                }
                long longValue = l.longValue();
                if (cw6.b()) {
                    hav.d("TraceUtil", "TraceUtil name=" + str + ",custom time=" + (System.currentTimeMillis() - longValue));
                }
                Trace.endSection();
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478151055);
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a0ed2258", new Object[0]);
        }
        return f23868a;
    }
}
