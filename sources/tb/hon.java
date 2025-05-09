package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Long f20781a;
    public static boolean b;
    public static final List<String> c = new CopyOnWriteArrayList();
    public static final List<fnn> d = new CopyOnWriteArrayList();

    static {
        t2o.a(729809712);
    }

    public static fnn a(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnn) ipChange.ipc$dispatch("5cd99507", new Object[]{z4aVar});
        }
        fnn e = fnn.e(z4aVar);
        ((CopyOnWriteArrayList) d).add(e);
        return e;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
            return;
        }
        List<fnn> list = d;
        if (!((CopyOnWriteArrayList) list).isEmpty()) {
            bqa.e("RecommendPrefetchScheduler", "destroy preload instance");
            try {
                Iterator it = ((CopyOnWriteArrayList) list).iterator();
                while (it.hasNext()) {
                    ((fnn) it.next()).c();
                }
                ((CopyOnWriteArrayList) d).clear();
            } catch (Throwable th) {
                fve.c("RecommendPrefetchScheduler", "RecommendContainer destroy", th);
            }
        }
    }

    public static void f(JSONObject jSONObject, z4a z4aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60185a16", new Object[]{jSONObject, z4aVar, new Integer(i)});
        } else if (!d(i, z4aVar)) {
            uqa.b("recmdPrefetch", "RecommendPrefetchScheduler", "当前不要预请求");
        } else {
            b();
            long uptimeMillis = SystemClock.uptimeMillis();
            a(z4aVar).t(null, jSONObject);
            uqa.b("recmdPrefetch", "RecommendPrefetchScheduler", "创建容器耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
            ((CopyOnWriteArrayList) c).add(z4aVar.b());
            f20781a = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
            return;
        }
        f20781a = null;
        b = false;
    }

    public static boolean d(int i, z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("348fa929", new Object[]{new Integer(i), z4aVar})).booleanValue();
        }
        boolean c2 = c(i);
        if (c2) {
            uqa.b("recmdPrefetch", "RecommendPrefetchScheduler", "距离上次请求是否间隔大于15s：" + c2);
            return true;
        }
        String b2 = z4aVar.b();
        if (b2 != null) {
            boolean z = !((CopyOnWriteArrayList) c).contains(b2);
            uqa.b("recmdPrefetch", "RecommendPrefetchScheduler", "当前是否被消费掉了：" + z);
            return z;
        }
        uqa.b("recmdPrefetch", "RecommendPrefetchScheduler", "当前预请求是否被miss掉了：" + b);
        return !b;
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2dc4823", new Object[]{str});
        } else if ("TYPE_MISS".equals(str)) {
            b = true;
            uqa.b("recmdPrefetch", "RecommendPrefetchScheduler", "发现预请求miss掉了");
        } else {
            ((CopyOnWriteArrayList) c).clear();
            g();
            uqa.b("recmdPrefetch", "RecommendPrefetchScheduler", "预请求回调回来了，一切重置");
        }
    }

    public static boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7452bd3", new Object[]{new Integer(i)})).booleanValue();
        }
        if (f20781a == null) {
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long longValue = uptimeMillis - f20781a.longValue();
        uqa.b("recmdPrefetch", "RecommendPrefetchScheduler", "当前的时间是：" + uptimeMillis + "上次预请求的时间是：" + f20781a);
        return longValue > ((long) i);
    }
}
