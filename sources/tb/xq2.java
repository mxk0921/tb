package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xq2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{str, str2});
            return;
        }
        TLog.loge(t71.MODULE_NAME, str, str2);
        Log.e(t71.MODULE_NAME, str + "->" + str2);
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf83f6", new Object[]{str, str2, th});
            return;
        }
        TLog.loge(t71.MODULE_NAME, str, str2, th);
        Log.e(t71.MODULE_NAME, str + "->" + str2, th);
    }
}
