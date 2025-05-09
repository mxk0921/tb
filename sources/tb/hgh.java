package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hgh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_REQUEST = "MtopRequest";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f20625a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(437256349);
        }

        public static void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            } else {
                AdapterForTLog.logd(str, str2);
            }
        }

        public static void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            } else {
                AdapterForTLog.loge("WidgetTLog", str);
            }
        }

        public static void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            } else {
                AdapterForTLog.loge(str, str2);
            }
        }
    }

    public static void a(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78d8fc", new Object[]{cls, str});
            return;
        }
        if (f20625a) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getSimpleName());
            sb.append(itw.URL_SEPARATOR);
            sb.append(str);
        }
        a.a("WidgetTLog", str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            a.a("WidgetTLog", str);
        }
    }

    public static void c(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d596c9db", new Object[]{cls, str});
            return;
        }
        if (f20625a) {
            Log.e("WidgetDynamic", cls.getSimpleName() + itw.URL_SEPARATOR + str);
        }
        a.c("WidgetTLog", str);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        if (f20625a) {
            Log.e("WidgetDynamic", str);
        }
        a.c("WidgetTLog", str);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        if (f20625a) {
            Log.e(str, str2);
        }
        a.c("WidgetTLog", str2);
    }

    static {
        t2o.a(437256348);
        f20625a = false;
        try {
            f20625a = new File(ey1.SWITCH_FILE_DIR, "tao_widget_log_open").exists();
        } catch (Exception e) {
            Log.e("enableLog", e.getMessage());
        }
    }
}
