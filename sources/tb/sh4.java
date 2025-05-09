package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BLANK_SCREEN_MONITOR = "enableBlankScreenMonitor";
    public static final String KEY_COMPONENT_LIFECYCLE = "enableComponentLifecycle";
    public static final String KEY_CONFIG_NAME_SPACE = "newUltron_container";
    public static final String KEY_DOWNGRADE_PRESET = "downgradePreset";
    public static final String KEY_DOWNLOAD_REFRESH = "downloadRefresh";
    public static final String KEY_ENABLE_CREATE_JSENGINE_WITH_JSI = "enableCreateJSEngineWithJsi";
    public static final String KEY_ENABLE_LIST_CONTAINER_SCROLLER = "enableListContainerScroller";
    public static final String KEY_HEADER_APPEAR_EVENT = "headerAppearEvent";
    public static final String KEY_PRESET_TEMPLATE_DIFF_REFRESH = "presetTemplateDiffRefresh";
    public static final String KEY_RELEASE_DX_ENGINE_WHEN_DESTROY = "releaseDXEngineWhenDestroy";
    public static final String KEY_REMOVE_UNSAFE_JSI = "removeUnSafeJSI";
    public static final String KEY_SCROLL_VISIBILITY_CHECK = "disableScrollVisibilityCheck";
    public static final String KEY_TEMPLATE_TIME_OUT = "template_time_out";
    public static final String KEY_USE_DATA_LOAD_TASK_CLEAN = "useDataloadTaskClean";
    public static final String KEY_USE_SYSTEM_TOAST = "useSystemToast";

    /* renamed from: a  reason: collision with root package name */
    public static final AliConfigInterface f28048a = yo0.b();

    static {
        t2o.a(157286726);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8474edae", new Object[0])).booleanValue();
        }
        return v9v.i("newUltron_container", "breakWhenOutOfBounds", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2187800", new Object[0])).booleanValue();
        }
        return v9v.i("newUltron_container", KEY_HEADER_APPEAR_EVENT, true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93922dff", new Object[0])).booleanValue();
        }
        return v9v.i("newUltron_container", KEY_PRESET_TEMPLATE_DIFF_REFRESH, true);
    }

    public static Map<String, String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{str});
        }
        return f28048a.getConfigs(str);
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("475d92b", new Object[0])).intValue();
        }
        return v9v.e("newUltron_container", KEY_TEMPLATE_TIME_OUT, 5000);
    }

    public static boolean h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd8cc7a", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return v9v.i("newUltron_container", str, z);
    }

    public static void i(String[] strArr, wo0 wo0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7902c32f", new Object[]{strArr, wo0Var});
        } else {
            f28048a.b(strArr, wo0Var);
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6679afc1", new Object[0])).booleanValue();
        }
        return v9v.i("newUltron_container", "releaseDXEngineWhenDestroy", true);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9240014e", new Object[0])).booleanValue();
        }
        return v9v.i("newUltron_container", KEY_REMOVE_UNSAFE_JSI, true);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bac5bd38", new Object[0])).booleanValue();
        }
        return v9v.i("newUltron_container", KEY_USE_DATA_LOAD_TASK_CLEAN, true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df62b53c", new Object[0])).booleanValue();
        }
        return v9v.i("newUltron_container", "useSystemToast", false);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d56df4d2", new Object[]{context})).booleanValue();
        }
        yv6.b(context);
        return v9v.i("newUltron_container", KEY_DOWNLOAD_REFRESH, true);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("474722d5", new Object[]{context})).booleanValue();
        }
        return v9v.i("newUltron_container", KEY_DOWNGRADE_PRESET, true);
    }
}
