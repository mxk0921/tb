package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class yt4 extends zt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CORE_FAILED_CUSTOM_START = 1000;
    public static final int CORE_FAILED_TYPE_ARCH_X86_NOT_SUPPORT = 4;
    public static final int CORE_FAILED_TYPE_PARAM_INVALID = 1;
    public static final int CORE_FAILED_TYPE_UC_CORE_INIT_U4_ERROR = 7;
    public static final int CORE_FAILED_TYPE_UC_CORE_NO_INIT_METHOD = 6;
    public static final int CORE_FAILED_TYPE_UC_CORE_PROCESS_NO_INIT = 5;
    public static final int CORE_FAILED_TYPE_UC_CORE_WINDVANE = 8;
    public static final int CORE_FAILED_TYPE_UC_DISABLED = 2;
    public static final int CORE_FAILED_TYPE_UC_DOWNLOAD_FAIL = 3;

    static {
        t2o.a(989856459);
    }

    public static /* synthetic */ Object ipc$super(yt4 yt4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/webview/CoreEventCallback2");
    }

    public void onUCCoreInitFailed(au4 au4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764065fe", new Object[]{this, au4Var});
        }
    }
}
