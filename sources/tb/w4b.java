package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.NewRangerOptions;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w4b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f30445a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends TypeReference<HashMap<String, String>> {
    }

    static {
        t2o.a(729810389);
    }

    public static void a(IHomePageProviderService iHomePageProviderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd47821e", new Object[]{iHomePageProviderService});
            return;
        }
        z6d pageProvider = iHomePageProviderService == null ? null : iHomePageProviderService.getPageProvider();
        if (pageProvider == null) {
            sfh.d("HomeUtUtil", "pageProvider == null");
            return;
        }
        qul.d(pageProvider.k1());
        TLog.loge("HomeUtUtil", "clearUt");
        Map<String, String> map = f30445a;
        if (map == null || map.isEmpty()) {
            sfh.d("HomeUtUtil", "lastPageProperties == null || lastPageProperties.isEmpty()");
            return;
        }
        for (Map.Entry<String, String> entry : f30445a.entrySet()) {
            entry.setValue(null);
        }
        r5a.t(pageProvider.k1(), f30445a);
        f30445a = null;
    }

    public static Activity b(wcc wccVar) {
        IHomePageProviderService iHomePageProviderService;
        z6d pageProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("5d25eeeb", new Object[]{wccVar});
        }
        if (wccVar == null || (iHomePageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class)) == null || (pageProvider = iHomePageProviderService.getPageProvider()) == null) {
            return null;
        }
        return pageProvider.k1();
    }

    public static JSONObject c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2ae2b00b", new Object[]{new Integer(i)});
        }
        String valueOf = String.valueOf(i);
        JSONObject m = e0p.m();
        if (m != null) {
            return m.getJSONObject(valueOf);
        }
        bqa.d("HomeUtUtil", "getTabBarSection item == null");
        return null;
    }

    public static Map<String, String> d(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("892a02fd", new Object[]{new Integer(i)});
        }
        HashMap hashMap = new HashMap();
        JSONObject c = c(i);
        if (c == null) {
            return null;
        }
        JSONObject jSONObject = c.getJSONObject("passOnTrack");
        if (jSONObject != null) {
            for (String str2 : jSONObject.keySet()) {
                Object obj = jSONObject.get(str2);
                if (obj == null) {
                    str = "";
                } else {
                    str = obj.toString();
                }
                hashMap.put(str2, str);
            }
        }
        return hashMap;
    }

    public static boolean e(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d96f072", new Object[]{wccVar})).booleanValue();
        }
        if (wccVar == null) {
            return false;
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class);
        if (iHomeControllerService == null || iHomeControllerService.isAtRecommendTab()) {
            return true;
        }
        return false;
    }

    public static void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fffae318", new Object[]{jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String str : jSONObject.keySet()) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(str, jSONObject.getString(str));
            }
        }
    }

    public static void g(IHomeSubTabController iHomeSubTabController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24543ee7", new Object[]{iHomeSubTabController, new Integer(i)});
        } else if (iHomeSubTabController instanceof gnn) {
            Map<String, String> updateNextPageProperties = ((gnn) iHomeSubTabController).getUpdateNextPageProperties();
            if (updateNextPageProperties != null) {
                r5a.r(updateNextPageProperties);
            }
        } else {
            try {
                r5a.r(d(i));
            } catch (Throwable th) {
                TLog.loge("HomeUtUtil", "UnExcepted exception.", th);
            }
        }
    }

    public static void h(imn imnVar, wcc wccVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de39b38a", new Object[]{imnVar, wccVar});
            return;
        }
        Activity b = b(wccVar);
        if (b != null && imnVar != null && e(wccVar) && imnVar.v() != null) {
            try {
                r5a.t(b, (Map) JSON.parseObject(imnVar.v().toJSONString(), new a(), new Feature[0]));
                r5a.u(b, imnVar.w().toJSONString());
            } catch (Throwable th) {
                bqa.c("HomeUtUtil", th, new String[0]);
            }
            AwesomeGetContainerData u = imnVar.u(z4a.NEW_FACE_PARENT.f32522a);
            if (u == null) {
                jSONObject = null;
            } else {
                jSONObject = u.getRangerParams();
            }
            if (jSONObject != null) {
                fza.d(b, jSONObject, new NewRangerOptions());
                jt8.a(jSONObject);
            }
            f(imnVar.B());
        }
    }

    public static void i(IHomeSubTabController iHomeSubTabController, IHomePageProviderService iHomePageProviderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fabdf85", new Object[]{iHomeSubTabController, iHomePageProviderService});
            return;
        }
        z6d pageProvider = iHomePageProviderService == null ? null : iHomePageProviderService.getPageProvider();
        if (pageProvider == null) {
            sfh.d("HomeUtUtil", "pageProvider == null");
            return;
        }
        qul.c(pageProvider.k1());
        String updatePageName = iHomeSubTabController.getUpdatePageName();
        if (!TextUtils.isEmpty(updatePageName)) {
            sfh.c("HomeUtUtil", "utWrite pageName : " + updatePageName);
            qul.n(pageProvider.k1(), updatePageName);
        } else {
            sfh.c("HomeUtUtil", "utWrite default pageName : " + updatePageName);
            qul.m(pageProvider.k1());
        }
        String c = b3b.c();
        String updatePageUtParam = iHomeSubTabController.getUpdatePageUtParam();
        if (updatePageUtParam != null) {
            r5a.u(pageProvider.k1(), updatePageUtParam);
        } else {
            r5a.u(pageProvider.k1(), t2b.b().a(c).b());
        }
        Map<String, String> updatePageProperties = iHomeSubTabController.getUpdatePageProperties();
        f30445a = updatePageProperties;
        if (updatePageProperties != null) {
            f30445a = new HashMap(f30445a);
            r5a.t(pageProvider.k1(), f30445a);
            return;
        }
        r5a.t(pageProvider.k1(), t2b.b().a(c).a());
    }
}
