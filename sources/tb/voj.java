package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class voj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355858);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95e3928", new Object[]{context, str});
        } else {
            s3s.d(context, str);
        }
    }

    public static void b(Context context, String str, Bundle bundle, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc0afdd", new Object[]{context, str, bundle, new Integer(i), new Boolean(z)});
        } else {
            s3s.e(context, str, bundle, i, z);
        }
    }

    public static void c(Context context, String str, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d937fda8", new Object[]{context, str, bundle, new Boolean(z)});
        } else {
            s3s.f(context, str, bundle, z);
        }
    }

    public static void d(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62699eac", new Object[]{context, str, new Boolean(z)});
        } else {
            s3s.f(context, str, null, z);
        }
    }
}
