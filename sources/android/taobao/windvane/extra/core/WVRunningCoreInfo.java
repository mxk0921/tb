package android.taobao.windvane.extra.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.export.extension.IRunningCoreInfo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVRunningCoreInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile IRunningCoreInfo sRunningCoreInfo;

    static {
        t2o.a(989855935);
    }

    public static String getCoreVersion() {
        ICoreVersion coreVersion;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("980bf3d6", new Object[0]);
        }
        IRunningCoreInfo iRunningCoreInfo = sRunningCoreInfo;
        if (iRunningCoreInfo == null || (coreVersion = iRunningCoreInfo.coreVersion()) == null) {
            return null;
        }
        return coreVersion.version();
    }

    public static void setRunningCoreInfo(IRunningCoreInfo iRunningCoreInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df8acadb", new Object[]{iRunningCoreInfo});
        } else {
            sRunningCoreInfo = iRunningCoreInfo;
        }
    }
}
