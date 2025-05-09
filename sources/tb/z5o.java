package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f32555a = new AtomicInteger(0);

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69b821b3", new Object[]{str, str2})).intValue();
        }
        if (str == null) {
            if (str2 == null) {
                return 0;
            }
            return -1;
        } else if (str2 == null) {
            return 1;
        } else {
            try {
                return Integer.parseInt(str) - Integer.parseInt(str2);
            } catch (Exception unused) {
                return str.compareTo(str2);
            }
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7afcc04", new Object[0]);
        }
        return String.valueOf(f32555a.incrementAndGet());
    }
}
