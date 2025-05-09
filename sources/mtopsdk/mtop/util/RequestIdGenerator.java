package mtopsdk.mtop.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class RequestIdGenerator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicLong sTimeStamp = new AtomicLong();

    static {
        t2o.a(589300011);
    }

    private RequestIdGenerator() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String getRequestId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91478625", new Object[0]);
        }
        return "r_" + sTimeStamp.incrementAndGet();
    }
}
