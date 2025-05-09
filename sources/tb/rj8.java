package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, mj8> f27420a = new ConcurrentHashMap<>();

    static {
        t2o.a(723517450);
    }

    public static mj8 a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj8) ipChange.ipc$dispatch("9b19d7b", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        return b(obj.getClass().getSimpleName() + obj.hashCode());
    }

    public static mj8 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj8) ipChange.ipc$dispatch("90d0bacd", new Object[]{str});
        }
        return c(str, mj8.DEFAULT_BUILDER);
    }

    public static mj8 c(String str, qj8 qj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj8) ipChange.ipc$dispatch("7568e043", new Object[]{str, qj8Var});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, mj8> concurrentHashMap = f27420a;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str);
        }
        mj8 mj8Var = new mj8(qj8Var);
        concurrentHashMap.put(str, mj8Var);
        return mj8Var;
    }

    public static void d(Object obj, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117b02eb", new Object[]{obj, event});
            return;
        }
        mj8 a2 = a(obj);
        if (a2 != null) {
            a2.f(event);
        }
    }

    public static void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{obj});
        } else if (obj != null) {
            f(obj.getClass().getSimpleName() + obj.hashCode());
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, mj8> concurrentHashMap = f27420a;
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.get(str).a();
                concurrentHashMap.remove(str);
            }
        }
    }
}
