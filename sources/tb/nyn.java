package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.login.LoginNotImplementException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nyn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "mtopsdk.RemoteLogin";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, rid> f25036a = new ConcurrentHashMap();

    static {
        t2o.a(589299780);
    }

    public static rid a(Mtop mtop) {
        String str;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rid) ipChange.ipc$dispatch("41097469", new Object[]{mtop});
        }
        if (mtop == null) {
            str = Mtop.Id.INNER;
        } else {
            str = mtop.getInstanceId();
        }
        Map<String, rid> map = f25036a;
        rid ridVar = (rid) ((ConcurrentHashMap) map).get(str);
        if (ridVar == null) {
            synchronized (nyn.class) {
                try {
                    ridVar = (rid) ((ConcurrentHashMap) map).get(str);
                    if (ridVar == null) {
                        if (mtop == null) {
                            context = null;
                        } else {
                            context = mtop.getMtopConfig().context;
                        }
                        p27 g = p27.g(context);
                        if (g != null) {
                            ((ConcurrentHashMap) map).put(str, g);
                            ridVar = g;
                        } else {
                            TBSdkLog.e(TAG, str + " [getLogin]loginImpl is null");
                            throw new LoginNotImplementException(str + " [getLogin] Login Not Implement!");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ridVar;
    }

    @Deprecated
    public static sih b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sih) ipChange.ipc$dispatch("a65acccd", new Object[0]);
        }
        return c(null, null);
    }

    public static sih c(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sih) ipChange.ipc$dispatch("8154c8ca", new Object[]{mtop, str});
        }
        rid a2 = a(mtop);
        if (!(a2 instanceof r8j)) {
            return a2.getLoginContext();
        }
        if ("DEFAULT".equals(str)) {
            str = null;
        }
        return ((r8j) a2).b(str);
    }

    public static boolean d(Mtop mtop, String str) {
        r8j r8jVar;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c8b533e", new Object[]{mtop, str})).booleanValue();
        }
        rid a2 = a(mtop);
        if (a2 instanceof r8j) {
            r8jVar = (r8j) a2;
        } else {
            r8jVar = null;
        }
        if ("DEFAULT".equals(str)) {
            str = null;
        }
        if (r8jVar != null) {
            z = r8jVar.c(str);
        } else {
            z = a2.isLogining();
        }
        if (z) {
            return false;
        }
        if (r8jVar != null) {
            return r8jVar.d(str);
        }
        return a2.isSessionValid();
    }

    public static void e(Mtop mtop, String str, boolean z, Object obj) {
        String str2;
        String str3;
        r8j r8jVar;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200a4d3d", new Object[]{mtop, str, new Boolean(z), obj});
            return;
        }
        rid a2 = a(mtop);
        if (mtop == null) {
            str2 = Mtop.Id.INNER;
        } else {
            str2 = mtop.getInstanceId();
        }
        if (StringUtils.isBlank(str)) {
            str3 = "DEFAULT";
        } else {
            str3 = str;
        }
        String concatStr = StringUtils.concatStr(str2, str3);
        String str4 = null;
        if (a2 instanceof r8j) {
            r8jVar = (r8j) a2;
        } else {
            r8jVar = null;
        }
        if (!"DEFAULT".equals(str)) {
            str4 = str;
        }
        if (r8jVar != null) {
            z2 = r8jVar.c(str4);
        } else {
            z2 = a2.isLogining();
        }
        if (!SwitchConfig.getInstance().checkLoginStatus() || !z2) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e(TAG, concatStr + " [login]call login");
            }
            if (obj != null && (a2 instanceof p27)) {
                ((p27) a2).f(obj);
            }
            wih b = wih.b(mtop, str);
            if (r8jVar != null) {
                r8jVar.e(str4, b, z);
            } else {
                a2.login(b, z);
            }
            b.sendEmptyMessageDelayed(911104, 20000L);
        } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            TBSdkLog.e(TAG, concatStr + " [login] loginsdk is logining");
        }
    }

    public static void f(Mtop mtop, rid ridVar) {
        String instanceId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75f504d", new Object[]{mtop, ridVar});
        } else if (ridVar != null) {
            synchronized (nyn.class) {
                if (mtop == null) {
                    instanceId = Mtop.Id.INNER;
                } else {
                    try {
                        instanceId = mtop.getInstanceId();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((ConcurrentHashMap) f25036a).put(instanceId, ridVar);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, instanceId + " [setLoginImpl] set loginImpl=" + ridVar);
                }
            }
        }
    }

    public static void g(Mtop mtop, Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77035ed1", new Object[]{mtop, bundle});
            return;
        }
        rid a2 = a(mtop);
        if (a2 instanceof sid) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                if (mtop == null) {
                    str = Mtop.Id.INNER;
                } else {
                    str = mtop.getInstanceId();
                }
                TBSdkLog.i(TAG, str + " [setSessionInvalid] bundle=" + bundle);
            }
            ((sid) a2).a(bundle);
        }
    }
}
