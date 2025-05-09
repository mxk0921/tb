package android.taobao.windvane.extra.uc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVGlobalState {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean sUrlHasBeenLoaded = false;

    static {
        t2o.a(989856091);
    }

    private WVGlobalState() {
    }

    public static void markLoadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb0eda3", new Object[0]);
        } else {
            sUrlHasBeenLoaded = true;
        }
    }

    public static boolean urlHasBeenLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5e3c2e7", new Object[0])).booleanValue();
        }
        return sUrlHasBeenLoaded;
    }
}
