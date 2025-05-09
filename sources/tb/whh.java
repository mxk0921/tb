package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class whh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb83973", new Object[]{str, str2})).intValue();
        }
        TLog.loge(erj.MODULE, str, str2);
        return Log.e(str, str2);
    }

    public static int b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("152aaa68", new Object[]{str, str2, th})).intValue();
        }
        TLog.loge(erj.MODULE, str, str2, th);
        return Log.e(str, str2, th);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            TLog.loge(erj.MODULE, str, str2);
        }
    }
}
