package tb;

import android.content.Intent;
import android.os.Bundle;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.cart.constant.CartFrom;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ie3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_QUERY_PARAM_CART_FROM = "cartfrom";
    public static final String TAG = "CartUtils";

    static {
        t2o.a(697303054);
    }

    public static CartFrom a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartFrom) ipChange.ipc$dispatch("e45f311", new Object[]{intent});
        }
        CartFrom cartFrom = CartFrom.TAOBAO_CLIENT;
        if (intent == null) {
            return cartFrom;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("cartfrom")) {
                return cartFrom;
            }
            return CartFrom.parseCartFrom(extras.getString("cartfrom"));
        } catch (Throwable unused) {
            return cartFrom;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d0d00bb", new Object[0])).booleanValue();
        }
        if (EnvironmentSwitcher.EnvType.OnLINE.getValue() == EnvironmentSwitcher.a()) {
            return true;
        }
        return false;
    }
}
