package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f32683a;

    static {
        t2o.a(347078694);
    }

    public static synchronized Context a() {
        synchronized (zca.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("d3bbff99", new Object[0]);
            }
            if (f32683a == null) {
                f32683a = yaa.n;
            }
            return f32683a;
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a491301", new Object[]{context});
        } else if (f32683a == null && context != null) {
            f32683a = context.getApplicationContext();
        }
    }
}
