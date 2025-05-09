package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.Calendar;
import java.util.TimeZone;
import tb.ftt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bvt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701672);
    }

    public static final long a(ftt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb3676e", new Object[]{aVar})).longValue();
        }
        ckf.g(aVar, "<this>");
        return TimeStampManager.instance().getCurrentTimeStamp();
    }

    public static final qtt b(ftt.a aVar, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qtt) ipChange.ipc$dispatch("ccfec430", new Object[]{aVar, new Long(j), str});
        }
        ckf.g(aVar, "<this>");
        Calendar instance = Calendar.getInstance();
        if (str != null) {
            instance.setTimeZone(TimeZone.getTimeZone(str));
        }
        instance.setTimeInMillis(j);
        return new qtt(instance.get(1), instance.get(2) + 1, instance.get(5), instance.get(11), instance.get(12), instance.get(13));
    }

    public static /* synthetic */ qtt c(ftt.a aVar, long j, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qtt) ipChange.ipc$dispatch("a0309834", new Object[]{aVar, new Long(j), str, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return b(aVar, j, str);
    }

    public static final long d(ftt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec16273e", new Object[]{aVar})).longValue();
        }
        ckf.g(aVar, "<this>");
        return System.currentTimeMillis();
    }
}
