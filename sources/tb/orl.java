package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class orl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(737149027);
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4882b92", new Object[]{str, new Long(j)})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            TLog.loge(yr2.MODULE, "ParseUtil", String.format("safelyParseLong: parse %s with exception %s.", str, e));
            return j;
        }
    }
}
