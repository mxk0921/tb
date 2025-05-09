package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, mid> f20946a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements wj1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(589299741);
            t2o.a(589299736);
        }

        public a(Mtop mtop, xj1 xj1Var) {
        }
    }

    static {
        t2o.a(589299740);
    }

    public static void a(Mtop mtop, xj1 xj1Var) {
        lwc lwcVar;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d22ec31", new Object[]{mtop, xj1Var});
        } else if (xj1Var == null) {
            TBSdkLog.e("mtopsdk.RemoteAuth", "[authorize] authParam is null");
        } else {
            mid b = b(mtop);
            if (b != null) {
                if (b instanceof lwc) {
                    lwcVar = (lwc) b;
                } else {
                    lwcVar = null;
                }
                if (lwcVar != null) {
                    z = lwcVar.g(xj1Var);
                } else {
                    z = b.a();
                }
                if (!z) {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i("mtopsdk.RemoteAuth", "call authorize. " + xj1Var);
                    }
                    a aVar = new a(mtop, xj1Var);
                    if (lwcVar != null) {
                        lwcVar.d(xj1Var, aVar);
                    } else {
                        b.c(xj1Var.b, xj1Var.d, xj1Var.e, xj1Var.c, aVar);
                    }
                }
            } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.RemoteAuth", "didn't set IRemoteAuth implement. remoteAuth=null");
            }
        }
    }

    public static mid b(Mtop mtop) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mid) ipChange.ipc$dispatch("9bc889ee", new Object[]{mtop});
        }
        if (mtop == null) {
            str = Mtop.Id.OPEN;
        } else {
            str = mtop.getInstanceId();
        }
        mid midVar = (mid) ((ConcurrentHashMap) f20946a).get(str);
        if (midVar == null) {
            TBSdkLog.e("mtopsdk.RemoteAuth", str + " [getAuth]remoteAuthImpl is null");
        }
        return midVar;
    }

    public static String c(Mtop mtop, xj1 xj1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bde436bd", new Object[]{mtop, xj1Var});
        }
        lwc lwcVar = null;
        if (xj1Var == null) {
            TBSdkLog.e("mtopsdk.RemoteAuth", "[getAuthToken] authParam is null");
            return null;
        }
        mid b = b(mtop);
        if (b == null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.RemoteAuth", "didn't set IRemoteAuth implement. remoteAuth=null");
            }
            return null;
        }
        if (b instanceof lwc) {
            lwcVar = (lwc) b;
        }
        if (lwcVar != null) {
            return lwcVar.e(xj1Var);
        }
        return b.getAuthToken();
    }

    public static boolean d(Mtop mtop, xj1 xj1Var) {
        lwc lwcVar;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79ca56a8", new Object[]{mtop, xj1Var})).booleanValue();
        }
        if (xj1Var == null) {
            TBSdkLog.e("mtopsdk.RemoteAuth", "[isAuthInfoValid] authParam is null");
            return true;
        }
        mid b = b(mtop);
        if (b == null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.RemoteAuth", "didn't set IRemoteAuth implement. remoteAuth=null");
            }
            return true;
        }
        if (b instanceof lwc) {
            lwcVar = (lwc) b;
        } else {
            lwcVar = null;
        }
        if (lwcVar != null) {
            z = lwcVar.g(xj1Var);
        } else {
            z = b.a();
        }
        if (z) {
            return false;
        }
        if (lwcVar != null) {
            return lwcVar.f(xj1Var);
        }
        return b.b();
    }
}
