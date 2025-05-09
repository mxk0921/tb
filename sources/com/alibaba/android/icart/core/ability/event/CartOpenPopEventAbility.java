package com.alibaba.android.icart.core.ability.event;

import android.net.Uri;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.a07;
import tb.c9x;
import tb.cb4;
import tb.ckf;
import tb.f9v;
import tb.fsb;
import tb.gsb;
import tb.hav;
import tb.hij;
import tb.kmb;
import tb.lcu;
import tb.lmb;
import tb.mc3;
import tb.nc3;
import tb.rc3;
import tb.t2o;
import tb.u55;
import tb.wc3;
import tb.xh8;
import tb.xhv;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CartOpenPopEventAbility extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sParamKeyIDMEvent = "popIDMEvent";
    public static final String sParamKeyTradeEvent = "popTradeEvent";
    public final String l = "CartOpenPopEventAbility";
    public final String m = "url";
    public final String n = "nextRenderRoot";
    public final String o = hij.KEY_HEIGHT_RATIO;
    public final String p = "isAboveSubmit";
    public final String q = "isAboveStripe";
    public final String r = "beforeStickyBottom";
    public final String s = "hideCheckAll";
    public final String t = "dataPassthroughEnabled";
    public static final a Companion = new a(null);
    public static String u = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(479199260);
        }

        public a() {
        }

        public static final /* synthetic */ void a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("561dd52d", new Object[]{aVar, str});
            } else {
                aVar.c(str);
            }
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd58cf28", new Object[]{this});
            }
            return CartOpenPopEventAbility.p();
        }

        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf4d84e", new Object[]{this, str});
            } else {
                CartOpenPopEventAbility.t(str);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(479199259);
    }

    public static /* synthetic */ Object ipc$super(CartOpenPopEventAbility cartOpenPopEventAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/ability/event/CartOpenPopEventAbility");
    }

    public static final /* synthetic */ String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71612e39", new Object[0]);
        }
        return u;
    }

    public static final /* synthetic */ zxb q(CartOpenPopEventAbility cartOpenPopEventAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("932dcc88", new Object[]{cartOpenPopEventAbility});
        }
        return cartOpenPopEventAbility.k;
    }

    public static final /* synthetic */ String r(CartOpenPopEventAbility cartOpenPopEventAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aca1adce", new Object[]{cartOpenPopEventAbility});
        }
        return cartOpenPopEventAbility.l;
    }

    public static final /* synthetic */ void s(CartOpenPopEventAbility cartOpenPopEventAbility, kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da2b761", new Object[]{cartOpenPopEventAbility, kmbVar});
        } else {
            cartOpenPopEventAbility.w(kmbVar);
        }
    }

    public static final /* synthetic */ void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ac5fc5", new Object[]{str});
        } else {
            u = str;
        }
    }

    public final String u(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b757c541", new Object[]{this, str, jSONObject});
        }
        String str2 = this.l;
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    buildUpon.appendQueryParameter(entry.getKey(), (String) value);
                }
            }
            String builder = buildUpon.toString();
            ckf.f(builder, "uri.toString()");
            return builder;
        } catch (Throwable th) {
            hav.a(str2, th.getMessage());
            return str;
        }
    }

    public final JSONObject v(String str) {
        zxb zxbVar;
        fsb c;
        JSONObject z;
        JSONObject parseObject;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e15329b4", new Object[]{this, str});
        }
        if (str == null || (zxbVar = this.k) == null || (c = zxbVar.c()) == null || !(c instanceof u55) || (z = ((u55) c).z()) == null || (jSONObject = (parseObject = JSON.parseObject(z.toJSONString())).getJSONObject("hierarchy")) == null || (jSONObject2 = jSONObject.getJSONObject("structure")) == null || (jSONArray = jSONObject2.getJSONArray(str)) == null) {
            return null;
        }
        jSONArray.remove("generalExtendBody_1");
        return wc3.INSTANCE.a(parseObject, str);
    }

    public final void w(kmb kmbVar) {
        IDMComponent w;
        ViewManager Z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528cda1c", new Object[]{this, kmbVar});
            return;
        }
        fsb fsbVar = this.d;
        if (fsbVar != null && (w = cb4.w(fsbVar)) != null && (Z = kmbVar.e()) != null) {
            Z.z0(w);
        }
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        gsb g;
        JSONObject fields;
        String string;
        fsb c;
        IDMComponent a2;
        JSONObject data;
        CartGlobal w;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (lcuVar == null) {
            hav.g(c9x.CART_BIZ_NAME, this.l, "event is null");
        } else {
            String str = this.l;
            try {
                kmb kmbVar = this.j;
                if (kmbVar != null && (g = g()) != null && (fields = g.getFields()) != null && (string = fields.getString(this.m)) != null) {
                    Float f = fields.getFloat(this.o);
                    float floatValue = f != null ? f.floatValue() : 1.0f;
                    Boolean bool = fields.getBoolean(this.p);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    Boolean bool2 = fields.getBoolean(this.q);
                    boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                    Boolean bool3 = fields.getBoolean(this.r);
                    if (bool3 != null) {
                        z = bool3.booleanValue();
                    }
                    Boolean bool4 = fields.getBoolean(this.s);
                    if (bool4 != null) {
                        z2 = bool4.booleanValue();
                    }
                    String string2 = fields.getString(this.n);
                    JSONObject jSONObject = fields.getJSONObject("queryParams");
                    if (jSONObject != null) {
                        string = u(string, jSONObject);
                    }
                    zxb zxbVar = this.k;
                    JSONObject p = rc3.p(fields, (zxbVar == null || (w = zxbVar.w()) == null) ? null : w.getOriginGlobal(), rc3.mFieldsKeyGlobalTransparent);
                    if (p != null) {
                        string = u(string, p);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (!(!fields.getBooleanValue(this.t) || (a2 = lcuVar.a()) == null || (data = a2.getData()) == null)) {
                        linkedHashMap.put("passthroughData", data);
                    }
                    u = string2 != null ? string2 : "";
                    zxb zxbVar2 = this.k;
                    if (!(zxbVar2 == null || (c = zxbVar2.c()) == null)) {
                        c.e(u);
                    }
                    JSONObject v = v(string2);
                    hav.d(this.l, "showPop");
                    nc3 nc3Var = new nc3();
                    nc3Var.D("weex2");
                    nc3Var.E(string);
                    nc3Var.z(floatValue);
                    if (v != null) {
                        linkedHashMap.put("protocol", v);
                    }
                    nc3Var.w(linkedHashMap);
                    nc3Var.u("#FFFFFF");
                    nc3Var.A(z2);
                    nc3Var.C(Integer.valueOf(R.id.cart_pop_placeholder));
                    nc3Var.t(booleanValue);
                    nc3Var.s(booleanValue2);
                    if (z) {
                        nc3Var.F(Float.valueOf(1000.0f));
                    }
                    nc3Var.r(sParamKeyTradeEvent, lcuVar);
                    gsb g2 = g();
                    if (g2 != null) {
                        nc3Var.r(sParamKeyIDMEvent, g2);
                    }
                    xhv xhvVar = xhv.INSTANCE;
                    mc3.q(kmbVar, nc3Var, new CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$1(kmbVar, z2, this, lcuVar), new CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$2(kmbVar, z2, this, lcuVar));
                }
            } catch (Throwable th) {
                xh8 c2 = xh8.a("Ultron").c(str);
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                f9v.q(c2.message(message));
            }
        }
    }
}
