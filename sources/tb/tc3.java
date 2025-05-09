package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.alibaba.android.icart.core.data.a;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CART_CHECK_BUBBLE_IS_SHOW = "cartCheckBubbleIsShow";

    /* renamed from: a  reason: collision with root package name */
    public static final m9v f28629a = m9v.d(c9x.CART_BIZ_NAME);

    static {
        t2o.a(479199571);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("206af96b", new Object[]{context})).booleanValue();
        }
        Boolean i = f28629a.i(CART_CHECK_BUBBLE_IS_SHOW, null);
        if (i != null) {
            return i.booleanValue();
        }
        if (context == null) {
            return false;
        }
        return d(context).getBoolean(CART_CHECK_BUBBLE_IS_SHOW, false);
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0134aed", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        m9v m9vVar = f28629a;
        Boolean i = m9vVar.i(str, null);
        if (i != null) {
            return i.booleanValue();
        }
        boolean z2 = c(context).getBoolean(str, z);
        m9vVar.p(str, z2);
        return z2;
    }

    @Deprecated
    public static SharedPreferences c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("7910e2e2", new Object[]{context});
        }
        return context.getSharedPreferences(a.SP_FILE_NAME, 0);
    }

    @Deprecated
    public static SharedPreferences d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a65cbf13", new Object[]{context});
            return;
        }
        f28629a.p(CART_CHECK_BUBBLE_IS_SHOW, true);
        if (context != null) {
            d(context).edit().putBoolean(CART_CHECK_BUBBLE_IS_SHOW, true).apply();
        }
    }

    public static void f(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900749f5", new Object[]{context, str, new Boolean(z)});
        } else {
            f28629a.p(str, z);
        }
    }
}
