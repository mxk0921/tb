package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fti {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ydd<String, String, Void> f19520a;
    public static final Object b = new Object();
    public static String c;

    public static void a(ydd<String, String, Void> yddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82179fca", new Object[]{yddVar});
            return;
        }
        synchronized (b) {
            try {
                f19520a = yddVar;
                if (!TextUtils.isEmpty(c)) {
                    f19520a.a("utABTest", c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d54453", new Object[]{str});
        } else if (f19520a == null) {
            synchronized (b) {
                try {
                    if (f19520a != null) {
                        f19520a.a("utABTest", str);
                    } else {
                        c = str;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            f19520a.a("utABTest", str);
        }
    }
}
