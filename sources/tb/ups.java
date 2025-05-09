package tb;

import android.content.Context;
import android.net.Uri;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.NativeShopActivity;
import com.alibaba.triver.triver_shop.newShop.data.NativeShopRenderContainerType;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ups {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f29550a;
    public final ShopDataParser b;
    public final int c;
    public final int d;
    public String e;
    public String f;
    public String g;
    public Map<String, ? extends Object> h;
    public String i;
    public JSONObject j;
    public JSONArray k;
    public eqp l;

    static {
        t2o.a(766509468);
    }

    public ups(JSONObject jSONObject, ShopDataParser shopDataParser, int i, int i2) {
        this.f29550a = jSONObject;
        this.b = shopDataParser;
        this.c = i;
        this.d = i2;
        C();
    }

    public static /* synthetic */ String s(ups upsVar, String str, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf2c3fa6", new Object[]{upsVar, str, str2, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return upsVar.r(str, str2);
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31682eef", new Object[]{this})).booleanValue();
        }
        return ckf.b("member", this.g);
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ccf84fd", new Object[]{this})).booleanValue();
        }
        return ckf.b(mop.KEY_SHOP_INDEX, this.g);
    }

    public final void C() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd55ed21", new Object[]{this});
            return;
        }
        JSONObject jSONObject2 = this.f29550a;
        if (jSONObject2 != null) {
            this.h = jSONObject2.getJSONObject("payload").getInnerMap();
            JSONObject jSONObject3 = this.f29550a.getJSONObject("payload");
            JSONObject jSONObject4 = null;
            if (!(jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("source")) == null)) {
                jSONObject4 = jSONObject.getJSONObject("abContext");
            }
            this.j = jSONObject4;
            this.k = this.f29550a.getJSONArray("prefetchMtopInfoList");
            this.e = D("type");
            this.f = D("utArg1");
            this.g = D("name");
        }
    }

    public final String D(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8760801", new Object[]{this, str});
        }
        JSONObject jSONObject = this.f29550a;
        if (jSONObject == null) {
            obj = null;
        } else {
            obj = jSONObject.get(str);
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void E(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42c6239", new Object[]{this, jSONArray});
        } else {
            this.k = jSONArray;
        }
    }

    public final void F(eqp eqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc60223", new Object[]{this, eqpVar});
        } else {
            this.l = eqpVar;
        }
    }

    public final JSONObject b() {
        Object obj;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4fba8445", new Object[]{this});
        }
        Map<String, Object> l = l();
        if (l == null || (obj = l.get("source")) == null || !(obj instanceof JSONObject) || (jSONObject = ((JSONObject) obj).getJSONObject("data")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("closeIcon");
    }

    public final JSONArray c() {
        Object obj;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("17fa9fc6", new Object[]{this});
        }
        Map<String, Object> l = l();
        if (l == null || (obj = l.get("source")) == null || !(obj instanceof JSONObject) || (jSONObject = ((JSONObject) obj).getJSONObject("data")) == null) {
            return null;
        }
        return jSONObject.getJSONArray("categoryList");
    }

    public final JSONObject d() {
        Object obj;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ea0467dd", new Object[]{this});
        }
        Map<String, Object> l = l();
        if (l == null || (obj = l.get("source")) == null || !(obj instanceof JSONObject) || (jSONObject = ((JSONObject) obj).getJSONObject("data")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("openIcon");
    }

    public final String e() {
        Object obj;
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80d32a3b", new Object[]{this});
        }
        Map<String, Object> l = l();
        return (l == null || (obj = l.get("source")) == null || !(obj instanceof JSONObject) || (jSONObject = ((JSONObject) obj).getJSONObject("data")) == null || (string = jSONObject.getString("defaultStatus")) == null) ? "open" : string;
    }

    public final NativeShopRenderContainerType f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NativeShopRenderContainerType) ipChange.ipc$dispatch("25b2c49", new Object[]{this});
        }
        return NativeShopRenderContainerType.Companion.b(this.e, n());
    }

    public final String g() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a2dadc9", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.h;
        if (map == null || (obj = map.get("source")) == null || !(obj instanceof JSONObject)) {
            return null;
        }
        return ((JSONObject) obj).getString("downgradeUrl");
    }

    public final String h() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8adba9d3", new Object[]{this});
        }
        JSONObject i = i();
        if (i == null || (jSONObject = i.getJSONObject("queryParam")) == null) {
            return null;
        }
        return jSONObject.getString("accountId");
    }

    public final JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2265a9d3", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.h;
        Object obj = map == null ? null : map.get("source");
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        return ((JSONObject) obj).getJSONObject("shopLive2023");
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86132add", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.g;
    }

    public final Map<String, Object> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("38d315d4", new Object[]{this});
        }
        return this.h;
    }

    public final JSONArray m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d97d1201", new Object[]{this});
        }
        return this.k;
    }

    public final String n() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe311996", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.b;
        Object E0 = shopDataParser == null ? null : shopDataParser.E0(this.g);
        if (E0 == null && (str = this.i) != null) {
            return str;
        }
        Map<String, ? extends Object> map = this.h;
        Object obj = map == null ? null : map.get("source");
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        String a2 = a(((JSONObject) obj).getString("url"));
        if (E0 != null) {
            return a2;
        }
        this.i = a2;
        return a2;
    }

    public final ShopDataParser o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        return this.b;
    }

    public final eqp p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqp) ipChange.ipc$dispatch("231e47dd", new Object[]{this});
        }
        return this.l;
    }

    public final int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ada0f062", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final String r(String str, String str2) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2830a203", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = this.j;
        if (jSONObject == null || (string = jSONObject.getString(str)) == null) {
            return str2;
        }
        return string;
    }

    public final String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57619f27", new Object[]{this});
        }
        return this.f;
    }

    public final JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("28c755ab", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.h;
        Object obj = map == null ? null : map.get("source");
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        return (JSONObject) obj;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc6e8755", new Object[]{this})).booleanValue();
        }
        return ckf.b("allitems", this.g);
    }

    public final boolean w() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a557d385", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.f29550a;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.getString("backgroundColor");
        }
        return ckf.b(pg1.ATOM_EXT_black, str);
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebf484d3", new Object[]{this})).booleanValue();
        }
        return ckf.b("category", this.g);
    }

    public final boolean y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aee72dc7", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        if (context instanceof NativeShopActivity) {
            return ckf.b(this.g, ((NativeShopActivity) context).X4());
        }
        return false;
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14380eb0", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.f29550a;
        return ckf.b("true", jSONObject == null ? null : jSONObject.getString("fullScreen"));
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff2ec1d", new Object[]{this})).booleanValue();
        }
        String queryParameter = Uri.parse(n()).getQueryParameter("shopHeaderNeedScrollMask");
        if (queryParameter == null || NativeShopRenderContainerType.Companion.a(this.e)) {
            return true;
        }
        return ckf.b("true", queryParameter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) {
        StringBuilder sb;
        String bool;
        Uri K0;
        String queryParameter;
        Object obj;
        JSONObject jSONObject;
        Object E0;
        JSONObject jSONObject2;
        int i;
        int i2;
        JSONObject o0;
        JSONObject o02;
        JSONObject o03;
        Context Q;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c831f7ee", new Object[]{this, str});
        }
        Uri N = r54.N(str);
        if (N == null) {
            return null;
        }
        Map<String, String> o = r54.o(N);
        Uri.Builder buildUpon = N.buildUpon();
        ShopDataParser shopDataParser = this.b;
        int O = kew.O(Integer.valueOf(((shopDataParser == null || (Q = shopDataParser.Q()) == null) ? 0 : kew.y(Q)) + kew.p(55)));
        ShopDataParser shopDataParser2 = this.b;
        String G0 = shopDataParser2 == null ? null : shopDataParser2.G0("weexShopToken");
        if (G0 == null) {
            ShopDataParser shopDataParser3 = this.b;
            G0 = shopDataParser3 == null ? null : shopDataParser3.W0();
        }
        o.put("weexShopToken", G0);
        ShopDataParser shopDataParser4 = this.b;
        o.put("shopId", shopDataParser4 == null ? null : shopDataParser4.W0());
        ShopDataParser shopDataParser5 = this.b;
        o.put("sellerId", shopDataParser5 == null ? null : shopDataParser5.N0());
        o.put("isNewStyle", "true");
        o.put("isNativeContainer", "true");
        o.put("inMiniappShop", "true");
        o.put("inMiniappShopVersion", "2.5");
        ShopDataParser shopDataParser6 = this.b;
        o.put("abBucket", (shopDataParser6 == null || (o03 = shopDataParser6.o0()) == null) ? null : o03.getString("abBucket"));
        ShopDataParser shopDataParser7 = this.b;
        o.put("bucket", (shopDataParser7 == null || (o02 = shopDataParser7.o0()) == null) ? null : o02.getString("abBucket"));
        ShopDataParser shopDataParser8 = this.b;
        o.put("inshopBuckets", (shopDataParser8 == null || (o0 = shopDataParser8.o0()) == null) ? null : o0.getString("inshopBuckets"));
        if (this.c == 1) {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append(".0.");
            sb.append(this.d);
        } else {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append('.');
            sb.append(this.d);
            sb.append(".0");
        }
        o.put("weexShopTabId", sb.toString());
        o.put("weexShopTransparentBG", "true");
        ShopDataParser shopDataParser9 = this.b;
        o.put("identityType", shopDataParser9 == null ? null : shopDataParser9.f3());
        String str2 = "0,0";
        o.put("paddingTopAndBottom", str2);
        ShopDataParser shopDataParser10 = this.b;
        if (shopDataParser10 != null && shopDataParser10.G1()) {
            o.put("is2022Style", "true");
            if (z()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.b.O());
                sb2.append(',');
                sb2.append(this.b.M());
                o.put("paddingTopAndBottom", sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(kew.O(12));
                sb3.append(',');
                eqp eqpVar = this.l;
                Integer valueOf = eqpVar == null ? null : Integer.valueOf(eqpVar.a());
                if (valueOf == null) {
                    i2 = this.b.M();
                } else {
                    i2 = valueOf.intValue();
                }
                sb3.append(i2);
                o.put("paddingTopAndBottom", sb3.toString());
            }
        }
        ShopDataParser shopDataParser11 = this.b;
        if (shopDataParser11 != null && shopDataParser11.H1()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.b.O());
            sb4.append(',');
            eqp eqpVar2 = this.l;
            Integer valueOf2 = eqpVar2 == null ? null : Integer.valueOf(eqpVar2.a());
            if (valueOf2 == null) {
                i = this.b.M();
            } else {
                i = valueOf2.intValue();
            }
            sb4.append(i);
            o.put("paddingTopAndBottom", sb4.toString());
        }
        ShopDataParser shopDataParser12 = this.b;
        if (!(shopDataParser12 == null || (E0 = shopDataParser12.E0(this.g)) == null)) {
            if (E0 instanceof JSONObject) {
                jSONObject2 = (JSONObject) E0;
            } else {
                jSONObject2 = E0 instanceof String ? brf.k((String) E0) : null;
            }
            if (jSONObject2 != null) {
                for (Map.Entry entry : jSONObject2.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    o.put(key, value == null ? null : value.toString());
                }
                xhv xhvVar = xhv.INSTANCE;
            }
        }
        String str3 = "false";
        if (v()) {
            o.put("weexShopTransparentBG", str3);
            o.put("ignoreShopHeadEvent", "true");
            o.put("bottomPadding", "100");
        }
        ShopDataParser shopDataParser13 = this.b;
        boolean h2 = shopDataParser13 == null ? false : shopDataParser13.h2();
        ShopDataParser shopDataParser14 = this.b;
        boolean J1 = shopDataParser14 == null ? false : shopDataParser14.J1();
        ShopDataParser shopDataParser15 = this.b;
        boolean G1 = shopDataParser15 == null ? false : shopDataParser15.G1();
        if (J1 && !h2 && !G1 && B()) {
            o.put("fullScreenStyle", "true");
        }
        ShopDataParser shopDataParser16 = this.b;
        boolean z2 = shopDataParser16 != null && shopDataParser16.N1();
        boolean B = B();
        if (B && J1) {
            z = true;
        }
        if (NativeShopRenderContainerType.Companion.a(this.e)) {
            Map<String, ? extends Object> map = this.h;
            if (!(map == null || (obj = map.get("source")) == null)) {
                if ((obj instanceof JSONObject) && (jSONObject = ((JSONObject) obj).getJSONObject("query")) != null) {
                    for (Map.Entry<String, Object> entry2 : jSONObject.entrySet()) {
                        String key2 = entry2.getKey();
                        Object value2 = entry2.getValue();
                        o.put(key2, value2 == null ? null : value2.toString());
                    }
                    xhv xhvVar2 = xhv.INSTANCE;
                }
                xhv xhvVar3 = xhv.INSTANCE;
            }
            o.put(RVStartParams.KEY_DISABLE_LOADING_VIEW, "true");
            o.put("disableAppInfoCache", "true");
            ShopDataParser shopDataParser17 = this.b;
            if (shopDataParser17 != null && shopDataParser17.G1()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(kew.P(12));
                sb5.append(',');
                sb5.append(this.b.M());
                str2 = sb5.toString();
            } else if (z2 && !z && !B) {
                str2 = O + ",0";
            }
            o.put("paddingTopAndBottom", str2);
        } else if (z2) {
            o.put("paddingTopAndBottom", O + ",0");
        }
        ShopDataParser shopDataParser18 = this.b;
        o.put("identityCode", shopDataParser18 == null ? null : shopDataParser18.s0());
        ShopDataParser shopDataParser19 = this.b;
        if (!(shopDataParser19 == null || (K0 = shopDataParser19.K0()) == null)) {
            for (String str4 : K0.getQueryParameterNames()) {
                if (!ckf.b("page", str4) && !ckf.b("templateId", str4) && (queryParameter = K0.getQueryParameter(str4)) != null) {
                    String str5 = (String) o.put(str4, queryParameter);
                }
            }
            xhv xhvVar4 = xhv.INSTANCE;
        }
        ShopDataParser shopDataParser20 = this.b;
        if (!(shopDataParser20 == null || (bool = Boolean.valueOf(shopDataParser20.Y()).toString()) == null)) {
            str3 = bool;
        }
        o.put("enableShopAsyncBridge", str3);
        ckf.f(buildUpon, "builder");
        r54.b(buildUpon, o);
        return buildUpon.build().toString();
    }
}
