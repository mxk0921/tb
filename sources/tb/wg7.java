package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wg7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(438304847);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        String str3 = "[" + str + "] " + str2;
        if (!TextUtils.isEmpty(str3)) {
            TLog.loge("Detail_Core", str3);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        String str3 = "[" + str + "] " + str2;
        if (!TextUtils.isEmpty(str3)) {
            TLog.loge("Detail_Core", str3);
        }
    }
}
