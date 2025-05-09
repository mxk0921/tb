package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.norm.ILogAdapter;
import com.alibaba.poplayer.norm.ITrackLogAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wdm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CATEGORY_CONFIG_CHECK = "configCheck";
    public static final String CATEGORY_CONFIG_UPDATE = "configUpdate";
    public static final String CATEGORY_CONTAINER_LIFE_CYCLE = "containerLifeCycle";
    public static final String CATEGORY_LIFE_CYCLE = "sdkLifeCycle";
    public static final String CATEGORY_OTHER = "other";
    public static final String CATEGORY_PAGE_LIFE_CYCLE = "pageLifeCycle";
    public static final String CATEGORY_TRIGGER_EVENT = "triggerEvent";
    public static final String CATEGORY_WEB_JSBRIDGE = "webJSBridge";
    public static final String CATEGORY_WEEX_JSBRIDGE = "weexJSBridge";

    /* renamed from: a  reason: collision with root package name */
    public static ILogAdapter f30641a = null;

    static {
        t2o.a(626000048);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e833d92", new Object[]{str});
            return;
        }
        try {
            if (PopLayer.DEBUG) {
                Log.e("PopLayer", str);
            }
            ILogAdapter iLogAdapter = f30641a;
            if (iLogAdapter != null) {
                iLogAdapter.Loge(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a05f961", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            ILogAdapter iLogAdapter = f30641a;
            if (iLogAdapter != null) {
                if (iLogAdapter instanceof ITrackLogAdapter) {
                    ((ITrackLogAdapter) iLogAdapter).Loge(true, str, str2, str3, str4);
                } else {
                    iLogAdapter.Loge(str4);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efff2af", new Object[]{str, str2, str3});
        } else {
            b("Common", str, str2, str3);
        }
    }

    public static void d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6780c4db", new Object[]{str, objArr});
            return;
        }
        try {
            if (PopLayer.DEBUG && objArr.length != 0) {
                String.format(str, objArr);
            }
            ILogAdapter iLogAdapter = f30641a;
            if (iLogAdapter != null) {
                iLogAdapter.Logi(str, objArr);
            }
        } catch (Throwable th) {
            a("log.error.e=" + th + th.getMessage());
        }
    }

    public static void e(boolean z, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea83175f", new Object[]{new Boolean(z), str, str2, str3, str4});
            return;
        }
        try {
            ILogAdapter iLogAdapter = f30641a;
            if (iLogAdapter != null) {
                if (!(iLogAdapter instanceof ITrackLogAdapter)) {
                    iLogAdapter.Logi(str4, new Object[0]);
                } else if (z) {
                    ((ITrackLogAdapter) iLogAdapter).LogiImmediate(true, str, str2, str3, str4);
                } else {
                    ((ITrackLogAdapter) iLogAdapter).Logi(true, str, str2, str3, str4);
                }
            }
        } catch (Throwable th) {
            a("log.error.e=" + th + th.getMessage());
        }
    }

    public static void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8884022b", new Object[]{str, str2, str3});
        } else {
            e(true, "Common", str, str2, str3);
        }
    }

    public static void g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d92b84ef", new Object[]{str, str2, str3});
        } else {
            e(true, "Common", str, str2, str3);
        }
    }

    public static void h(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fef4e1", new Object[]{str, th});
        } else {
            i(false, str, th);
        }
    }

    public static void i(boolean z, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c27f961", new Object[]{new Boolean(z), str, th});
        } else if (z) {
            b(TLogTracker.SCENE_EXCEPTION, "", "", str + "\nstack:" + Log.getStackTraceString(th));
        } else {
            a(str + "\nstack:" + Log.getStackTraceString(th));
        }
    }

    public static String j(String str, String str2, String str3) {
        String str4;
        String str5 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a919870", new Object[]{str, str2, str3});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return str5;
            }
            StringBuilder sb = new StringBuilder("[PoplayerSDK_");
            sb.append(str);
            sb.append("]");
            if (TextUtils.isEmpty(str2)) {
                str4 = str5;
            } else {
                str4 = "[popId:" + str2 + "]";
            }
            sb.append(str4);
            sb.append(":");
            sb.append(str3);
            return sb.toString();
        } catch (Throwable th) {
            h("generateTrackMsg error", th);
            StringBuilder sb2 = new StringBuilder("[PoplayerSDK_");
            sb2.append(str);
            sb2.append("]");
            if (!TextUtils.isEmpty(str2)) {
                str5 = "[popId:" + str2 + "]";
            }
            sb2.append(str5);
            return sb2.toString();
        }
    }

    public static void k(ILogAdapter iLogAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bafbd", new Object[]{iLogAdapter});
        } else {
            f30641a = iLogAdapter;
        }
    }
}
