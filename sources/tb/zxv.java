package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f33082a = new AtomicInteger(0);

    static {
        t2o.a(315621417);
    }

    public static void a(long j, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e38afd", new Object[]{new Long(j), sb});
            return;
        }
        do {
            long j2 = 58;
            sb.insert(0, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".charAt((int) (j % j2)));
            j /= j2;
        } while (j > 0);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f2139b9", new Object[0]);
        }
        StringBuilder sb = new StringBuilder(8);
        a((f33082a.getAndIncrement() & Integer.MAX_VALUE) % 58, sb);
        a((System.currentTimeMillis() % 31622400000L) + 691200000, sb);
        sb.insert(0, "7");
        return sb.toString();
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9986362a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                sb.append("%25");
            } else if (charAt == ',') {
                sb.append("%2C");
            } else if (charAt == '=') {
                sb.append("%3D");
            } else if (charAt != '|') {
                sb.append(charAt);
            } else {
                sb.append("%7C");
            }
            z = true;
        }
        if (z) {
            return sb.toString();
        }
        return str;
    }
}
