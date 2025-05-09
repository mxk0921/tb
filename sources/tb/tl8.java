package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.homepage.busniess.model.ClickParamBean;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tl8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538127);
    }

    public static void a(JSONObject jSONObject, int i) {
        String str;
        String str2;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ab1f4c", new Object[]{jSONObject, new Integer(i)});
            return;
        }
        Object obj = jSONObject.get("clickParam");
        String str3 = u3j.b;
        if (obj != null) {
            try {
                ClickParamBean clickParamBean = (ClickParamBean) JSON.toJavaObject(jSONObject.getJSONObject("clickParam"), ClickParamBean.class);
                if (!TextUtils.isEmpty(clickParamBean.page)) {
                    str3 = clickParamBean.page;
                }
                if (TextUtils.isEmpty(clickParamBean.eventId)) {
                    str = "2101";
                } else {
                    str = clickParamBean.eventId;
                }
                if (TextUtils.isEmpty(clickParamBean.arg1)) {
                    str2 = c(i);
                } else {
                    str2 = clickParamBean.arg1;
                }
                JSONObject jSONObject2 = clickParamBean.args;
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    suv.e(str3, Integer.parseInt(str), str2, clickParamBean.arg2, clickParamBean.arg3, clickParamBean.args);
                    map = clickParamBean.nextPage;
                    if (map != null && !map.isEmpty()) {
                        suv.l(clickParamBean.nextPage);
                        return;
                    }
                }
                suv.f(str3, Integer.parseInt(str), str2, clickParamBean.arg2, clickParamBean.arg3, suv.a(d(i), null, null, null));
                map = clickParamBean.nextPage;
                if (map != null) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            suv.o(str3, c(i), d(i));
        }
    }

    public static String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2af2021e", new Object[]{new Integer(i)});
        }
        return "Page_MyTaobao_Button-OrderNews";
    }

    public static String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed8b4646", new Object[]{new Integer(i)});
        }
        return "a2141.7631743.3." + (i + 26);
    }

    public static void b(Context context, JSONObject jSONObject, List<Object> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67fc345d", new Object[]{context, jSONObject, list, new Integer(i)});
        } else if (jSONObject != null) {
            Long l = jSONObject.getLong("id");
            String string = jSONObject.getString(rg0.JUMP_URL);
            a(jSONObject, i);
            if (!TextUtils.isEmpty(string)) {
                Nav.from(context).toUri(string);
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext").getJSONObject("extraInfo");
            if (jSONObject2 != null) {
                jSONObject2.toJSONString();
            }
            if (l == null || l.longValue() != -1 || jSONObject2 == null) {
                Bundle bundle = new Bundle();
                bundle.putString("data", trf.b(list));
                bundle.putInt("currentPage", i);
                Nav.from(context).withExtras(bundle).toUri("taobao://go/packagelist");
                if (context instanceof Activity) {
                    ((Activity) context).overridePendingTransition(R.anim.fade_in, 0);
                    return;
                }
                return;
            }
            Nav.from(context).toUri(sgj.h(jSONObject2.getString("moreUrl")));
        }
    }
}
