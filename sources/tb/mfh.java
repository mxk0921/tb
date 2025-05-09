package tb;

import android.content.Context;
import com.alibaba.analytics.core.model.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mfh implements snc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592932);
        t2o.a(962592931);
    }

    public mfh(Context context) {
    }

    public synchronized int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b700c8c1", new Object[]{this, new Integer(i)})).intValue();
        }
        nhh.d();
        String n = o2w.k().h().n(Log.class);
        c55 h = o2w.k().h();
        return h.f(Log.class, " _id in ( select _id from " + n + "  ORDER BY priority ASC , _id ASC LIMIT " + i + " )", null);
    }

    public synchronized int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76b03c47", new Object[]{this, str, str2})).intValue();
        }
        nhh.d();
        c55 h = o2w.k().h();
        return h.f(Log.class, str + "< ?", new String[]{str2});
    }

    public synchronized int c(List<Log> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("642e2596", new Object[]{this, list})).intValue();
        }
        return o2w.k().h().g(list);
    }

    @Override // tb.snc
    public synchronized int count() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue();
        }
        return o2w.k().h().d(Log.class);
    }

    public synchronized List<Log> d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("640eb7c1", new Object[]{this, new Integer(i)});
        }
        return o2w.k().h().i(Log.class, null, "priority DESC , time DESC ", i);
    }

    public synchronized boolean e(List<Log> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7154fb5", new Object[]{this, list})).booleanValue();
        }
        o2w.k().h().o(list);
        return true;
    }
}
