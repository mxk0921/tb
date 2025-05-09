package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.usertracker.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f21 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TASK_CONTAINER_RENDER = "turbo_container_render";
    public static final String TASK_DSL_LOAD = "dsl_load";
    public static final String TASK_DSL_RENDER = "dsl_render";
    public static final String TASK_FRAGMENT_CREATE = "gg_home_fragment_create";
    public static final String TASK_FRAGMENT_ONCREATE = "gg_home_fragment_oncreate";
    public static final String TASK_ICON_CLICK = "gg_home_icon_click";
    public static final String TASK_PAGE_INIT = "tnodepage_init";
    public static final String TASK_TAB_SELECT = "tab_select";

    /* renamed from: a  reason: collision with root package name */
    public static long f18953a = 0;

    static {
        t2o.a(503317403);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc43e03d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "TNodeDefaultPageName";
        }
        String[] split = str.split("\\/");
        if (split.length > 3) {
            return split[split.length - 3];
        }
        return "TNodeDefaultPageName";
    }

    public static String b(o.y yVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e7ca7e", new Object[]{yVar, str});
        }
        if (yVar.r() == null || TextUtils.isEmpty(yVar.r().h)) {
            return "gg_" + a(yVar.d) + "_" + str;
        }
        return "gg_" + yVar.r().h + "_" + str;
    }

    public static String c(o oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e8d505", new Object[]{oVar, str});
        }
        if (oVar.d0() == null || oVar.d0().c0() == null || oVar.d0().c0().r() == null || TextUtils.isEmpty(oVar.d0().c0().r().h)) {
            return "gg_" + f(oVar.Z()) + "_" + str;
        }
        return "gg_" + oVar.d0().c0().r().h + "_" + str;
    }

    public static mdd d(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("4c1d227d", new Object[]{oVar});
        }
        Object W = oVar.W();
        if (W instanceof Activity) {
            return vxm.b.a((Activity) W);
        }
        if (W instanceof Fragment) {
            return vxm.b.j((Fragment) W);
        }
        if (W instanceof anl) {
            return vxm.b.g(((anl) W).getContentView());
        }
        return vxm.b.h();
    }

    public static void g(o.y yVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b3b8ce", new Object[]{yVar, str});
            return;
        }
        String b = b(yVar, str);
        new StringBuilder(" subTaskBegin: ").append(b);
        i(b);
    }

    public static void h(o oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d435b60f", new Object[]{oVar, str});
            return;
        }
        String c = c(oVar, str);
        d(oVar).v(c);
        new StringBuilder(" subTaskBegin: ").append(c);
        i(c);
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf236155", new Object[]{str});
            return;
        }
        tfs.g("APMLogger:", " subTaskBeginRaw: " + str);
        vxm.b.e().v(str);
        a.p().t(null, str);
    }

    public static void j(o.y yVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14496f99", new Object[]{yVar, str, str2, jSONObject});
            return;
        }
        String b = b(yVar, str);
        new StringBuilder(" onSubTaskFail: ").append(b);
        l(b, str2, jSONObject);
    }

    public static void k(o oVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14748d6", new Object[]{oVar, str, str2, jSONObject});
            return;
        }
        String c = c(oVar, str);
        d(oVar).p(c, str2, jSONObject);
        new StringBuilder(" onSubTaskFail: ").append(c);
        l(c, str2, jSONObject);
    }

    public static void l(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc971550", new Object[]{str, str2, jSONObject});
            return;
        }
        tfs.g("APMLogger:", " subTaskFailRaw: " + str);
        vxm.b.e().p(str, str2, jSONObject);
        a.p().u(null, str, str2, jSONObject);
    }

    public static void m(o.y yVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5d1a88", new Object[]{yVar, str, jSONObject});
            return;
        }
        String b = b(yVar, str);
        new StringBuilder(" onSubTaskSuccess: ").append(b);
        o(b, jSONObject);
    }

    public static void n(o oVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdd61db", new Object[]{oVar, str, jSONObject});
            return;
        }
        String c = c(oVar, str);
        d(oVar).e(c, jSONObject);
        new StringBuilder(" onSubTaskSuccess: ").append(c);
        o(c, jSONObject);
    }

    public static void o(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d266b055", new Object[]{str, jSONObject});
            return;
        }
        tfs.g("APMLogger:", " subTaskSuccessRaw: " + str);
        vxm.b.e().e(str, jSONObject);
        a.p().v(null, str, jSONObject);
    }

    public static String e(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b0b0585", new Object[]{nVar});
        }
        if (nVar == null) {
            return "TNodeDefaultPageName";
        }
        Object H = nVar.H("page");
        if (H instanceof String) {
            return (String) H;
        }
        Object H2 = nVar.H(Component.KEY_PAGE_NAME);
        if (H2 instanceof String) {
            return (String) H2;
        }
        String str = (String) nVar.m0(1);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        o.y c0 = nVar.c0();
        if (c0 != null) {
            return f(c0.d);
        }
        return "TNodeDefaultPageName";
    }

    public static String f(String str) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44afa8ff", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "TNodeDefaultPageName";
        }
        Uri parse = Uri.parse(str);
        if (!(parse == null || (queryParameter = parse.getQueryParameter("tnode")) == null)) {
            String[] split = queryParameter.split("\\?");
            if (split.length > 0) {
                return split[0];
            }
        }
        return a(str);
    }
}
