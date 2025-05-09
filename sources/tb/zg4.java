package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static zg4 f32742a = null;
    public static final Map<String, String> b = Collections.synchronizedMap(new HashMap());

    static {
        t2o.a(962592856);
    }

    public static synchronized zg4 b() {
        synchronized (zg4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zg4) ipChange.ipc$dispatch("234392cf", new Object[0]);
            }
            if (f32742a == null) {
                f32742a = new zg4();
            }
            return f32742a;
        }
    }

    public synchronized String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        String str2 = b.get(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        return str2;
    }

    public synchronized void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
        } else {
            b.put(str, str2);
        }
    }

    public synchronized long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7149c7f7", new Object[]{this, str})).longValue();
        }
        String str2 = b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }
}
