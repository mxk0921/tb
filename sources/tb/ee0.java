package tb;

import android.app.Application;
import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.opencart.AddBagModel;
import com.taobao.android.opencart.AddBagRequester;
import com.taobao.android.opencart.weex.DismissPopWeexModule;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ee0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements de0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18508a;

        public b(ee0 ee0Var, String str) {
            this.f18508a = str;
        }

        @Override // tb.de0
        public void a(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("476d5dea", new Object[]{this, str, str2, jSONObject});
            } else {
                rrh.e().i(this.f18508a, str, str2, jSONObject);
            }
        }

        @Override // tb.de0
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                rrh.e().l(this.f18508a, jSONObject);
            }
        }
    }

    public static /* synthetic */ JSONObject a(ee0 ee0Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5aeb2fc0", new Object[]{ee0Var, map});
        }
        return ee0Var.d(map);
    }

    public static /* synthetic */ JSONObject b(ee0 ee0Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9b161681", new Object[]{ee0Var, map});
        }
        return ee0Var.e(map);
    }

    public final JSONObject d(Map<String, Object> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3db290b", new Object[]{this, map});
        }
        JSONObject jSONObject3 = new JSONObject();
        if (!(map == null || (jSONObject = new JSONObject(map).getJSONObject(to8.ADD_CART)) == null || (jSONObject2 = jSONObject.getJSONObject("addCartResult")) == null)) {
            jSONObject3.put("addCartResult", (Object) jSONObject2);
        }
        return jSONObject3;
    }

    public final JSONObject e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26f7224f", new Object[]{this, map});
        }
        JSONObject d = d(map);
        d.put("MSOAErrorWVUserInfo", (Object) Boolean.TRUE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.KEY_USER_ID, (Object) d);
        if (map != null) {
            jSONObject.put("resultCode", map.get("resultCode"));
        }
        return jSONObject;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18507a;

        public a(String str) {
            this.f18507a = str;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            rrh.e().i(this.f18507a, str, str2, ee0.b(ee0.this, map));
            String str4 = "AddBagServiceProxy,加购失败(异常)," + str + "," + str2;
            if (map == null) {
                str3 = "";
            } else {
                str3 = JSON.toJSONString(map);
            }
            hav.g("iCartAddBag", str4, str3);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            String str;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            JSONObject a2 = ee0.a(ee0.this, map);
            if (map == null || !"1".equals(map.get("resultCode"))) {
                z = false;
            }
            String str2 = "";
            if (z) {
                rrh.e().l(this.f18507a, a2);
            } else {
                rrh.e().i(this.f18507a, str2, str2, ee0.b(ee0.this, map));
            }
            if (z) {
                str = ",加购成功";
            } else {
                str = ",加购失败";
            }
            String concat = "AddBagServiceProxy".concat(str);
            if (map != null) {
                str2 = JSON.toJSONString(map);
            }
            hav.g("iCartAddBag", concat, str2);
        }
    }

    public void c(String str, String str2, Integer num, String str3, String str4, String str5, Boolean bool, Map<String, Object> map, Context context) {
        JSONObject jSONObject;
        HashMap hashMap = map;
        Application application = context;
        int i = 1;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9040c9bd", new Object[]{this, str, str2, num, str3, str4, str5, bool, hashMap, application});
            return;
        }
        hav.g("iCartAddBag", "AddBagServiceProxy", ",开始加购(MSOA),", "requestId==" + str + ",itemId=" + str2 + ",quantity=" + num + ",skuId=" + str3 + ",exParams=" + str4 + ",cartFrom=" + str5 + ",showSku=" + bool + ",clientExParams=" + hashMap + ",context=" + application);
        if (bool == null || !bool.booleanValue()) {
            AddBagRequester addBagRequester = new AddBagRequester();
            AddBagModel.b g = new AddBagModel.b().i(str).g(str2);
            if (num != null) {
                i = num.intValue();
            }
            AddBagModel.b d = g.h(i).k(str3).f(str4).d(str5);
            if (bool != null) {
                z = bool.booleanValue();
            }
            AddBagModel.b j = d.j(z);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            AddBagModel a2 = j.e(hashMap).a();
            if (application == null) {
                application = Globals.getApplication();
            }
            addBagRequester.x(application, a2, new b(this, str));
            return;
        }
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("itemId", str2);
        hashMap2.put("sourceType", 5);
        if (str4 != null) {
            jSONObject = JSON.parseObject(str4);
        } else {
            jSONObject = new JSONObject();
        }
        jSONObject.put("openFrom", (Object) DismissPopWeexModule.MODULE_NAME);
        StringBuilder sb = new StringBuilder();
        for (String str6 : jSONObject.keySet()) {
            sb.append(str6);
            sb.append(",");
        }
        if (sb.toString().endsWith(",")) {
            sb.delete(sb.length() - 1, sb.length());
        }
        jSONObject.put(r4p.KEY_MSOA_TRANS_KEY, (Object) sb.toString());
        if (hashMap != null) {
            jSONObject.putAll(hashMap);
        }
        jSONObject.put("bizName", (Object) "minidetail");
        if (str3 != null) {
            jSONObject.put(q2q.KEY_SKU_ID, (Object) str3);
        }
        if (num != null) {
            jSONObject.put("quantity", (Object) num);
        }
        hashMap2.put("exParams", jSONObject);
        try {
            rrh.e().o(new vrh("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap2), new a(str));
        } catch (Exception unused) {
        }
    }
}
