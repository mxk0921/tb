package tb;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SEC = "sec";
    public static final String TAG = "CookieMgr";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f22902a = false;
    public static CookieManager b;

    static {
        t2o.a(343932963);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca799c60", new Object[0])).booleanValue();
        }
        if (!f22902a && GlobalClientInfo.mContext != null) {
            d(GlobalClientInfo.mContext);
        }
        return f22902a;
    }

    public static synchronized String b(String str) {
        synchronized (kt4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6a4041b8", new Object[]{str});
            } else if (!a()) {
                ALog.e(TAG, "cookieMgr not setup", new Object[0]);
                return null;
            } else {
                return c(b.getCookie(str));
            }
        }
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5661700", new Object[]{str});
        }
        if (str != null && str.length() > 2 && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
            return str.substring(1, str.length() - 1);
        }
        if (str == null || str.length() <= 2 || str.charAt(0) != '\'' || str.charAt(str.length() - 1) != '\'') {
            return str;
        }
        return str.substring(1, str.length() - 1);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a9201c", new Object[]{str});
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        do {
            try {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf != -1) {
                    String trim = nextToken.substring(0, indexOf).trim();
                    String trim2 = nextToken.substring(indexOf + 1).trim();
                    if (KEY_SEC.equals(trim)) {
                        str2 = e(trim2);
                    }
                } else {
                    throw new IllegalArgumentException("Invalid cookie name-value pair");
                }
            } catch (Throwable th) {
                ALog.e(TAG, "parse", th, new Object[0]);
            }
        } while (stringTokenizer.hasMoreTokens());
        return str2;
    }

    public static synchronized void d(Context context) {
        synchronized (kt4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7de2fc4", new Object[]{context});
            } else if (!xaa.b) {
                ALog.i(TAG, "disable cookie", new Object[0]);
            } else if (!f22902a) {
                CookieManager instance = CookieManager.getInstance();
                b = instance;
                instance.setAcceptCookie(true);
                f22902a = true;
            }
        }
    }
}
