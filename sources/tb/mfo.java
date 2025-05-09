package tb;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539429);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13ffdf99", new Object[]{str})).intValue();
        }
        return str.replaceAll("E[+-]?\\d+", "").replace(".", "").length();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9163653a", new Object[]{str});
        }
        int a2 = a(str);
        int a3 = a(String.valueOf((int) Float.parseFloat(str)));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a3; i++) {
            sb.append('0');
        }
        if (a3 != a2) {
            sb.append('.');
            while (true) {
                a3++;
                if (a3 > a2) {
                    break;
                }
                sb.append('0');
            }
        }
        return sb.toString();
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d0fd67e", new Object[0])).longValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    public static int d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c520933", new Object[]{new Boolean(z)})).intValue();
        }
        if (z) {
            return 1;
        }
        return 0;
    }

    public static boolean e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("785366b6", new Object[]{new Long(j)})).booleanValue();
        }
        if (j >= c() || System.currentTimeMillis() < c()) {
            return false;
        }
        return true;
    }

    public static void f(TextView textView, boolean z, String str) {
        Typeface typeface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767611fa", new Object[]{textView, new Boolean(z), str});
        } else if (TextUtils.isEmpty(str)) {
            textView.setTypeface(Typeface.defaultFromStyle(d(z)));
        } else {
            try {
                typeface = fv9.c().b(str, d(z));
            } catch (InterruptedException e) {
                fve.e("RollingNumberUtil", "出现异常: " + e);
                typeface = null;
            }
            if (typeface != null) {
                textView.setLineSpacing(10.0f, 1.0f);
                textView.setTypeface(typeface);
                return;
            }
            textView.setTypeface(Typeface.defaultFromStyle(d(z)));
        }
    }
}
