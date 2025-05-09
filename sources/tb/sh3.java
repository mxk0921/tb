package tb;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sh3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CHANGE_APP_ICON_RESULT = "change_app_icon_result";

    static {
        t2o.a(284164098);
    }

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798729dd", new Object[]{intent});
            return;
        }
        AdapterForTLog.loge(qh3.TAG, "sendBroadcast:" + intent.getAction());
        LocalBroadcastManager.getInstance(qh3.k()).sendBroadcast(intent);
    }
}
