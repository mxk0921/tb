package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rd3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BUY_METHOD_IN_EVENT = "id_biz_buy_method";
    public static final String KEY_INSTALLMENT_TRANS_IN_EVENT = "key_installment_param";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements l2q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lcu f27292a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;

        public a(lcu lcuVar, String str, JSONObject jSONObject) {
            this.f27292a = lcuVar;
            this.b = str;
            this.c = jSONObject;
        }

        @Override // tb.l2q
        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = rd3.z(rd3.this).getString(R.string.cart_msg_cannot_modify);
            }
            be3.c(rd3.r(rd3.this), str);
            hdv.a().commitFeedback(c9x.CART_BIZ_NAME, str, UmTypeKey.TOAST, "skuEditError", JSON.toJSONString(this.c));
            lbq.b(c9x.CART_BIZ_NAME, "CALL_SKU_WITH_MSOA_FAILURE", "skuEditError", str);
        }

        @Override // tb.l2q
        public void a(u2q u2qVar) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc6a6ad6", new Object[]{this, u2qVar});
                return;
            }
            String str = u2qVar.b;
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject = JSON.parseObject(u2qVar.d);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(rd3.p(rd3.this).getKey());
                this.f27292a.m("operateItems", arrayList);
                HashMap hashMap = new HashMap();
                hashMap.put(q2q.KEY_SKU_ID, str);
                rd3 rd3Var = rd3.this;
                rd3.s(rd3Var, rd3.q(rd3Var), hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(this.b, u2qVar.d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("installmentUpdateInfo", (Object) hashMap2);
                this.f27292a.m(rd3.KEY_INSTALLMENT_TRANS_IN_EVENT, jSONObject2);
                if (jSONObject != null) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("cartId", this.b);
                    hashMap3.putAll(jSONObject);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("skuExtParams", (Object) hashMap3);
                    this.f27292a.m("skuExtParams", jSONObject3);
                }
                this.f27292a.m("_isSupportChangeIDMEvent", Boolean.TRUE);
                rd3.v(rd3.this).k0(rd3.t(rd3.this), rd3.u(rd3.this), true, null, null);
                juv.a(rd3.w(rd3.this), "Page_ShoppingCart_Item_SKU_Select", vo0.b(rd3.x(rd3.this), rd3.y(rd3.this), new String[0]));
            }
        }
    }

    static {
        t2o.a(478150783);
    }

    public static /* synthetic */ Object ipc$super(rd3 rd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartShowSkuSubscriber");
    }

    public static /* synthetic */ IDMComponent p(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("56bda590", new Object[]{rd3Var});
        }
        return rd3Var.e;
    }

    public static /* synthetic */ gsb q(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("47ce6714", new Object[]{rd3Var});
        }
        return rd3Var.g();
    }

    public static /* synthetic */ Context r(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("21c3e973", new Object[]{rd3Var});
        }
        return rd3Var.b;
    }

    public static /* synthetic */ boolean s(rd3 rd3Var, gsb gsbVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c96faa20", new Object[]{rd3Var, gsbVar, map})).booleanValue();
        }
        return rd3Var.n(gsbVar, map);
    }

    public static /* synthetic */ IDMComponent t(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("7128db93", new Object[]{rd3Var});
        }
        return rd3Var.e;
    }

    public static /* synthetic */ lcu u(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("1b7ad17b", new Object[]{rd3Var});
        }
        return rd3Var.f23048a;
    }

    public static /* synthetic */ kmb v(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("f082e59a", new Object[]{rd3Var});
        }
        return rd3Var.j;
    }

    public static /* synthetic */ kmb w(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("30adcc5b", new Object[]{rd3Var});
        }
        return rd3Var.j;
    }

    public static /* synthetic */ IDMComponent x(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("3f0d2397", new Object[]{rd3Var});
        }
        return rd3Var.e;
    }

    public static /* synthetic */ kmb y(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("b10399dd", new Object[]{rd3Var});
        }
        return rd3Var.j;
    }

    public static /* synthetic */ Context z(rd3 rd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f9080c0d", new Object[]{rd3Var});
        }
        return rd3Var.b;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        JSONObject c = c();
        if (c != null) {
            String string = c.getString("itemId");
            String string2 = lcuVar.a().getFields().getString("cartId");
            String string3 = c.getString(q2q.KEY_SKU_ID);
            JSONObject jSONObject = lcuVar.a().getFields().getJSONObject("sku");
            String string4 = jSONObject != null ? jSONObject.getString("isForbidH5") : null;
            String string5 = c.getString(q2q.KEY_AREA_ID);
            if (!c.getBoolean("editable").booleanValue()) {
                String string6 = c.getString("invalidMsg");
                if (TextUtils.isEmpty(string6)) {
                    string6 = this.b.getString(R.string.cart_msg_cannot_modify);
                }
                be3.c(this.b, string6);
                hdv.a().commitFeedback(c9x.CART_BIZ_NAME, string6, UmTypeKey.TOAST, "biz", JSON.toJSONString(c));
                ub3.g("skuUneditable", string6);
                return;
            }
            kmb kmbVar = this.j;
            juv.a(kmbVar, "Page_ShoppingCart_Item_SKU_Select", vo0.b(this.e, kmbVar, new String[0]));
            juv.b(this.j, "Page_ShoppingCart_General-ReselectClick", new String[0]);
            u2q a2 = u2q.a(string, string3, string5, string4);
            JSONObject jSONObject2 = c.getJSONObject("skuExtParams");
            if (jSONObject2 != null) {
                a2.c = jSONObject2;
                a2.e = jSONObject2.getJSONObject("installmentUpdateInfo");
            }
            if (c.containsKey("skuTransparent")) {
                if (a2.f == null) {
                    a2.f = new JSONObject();
                }
                JSONObject jSONObject3 = c.getJSONObject("skuTransparent");
                a2.h.addAll(jSONObject3.keySet());
                a2.f.putAll(jSONObject3);
            }
            z2q.b(a2).e(new a(lcuVar, string2, c));
        }
    }
}
