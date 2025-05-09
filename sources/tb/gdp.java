package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gdp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile gdp b = null;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Pair<Class, Object>> f19914a = new ConcurrentHashMap<>();

    static {
        t2o.a(393216103);
    }

    public static gdp b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gdp) ipChange.ipc$dispatch("c2288af3", new Object[0]);
        }
        if (b == null) {
            synchronized (gdp.class) {
                try {
                    if (b == null) {
                        b = new gdp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7806ad02", new Object[]{this, list});
        } else if (list != null) {
            for (String str : list) {
                this.f19914a.remove(str);
            }
        }
    }

    public Pair<Class, Object> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d0c621a", new Object[]{this, str});
        }
        return this.f19914a.get(str);
    }

    public void d(String str, Pair<Class, Object> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ceda8c3", new Object[]{this, str, pair});
        } else {
            this.f19914a.putIfAbsent(str, pair);
        }
    }
}
