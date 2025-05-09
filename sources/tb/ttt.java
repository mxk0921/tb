package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ttt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Long> f28955a = new ConcurrentHashMap<>();

    static {
        t2o.a(393216106);
    }

    public static void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24ad6e2", new Object[]{str, new Long(j)});
        } else {
            f28955a.put(str, Long.valueOf(j));
        }
    }

    public static boolean a(String str, long j) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f51dab8", new Object[]{str, new Long(j)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            b5d.i("TimeMeter", "isTimeOut() illegalArguments", new Object[0]);
            return false;
        }
        synchronized (ttt.class) {
            try {
                Long l = f28955a.get(str);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (l != null) {
                    if (elapsedRealtime <= l.longValue()) {
                        z = false;
                    }
                    if (z) {
                        b(str, elapsedRealtime + j);
                    }
                    return z;
                }
                b(str, elapsedRealtime + j);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
