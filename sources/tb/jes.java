package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.HashMap;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class jes {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jes INSTANCE = new jes();

    static {
        t2o.a(839909983);
    }

    @JvmStatic
    public static final String a(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b0d0c6d", new Object[]{bbsVar});
        }
        if (bbsVar == null) {
            return "";
        }
        if (bbsVar.a0() != TMSSolutionType.MINIGAME) {
            return "TMS";
        }
        return "hdkf_" + ((Object) bbsVar.L()) + ".home";
    }

    @JvmStatic
    public static final HashMap<String, String> c(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3069487d", new Object[]{bbsVar});
        }
        String str = null;
        String str2 = bbsVar == null ? null : bbsVar.h;
        String e0 = bbsVar == null ? null : bbsVar.e0();
        if (bbsVar != null) {
            str = bbsVar.L();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("miniapp_id", str);
        hashMap.put("miniapp_trace_id", str2);
        hashMap.put(luw.MINIAPP_ORI_URL_KEY, e0);
        hashMap.put("miniapp_type", "miniapp");
        hashMap.put("pageName", a(bbsVar));
        hashMap.put("name", a(bbsVar));
        hashMap.put("spm-cnt", INSTANCE.b(bbsVar));
        return hashMap;
    }

    @JvmStatic
    public static final JSONObject d(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("404b351e", new Object[]{bbsVar});
        }
        String str = null;
        String str2 = bbsVar == null ? null : bbsVar.h;
        String e0 = bbsVar == null ? null : bbsVar.e0();
        if (bbsVar != null) {
            str = bbsVar.L();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "miniapp_id", str);
        jSONObject.put((JSONObject) luw.MINIAPP_ORI_URL_KEY, e0);
        jSONObject.put((JSONObject) "miniapp_trace_id", str2);
        jSONObject.put((JSONObject) "miniapp_type", "miniapp");
        return jSONObject;
    }

    @JvmStatic
    public static final void e(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97af80a", new Object[]{bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        Activity I = bbsVar.I();
        ckf.f(I, "instance.activity");
        IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter != null) {
            iUserTrackerAdapter.updatePageProperties(I, c(bbsVar));
        }
        IUserTrackerAdapter iUserTrackerAdapter2 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter2 != null) {
            iUserTrackerAdapter2.updatePageUtParam(I, d(bbsVar));
        }
        IUserTrackerAdapter iUserTrackerAdapter3 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter3 != null) {
            iUserTrackerAdapter3.updatePageName(I, a(bbsVar));
        }
        IUserTrackerAdapter iUserTrackerAdapter4 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter4 != null) {
            iUserTrackerAdapter4.updatePageUrl(I, bbsVar.e0());
        }
    }

    public final String b(bbs bbsVar) {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c1ec3ae", new Object[]{this, bbsVar});
        }
        if (bbsVar == null) {
            return "";
        }
        String str = "MiniApp_" + ((Object) bbsVar.L()) + ".pages_index_index.0.0";
        if (q9s.D() && (c = ies.c(bbsVar.e0(), "spm")) != null && c.length() != 0) {
            str = ies.c(bbsVar.e0(), "spm");
            ckf.f(str, "getUrlParamByKey(instance.url, \"spm\")");
        } else if (bbsVar.a0() == TMSSolutionType.MINIGAME) {
            str = "hdkf_" + ((Object) bbsVar.L()) + ".home.0.0";
        }
        TMSLogger.b("TMSUserTrackerUtils", ckf.p("spm:", str));
        return str;
    }
}
