package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hgj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20627a;

    static {
        t2o.a(729809713);
    }

    public static void a(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ea3863", new Object[]{jSONObject});
        } else if (jSONObject != null && (jSONArray = jSONObject.getJSONArray(TSRecmdReqPrefetch.PREFETCH_PARAMS_IGNORE)) != null) {
            jSONArray.add("currentExposureItemID");
            jSONArray.add("firstPagePVID");
            jSONArray.add("latestHundredItem");
        }
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6a0b5fe5", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject("apiParams");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(jSONObject3);
        }
        return jSONObject2;
    }

    public static JSONObject c() {
        JSONObject jSONObject;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a46c01eb", new Object[0]);
        }
        try {
            jSONObject = JSON.parseObject(f4b.h("orderListPreRequestParams", "{\"apiParams\":{\"appid\":2497,\"isNeedSubSelectionData\":\"true\"},\"ignores\":[\"orderIdsStr\",\"clientReqTime\",\"channel\",\"orderListType\"],\"timeout\":\"15000\"}"));
        } catch (Exception e2) {
            e = e2;
            jSONObject = null;
        }
        try {
            a(jSONObject);
        } catch (Exception e3) {
            e = e3;
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "获取预请求配置出现异常：" + e);
            return jSONObject;
        }
        return jSONObject;
    }

    public static boolean d(String str, int i, int i2, int i3) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("593939d8", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        boolean equals = n7l.ALL_LESS_THEN.equals(str);
        int e = n7l.e();
        if (i > e || i2 > e || i3 > e) {
            z = false;
        } else {
            z = true;
        }
        if (!equals || !z) {
            return false;
        }
        return true;
    }

    public static boolean e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6e466b8", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (i == 0 && i2 == 0 && i3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b146c1f7", new Object[0])).booleanValue();
        }
        if (!f4b.b("orderListRecInstantOpenEnable", true)) {
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "我淘预请求降级了");
            return false;
        } else if ("tscheduleAndInstantOpen".equals(n7l.c())) {
            return true;
        } else {
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "当前不允许在我淘预请求");
            return false;
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[0]);
            return;
        }
        f20627a = false;
        uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "离开我淘了");
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[0]);
            return;
        }
        f20627a = true;
        uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "进入我淘了");
    }

    public static void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8ef134", new Object[]{jSONObject});
        } else if (!f()) {
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "orderCountRequestSuccess 不需要预请求");
        } else if (!f20627a) {
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "真实需要发请求的时候已经离开我淘 不需要发请求了");
        } else {
            int g = vls.g(jSONObject, lcl.KEY_ORDER_PAY);
            int g2 = vls.g(jSONObject, lcl.KEY_ORDER_RECEIVE);
            int g3 = vls.g(jSONObject, lcl.KEY_ORDER_DELIVER);
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "当前待支付的订单数是：" + g + "待确认的订单数：" + g2 + "待发货的订单数是：" + g3);
            l(g, g2, g3);
        }
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b1c610", new Object[0]);
            return;
        }
        JSONObject c = c();
        if (c == null || c.isEmpty()) {
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "预请求的配置为空");
            return;
        }
        hon.f(b(c), z4a.REC_ORDER_LIST_CATAPULT, n7l.b());
        arm.f(arm.ORIGIN_MY_TAO_BAO);
        arm.e("tscheduleAndInstantOpen");
    }

    public static void l(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("304a0df8", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String a2 = n7l.a();
        if (TextUtils.isEmpty(a2)) {
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "实验类型为空，不发预请求");
        } else if (e(i, i2, i3)) {
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "000情况不处理");
        } else if (d(a2, i, i2, i3)) {
            k();
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "符合都小于3的情况，准备发预请求了");
        } else if (g(a2, i, i2, i3)) {
            k();
            uqa.b("recmdPrefetch", "MyTaoBaoPreRequest", "符合有一个小于3的情况，准备发预请求了");
        }
    }

    public static boolean g(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c4167e0", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        boolean equals = n7l.ONE_LESS_THEN.equals(str);
        int e = n7l.e();
        return equals && ((i > 0 && i <= e) || (i2 > 0 && i2 <= e) || (i3 > 0 && i3 <= e));
    }
}
