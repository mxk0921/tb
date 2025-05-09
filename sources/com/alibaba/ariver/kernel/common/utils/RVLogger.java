package com.alibaba.ariver.kernel.common.utils;

import android.os.SystemClock;
import android.util.Log;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RVLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Proxy f2442a = new Proxy() { // from class: com.alibaba.ariver.kernel.common.utils.RVLogger.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.ariver.kernel.common.utils.RVLogger.Proxy
        public void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            }
        }

        @Override // com.alibaba.ariver.kernel.common.utils.RVLogger.Proxy
        public void debug(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
            }
        }

        @Override // com.alibaba.ariver.kernel.common.utils.RVLogger.Proxy
        public void e(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
            } else {
                Log.e(str, str2, th);
            }
        }

        @Override // com.alibaba.ariver.kernel.common.utils.RVLogger.Proxy
        public void w(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Proxy extends Proxiable {
        void d(String str, String str2);

        void debug(String str, String str2);

        void e(String str, String str2, Throwable th);

        void w(String str, String str2, Throwable th);
    }

    public static Proxy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Proxy) ipChange.ipc$dispatch("b610a21d", new Object[0]);
        }
        Proxy proxy = (Proxy) RVProxy.get((Class<Object>) Proxy.class, true);
        if (proxy != null) {
            return proxy;
        }
        return f2442a;
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            return;
        }
        try {
            d("RVLogger", str);
        } catch (Throwable th) {
            e("RVLogger exception: " + th);
        }
    }

    public static void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{str, str2});
        } else if (!isEmpty(str2)) {
            try {
                a().debug(str, str2);
            } catch (Throwable th) {
                e("RVLogger exception: " + th);
            }
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        try {
            e("RVLogger", str, null);
        } catch (Throwable th) {
            e("RVLogger exception: " + th);
        }
    }

    public static boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }

    public static String makeLogTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6db2746b", new Object[]{str});
        }
        if (str.length() <= 16) {
            return "Ariver_".concat(str);
        }
        return "Ariver_" + str.substring(0, 15);
    }

    public static void printPerformanceLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f82261c", new Object[]{str, str2});
            return;
        }
        Proxy proxy = (Proxy) RVProxy.get((Class<Object>) Proxy.class, true);
        if (proxy != null) {
            proxy.e("AriverPerformance", "[Thread:" + RVKernelUtils.getCurrentThread().getName() + "] [Stage:" + str + "] [Info:" + str2 + "] [TimeStamp:" + SystemClock.uptimeMillis() + "]", null);
            return;
        }
        Log.e("AriverPerformance", "[Thread:" + RVKernelUtils.getCurrentThread().getName() + "] [Stage:" + str + "] [Info:" + str2 + "] [TimeStamp:" + SystemClock.uptimeMillis() + "]");
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
            return;
        }
        try {
            w("RVLogger", str);
        } catch (Throwable th) {
            e("RVLogger exception: " + th);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (!isEmpty(str2)) {
            try {
                a().d(str, str2);
            } catch (Throwable th) {
                e("RVLogger exception: " + th);
            }
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        try {
            e(str, str2, null);
        } catch (Throwable th) {
            e("RVLogger exception: " + th);
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else if (!isEmpty(str2)) {
            try {
                a().w(str, str2, null);
            } catch (Throwable th) {
                e("RVLogger exception: " + th);
            }
        }
    }

    public static String makeLogTag(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfbee40e", new Object[]{cls}) : makeLogTag(cls.getSimpleName());
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
            return;
        }
        try {
            e("RVLogger", str, th);
        } catch (Throwable th2) {
            e("RVLogger exception: " + th2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
            return;
        }
        try {
            a().w(str, str2, th);
        } catch (Throwable th2) {
            e("RVLogger exception: " + th2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        try {
            a().e(str, str2, th);
        } catch (Throwable th2) {
            e("RVLogger exception: " + th2);
        }
    }
}
