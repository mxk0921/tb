package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class dgq implements ujd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOGIN_CANCEL = 911103;
    public static final int LOGIN_FAILED = 911102;
    public static final int LOGIN_SUCCESS = 911101;
    public static final int LOGIN_TIMEOUT = 911104;

    /* renamed from: a  reason: collision with root package name */
    public static volatile cgq f17800a;

    public static cgq b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cgq) ipChange.ipc$dispatch("79e12894", new Object[0]);
        }
        if (f17800a == null) {
            synchronized (dgq.class) {
                try {
                    if (f17800a == null) {
                        f17800a = new cgq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17800a;
    }

    @Override // tb.ujd
    public void a(int i, Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ca7ac5", new Object[]{this, new Integer(i), mtop});
            return;
        }
        switch (i) {
            case 911101:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("ssr.SsrRequestPoolManager", "login success");
                }
                b().d(mtop);
                return;
            case 911102:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("ssr.SsrRequestPoolManager", "login failed");
                }
                b().b(mtop, "SSRE_LOGIN_FAIL", ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL);
                return;
            case 911103:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("ssr.SsrRequestPoolManager", "login cancel");
                }
                b().b(mtop, "SSRE_LOGIN_CANCEL", ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_CANCEL);
                return;
            case 911104:
                TBSdkLog.LogEnable logEnable = TBSdkLog.LogEnable.ErrorEnable;
                if (TBSdkLog.isLogEnable(logEnable)) {
                    TBSdkLog.e("ssr.SsrRequestPoolManager", "login timeout");
                }
                if (nyn.d(mtop, null)) {
                    if (TBSdkLog.isLogEnable(logEnable)) {
                        TBSdkLog.e("ssr.SsrRequestPoolManager", "Session valid, Broadcast may missed!");
                    }
                    b().d(mtop);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
