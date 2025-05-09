package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class th3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(285212678);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        if (hashMap != null) {
            try {
                z = TextUtils.equals((String) hashMap.get("process"), "com.taobao.taobao");
            } catch (Throwable th) {
                th.printStackTrace();
                AdapterForTLog.loge(qh3.TAG, "ChangeAppIconLauncher error", th);
                return;
            }
        }
        AdapterForTLog.loge(qh3.TAG, "ChangeAppIconLauncher init isMainProcess:" + z);
        rh3.a(application, z);
    }
}
