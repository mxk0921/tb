package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z2q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SKU_ADD_CART = "5";
    public static final String SKU_ADD_CART_AND_DETAIL = "4";
    public static final String SKU_ADD_CART_WITH_SURE = "1";
    public static final String SKU_BUY = "2";
    public static final String SKU_SURE_AND_DETAIL = "3";

    /* renamed from: a  reason: collision with root package name */
    public final u2q f32502a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l2q f32503a;

        public a(l2q l2qVar) {
            this.f32503a = l2qVar;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            l2q l2qVar = this.f32503a;
            l2qVar.onFailed(-2, q2q.KEY_SKU_ERROR_MSG + str + str2);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map == null) {
                this.f32503a.onFailed(-1, q2q.KEY_SKU_CANCEL_MSG);
            } else {
                u2q a2 = u2q.a(z2q.a(z2q.this, map, "itemId"), z2q.a(z2q.this, map, q2q.KEY_SKU_ID), z2q.a(z2q.this, map, q2q.KEY_AREA_ID), "");
                Object obj = map.get(to8.ADD_CART);
                if (obj instanceof Map) {
                    a2.d = z2q.a(z2q.this, (Map) obj, "exParams");
                }
                this.f32503a.a(a2);
            }
        }
    }

    static {
        t2o.a(478150865);
    }

    public z2q(u2q u2qVar) {
        this.f32502a = u2qVar;
    }

    public static /* synthetic */ String a(z2q z2qVar, Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47da6ab7", new Object[]{z2qVar, map, str});
        }
        return z2qVar.d(map, str);
    }

    public static z2q b(u2q u2qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z2q) ipChange.ipc$dispatch("3fe40062", new Object[]{u2qVar});
        }
        return new z2q(u2qVar);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c09f11d6", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.f32502a.g)) {
            return Boolean.valueOf(this.f32502a.g).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("cart_switch", "forbidH5", "true"));
    }

    public final String d(Map<String, Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2026bba0", new Object[]{this, map, str});
        }
        if (map == null || (obj = map.get(str)) == null || !(obj instanceof String)) {
            return "";
        }
        return (String) obj;
    }

    public void e(l2q l2qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81db456", new Object[]{this, l2qVar});
        } else {
            f("3", l2qVar, false);
        }
    }

    public void f(String str, l2q l2qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476ccdaa", new Object[]{this, str, l2qVar, new Boolean(z)});
        } else if (this.f32502a == null) {
            l2qVar.onFailed(-3, q2q.KEY_SKU_PARAM_ERROR_MSG);
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = this.f32502a.e;
            if (jSONObject2 != null) {
                jSONObject.put("id_biz_installment", (Object) jSONObject2);
            }
            JSONObject jSONObject3 = this.f32502a.c;
            if (jSONObject3 != null) {
                jSONObject.putAll(jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = this.f32502a.f;
            if (jSONObject5 != null) {
                jSONObject4.putAll(jSONObject5);
            }
            jSONObject4.put(q2q.KEY_SKU_ID, (Object) this.f32502a.b);
            jSONObject4.put("bizName", (Object) "cart");
            jSONObject4.put("extInput", (Object) jSONObject);
            String b = ziq.c().b();
            if (!TextUtils.isEmpty(b)) {
                jSONObject4.put("addressId", (Object) b);
                this.f32502a.h.add("addressId");
            }
            jSONObject4.put("openFrom", (Object) "cart");
            this.f32502a.h.add("openFrom");
            if ("1".equals(str)) {
                jSONObject4.put("depressTBCartRefresh", (Object) Boolean.valueOf(z));
            }
            if (c()) {
                jSONObject4.put("sku_forbidH5", (Object) "true");
                jSONObject4.put("sku_forbidH5_toast", (Object) Localization.q(R.string.taobao_app_1028_1_21631));
            }
            HashMap hashMap = new HashMap(3);
            hashMap.put("itemId", this.f32502a.f29091a);
            hashMap.put("sourceType", str);
            jSONObject4.put(r4p.KEY_MSOA_TRANS_KEY, (Object) cb4.F(this.f32502a.h));
            hashMap.put("exParams", jSONObject4);
            try {
                rrh.e().o(new vrh("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap), new a(l2qVar));
            } catch (Exception unused) {
            }
        }
    }
}
