package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class aj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<? extends aj8>, Set<lk8<aj8>>> f15773a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510309);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final Map<Class<? extends aj8>, Set<lk8<aj8>>> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("da2ef722", new Object[]{this});
            }
            return aj8.a();
        }

        public a() {
        }
    }

    static {
        t2o.a(766510308);
    }

    public /* synthetic */ aj8(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f1fc6e27", new Object[0]);
        }
        return f15773a;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a48500f", new Object[]{this});
            return;
        }
        Set<lk8> set = (Set) ((LinkedHashMap) f15773a).get(getClass());
        if (set != null) {
            for (lk8 lk8Var : set) {
                lk8Var.onEvent(this);
            }
        }
    }

    public aj8() {
    }
}
