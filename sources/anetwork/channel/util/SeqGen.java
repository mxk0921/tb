package anetwork.channel.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SeqGen {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int mask = Integer.MAX_VALUE;
    private static AtomicInteger seq = new AtomicInteger(0);

    static {
        t2o.a(607126155);
    }

    public static String createSeqNo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da5a4d81", new Object[]{str, str2});
        }
        StringBuilder sb = new StringBuilder(16);
        if (str != null) {
            sb.append(str);
            sb.append('.');
        }
        if (str2 != null) {
            sb.append(str2);
            sb.append(seq.incrementAndGet() & Integer.MAX_VALUE);
        }
        return sb.toString();
    }
}
