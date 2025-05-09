package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pth {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26288a = false;
    public static boolean b = false;
    public static int c = -1;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4e15485", new Object[0]);
        }
        int c2 = c();
        if (c2 == 0) {
            return "h";
        }
        if (c2 == 1) {
            return "m";
        }
        if (c2 == 2) {
            return "l";
        }
        return "unknown:" + c2;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[0]);
        }
        return String.valueOf(c());
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("312199f", new Object[0])).intValue();
        }
        int i = c;
        if (i < 0) {
            i = c21.g().getInt("deviceLevel", -1);
            if (!f26288a && i < 0) {
                String a2 = zuh.a("deviceLevel", "");
                if (!TextUtils.isEmpty(a2)) {
                    i = Integer.parseInt(a2);
                    c = i;
                }
                f26288a = true;
            }
            if (!b && i >= 0) {
                b = true;
                zuh.b("deviceLevel", String.valueOf(i));
            }
        }
        return i;
    }
}
