package android.taobao.windvane.extra.uc.init;

import android.content.Context;
import android.os.SystemClock;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import tb.r9u;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVDexOptimizer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVDexOptimizer";

    static {
        t2o.a(989856157);
    }

    private WVDexOptimizer() {
    }

    public static void preloadDexSafe(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c87106", new Object[]{context});
            return;
        }
        r9u.b("preloadDex");
        try {
            String fetchUCRemoteLocal = WVUCRemoteFetcher.fetchUCRemoteLocal();
            if (!TextUtils.isEmpty(fetchUCRemoteLocal)) {
                long uptimeMillis = SystemClock.uptimeMillis();
                U4Engine.loadCoreDex(context, new File(fetchUCRemoteLocal));
                v7t.i(TAG, "preloadDex cost " + (SystemClock.uptimeMillis() - uptimeMillis));
            } else {
                v7t.d(TAG, "preloadDex error ucSoPath is empty");
            }
        } catch (Throwable th) {
            v7t.d(TAG, "preloadDex error " + th.getMessage());
        }
        r9u.d();
    }
}
