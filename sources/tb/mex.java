package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class mex {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f24001a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<Pair<Class<?>, Object>> f24002a = new ArrayList();

        static {
            t2o.a(989855857);
        }

        public static /* synthetic */ List a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("b72f1b5a", new Object[]{aVar});
            }
            return aVar.f24002a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a f24003a = new a();

        static {
            t2o.a(989855858);
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7d9e36d7", new Object[]{this});
            }
            return this.f24003a;
        }

        public b b(Class<?> cls, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ee55eb95", new Object[]{this, cls, obj});
            }
            if (cls == null || obj == null || !cls.isInstance(obj)) {
                return this;
            }
            a.a(this.f24003a).add(new Pair(cls, obj));
            return this;
        }
    }

    static {
        t2o.a(989855856);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68dcb7a", new Object[]{aVar});
        } else if (aVar != null) {
            try {
                TLog.loge("WindVane", "Initializer", "setup");
            } catch (Exception unused) {
            }
            if (f24001a.compareAndSet(false, true)) {
                for (Pair pair : a.a(aVar)) {
                    jpw.c().d((Class) pair.first, pair.second);
                }
            }
        }
    }
}
