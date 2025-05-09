package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.manager.FeatureManager;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static i1r f25089a;

    public static i1r a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1r) ipChange.ipc$dispatch("47252cff", new Object[]{context});
        }
        return b(context, false);
    }

    public static i1r b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1r) ipChange.ipc$dispatch("7a75cbf", new Object[]{context, new Boolean(z)});
        }
        if (f25089a == null || z) {
            try {
                f25089a = new i1r(context.getSharedPreferences(FeatureManager.FEATURE_KEY_CRASH, 0).getAll());
            } catch (Exception unused) {
                f25089a = new i1r(new HashMap());
            }
        }
        return f25089a;
    }
}
