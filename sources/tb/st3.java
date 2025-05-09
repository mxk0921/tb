package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class st3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810118);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922b0336", new Object[0]);
        } else {
            d(b());
        }
    }

    public static String b() {
        AwesomeGetContainerInnerData q;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ad9577c", new Object[0]);
        }
        String f = yyj.e().f();
        imn d = zza.d(f);
        if (d == null || (q = d.q(f)) == null || (jSONObject = q.ext) == null) {
            return null;
        }
        return jSONObject.getString("clickBack");
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a4a3f8", new Object[0]);
            return;
        }
        a();
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onWillExit();
        }
    }

    public static void d(String str) {
        AwesomeGetContainerInnerData q;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb78fbd", new Object[]{str});
            return;
        }
        String k = yyj.e().k();
        imn d = zza.d(k);
        if (d != null && (q = d.q(k)) != null && (jSONObject = q.ext) != null) {
            jSONObject.put("clickBack", (Object) str);
        }
    }
}
