package tb;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k3l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static izb f22383a = null;
    public static String b = null;

    static {
        t2o.a(147849226);
    }

    public static synchronized String a(Context context) {
        synchronized (k3l.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e11ddb22", new Object[]{context});
            } else if (context == null) {
                throw new RuntimeException("Context is null");
            } else if (Looper.myLooper() != Looper.getMainLooper()) {
                if (f22383a == null) {
                    f22383a = bi7.a();
                }
                izb izbVar = f22383a;
                if (izbVar != null) {
                    try {
                        String a2 = izbVar.a(context);
                        if (!TextUtils.isEmpty(a2)) {
                            b = a2;
                        }
                        return b;
                    } catch (Throwable unused) {
                    }
                }
                return null;
            } else {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
        }
    }
}
