package com.taobao.search.sf.util.tlog;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.common.WXConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import tb.c4p;
import tb.ckf;
import tb.fj4;
import tb.j3p;
import tb.t2o;
import tb.v5s;
import tb.yko;
import tb.zzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TLogTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT = "default";
    public static final String LEVEL_DEBUG = "D";
    public static final String LEVEL_ERROR = "E";
    public static final String LEVEL_INFO = "I";
    public static final String LEVEL_WARNING = "W";
    public static final String SCENE_EXCEPTION = "Exception";
    public static final TLogTracker INSTANCE = new TLogTracker();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11705a = true;
    public static final String b = zzo.MODULE_NAME;
    public static String c = "unknown";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface LogLevel {
    }

    @JvmStatic
    public static final void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9493e8b0", new Object[]{str, str2, str3});
        } else {
            INSTANCE.c(c, str, str2, str3);
        }
    }

    @JvmStatic
    public static final void g(String str, v5s v5sVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1a9e59", new Object[]{str, v5sVar});
            return;
        }
        TLogTracker tLogTracker = INSTANCE;
        String str3 = c;
        if (v5sVar != null) {
            str2 = v5sVar.a();
        } else {
            str2 = null;
        }
        tLogTracker.c(str3, str, "default", str2);
    }

    @JvmStatic
    public static final void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd60f15f", new Object[]{str, str2});
        } else {
            INSTANCE.d(c, "default", str, str2);
        }
    }

    @JvmStatic
    public static final void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0662169", new Object[]{str, str2, str3});
            return;
        }
        INSTANCE.d(c, "default", str, "\"errCode\":" + str2 + ",\"errMsg\":" + str3);
    }

    @JvmStatic
    public static final void j(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdb9f9e", new Object[]{str, str2, map});
            return;
        }
        TLogTracker tLogTracker = INSTANCE;
        tLogTracker.d(c, str, str2, tLogTracker.b(map));
    }

    @JvmStatic
    public static final void k(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f36968", new Object[]{str, map});
            return;
        }
        TLogTracker tLogTracker = INSTANCE;
        tLogTracker.d(c, SCENE_EXCEPTION, str, tLogTracker.b(map));
    }

    @JvmStatic
    public static final void l(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2728e7e", new Object[]{str, map});
            return;
        }
        ckf.g(str, "scene");
        f(str, "PageCreate", INSTANCE.a(map));
    }

    @JvmStatic
    public static final void m(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65225048", new Object[]{map});
        } else {
            n(null, map, 1, null);
        }
    }

    public static /* synthetic */ void n(String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e7317e", new Object[]{str, map, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            str = "Default";
        }
        l(str, map);
    }

    @JvmStatic
    public static final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16baa4a7", new Object[0]);
        } else {
            f("Default", "PageDestroy", "");
        }
    }

    @JvmStatic
    public static final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0c7e05", new Object[0]);
        } else {
            f("Default", "PageEnter", "");
        }
    }

    @JvmStatic
    public static final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3435be64", new Object[0]);
        } else {
            f("Default", "PageLeave", "");
        }
    }

    @JvmStatic
    public static final void r(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df2a3a25", new Object[]{str, str2, map});
            return;
        }
        TLogTracker tLogTracker = INSTANCE;
        tLogTracker.c(c, str, str2, tLogTracker.b(map));
    }

    @JvmStatic
    public static final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f43f4", new Object[]{str});
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        c = str;
    }

    @JvmStatic
    public static final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcbbaca", new Object[]{new Boolean(z)});
        } else {
            f11705a = z;
        }
    }

    public final String a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("656ca786", new Object[]{this, map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        return JSON.toJSONString(map);
    }

    public final String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be99c435", new Object[]{this, map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        String jSONString = JSON.toJSONString(map);
        ckf.f(jSONString, "toJSONString(...)");
        return jSONString;
    }

    public final void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("162e462a", new Object[]{this, str, str2, str3, str4});
        } else {
            e(LEVEL_INFO, str, str2, str3, str4);
        }
    }

    public final void d(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd435963", new Object[]{this, str, str2, str3, str4});
        } else {
            e("E", str, str2, str3, str4);
        }
    }

    public final void e(String str, String str2, String str3, String str4, String str5) {
        fj4 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fcd9bfa", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        ckf.g(str, WXConfig.logLevel);
        if (f11705a) {
            StringBuilder sb = new StringBuilder(str);
            sb.append("|24.2|");
            sb.append(str2);
            sb.append("|");
            sb.append(str3);
            sb.append("|");
            sb.append(str4);
            if (!TextUtils.isEmpty(str5)) {
                sb.append("|");
                sb.append(str5);
            }
            String str6 = b;
            TLog.loge(str6, str6, sb.toString());
            yko g2 = j3p.g();
            if (g2 != null && (g = g2.g()) != null && g.isDebug()) {
                if (ckf.b(str, "E")) {
                    c4p.C(str6, sb.toString(), new Object[0]);
                } else if (ckf.b(str, "W")) {
                    c4p.E(str6, sb.toString(), new Object[0]);
                } else {
                    c4p.D(str6, sb.toString(), new Object[0]);
                }
            }
        }
    }

    static {
        t2o.a(815793522);
    }
}
