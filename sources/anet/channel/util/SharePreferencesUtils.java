package anet.channel.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SharePreferencesUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SP_NAME_CORE = "network_core_init_config";
    private static volatile SharedPreferences corePreferences;

    static {
        t2o.a(607125958);
    }

    public static SharedPreferences getCorePreferences(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("c2a31db2", new Object[]{context});
        }
        if (corePreferences == null) {
            synchronized (SharePreferencesUtils.class) {
                try {
                    if (corePreferences == null) {
                        corePreferences = context.getSharedPreferences("network_core_init_config", 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return corePreferences;
    }
}
