package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.CardInnerCommonNode;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cxj f29741a;
    public final dh7 b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ag8<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
            }
            return String.valueOf(obj);
        }
    }

    static {
        t2o.a(352321676);
        t2o.a(352321897);
    }

    public v22(cxj cxjVar, dh7 dh7Var, String str) {
        this.f29741a = cxjVar;
        this.b = dh7Var;
        this.c = str;
    }

    public static Map<String, String> c(bxj bxjVar, com.taobao.android.detail2.core.framework.data.global.a aVar, Map<String, String> map, x3w x3wVar) {
        CardInnerCommonNode cardInnerCommonNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("14ab332b", new Object[]{bxjVar, aVar, map, x3wVar});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (x3wVar == null) {
            return map;
        }
        map.put("user_id", kq0.c().getUserId());
        map.putAll(xxj.a(x3wVar.M(), new a()));
        map.put("cardnum", String.valueOf(x3wVar.f31127a));
        if (aVar != null) {
            map.put("entrySpm", aVar.w());
            map.put("entryScm", aVar.v());
            map.put(yj4.PARAM_ENTRY_UT_PARAM, aVar.r());
            map.put("nd_orangeConfigVersion", aVar.J().f());
            AtmosParams o = aVar.o();
            if (o != null) {
                map.put("nd_navWeexVersion", o.jsVersion);
            }
        }
        if (((ArrayList) x3wVar.D).contains(x3wVar.M().getString("nid"))) {
            map.put("is_back", "1");
        } else {
            map.put("is_back", "0");
        }
        map.put("container_type", "new_detail");
        if (!(bxjVar == null || aVar == null)) {
            map.put("newdetailContainer", bxjVar.getClass().toString());
            map.put("weexKeepLiveOpen", String.valueOf(aVar.x0()));
        }
        if (aVar != null) {
            map.put("feedToken", aVar.B());
        }
        if ((x3wVar instanceof ue7) && (cardInnerCommonNode = ((ue7) x3wVar).o0) != null) {
            map.put("nd_mainPicWeexVersion", cardInnerCommonNode.containerInfo.b());
        }
        return map;
    }

    public static Map<String, String> e(bxj bxjVar, com.taobao.android.detail2.core.framework.data.global.a aVar, Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8c55473a", new Object[]{bxjVar, aVar, map, x3wVar});
        }
        try {
            o2r.a("sendExposureStatusWithUT");
            if (map == null) {
                map = new HashMap<>();
            }
            if (bxjVar != null) {
                o2r.a("processCommonArgs.getPageAllProperties");
                Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(bxjVar.getNewDetailContext());
                o2r.b();
                if (pageAllProperties != null) {
                    map.put("spm-url", pageAllProperties.get("spm-url"));
                    map.put("spm-pre", pageAllProperties.get("spm-pre"));
                    map.put("spm-cnt", pageAllProperties.get("spm-cnt"));
                    map.put("scm-url", pageAllProperties.get("scm-url"));
                    map.put("scm-pre", pageAllProperties.get("scm-pre"));
                    map.put("scm-cnt", pageAllProperties.get("scm-cnt"));
                    map.put("scm", pageAllProperties.get("scm-cnt"));
                }
            }
            Map<String, String> c = c(bxjVar, aVar, map, x3wVar);
            o2r.b();
            return c;
        } catch (Throwable th) {
            o2r.b();
            throw th;
        }
    }

    public final String a(x3w x3wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b532841", new Object[]{this, x3wVar, str});
        }
        if (x3wVar == null || x3wVar.v() == null || TextUtils.isEmpty(x3wVar.v().pageName)) {
            return str;
        }
        return x3wVar.v().pageName;
    }

    public final HashMap<String, String> b(int i, String str, String str2, String str3, Map<String, String> map, x3w x3wVar) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("13b2c026", new Object[]{this, new Integer(i), str, str2, str3, map, x3wVar});
        }
        List<pyj> b0 = this.b.b0();
        HashMap<String, String> hashMap = new HashMap<>();
        for (pyj pyjVar : b0) {
            if (!(pyjVar == null || (a2 = pyjVar.a(this.f29741a.i(), i, str, str2, str3, map, x3wVar)) == null)) {
                hashMap.putAll(a2);
            }
        }
        return hashMap;
    }

    public Map<String, String> d(Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eef4de0e", new Object[]{this, map, x3wVar});
        }
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    public final void f(Activity activity, x3w x3wVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7081bcf6", new Object[]{this, activity, x3wVar});
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            String uri = data.toString();
            if (!TextUtils.isEmpty(uri)) {
                String replaceAll = uri.replaceAll("(scm=[^&]*)", "");
                if (!(x3wVar == null || x3wVar.f31127a == 0)) {
                    replaceAll = replaceAll.replaceAll("(spm=[^&]*)", "");
                }
                UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(activity, Uri.parse(replaceAll));
            }
        }
    }

    public Map<String, String> g(bxj bxjVar, com.taobao.android.detail2.core.framework.data.global.a aVar, Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("776d5de9", new Object[]{this, bxjVar, aVar, map, x3wVar});
        }
        o2r.a("processPageCommonArgs");
        if (map == null) {
            map = new HashMap<>();
        }
        String a2 = muv.a(x3wVar, "");
        if (!TextUtils.isEmpty(a2)) {
            map.put("spm-cnt", a2);
        }
        Map<String, String> c = c(bxjVar, aVar, map, x3wVar);
        c.put("scm-cnt", x3wVar.J());
        o2r.a(a1v.GET_PAGE_ALL_PROPERTIES);
        Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(bxjVar.getNewDetailContext());
        this.b.a0().c = pageAllProperties;
        o2r.b();
        if (x3wVar.f31127a == 0 && (pageAllProperties == null || !pageAllProperties.containsKey("scm"))) {
            c.put("scm", aVar.v());
        }
        h(aVar, c);
        o2r.b();
        return c;
    }

    public final void h(com.taobao.android.detail2.core.framework.data.global.a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7ec46e", new Object[]{this, aVar, map});
            return;
        }
        x3w X = aVar.X();
        if (X != null) {
            String K = X.K();
            if (!TextUtils.isEmpty(K)) {
                map.put("pre_seller_id", K);
            }
        }
    }

    public void i(String str, String str2, String str3, Map<String, String> map, x3w x3wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2518cc", new Object[]{this, str, str2, str3, map, x3wVar, new Boolean(z)});
            return;
        }
        Map<String, String> e = e(this.f29741a.h(), this.f29741a.j(), d(map, x3wVar), x3wVar);
        if (!z) {
            str = "NewDetail_Button_".concat(str);
        }
        if (!z) {
            e.putAll(b(2101, str, str2, str3, e, x3wVar));
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(a(x3wVar, this.c), 2101, str, str2, str3, e).build());
    }

    public void j(String str, String str2, String str3, Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a657d7d", new Object[]{this, str, str2, str3, map, x3wVar});
            return;
        }
        Map<String, String> e = e(this.f29741a.h(), this.f29741a.j(), d(map, x3wVar), x3wVar);
        e.putAll(b(2201, "NewDetail_Show_" + str, str2, str3, e, x3wVar));
        String a2 = a(x3wVar, this.c);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(a2, 2201, "NewDetail_Show_" + str, str2, str3, e).build());
    }

    public final void k(Map<String, String> map, x3w x3wVar) {
        Object obj;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac7a9dc", new Object[]{this, map, x3wVar});
            return;
        }
        Activity i = this.f29741a.i();
        if (i != null) {
            StringBuilder sb = new StringBuilder("trackPageAppear");
            if (x3wVar == null) {
                obj = "null";
            } else {
                obj = Integer.valueOf(x3wVar.f31127a);
            }
            sb.append(obj);
            o2r.a(sb.toString());
            txj.e(txj.TAG_UT, "trackPageAppear执行");
            String a2 = a(x3wVar, this.c);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            defaultTracker.updatePageName(i, a2);
            defaultTracker.pageAppearDonotSkip(i, a2);
            f(i, x3wVar);
            Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(i);
            if (!(pageAllProperties == null || x3wVar.f31127a != 0 || (str = pageAllProperties.get(z9u.KEY_UTPARAM_URL)) == null)) {
                this.f29741a.j().Y0(str);
            }
            m(map, x3wVar);
            txj.e(txj.TAG_UT, "trackPageAppear执行完毕");
            o2r.b();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f406270", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f29741a.i());
        }
    }

    public void m(Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed61e589", new Object[]{this, map, x3wVar});
            return;
        }
        o2r.a("updateCurrentAndNextPageProperties");
        Activity i = this.f29741a.i();
        if (i == null || x3wVar == null) {
            o2r.b();
            return;
        }
        Map<String, String> g = g(this.f29741a.h(), this.f29741a.j(), d(map, x3wVar), x3wVar);
        o2r.a(a1v.UPDATE_PAGE_PROPERTIES);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(i, g);
        o2r.b();
        HashMap hashMap = new HashMap();
        hashMap.put("spm-url", g.get("spm-cnt"));
        hashMap.put("scm-url", g.get("scm-cnt"));
        hashMap.put("scm", g.get("scm-cnt"));
        hashMap.put("scm-pre", g.get("scm"));
        o2r.a(a1v.UPDATE_NEXT_PAGE_PROPERTIES);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        o2r.b();
        o2r.b();
    }

    public void n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
            return;
        }
        o2r.a(a1v.UPDATE_PAGE_PROPERTIES);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f29741a.i(), map);
        o2r.b();
    }

    public void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f794d6", new Object[]{this, jSONObject});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this.f29741a.i(), JSON.toJSONString(jSONObject));
        }
    }
}
