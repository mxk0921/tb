package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wh4 extends b1n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String adashxServerHost = "Configuration.adashxServerHost";
    public static final String enableExternalLinster = "Configuration.enableExternalLinster";
    public static final String enableReportContentCompress = "Configuration.enableReportContentCompress";
    public static final String enableSafeGuard = "Configuration.enableSafeGuard";
    public static final String enableSecuritySDK = "Configuration.enableSecuritySDK";
    public static final String enableUIProcessSafeGuard = "Configuration.enableUIProcessSafeGuard";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final wh4 INSTANCE = new wh4();
    }

    public static final wh4 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wh4) ipChange.ipc$dispatch("c57326b7", new Object[0]);
        }
        return b.INSTANCE;
    }

    public static /* synthetic */ Object ipc$super(wh4 wh4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tcrash/config/Configuration");
    }

    public wh4() {
        Boolean bool = Boolean.TRUE;
        a(enableExternalLinster, bool);
        a(enableSafeGuard, bool);
        a(enableUIProcessSafeGuard, Boolean.FALSE);
        a(enableReportContentCompress, bool);
        a(enableSecuritySDK, bool);
        a(adashxServerHost, "h-adashx.ut.taobao.com");
    }
}
