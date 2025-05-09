package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.weex.WXSDKInstance;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.Map;
import tb.cbk;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dnx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793533);
    }

    public static void x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686053ce", new Object[]{jSONObject});
        } else if (jSONObject == null) {
            b4p.b("XSearchEventImpl", "options为空");
        } else {
            String string = jSONObject.getString("controlName");
            if (TextUtils.isEmpty(string)) {
                b4p.b("XSearchEventImpl", "controlName为空");
                return;
            }
            String string2 = jSONObject.getString("spm");
            ArrayMap<String, String> b = bwf.b(jSONObject, "args");
            String string3 = jSONObject.getString("pageName");
            if (TextUtils.equals(jSONObject.getString("withoutPageName"), "true")) {
                b.put("spm", string2);
                b.put("rainbow", oen.j());
                UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(string);
                uTHitBuilders$UTControlHitBuilder.setProperties(b);
                uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG1, string);
                UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
                return;
            }
            sen.i(string3, string, b, string2);
        }
    }

    public void a(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f22c150", new Object[]{this, wXSDKInstance, jSONObject});
        } else {
            j(wXSDKInstance, "addParams", jSONObject);
        }
    }

    public void b(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fb77fc", new Object[]{this, wXSDKInstance, jSONObject});
        } else {
            j(wXSDKInstance, "clearParams", jSONObject);
        }
    }

    public final cbk.a c(WXSDKInstance wXSDKInstance, Context context) {
        cbk.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cbk.a) ipChange.ipc$dispatch("dec8a531", new Object[]{this, wXSDKInstance, context});
        }
        if (wXSDKInstance instanceof cbk) {
            aVar = ((cbk) wXSDKInstance).E1();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        if (context instanceof cbk.a) {
            return (cbk.a) context;
        }
        return aVar;
    }

    public Map<String, String> d(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c6b92980", new Object[]{this, wXSDKInstance});
        }
        if (!(wXSDKInstance instanceof cbk)) {
            return null;
        }
        cnx D1 = ((cbk) wXSDKInstance).D1();
        if (!(D1 instanceof b7x)) {
            return null;
        }
        return ((CommonBaseDatasource) ((b7x) D1).getModel().e()).getParamsSnapShot();
    }

    public void e(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb28f41", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            l(wXSDKInstance, context, "goToSrp", jSONObject);
        }
    }

    public void f(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e32a5e3", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject == null) {
            c4p.n("XSearchEventImpl", "options参数为空");
        } else {
            l(wXSDKInstance, context, "jumpToTab", jSONObject);
        }
    }

    public void g(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d9f365", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject == null) {
            c4p.n("XSearchEventImpl", "options参数为空");
        } else {
            l(wXSDKInstance, context, "jumpToTimeline", jSONObject);
        }
    }

    public void h(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fa2f4a", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            l(wXSDKInstance, context, "openTaobaoExperience", jSONObject);
        }
    }

    public void i(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bd9325", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject == null) {
            c4p.n("XSearchEventImpl", "options参数为空");
        } else {
            l(wXSDKInstance, context, "operateSearchList", jSONObject);
        }
    }

    public final void j(WXSDKInstance wXSDKInstance, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f98d036", new Object[]{this, wXSDKInstance, str, jSONObject});
        } else {
            k(wXSDKInstance, str, jSONObject, null, null);
        }
    }

    public final void k(WXSDKInstance wXSDKInstance, String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        cnx D1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15d9c76", new Object[]{this, wXSDKInstance, str, jSONObject, aVar, aVar2});
        } else if ((wXSDKInstance instanceof cbk) && (D1 = ((cbk) wXSDKInstance).D1()) != null) {
            D1.K(str, jSONObject, aVar, aVar2);
        }
    }

    public final void l(WXSDKInstance wXSDKInstance, Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783bc68b", new Object[]{this, wXSDKInstance, context, str, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
            c4p.n("XSearchEventImpl", "event为空");
        } else {
            cbk.a c = c(wXSDKInstance, context);
            if (c == null) {
                c4p.n("XSearchEventImpl", str + ": eventListener为空");
                return;
            }
            c.r2(str, jSONObject, null, null);
        }
    }

    public void m(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe38a38b", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject != null) {
            l(wXSDKInstance, context, "prepareCompassRequest", jSONObject);
        }
    }

    public void n(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c3f807", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            l(wXSDKInstance, context, "refreshAuction", jSONObject);
        }
    }

    public void o(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c5d904", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject != null) {
            l(wXSDKInstance, context, "removeDynamicCard", jSONObject);
        }
    }

    public void p(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d16973", new Object[]{this, wXSDKInstance, jSONObject});
        } else {
            j(wXSDKInstance, "removeParams", jSONObject);
        }
    }

    public void q(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284b1497", new Object[]{this, wXSDKInstance});
        } else {
            j(wXSDKInstance, "removeSelf", null);
        }
    }

    public void r(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b11147", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            l(wXSDKInstance, context, "search", jSONObject);
        }
    }

    public void s(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466846d2", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            l(wXSDKInstance, context, "searchOption", jSONObject);
        }
    }

    public void t(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fc75e7", new Object[]{this, wXSDKInstance, context, jSONObject, aVar, aVar2});
        } else {
            k(wXSDKInstance, "searchOptionWithCallback", jSONObject, aVar, aVar2);
        }
    }

    public void u(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa17fd1", new Object[]{this, wXSDKInstance, jSONObject});
        } else {
            j(wXSDKInstance, "setParams", jSONObject);
        }
    }

    public void v(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7afbb34d", new Object[]{this, wXSDKInstance, context, jSONObject});
            return;
        }
        l(wXSDKInstance, context, "tagSearch", jSONObject);
        c(wXSDKInstance, context);
    }

    public void w(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaadb5bd", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            l(wXSDKInstance, context, "updateStorage", jSONObject);
        }
    }
}
