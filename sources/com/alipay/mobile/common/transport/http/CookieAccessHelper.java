package com.alipay.mobile.common.transport.http;

import android.content.Context;
import com.alipay.mobile.common.transport.http.cookie.AlipayNetCookieManager;
import com.alipay.mobile.common.transport.http.cookie.AlipayNetCookieSyncManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CookieAccessHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AsyncFlushCookieRunnable f4074a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class AsyncFlushCookieRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private AsyncFlushCookieRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CookieAccessHelper.flushCookie();
            }
        }
    }

    public static AsyncFlushCookieRunnable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncFlushCookieRunnable) ipChange.ipc$dispatch("8ac13515", new Object[0]);
        }
        AsyncFlushCookieRunnable asyncFlushCookieRunnable = f4074a;
        if (asyncFlushCookieRunnable != null) {
            return asyncFlushCookieRunnable;
        }
        synchronized (CookieAccessHelper.class) {
            try {
                AsyncFlushCookieRunnable asyncFlushCookieRunnable2 = f4074a;
                if (asyncFlushCookieRunnable2 != null) {
                    return asyncFlushCookieRunnable2;
                }
                AsyncFlushCookieRunnable asyncFlushCookieRunnable3 = new AsyncFlushCookieRunnable();
                f4074a = asyncFlushCookieRunnable3;
                return asyncFlushCookieRunnable3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void applyCookie(String str, String str2, Context context) {
        synchronized (CookieAccessHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f14a1cdb", new Object[]{str, str2, context});
                return;
            }
            b(context);
            getCookieManager().setCookie(str, str2);
        }
    }

    public static final void asyncFlushCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf1ccf3", new Object[0]);
        } else {
            NetworkAsyncTaskExecutor.executeIO(a());
        }
    }

    public static final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            AlipayNetCookieSyncManager.createInstance(context);
        } catch (Throwable th) {
            LogCatUtil.error("CookieAccessHelper", "createCookieSyncManager exception:", th);
        }
    }

    public static final void flushCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2328df0f", new Object[0]);
            return;
        }
        try {
            AlipayNetCookieSyncManager.getInstance().sync();
        } catch (Throwable th) {
            LogCatUtil.error("CookieAccessHelper", "flushCookie exception:", th);
        }
    }

    @Deprecated
    public static synchronized String getCookie(String str) {
        synchronized (CookieAccessHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{str});
            }
            return getCookieManager().getCookie(str);
        }
    }

    public static AlipayNetCookieManager getCookieManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetCookieManager) ipChange.ipc$dispatch("f3f4655d", new Object[0]);
        }
        return AlipayNetCookieManager.getInstance();
    }

    @Deprecated
    public static synchronized void removeAllCookie() {
        synchronized (CookieAccessHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88e96b48", new Object[0]);
            } else {
                getCookieManager().removeAllCookie();
            }
        }
    }

    @Deprecated
    public static synchronized void setCookie(String str, String str2) {
        synchronized (CookieAccessHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d42fc581", new Object[]{str, str2});
                return;
            }
            getCookieManager().setCookie(str, str2);
            AlipayNetCookieSyncManager.getInstance().sync();
        }
    }

    public static synchronized String getCookie(String str, Context context) {
        synchronized (CookieAccessHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1c0d4483", new Object[]{str, context});
            }
            b(context);
            return getCookieManager().getCookie(str);
        }
    }

    public static synchronized void removeAllCookie(Context context) {
        synchronized (CookieAccessHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc2e180", new Object[]{context});
                return;
            }
            b(context);
            getCookieManager().removeAllCookie();
        }
    }

    public static synchronized void setCookie(String str, String str2, Context context) {
        synchronized (CookieAccessHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cd94967", new Object[]{str, str2, context});
                return;
            }
            b(context);
            getCookieManager().setCookie(str, str2);
            AlipayNetCookieSyncManager.getInstance().sync();
        }
    }
}
