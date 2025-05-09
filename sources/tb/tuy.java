package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tuy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else if (th == null) {
            Log.e(str, str2);
            AdapterForTLog.loge(str, str2);
        } else {
            Log.e(str, str2, th);
            AdapterForTLog.loge(str, str2, th);
        }
    }
}
