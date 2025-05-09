package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o9g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LCPerformanceTrace";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f25226a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f25227a;
        public final long b;

        static {
            t2o.a(511705614);
        }

        public a(String str, long j) {
            this.f25227a = str;
            this.b = j;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return TextUtils.equals(this.f25227a, ((a) obj).f25227a);
        }
    }

    static {
        t2o.a(511705613);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f003de7a", new Object[]{str});
        } else {
            ((HashMap) f25226a).put(str, new a(str, SystemClock.elapsedRealtime()));
        }
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41f4dd20", new Object[]{str})).longValue();
        }
        Map<String, a> map = f25226a;
        if (!((HashMap) map).containsKey(str)) {
            return -1L;
        }
        a aVar = (a) ((HashMap) map).remove(str);
        long elapsedRealtime = SystemClock.elapsedRealtime() - aVar.b;
        odg.c(TAG, aVar.f25227a + " cost:" + elapsedRealtime + "ms");
        return elapsedRealtime;
    }
}
