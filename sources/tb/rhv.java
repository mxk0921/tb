package tb;

import android.content.Context;
import com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack.UserTrackUFWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rhv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile rhv c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27391a = false;
    public boolean b = false;

    static {
        t2o.a(962592953);
    }

    public static rhv b() {
        rhv rhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rhv) ipChange.ipc$dispatch("db725da7", new Object[0]);
        }
        if (c != null) {
            return c;
        }
        synchronized (rhv.class) {
            try {
                if (c == null) {
                    c = new rhv();
                }
                rhvVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rhvVar;
    }

    public final void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f1a2d0", new Object[]{this, hashMap});
            return;
        }
        if (hashMap == null || hashMap.isEmpty()) {
            hashMap = new HashMap<>();
        }
        Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key == null || key.isEmpty() || !key.startsWith("x-")) {
                it.remove();
            }
        }
    }

    public synchronized HashMap<String, String> c() {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a011da58", new Object[]{this});
        } else if (!this.b) {
            return null;
        } else {
            HashMap<String, String> e = e();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                hashMap = UserTrackUFWrapper.getUFWrapper();
            } catch (Throwable th) {
                nhh.h("UnifiedSecuritySDK2", th, "getSecurityFactorsImpl");
                hashMap = null;
            }
            if (hashMap != null && !hashMap.isEmpty()) {
                a(hashMap);
                hashMap.putAll(e);
                nhh.f("UnifiedSecuritySDK2", "getSecurityFactorsImpl cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                nhh.e("UnifiedSecuritySDK2", hashMap);
                return hashMap;
            }
            return null;
        }
    }

    public synchronized void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b942b1", new Object[]{this, context});
        } else if (b1v.bXmodule) {
            if (!this.f27391a) {
                nhh.f("UnifiedSecuritySDK2", "initSecurity begin");
                String d = o2w.k().d();
                if (d != null) {
                    if (d.isEmpty()) {
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    UserTrackUFWrapper.init(context, d);
                    nhh.f("UnifiedSecuritySDK2", "init cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    this.b = true;
                    nhh.f("UnifiedSecuritySDK2", "initSecurity End");
                    this.f27391a = true;
                }
                d = wu3.c().a();
                long currentTimeMillis2 = System.currentTimeMillis();
                UserTrackUFWrapper.init(context, d);
                nhh.f("UnifiedSecuritySDK2", "init cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                this.b = true;
                nhh.f("UnifiedSecuritySDK2", "initSecurity End");
                this.f27391a = true;
            }
        }
    }

    public final HashMap<String, String> e() {
        gi7 c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fb5452bf", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String d = o2w.k().d();
        if (d == null || d.isEmpty()) {
            d = wu3.c().a();
        }
        hashMap.put(HttpHeaderConstant.X_APPKEY, d);
        String c3 = o2w.k().c();
        if ((c3 == null || c3.isEmpty()) && (c2 = th7.c(o2w.k().g())) != null) {
            c3 = c2.a();
        }
        hashMap.put(HttpHeaderConstant.X_APP_VER, c3);
        hashMap.put(HttpHeaderConstant.X_UTDID, UTDevice.getUtdid(o2w.k().g()));
        hashMap.put(HttpHeaderConstant.X_UID, o2w.k().w());
        hashMap.put("x-pv", "1");
        hashMap.put(HttpHeaderConstant.X_TTID, o2w.k().e());
        return hashMap;
    }
}
