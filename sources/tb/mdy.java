package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mdy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f23983a = 0;

    static {
        t2o.a(729810407);
    }

    public static IHomeSubTabController a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("f6ed7b88", new Object[]{str});
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.getHomeSubTabController(str);
        }
        return null;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8bf39cb", new Object[0]);
            return;
        }
        fve.e("webViewOptimizationTrigger", "闲时触发预加载");
        if (c()) {
            fve.e("webViewOptimizationTrigger", "idleTrigger 走新链路");
            return;
        }
        g(e0p.f());
        f23983a++;
    }

    public static boolean c() {
        z9c globalExtModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("668fe385", new Object[0])).booleanValue();
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService == null || (globalExtModel = iHomeDataService.getGlobalExtModel()) == null) {
            return false;
        }
        JSONObject e = globalExtModel.e();
        if (e == null) {
            bqa.d("webViewOptimizationTrigger", "clientABTest == null");
            return false;
        }
        JSONObject jSONObject = e.getJSONObject("preloadConfig");
        if (jSONObject != null) {
            return !TextUtils.isEmpty(jSONObject.getString("value"));
        }
        bqa.d("webViewOptimizationTrigger", "preloadConfig == null");
        return false;
    }

    public static void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17672865", new Object[]{jSONObject});
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isNeedPreRender");
        String string = jSONObject.getString("type");
        if (booleanValue) {
            IHomeSubTabController a2 = a(string);
            if (a2 instanceof b5b) {
                ((b5b) a2).n();
            }
        }
    }

    public static void g(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8292d2dc", new Object[]{list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            JSONObject jSONObject = list.get(i).getJSONObject("content");
            if (jSONObject != null) {
                f(jSONObject);
            }
        }
    }

    public static void d(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc0fefd", new Object[]{list});
            return;
        }
        fve.e("webViewOptimizationTrigger", "reTrigger");
        if (f23983a != 0) {
            if (c()) {
                fve.e("webViewOptimizationTrigger", "reTrigger 走新链路");
                return;
            }
            g(list);
            f23983a++;
        }
    }

    public static void e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591db213", new Object[]{jSONObject});
            return;
        }
        fve.e("webViewOptimizationTrigger", "reTriggerByIndex");
        if (f23983a != 0 && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            f(jSONObject2);
            f23983a++;
        }
    }
}
