package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h2z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_GRAY = 2;
    public static final int TYPE_INTEGRATION = 4;
    public static final int TYPE_RELEASE = 1;
    public static final int TYPE_SELF_GRAY = 3;
    public static final int TYPE_TEST = 5;
    public static final int TYPE_UNKNOWN = 0;

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
        } catch (Exception unused) {
        }
        if (i != 0) {
            return context.getString(i);
        }
        return null;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("189761ea", new Object[]{context})).intValue();
        }
        String a2 = a(context, "package_type");
        String a3 = a(context, "publish_type");
        if (a2 == null || a3 == null) {
            return 0;
        }
        char c = 65535;
        switch (a2.hashCode()) {
            case 49:
                if (a2.equals("1")) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (a2.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (a2.equals("3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if ("1".equals(a3)) {
                    return 1;
                }
                return "0".equals(a3) ? 2 : 4;
            case 1:
                return 4;
            case 2:
                return 5;
            default:
                return 0;
        }
    }
}
