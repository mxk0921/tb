package tb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(817889361);
    }

    public static Activity a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b8aa660f", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static String b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c5aed29", new Object[]{obj, str});
        }
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }
}
