package com.taobao.weex.utils;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WXLogUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WEEX_PERF_TAG = "weex_perf";
    public static final String WEEX_TAG = "weex1";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Class> f14149a;
    public static final List<JsLogWatcher> b = new ArrayList();
    public static volatile LogWatcher c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface JsLogWatcher {
        void onJsLog(int i, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface LogWatcher {
        void onLog(String str, String str2, String str3);
    }

    public static Class a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b9d1e7f0", new Object[]{str});
        }
        try {
            Class<?> cls = Class.forName(str);
            try {
                f14149a.put(str, cls);
                return cls;
            } catch (ClassNotFoundException unused) {
                return cls;
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public static void b(String str, String str2, LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb59c55", new Object[]{str, str2, logLevel});
        } else if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && logLevel != null && !TextUtils.isEmpty(logLevel.getName())) {
            if (!str.toLowerCase().startsWith("weex1")) {
                str = "weex1_".concat(str);
            }
            if (c != null) {
                c.onLog(logLevel.getName(), str, str2);
            }
            if (WXEnvironment.isApkDebugable()) {
                if (logLevel.getValue() - WXEnvironment.sLogLevel.getValue() >= 0) {
                    Log.println(logLevel.getPriority(), str, str2);
                    c(logLevel.getName(), str2);
                }
            } else if (logLevel.getValue() - LogLevel.WARN.getValue() >= 0 && logLevel.getValue() - WXEnvironment.sLogLevel.getValue() >= 0) {
                Log.println(logLevel.getPriority(), str, str2);
            }
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            d("weex1", str);
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            e("weex1", str);
        }
    }

    public static void eTag(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af755ef", new Object[]{str, th});
        } else if (WXEnvironment.isApkDebugable()) {
            e(str, getStackTrace(th));
        }
    }

    public static String getStackTrace(Throwable th) {
        Throwable th2;
        PrintWriter printWriter;
        StringWriter stringWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b084d465", new Object[]{th});
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter2 = null;
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
            } catch (Throwable th3) {
                th2 = th3;
                printWriter = null;
            }
        } catch (Throwable th4) {
            th2 = th4;
            printWriter = null;
        }
        try {
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            try {
                stringWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            printWriter.close();
            return stringWriter.toString();
        } catch (Throwable th5) {
            th2 = th5;
            stringWriter2 = stringWriter;
            if (stringWriter2 != null) {
                try {
                    stringWriter2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
            throw th2;
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else {
            i("weex1", str);
        }
    }

    public static void info(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dfc8bf", new Object[]{str});
        } else {
            i("weex1", str);
        }
    }

    public static void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e4701", new Object[]{str});
        } else {
            d(WEEX_PERF_TAG, str);
        }
    }

    public static void performance(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9aecf48", new Object[]{str, bArr});
        }
    }

    public static void renderPerformanceLog(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ac02e9", new Object[]{str, new Long(j)});
        }
    }

    public static void setJsLogWatcher(JsLogWatcher jsLogWatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568291b9", new Object[]{jsLogWatcher});
            return;
        }
        List<JsLogWatcher> list = b;
        if (!((ArrayList) list).contains(jsLogWatcher)) {
            ((ArrayList) list).add(jsLogWatcher);
        }
    }

    public static void setLogWatcher(LogWatcher logWatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b21ab8b", new Object[]{logWatcher});
        } else {
            c = logWatcher;
        }
    }

    public static void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7de87", new Object[]{str});
        } else {
            v("weex1", str);
        }
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
        } else {
            w("weex1", str);
        }
    }

    public static void wtf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6d2fa", new Object[]{str});
        } else {
            wtf("weex1", str);
        }
    }

    public static void d(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feb637c", new Object[]{str, bArr});
        } else {
            d(str, new String(bArr));
        }
    }

    public static void e(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41bb07d", new Object[]{str, bArr});
        } else {
            e(str, new String(bArr));
        }
    }

    public static void i(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4dce481", new Object[]{str, bArr});
        } else {
            i(str, new String(bArr));
        }
    }

    public static void p(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f1c794", new Object[]{str, th});
        } else if (WXEnvironment.isApkDebugable()) {
            p(str + getStackTrace(th));
        }
    }

    public static void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
        } else {
            b(str, str2, LogLevel.VERBOSE);
        }
    }

    public static void w(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff811a8f", new Object[]{str, bArr});
        } else {
            w(str, new String(bArr));
        }
    }

    public static void wtf(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839ef244", new Object[]{str, str2});
        } else {
            b(str, str2, LogLevel.WTF);
        }
    }

    public static void d(String str, String str2) {
        List<JsLogWatcher> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            b(str, str2, LogLevel.DEBUG);
            if (WXEnvironment.isApkDebugable() && "jsLog".equals(str) && (list = b) != null && ((ArrayList) list).size() > 0) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    JsLogWatcher jsLogWatcher = (JsLogWatcher) it.next();
                    if (str2.endsWith("__DEBUG")) {
                        jsLogWatcher.onJsLog(3, str2.replace("__DEBUG", ""));
                    } else if (str2.endsWith("__INFO")) {
                        jsLogWatcher.onJsLog(3, str2.replace("__INFO", ""));
                    } else if (str2.endsWith("__WARN")) {
                        jsLogWatcher.onJsLog(3, str2.replace("__WARN", ""));
                    } else if (str2.endsWith("__ERROR")) {
                        jsLogWatcher.onJsLog(3, str2.replace("__ERROR", ""));
                    } else {
                        jsLogWatcher.onJsLog(3, str2);
                    }
                }
            }
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            b(str, str2, LogLevel.ERROR);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            b(str, str2, LogLevel.INFO);
        }
    }

    public static void v(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7c3fce", new Object[]{str, th});
        } else if (WXEnvironment.isApkDebugable()) {
            v(str + getStackTrace(th));
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else {
            b(str, str2, LogLevel.WARN);
        }
    }

    public static void wtf(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1420a13b", new Object[]{str, th});
        } else if (WXEnvironment.isApkDebugable()) {
            wtf(str + getStackTrace(th));
        }
    }

    static {
        t2o.a(985661820);
        HashMap<String, Class> hashMap = new HashMap<>(2);
        f14149a = hashMap;
        hashMap.put("com.taobao.weex.devtools.common.LogUtil", a("com.taobao.weex.devtools.common.LogUtil"));
    }

    public static void c(String str, String str2) {
        if (WXEnvironment.isApkDebugable()) {
            try {
                Class cls = f14149a.get("com.taobao.weex.devtools.common.LogUtil");
                if (cls != null) {
                    cls.getMethod("log", String.class, String.class).invoke(cls, str, str2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
            return;
        }
        e(str + getStackTrace(th));
    }

    public static void i(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157ae5fb", new Object[]{str, th});
        } else if (WXEnvironment.isApkDebugable()) {
            info(str + getStackTrace(th));
        }
    }

    public static void w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be68a92d", new Object[]{str, th});
            return;
        }
        w(str + getStackTrace(th));
    }

    public static void d(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46dcd720", new Object[]{str, th});
        } else if (WXEnvironment.isApkDebugable()) {
            d(str + getStackTrace(th));
        }
    }
}
