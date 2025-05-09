package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y7n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_WDKSGLL = "wdksgll";
    public static final String K_WDK_ADDRESSID = "wdk_addressId";

    /* renamed from: a  reason: collision with root package name */
    public final String f31897a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final int n;
    public final boolean o;

    static {
        t2o.a(301990036);
    }

    public y7n(Map<String, String> map) {
        JSONObject jSONObject;
        this.o = false;
        try {
            String str = map.get("exParams");
            if (str != null) {
                jSONObject = JSON.parseObject(str);
            } else {
                jSONObject = new JSONObject();
            }
            map.put("exParams", jSONObject.toJSONString());
            this.f31897a = jSONObject.getString("novad");
            this.b = jSONObject.getString("novab");
            this.c = jSONObject.getString("novabv");
            this.d = jSONObject.getString("novaa");
            this.e = jSONObject.getString("novaav");
            this.f = jSONObject.getString("novac");
            this.g = jSONObject.getString("novacv");
            if (jSONObject.containsKey("source_int")) {
                this.o = true;
                this.n = jSONObject.getIntValue("source_int");
            }
            if (jSONObject.containsKey(K_WDK_ADDRESSID)) {
                this.j = jSONObject.getString(K_WDK_ADDRESSID);
            }
            if (jSONObject.containsKey(K_WDKSGLL)) {
                String string = jSONObject.getString(K_WDKSGLL);
                if (!TextUtils.isEmpty(string)) {
                    String[] split = string.split(",");
                    this.h = split[0];
                    this.i = split[1];
                }
            }
            if (jSONObject.containsKey("poiId")) {
                this.k = jSONObject.getString("poiId");
            }
            if (jSONObject.containsKey("life_order_location")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("life_order_location");
                this.h = jSONObject2.getString("longitude");
                this.i = jSONObject2.getString("latitude");
                this.j = jSONObject2.getString("addressId");
                this.k = jSONObject2.getString("poiId");
            }
            this.l = map.get(r4p.KEY_STORE_ID);
            if (jSONObject.containsKey("life_biz_type")) {
                this.m = jSONObject.getString("life_biz_type");
            }
        } catch (Throwable unused) {
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79ee1b20", new Object[]{this});
        }
        return this.j;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94fce4bd", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (Localization.o()) {
            return "mtop.trade.global.buy.adjust";
        }
        return "mtop.trade.order.adjust";
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a690d8a", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.e)) {
            return this.e;
        }
        if (Localization.o()) {
            return "1.0";
        }
        return j5m.API_VERSION;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b5224ea", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (Localization.o()) {
            return "mtop.trade.global.buy.build";
        }
        return "mtop.trade.order.build";
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20be4db7", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        if (Localization.o()) {
            return "1.0";
        }
        return AfcCustomSdk.SDK_VERSION;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4481cf0", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        if (Localization.o()) {
            return "mtop.trade.global.buy.create";
        }
        return "mtop.trade.order.create";
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79b445bd", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.g)) {
            return this.g;
        }
        if (Localization.o()) {
            return "1.0";
        }
        return j5m.API_VERSION;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return this.f31897a;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f4fa657", new Object[]{this});
        }
        return this.i;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4da962be", new Object[]{this});
        }
        return this.m;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16d079a0", new Object[]{this});
        }
        return this.h;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47842f0a", new Object[]{this});
        }
        return this.k;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("379e3498", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5844913", new Object[]{this});
        }
        return this.l;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abef2826", new Object[]{this})).booleanValue();
        }
        return this.o;
    }
}
