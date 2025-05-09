package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class bka {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile bka f16443a;
    public static final Map<String, aka> b = new ConcurrentHashMap();

    static {
        t2o.a(989856191);
    }

    public static bka c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bka) ipChange.ipc$dispatch("43453a60", new Object[0]);
        }
        if (f16443a == null) {
            synchronized (bka.class) {
                try {
                    if (f16443a == null) {
                        f16443a = new bka();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16443a;
    }

    public void a(aka akaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af09bf1", new Object[]{this, akaVar});
        } else {
            ((ConcurrentHashMap) b).put(akaVar.b(), akaVar);
        }
    }

    public aka b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aka) ipChange.ipc$dispatch("9a7a2b6c", new Object[]{this, str});
        }
        return (aka) ((ConcurrentHashMap) b).get(str);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
        } else {
            ((ConcurrentHashMap) b).remove(str);
        }
    }
}
