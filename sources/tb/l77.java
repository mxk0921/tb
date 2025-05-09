package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kht;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class l77 extends kht.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23147a;
    public final BaseTemplateComponent b;
    public final ShopDataParser c;

    static {
        t2o.a(766510044);
    }

    public l77(Context context, BaseTemplateComponent baseTemplateComponent) {
        ckf.g(context, "context");
        ckf.g(baseTemplateComponent, "shopTemplateComponent");
        this.f23147a = context;
        this.b = baseTemplateComponent;
        this.c = baseTemplateComponent.i();
    }

    public static /* synthetic */ Object ipc$super(l77 l77Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/DefaultTabActionListener");
    }

    @Override // tb.kht.b
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f442552", new Object[]{this, obj});
        } else if (this.b.l()) {
            r54.Z(this.f23147a);
            if (!this.c.H1()) {
                brp.h(this.c);
            }
        }
    }

    @Override // tb.kht.b
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c029e6", new Object[]{this, obj});
        } else if (this.b.l()) {
            boolean z = obj instanceof String;
            if (z) {
                khu.h(this.f23147a, (String) obj);
            }
            if (ckf.b(this.c.M0(), obj)) {
                brp.i(this.c);
            }
            if (ckf.b(this.c.a1(), obj)) {
                brp.e(this.c);
            }
            if (z && this.c.S1((String) obj)) {
                brp.k(this.c);
            }
        }
    }

    @Override // tb.kht.b
    public void d(Object obj) {
        vpd I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e61bd08", new Object[]{this, obj});
            return;
        }
        String str = null;
        if ((obj instanceof String) && (I = this.c.I()) != null) {
            I.d((String) obj, null);
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject.getString("jumpType");
            JSONObject jSONObject2 = jSONObject.getJSONObject("jumpParams");
            vpd I2 = this.c.I();
            if (I2 != null) {
                if (jSONObject2 != null) {
                    str = jSONObject2.toJSONString();
                }
                I2.d(string, str);
            }
        }
    }

    @Override // tb.kht.b
    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9e8f42", new Object[]{this, obj});
        } else if (this.b.l()) {
            ShopMoreUtils.INSTANCE.w((Activity) this.f23147a, this.b.i(), this.b.i().P(), this.b.i().R(), null, null, null);
            if (!this.c.H1()) {
                brp.g(this.c);
            }
        }
    }

    public final ShopDataParser i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        return this.c;
    }
}
