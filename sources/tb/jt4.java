package tb;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class jt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "qmtopsdk.CookieManager";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f22196a = false;
    public static CookieManager b;

    static {
        t2o.a(590348296);
    }

    public static synchronized String a(String str) {
        synchronized (jt4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{str});
            } else if (!f22196a) {
                return null;
            } else {
                return b.getCookie(str);
            }
        }
    }

    public static synchronized void b(String str, String str2) {
        synchronized (jt4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d42fc581", new Object[]{str, str2});
            } else if (f22196a) {
                b.setCookie(str, str2);
                CookieSyncManager.getInstance().sync();
            }
        }
    }

    public static synchronized void c(Context context) {
        synchronized (jt4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7de2fc4", new Object[]{context});
                return;
            }
            if (!f22196a && context != null) {
                CookieSyncManager.createInstance(context);
                CookieManager instance = CookieManager.getInstance();
                b = instance;
                instance.setAcceptCookie(true);
                b.removeExpiredCookie();
                f22196a = true;
            }
        }
    }
}
