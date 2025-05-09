package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a68 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "edlp";

    static {
        t2o.a(1032847365);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (s74.b()) {
            TLog.loge(TAG, " idel start init ");
            a9f.a(application);
            a9f.c();
            TLog.loge(TAG, " idel end init ");
        }
    }
}
