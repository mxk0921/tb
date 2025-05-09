package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class ud9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ud9 f29305a;

    static {
        t2o.a(475005015);
    }

    public static ud9 a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ud9) ipChange.ipc$dispatch("8a684d3f", new Object[]{context});
        }
        if (f29305a == null) {
            synchronized (ud9.class) {
                try {
                    if (f29305a == null) {
                        f29305a = new f19(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29305a;
    }

    public abstract String b();
}
