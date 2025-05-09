package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h4r {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h4r INSTANCE = new h4r();

    static {
        t2o.a(850395166);
    }

    @JvmStatic
    public static final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d82b0282", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        e4r.a(context);
        String c = e4r.c();
        if (c != null && kes.a(c, "100.0.4896.58") > 0) {
            return true;
        }
        return false;
    }
}
