package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f25762a = f4b.b("enableHomePageDarkMode", true);

    static {
        t2o.a(473956391);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79643682", new Object[]{context})).booleanValue();
        }
        if (!f25762a || !var.c(context)) {
            return false;
        }
        return true;
    }
}
