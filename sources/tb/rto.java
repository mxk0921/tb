package tb;

import com.taobao.calendar.sdk.db.ScheduleDO;
import java.util.Comparator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rto implements Comparator {
    static {
        t2o.a(414187545);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        long j = ((ScheduleDO) obj).alartTime;
        long j2 = ((ScheduleDO) obj2).alartTime;
        if (j > j2) {
            return 1;
        }
        if (j < j2) {
            return -1;
        }
        return 0;
    }
}
