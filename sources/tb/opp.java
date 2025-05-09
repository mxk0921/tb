package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXEnvironment;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class opp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOP_COST = "ShopCost";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f25555a = null;
    public static Boolean b = null;
    public static Boolean c = null;

    static {
        t2o.a(764412000);
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c73c721", new Object[]{str, str2, objArr});
        } else {
            b(str, str2, null, objArr);
        }
    }

    public static void e(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa35e266", new Object[]{objArr});
        } else if (f().booleanValue()) {
            String i = i(objArr);
            if (j5s.j().u()) {
                TLog.logd("shop", "ShopCost", i);
            }
        }
    }

    public static Boolean f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cc8d303d", new Object[0]);
        }
        if (f25555a == null) {
            try {
                if (j()) {
                    f25555a = Boolean.FALSE;
                } else {
                    if (WXEnvironment.isApkDebugable() || m() || k()) {
                        z = true;
                    }
                    f25555a = Boolean.valueOf(z);
                }
            } catch (Exception e) {
                f25555a = Boolean.FALSE;
                e.printStackTrace();
            }
        }
        return f25555a;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a486225e", new Object[0])).booleanValue();
        }
        if (WXEnvironment.isApkDebugable() || m() || n()) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff53766f", new Object[0])).booleanValue();
        }
        if (new File("/data/local/tmp/.shop_no_log").exists()) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83bc160e", new Object[0])).booleanValue();
        }
        if (new File("/data/local/tmp/.shop_log").exists()) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86d7f5cc", new Object[0])).booleanValue();
        }
        return new File("/data/local/tmp/.shop_no_weex_analyzer").exists();
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2895f501", new Object[0])).booleanValue();
        }
        if (b == null) {
            if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "doLog", "false"))) {
                b = Boolean.TRUE;
            } else {
                b = Boolean.FALSE;
            }
            new StringBuilder("main-cost get configDoLog (doLog) result is ").append(b);
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0972745", new Object[0])).booleanValue();
        }
        String nick = Login.getNick();
        if ((!TextUtils.isEmpty(nick) && ("tmallapp".equals(nick) || "tyx测试账号001".equals(nick) || "行久".equals(nick) || "清锐".equals(nick) || "东煜".equals(nick) || "曹西".equals(nick))) || "小程序测试qa".equals(nick) || "c测试账号911".equals(nick)) {
            c = Boolean.TRUE;
        } else if (TextUtils.isEmpty(nick) || !OrangeConfig.getInstance().getConfig("shop_router", "private_window_whitelist", "").contains(nick)) {
            c = Boolean.FALSE;
        } else {
            c = Boolean.TRUE;
        }
        new StringBuilder("main-cost testUser result is ").append(c);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void o(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a42595e", new Object[]{objArr});
        } else if (f().booleanValue()) {
            String i = i(objArr);
            if (j5s.j().u()) {
                TLog.loge("shop", "ShopCost", i);
            } else {
                Log.e("ShopCost", i);
            }
        }
    }

    public static void p(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e537cf3", new Object[]{objArr});
        } else if (f().booleanValue()) {
            String i = i(objArr);
            if (j5s.j().u()) {
                TLog.logw("shop", "ShopCost", i);
            }
        }
    }

    public static String a(Throwable th) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2fa956b4", new Object[]{th});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Caused By " + th.getClass().getName() + ": " + th.getMessage());
        sb.append("\n");
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            String className = stackTraceElement.getClassName();
            if (className != null && (className.contains("taobao") || className.contains("alibaba") || className.contains("shop") || className.contains("tm"))) {
                sb.append("at " + className + "." + stackTraceElement.getMethodName() + f7l.BRACKET_START_STR + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + f7l.BRACKET_END_STR);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5cc2ea", new Object[]{str, str2, objArr});
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("|");
        if (TextUtils.isEmpty(str2)) {
            str2 = "home";
        }
        sb.append(str2);
        if (objArr != null) {
            for (Object obj : objArr) {
                sb.append("|");
                sb.append(obj);
                if (WXEnvironment.isApkDebugable()) {
                    sb.append("\n");
                }
            }
        }
        AppMonitor.Alarm.commitSuccess("Shop", ShopRenderActivity.SHOP_RENDER, sb.toString());
    }

    public static String h(Throwable th) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5786c627", new Object[]{th});
        }
        if (th == null) {
            return "exception is null";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in thread \"" + Thread.currentThread().getName() + "\" " + th.getClass().getName() + ": " + th.getMessage());
            sb.append("\n");
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("at " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + f7l.BRACKET_START_STR + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + f7l.BRACKET_END_STR);
                sb.append("\n");
            }
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                sb.append(a(cause));
            }
            return sb.toString();
        } catch (Throwable unused) {
            String concat = "simple exception msg is ".concat("Exception in thread \"" + Thread.currentThread().getName() + "\" " + th.getClass().getName() + ": " + th.getMessage());
            AppMonitor.Alarm.commitFail("Shop", ShopRenderActivity.SHOP_RENDER, concat, "-52901", "error in formatExceptionStackTrace");
            return concat;
        }
    }

    public static String i(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7d64968", new Object[]{objArr});
        }
        if (objArr == null) {
            return "no message";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void b(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c17b2c", new Object[]{str, str2, th, objArr});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (objArr != null) {
            for (Object obj : objArr) {
                sb.append(obj);
                sb.append(" | ");
                if (WXEnvironment.isApkDebugable()) {
                    sb.append("\n");
                }
            }
        }
        if (th != null) {
            sb.append(h(th));
        }
        String sb2 = sb.toString();
        AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", sb2, str, str2);
        o("main-cost", "commitFail", str, str2, sb2);
    }
}
