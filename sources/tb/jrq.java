package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jrq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f1a87b", new Object[]{new Long(j)});
        }
        if (j / 100000000 >= 1) {
            return (((float) (j / 10000000)) / 10.0f) + "E";
        } else if (j / 10000 >= 1) {
            return (((float) (j / 1000)) / 10.0f) + "W";
        } else {
            return j + "";
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }
}
