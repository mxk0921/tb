package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class seo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE_CART = "cart";

    /* renamed from: a  reason: collision with root package name */
    public final String f27995a;
    public final String b;
    public final JSONObject c;
    public final String d;
    public final String e;
    public final int f;
    public final x3w g;
    public final JSONObject h;

    static {
        t2o.a(352322110);
    }

    public seo(JSONObject jSONObject, int i, x3w x3wVar) {
        if (jSONObject != null) {
            this.h = jSONObject;
            this.f27995a = jSONObject.getString(MspWebActivity.BTN_TYPE);
            this.b = jSONObject.getString("bizType");
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            this.c = jSONObject2;
            if (jSONObject2 != null) {
                this.e = jSONObject2.getString("iconUrl");
                this.d = jSONObject2.getString("iconFont");
            }
            this.f = i;
            this.g = x3wVar;
        }
    }

    public boolean a(seo seoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bb1043f", new Object[]{this, seoVar})).booleanValue();
        }
        if (seoVar == null) {
            return false;
        }
        if ((Objects.equals(this.d, seoVar.d) || Objects.equals(this.e, seoVar.e)) && Objects.equals(this.f27995a, seoVar.f27995a) && this.f == seoVar.f) {
            return true;
        }
        return false;
    }

    public x3w b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("ec2779df", new Object[]{this});
        }
        return this.g;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc53af79", new Object[]{this});
        }
        return this.f27995a;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.h;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
        }
        return this.c;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fefae22e", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deba0fdb", new Object[]{this});
        }
        return this.d;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
        }
        return this.e;
    }
}
