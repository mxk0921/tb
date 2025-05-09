package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favsdk.remoteplugin.RemoteBusinessService;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile pnd f22378a;
    public static volatile nnd b;
    public static volatile ond c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ond {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ond
        public String getUserId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
            }
            return Login.getUserId();
        }

        @Override // tb.ond
        public boolean isSessionValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue();
            }
            return Login.checkSessionValid();
        }
    }

    static {
        t2o.a(463470635);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b197a0", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("favorite_sdk", "retryInit", "false"));
    }

    public static nnd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nnd) ipChange.ipc$dispatch("35c9f29d", new Object[0]);
        }
        if (b == null && a()) {
            b = new qp();
        }
        return b;
    }

    public static ond c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ond) ipChange.ipc$dispatch("85a38a7e", new Object[0]);
        }
        if (c == null && a()) {
            c = new a();
        }
        return c;
    }

    public static pnd d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pnd) ipChange.ipc$dispatch("2a16379e", new Object[0]);
        }
        if (f22378a == null && a()) {
            f22378a = new RemoteBusinessService();
        }
        return f22378a;
    }

    public static void e(nnd nndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f71c7d9", new Object[]{nndVar});
            return;
        }
        TLog.logd("FAVSDK_FavoriteSdkManager", "setGlobalCache");
        b = nndVar;
    }

    public static void f(ond ondVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8021caa", new Object[]{ondVar});
            return;
        }
        TLog.logd("FAVSDK_FavoriteSdkManager", "setGlobalLogin");
        c = ondVar;
    }

    public static void g(pnd pndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df14f4", new Object[]{pndVar});
            return;
        }
        TLog.logd("FAVSDK_FavoriteSdkManager", "setGlobalNetwork");
        f22378a = pndVar;
    }
}
