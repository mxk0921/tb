package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.tcon.OpenSSLInit;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class coo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        if (ABGlobal.isFeatureOpened(null, "player_pre_init_v2")) {
            hq.a(application, hashMap);
        }
        if (ABGlobal.isFeatureOpened(null, "openssl_pre_init")) {
            OpenSSLInit.init();
        }
    }
}
