package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class il1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21374a = false;

    static {
        t2o.a(912262645);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fc6e97a", new Object[]{this})).booleanValue();
        }
        return vbl.g();
    }

    public final boolean c(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd19a5a5", new Object[]{this, feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isOpenDetailAndAddCartAndBuyNow();
    }

    public final boolean d(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c08185", new Object[]{this, feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isOpenDetailAndNewBuy();
    }

    public void a(ze7 ze7Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9448a0dc", new Object[]{this, ze7Var});
        } else if (!this.f21374a && ze7Var != null && ze7Var.e() != null && b()) {
            Feature feature = (Feature) ze7Var.e().f(Feature.class);
            if (d(feature)) {
                str = "BUYNOW";
            } else if (c(feature)) {
                str = "ADDCART_AND_BUYNOW";
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                ze7Var.i().f("isAutoOpenSku", "true");
                ze7Var.b().h(OpenSkuImplementor.h(str, null), new RuntimeAbilityParam[0]);
                this.f21374a = true;
            }
        }
    }
}
