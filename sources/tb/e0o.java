package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.Map;
import tb.lgs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class e0o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE_ADD_VIDEO_TO_CONTAINER = "add_video_to_container";
    public static final String FEATURE_ASYNC_VIDEO_INFO = "async_videoinfo";
    public static final String FEATURE_DELAY_TAB2_RENDER = "delayTab2Render";
    public static final String FEATURE_DELAY_VIDEO_INTERACT_Layer = "delay_interact_layer";
    public static final String FEATURE_LINKBACK_PREFETCH = "link_back_prefetch";
    public static final String FEATURE_LINK_BACK = "opt_linkback2";
    public static final String FEATURE_LOCAL_URL = "local_url";
    public static final String FEATURE_OPT_LOADING = "opt_loading";
    public static final String FEATURE_OPT_UT = "opt_ut_launch";
    public static final String FEATURE_OTHER_SCENE_PREFETCH_MTOP = "other_scene_prefetch_mtop2";
    public static final String FEATURE_PRECREATE_DWINSTANCE = "precreate_dwinstance";
    public static final String FEATURE_PRERENDER_VIDEO_HOT_LAUNCHER = "prerender_video_hot_launcher";
    public static final String FEATURE_QUICK_RENDER = "quick_render";
    public static final String FEATURE_SIMPLE_DSL = "simple_dsl3";
    public static final String FEATURE_SKIP_VIDEO_MTOP_SIGN = "feature_skip_mtop_sign";
    public static final String FEATURE_USE_LOCAL_VIDEO_PLAY = "use_local_video_play";
    public static final String FEATURE_VIDEO_IN_CONTAINER_WATCH_LIFECYCLE = "video_in_container_watch_lifecycle";
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static String e = null;

    /* renamed from: a  reason: collision with root package name */
    public final lgs.b f18196a;

    static {
        t2o.a(503316956);
    }

    public e0o(lgs.b bVar) {
        this.f18196a = bVar;
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5355980", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        if (z) {
            try {
                boolean a2 = t.a(context, "disable_" + str);
                tfs.d("disableFeature " + str + " " + a2);
                return !a2;
            } catch (Throwable unused) {
                return true;
            }
        } else {
            try {
                boolean a3 = t.a(context, "enable_" + str);
                tfs.d("enableFeature " + str + " " + a3);
                return a3;
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1cf6b36", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        if (z) {
            if (!akt.p2(str, true) || !a(context, str, z)) {
                return false;
            }
            return true;
        } else if (akt.p2(str, false) || a(context, str, z)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c9ac8e0", new Object[0])).booleanValue();
        }
        return b;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6606d16", new Object[]{str})).booleanValue();
        }
        if (!b || !TextUtils.equals(str, e)) {
            return false;
        }
        return true;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37b8660c", new Object[]{str})).booleanValue();
        }
        if (!d || !TextUtils.equals(str, e)) {
            return false;
        }
        return true;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8370cb52", new Object[0])).booleanValue();
        }
        return c;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f703abe", new Object[0])).booleanValue();
        }
        return false;
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c485f54", new Object[0]);
        } else {
            d = true;
        }
    }

    public static void r(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c51cbb", new Object[]{str, new Boolean(z)});
            return;
        }
        b = true;
        e = str;
        c = z;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cd19f8d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract void j(Context context, Object obj, Object obj2, lgs.b bVar);

    public abstract void k(n nVar);

    public abstract void l(Context context, TNodeView tNodeView, Object obj, lgs.b bVar);

    public abstract void m(Context context, n nVar, String str, String str2, Map map);

    public abstract void n(Context context, Object obj);

    public abstract void o(Context context, Object obj);

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b254390", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean i(TNodeView tNodeView) {
        n d0;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57db960", new Object[]{this, tNodeView})).booleanValue();
        }
        if (tNodeView == null || tNodeView.getEngine() == null || (d0 = tNodeView.getEngine().d0()) == null) {
            return false;
        }
        Object H = d0.H("onbackclick");
        if (!(H instanceof String) || TextUtils.isEmpty((CharSequence) H)) {
            z = false;
        }
        return z;
    }
}
