package anet.channel.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SessionSeq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicInteger mIndex = new AtomicInteger();

    static {
        t2o.a(607125957);
    }

    public static String createSequenceNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7ccb4f1", new Object[]{str});
        }
        if (mIndex.get() == Integer.MAX_VALUE) {
            mIndex.set(0);
        }
        if (!TextUtils.isEmpty(str)) {
            return StringUtils.concatString(str, ".AWCN", String.valueOf(mIndex.incrementAndGet()));
        }
        return StringUtils.concatString("AWCN", String.valueOf(mIndex.incrementAndGet()));
    }
}
