package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ff7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19249a;
    public String b;
    public String c;
    public Map<String, String> d;
    public String e;
    public boolean f;
    public boolean g;
    public float h;
    public String i;
    public String j;

    static {
        t2o.a(912262248);
    }

    public static ff7 a(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ff7) ipChange.ipc$dispatch("9b3b2ef0", new Object[]{nb4Var});
        }
        ff7 ff7Var = null;
        if (!(nb4Var == null || nb4Var.f() == null)) {
            JSONObject jSONObject = nb4Var.f().getJSONObject("payload");
            if (jSONObject == null) {
                return null;
            }
            ff7Var = new ff7();
            ff7Var.f19249a = jSONObject.getString("userId");
            ff7Var.b = jSONObject.getString("shopId");
            ff7Var.c = jSONObject.getString("itemId");
            try {
                ff7Var.d = (Map) jSONObject.getObject("moduleDescParams", Map.class);
            } catch (Exception unused) {
                tgh.b("DetailDescModel", "detailDescModel moduleDescParams parser error");
            }
            ff7Var.e = jSONObject.getString("taobaoDescUrl");
            jSONObject.getString("taobaoPcDescUrl");
            try {
                ff7Var.f = jSONObject.getBooleanValue("shrinkDesc");
                ff7Var.g = jSONObject.getBooleanValue("shrinkPriceInfo");
            } catch (Exception unused2) {
                tgh.b("DetailDescModel", "detailDescModel shrink parser error");
            }
            try {
                ff7Var.h = jSONObject.getFloatValue("shrinkDescHeightRatio");
            } catch (Exception unused3) {
                tgh.b("DetailDescModel", "detailDescModel shrinkHeight parser error");
            }
            ff7Var.i = jSONObject.getString("priceExpandImageUrl");
            ff7Var.j = jSONObject.getString("priceShrinkImageUrl");
        }
        return ff7Var;
    }
}
