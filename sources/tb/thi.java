package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class thi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705144);
    }

    public static int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a671ff3", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i3 == 90 || i3 == 270) {
            return i;
        }
        return i2;
    }

    public static int b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b098c104", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i3 == 90 || i3 == 270) {
            return i2;
        }
        return i;
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37a268ac", new Object[]{str, str2});
        }
        return d(str, str2, "");
    }

    public static String d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e186122", new Object[]{str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        if (TextUtils.isEmpty(str2)) {
            str2 = str3;
        }
        sb.append(str2);
        return sb.toString();
    }
}
