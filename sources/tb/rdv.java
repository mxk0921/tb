package tb;

import android.content.Context;
import com.alibaba.android.umbrella.weex.UmbrellaWeexModule;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a581366a", new Object[]{context});
            return;
        }
        try {
            WXSDKEngine.registerModule("umbrella-weex", UmbrellaWeexModule.class);
        } catch (Throwable th) {
            TLog.loge("UmbrellaWeexLauncher", "launchUmbrella", th);
        }
    }
}
