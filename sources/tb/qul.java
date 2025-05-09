package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.TrackBuried;
import com.taobao.tao.util.Constants;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qul {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809116);
    }

    public static void a(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e70ef1", new Object[]{str, map, map2, map3});
            return;
        }
        try {
            UTAnalytics.getInstance().getUTSceneTracker().beginScene(str, map, map2, map3);
        } catch (Exception e) {
            bqa.b("PathTracker", "beginScene error", e);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee94d042", new Object[]{str});
            return;
        }
        try {
            UTAnalytics.getInstance().getUTSceneTracker().endScene(str);
        } catch (Exception e) {
            bqa.b("PathTracker", "endScene error", e);
        }
    }

    public static void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff07c6", new Object[]{obj});
            return;
        }
        try {
            bqa.a("PathTracker", "pageAppear````````````````````");
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(obj);
        } catch (Exception unused) {
        }
    }

    public static void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{obj});
            return;
        }
        try {
            bqa.a("PathTracker", "pageDisAppear````````````````````");
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(obj);
        } catch (Exception unused) {
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b85cabd", new Object[0]);
            return;
        }
        TBS.Adv.putKvs("ad_word_show", null);
        TBS.Adv.unKeepKvs("com.taobao.search.SearchListActivity", "ad_word_show");
        TBS.Adv.unKeepKvs("com.taobao.tao.RecommandShopActivity", "ad_word_show");
        TBS.Adv.unKeepKvs("com.taobao.tao.detail.DetailActivity", "ad_word_show");
        TBS.Adv.putKvs(Constants.KEY_SEARCH_KEYWORD, null);
        TBS.Adv.unKeepKvs("com.taobao.search.SearchListActivity", Constants.KEY_SEARCH_KEYWORD);
        TBS.Adv.unKeepKvs("com.taobao.tao.RecommandShopActivity", Constants.KEY_SEARCH_KEYWORD);
        TBS.Adv.unKeepKvs("com.taobao.tao.detail.DetailActivity", Constants.KEY_SEARCH_KEYWORD);
        TBS.Adv.putKvs("seller_id", null);
        TBS.Adv.unKeepKvs("com.taobao.tao.detail.DetailActivity", "seller_id");
        TBS.Adv.putKvs("shop_id", null);
        TBS.Adv.unKeepKvs("com.taobao.tao.detail.DetailActivity", "shop_id");
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a517020", new Object[0]);
        } else {
            TBS.Ext.commitEvent("Page_UT", 1012, ied.PULL_INIT, "Initiative", (Object) null);
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd4a3cd", new Object[0]);
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("x_region_info", kbq.c(m0b.c()).editionCode);
        } catch (Exception unused) {
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e163e001", new Object[0]);
        } else {
            TBS.Ext.commitEvent("Page_UT", 1012, "Background", "Initiative", (Object) null);
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fa2ca7", new Object[0]);
            return;
        }
        TrackBuried.list_refer = "Page_Home";
        TrackBuried.list_CurPage = "Page_Home";
    }

    public static void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4d2b70", new Object[]{context});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!(context == null || context.getResources() == null || context.getResources().getConfiguration() == null)) {
            hashMap.put("fontSize", String.valueOf(context.getResources().getConfiguration().fontScale));
        }
        nrv.a().e(hashMap);
        r5a.t(context, hashMap);
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b27f98", new Object[0]);
        } else {
            TBS.Ext.commitEvent("Page_Home", 30001, "Show", (Object) null, (Object) null);
        }
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd23cfa9", new Object[0]);
            return;
        }
        TrackBuried.list_Param = "";
        TrackBuried.list_Type = "";
        TrackBuried.list_CurPage = "Page_Home";
        TrackBuried.list_refer = "Page_Home";
        TrackBuried.carrier = "";
    }

    public static void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68fa8bd9", new Object[]{context});
        } else {
            n(context, "Page_Home");
        }
    }

    public static void n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bfd163", new Object[]{context, str});
            return;
        }
        try {
            bqa.d("PathTracker", "pageName : " + str);
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
        } catch (Exception unused) {
        }
    }

    public static void o(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d4ad03", new Object[]{context, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isLowNetwork", String.valueOf(z ? 1 : 0));
        r5a.t(context, hashMap);
    }
}
