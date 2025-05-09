package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final DecimalFormat f29890a = new DecimalFormat("#.#");
    public static final DecimalFormat b = new DecimalFormat("#.##");

    static {
        t2o.a(779093657);
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88795816", new Object[]{new Long(j)});
        }
        if (j < 100000) {
            return "" + j;
        } else if (j < 1000000) {
            return b.format((j * 1.0d) / 10000.0d) + "万";
        } else if (j < 100000000) {
            return f29890a.format((j * 1.0d) / 10000.0d) + "万";
        } else {
            return b.format((j * 1.0d) / 1.0E8d) + "亿";
        }
    }

    public static String b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b35c6a26", new Object[]{new Long(j)});
        }
        if (j < 100000) {
            return "" + j;
        }
        return f29890a.format((j * 1.0d) / 10000.0d) + "万";
    }
}
