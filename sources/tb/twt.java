package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class twt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final njg f29008a = a.a(LazyThreadSafetyMode.SYNCHRONIZED, new d1a() { // from class: tb.swt
        @Override // tb.d1a
        public final Object invoke() {
            g2e c;
            c = twt.c();
            return c;
        }
    });

    static {
        t2o.a(1003487364);
    }

    public static final g2e b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("616753e6", new Object[0]);
        }
        return (g2e) f29008a.getValue();
    }

    public static final g2e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("1b286529", new Object[0]);
        }
        g2e q = qau.q("tblive");
        q.f(new String[]{"tblive"});
        return q;
    }

    public static final Map<Object, ?> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1ac92f4", new Object[0]);
        }
        if (!zys.INSTANCE.c()) {
            return null;
        }
        Map<String, String> e = b().e();
        ckf.f(e, "getAllTrackInfo(...)");
        return kotlin.collections.a.r(e);
    }

    public static final void e(Map<Object, ?> map) {
        Object obj;
        String g;
        Object obj2;
        String g2;
        Object obj3;
        String g3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8a9a53", new Object[]{map});
        } else if (zys.INSTANCE.c()) {
            long j = 0;
            long parseLong = (map == null || (obj3 = map.get("experimentId")) == null || (g3 = tvr.g(obj3)) == null) ? 0L : Long.parseLong(g3);
            long parseLong2 = (map == null || (obj2 = map.get("experimentReleaseId")) == null || (g2 = tvr.g(obj2)) == null) ? 0L : Long.parseLong(g2);
            if (!(map == null || (obj = map.get("experimentBucketId")) == null || (g = tvr.g(obj)) == null)) {
                j = Long.parseLong(g);
            }
            qau.v("tblive", parseLong, parseLong2, j);
        }
    }
}
