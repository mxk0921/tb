package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f27668a;

    public static boolean b(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96669d88", new Object[]{context})).booleanValue();
        }
        Boolean bool = f27668a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            f27668a = Boolean.valueOf(z);
        } catch (Exception unused) {
            f27668a = Boolean.FALSE;
        }
        return f27668a.booleanValue();
    }

    public static String a(Context context, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de2570b5", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            i = context.getResources().getIdentifier(str, "string", context.getPackageName());
        } catch (Exception e) {
            ehh.d(e);
        }
        if (i != 0) {
            return context.getString(i);
        }
        return null;
    }
}
