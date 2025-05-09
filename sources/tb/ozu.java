package tb;

import android.app.Application;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ozu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ozu f25774a = new ozu();

    static {
        t2o.a(962593148);
    }

    public static ozu getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozu) ipChange.ipc$dispatch("88bfc58d", new Object[0]);
        }
        return f25774a;
    }

    @Deprecated
    public void initUT(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24312ee9", new Object[]{this, application});
        }
    }

    public void saveCacheDataToLocal() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb3568", new Object[]{this});
        } else {
            ofh.l().n();
        }
    }

    @Deprecated
    public void sessionTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d804f2", new Object[]{this});
        } else {
            vep.a().g();
        }
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            o2w.k().O(str);
        }
    }

    public void setChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{this, str});
            return;
        }
        nhh.f(null, "channel", str);
        o2w.k().P(str);
    }

    public void setSessionProperties(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7854497", new Object[]{this, map});
        } else {
            o2w.k().Y(map);
        }
    }

    public void transferLog(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8801825", new Object[]{this, map});
        } else {
            n1v.getInstance().transferLog(map);
        }
    }

    public void turnOffRealTimeDebug() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108167d", new Object[]{this});
        } else {
            o2w.k().d0();
        }
    }

    public void turnOnDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27dd7e", new Object[]{this});
        } else {
            o2w.k().e0();
        }
    }

    public void turnOnRealTimeDebug(Map map) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee88af2", new Object[]{this, map});
        } else {
            o2w.k().f0(map);
        }
    }

    public void updateSessionProperties(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17bd97e", new Object[]{this, map});
            return;
        }
        Map<String, String> r = o2w.k().r();
        HashMap hashMap = new HashMap();
        if (r != null) {
            hashMap.putAll(r);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        o2w.k().Y(hashMap);
    }

    @Deprecated
    public void updateUserAccount(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d5d3e", new Object[]{this, str, str2, str3});
        } else {
            o2w.k().g0(str, str2, str3);
        }
    }

    public void updateUserAccount(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c8f388", new Object[]{this, str, str2, str3, str4});
        } else {
            o2w.k().h0(str, str2, str3, str4);
        }
    }
}
