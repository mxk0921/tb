package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ebr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(443547656);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            TTDetailPageManager.w0(application, hashMap);
        }
    }
}
