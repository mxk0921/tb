package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class guh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_LOG = "MinutesDetail:";
    public static final String DOWNGRADE_LOG = "MinutesDowngrade:";
    public static final String TAG = "MinutesSdk:";

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a85d94", new Object[]{str, str2});
            return;
        }
        TLog.loge(str, str2);
        if (Versions.isDebug()) {
            Log.e(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91eb9ae1", new Object[]{str, str2, th});
        } else if (!TextUtils.isEmpty(str2) || th != null) {
            TLog.loge(str, str2, th);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1546686c", new Object[]{str, str2});
        } else {
            TLog.loge(str, str2);
        }
    }
}
