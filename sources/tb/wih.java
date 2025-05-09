package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wih extends Handler implements iby {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOGIN_CANCEL = 911103;
    public static final int LOGIN_FAILED = 911102;
    public static final int LOGIN_SUCCESS = 911101;
    public static final int LOGIN_TIMEOUT = 911104;
    public static final Map<String, wih> c = new ConcurrentHashMap();
    public static HandlerThread d;

    /* renamed from: a  reason: collision with root package name */
    public final Mtop f30717a;
    public final String b;

    static {
        t2o.a(589299777);
        t2o.a(589299781);
    }

    public wih(Mtop mtop, String str, Looper looper) {
        super(looper);
        this.f30717a = mtop;
        this.b = str;
    }

    public static String a(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("339253ad", new Object[]{mtop, str});
        }
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        return StringUtils.concatStr(mtop.getInstanceId(), str);
    }

    public static wih b(Mtop mtop, String str) {
        Mtop mtop2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wih) ipChange.ipc$dispatch("5ce44356", new Object[]{mtop, str});
        }
        if (mtop == null) {
            mtop2 = Mtop.instance(null);
        } else {
            mtop2 = mtop;
        }
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        String a2 = a(mtop, str);
        Map<String, wih> map = c;
        wih wihVar = (wih) ((ConcurrentHashMap) map).get(a2);
        if (wihVar == null) {
            synchronized (wih.class) {
                try {
                    wihVar = (wih) ((ConcurrentHashMap) map).get(a2);
                    if (wihVar == null) {
                        if (d == null) {
                            HandlerThread handlerThread = new HandlerThread("mtopsdk.LoginHandler");
                            d = handlerThread;
                            handlerThread.start();
                        }
                        wihVar = new wih(mtop2, str, d.getLooper());
                        ((ConcurrentHashMap) map).put(a2, wihVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return wihVar;
    }

    public static /* synthetic */ Object ipc$super(wih wihVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/remotebusiness/login/LoginHandler");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82cd926b", new Object[]{this});
        } else {
            sendEmptyMessage(911103);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ea5b8f", new Object[]{this});
        } else {
            sendEmptyMessage(911102);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbcebe0", new Object[]{this});
        } else {
            sendEmptyMessage(911101);
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1fdaf3", new Object[]{this, str});
            return;
        }
        sih c2 = nyn.c(this.f30717a, this.b);
        if (c2 == null) {
            TBSdkLog.e("mtopsdk.LoginHandler", str + " [updateXStateSessionInfo] LoginContext is null.");
            return;
        }
        try {
            if (StringUtils.isNotBlank(c2.f28073a) && !c2.f28073a.equals(this.f30717a.getMultiAccountSid(this.b))) {
                this.f30717a.registerMultiAccountSession(this.b, c2.f28073a, c2.b);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("mtopsdk.LoginHandler", str + " [updateXStateSessionInfo] invoked.");
                }
            }
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.LoginHandler", str + " [updateXStateSessionInfo] error.", e);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        String a2 = a(this.f30717a, this.b);
        TBSdkLog.LogEnable logEnable = TBSdkLog.LogEnable.ErrorEnable;
        if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.e("mtopsdk.LoginHandler", a2 + " [handleMessage]The MtopBusiness LoginHandler receive message .");
        }
        switch (message.what) {
            case 911101:
                if (TBSdkLog.isLogEnable(logEnable)) {
                    TBSdkLog.e("mtopsdk.LoginHandler", a2 + " [handleMessage]onReceive: NOTIFY_LOGIN_SUCCESS.");
                }
                f(a2);
                l5o.a("SESSION").e(this.f30717a, this.b);
                removeMessages(911104);
                break;
            case 911102:
                if (TBSdkLog.isLogEnable(logEnable)) {
                    TBSdkLog.e("mtopsdk.LoginHandler", a2 + "[handleMessage]onReceive: NOTIFY_LOGIN_FAILED.");
                }
                l5o.a("SESSION").b(this.f30717a, this.b, ErrorConstant.ERRCODE_ANDROID_SYS_LOGIN_FAIL, ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL);
                removeMessages(911104);
                break;
            case 911103:
                if (TBSdkLog.isLogEnable(logEnable)) {
                    TBSdkLog.e("mtopsdk.LoginHandler", a2 + "[handleMessage]onReceive: NOTIFY_LOGIN_CANCEL.");
                }
                l5o.a("SESSION").b(this.f30717a, this.b, "ANDROID_SYS_LOGIN_CANCEL", ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_CANCEL);
                removeMessages(911104);
                break;
            case 911104:
                if (TBSdkLog.isLogEnable(logEnable)) {
                    TBSdkLog.e("mtopsdk.LoginHandler", a2 + "[handleMessage]onReceive: NOTIFY_LOGIN_TIMEOUT.");
                }
                if (nyn.d(this.f30717a, this.b)) {
                    if (TBSdkLog.isLogEnable(logEnable)) {
                        TBSdkLog.e("mtopsdk.LoginHandler", "Session valid, Broadcast may missed!");
                    }
                    f(a2);
                    l5o.a("SESSION").e(this.f30717a, this.b);
                    break;
                }
                break;
        }
        ujd a3 = s5o.a();
        if (a3 != null) {
            a3.a(message.what, this.f30717a);
        }
    }
}
