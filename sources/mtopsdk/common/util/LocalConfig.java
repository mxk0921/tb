package mtopsdk.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LocalConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.LocalConfig";
    private static LocalConfig instance;
    public boolean enableErrorCodeMapping = true;
    public boolean enableBizErrorCodeMapping = true;
    public boolean enableSpdy = true;
    @Deprecated
    public boolean enableUnit = true;
    public boolean enableSsl = true;
    public boolean enableProperty = true;
    @Deprecated
    public boolean enableRemoteNetworkService = true;

    static {
        t2o.a(589299796);
    }

    public static LocalConfig getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalConfig) ipChange.ipc$dispatch("cf3183c", new Object[0]);
        }
        if (instance == null) {
            synchronized (LocalConfig.class) {
                try {
                    if (instance == null) {
                        instance = new LocalConfig();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }
}
