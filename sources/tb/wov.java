package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class wov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356504);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b989da7e", new Object[]{context});
        }
        return s3s.c(context);
    }
}
