package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z85 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(452985192);
    }

    public static StringBuilder a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("3a6b5253", new Object[]{new Long(j)});
        }
        StringBuilder sb = new StringBuilder(32);
        long j2 = j / 100000000;
        if (j2 >= 1) {
            sb.append(j2);
            long j3 = (j % 100000000) / 10000000;
            if (j3 > 0) {
                sb.append(".");
                sb.append(j3);
            }
            sb.append("亿");
        } else {
            long j4 = j / 10000;
            if (j4 >= 1) {
                sb.append(j4);
                long j5 = (j % 10000) / 1000;
                if (j5 > 0) {
                    sb.append(".");
                    sb.append(j5);
                }
                sb.append("万");
            } else {
                sb.append(j);
            }
        }
        return sb;
    }
}
