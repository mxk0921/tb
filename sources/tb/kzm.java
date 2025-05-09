package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kzm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL_IN = 2;
    public static final int PART_IN = 1;
    public static final int SKIP = 0;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5331230", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "PART_IN";
        }
        if (i == 2) {
            return "ALL_IN";
        }
        return "SKIP";
    }
}
