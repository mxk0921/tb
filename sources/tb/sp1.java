package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sp1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f28194a = 62;

    static {
        t2o.a(343933229);
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcb258b9", new Object[]{new Long(j)});
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0 || i == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (j != 0) {
            int i2 = f28194a;
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (j % i2)));
            j /= i2;
        }
        return sb.reverse().toString();
    }
}
