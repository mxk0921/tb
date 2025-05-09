package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f24323a = new AtomicLong();

    static {
        t2o.a(393216107);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b946cb9", new Object[0]);
        }
        return b(h5d.f());
    }

    public static String b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54b85bef", new Object[]{str});
        }
        if (str == null) {
            str2 = "";
        } else {
            int indexOf = str.indexOf(":");
            if (indexOf > 0) {
                str2 = str.substring(indexOf);
            } else {
                str2 = "main";
            }
        }
        return str2 + "." + System.currentTimeMillis() + "." + f24323a.incrementAndGet();
    }
}
