package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LEVEL_HIGH = "h";
    public static final String LEVEL_LOW = "l";
    public static final String LEVEL_MED = "m";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f24078a = null;

    static {
        t2o.a(404750665);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
        } else {
            f24078a = null;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[0]);
        }
        try {
            int i = c21.g().getInt("deviceLevel", -1);
            if (i == 0) {
                return "h";
            }
            if (i == 1) {
                return "m";
            }
            return "l";
        } catch (Throwable th) {
            th.printStackTrace();
            return "h";
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ddc7d21", new Object[0])).booleanValue();
        }
        Boolean bool = f24078a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String w = v82.c.w();
        if (TextUtils.isEmpty(w)) {
            return true;
        }
        String b = b();
        String[] split = w.split(",");
        f24078a = Boolean.FALSE;
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (TextUtils.equals(split[i], b)) {
                f24078a = Boolean.TRUE;
                break;
            } else {
                i++;
            }
        }
        Boolean bool2 = f24078a;
        if (bool2 == null || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }
}
