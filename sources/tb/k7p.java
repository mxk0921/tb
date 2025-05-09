package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k7p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TARCK_KEY_PAGE_HOME = "Page_Home";
    public static final String TARCK_KEY_PAGE_MINI_APP_HOME = "Page_MiniappHome";

    static {
        t2o.a(729810315);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c92053", new Object[0]);
            return;
        }
        z6d c = h2b.a().c();
        if (c == null) {
            sfh.d("SecondFloorUtUtil", "pageProvider == null");
            return;
        }
        qul.d(c.k1());
        sfh.c("SecondFloorUtUtil", "clearUt");
    }

    public static IHomeSubTabController b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("7c3a56ec", new Object[0]);
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.getCurrentSubTabController();
        }
        return null;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb30a61", new Object[0])).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.isAtRecommendTab();
        }
        return false;
    }

    public static void d(z6d z6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8c2b26", new Object[]{z6dVar});
            return;
        }
        String c = b3b.c();
        if (b() != null) {
            Activity k1 = z6dVar.k1();
            r5a.u(k1, t2b.b().a(c).b());
            r5a.t(k1, t2b.b().a(c).a());
            qul.j(k1);
            boolean d = h2b.d();
            if (c()) {
                qul.o(k1, d);
            }
            HashMap hashMap = new HashMap();
            hashMap.put(c2v.UT_ISBK, "1");
            hashMap.put("spm-url", "a2141.1.tabbar.homepage");
            r5a.t(z6dVar.k1(), hashMap);
        }
    }

    public static void e(String str, z6d z6dVar) {
        JSONObject parseObject;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3b89f8", new Object[]{str, z6dVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("spm");
                if (JSON.parseObject(parse.getQueryParameter("passParams")) != null) {
                    str2 = parseObject.getString(tm2.HOME_BUCKETS) + "_9999";
                } else {
                    str2 = "";
                }
                hashMap.put("spm-cnt", "a2141.miniapp");
                if (!TextUtils.isEmpty(queryParameter)) {
                    hashMap.put("spm-url", queryParameter);
                }
                hashMap.put(tm2.HOME_BUCKETS, str2);
            }
            r5a.t(z6dVar.k1(), hashMap);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8253669b", new Object[]{str, str2});
            return;
        }
        z6d c = h2b.a().c();
        if (c == null) {
            sfh.d("SecondFloorUtUtil", "pageProvider == null");
            return;
        }
        qul.c(c.k1());
        if (!TextUtils.isEmpty(str)) {
            sfh.c("SecondFloorUtUtil", "utWrite pageName : " + str);
            qul.n(c.k1(), str);
        } else {
            sfh.c("SecondFloorUtUtil", "utWrite default pageName : " + str);
            qul.m(c.k1());
        }
        if (TextUtils.equals(TARCK_KEY_PAGE_MINI_APP_HOME, str)) {
            e(str2, c);
        } else {
            d(c);
        }
    }
}
