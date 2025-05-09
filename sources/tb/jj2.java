package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.goodlist.BottomMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jj2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SKU_ADD_CART = "5";
    public static final String SKU_ADD_CART_AND_DETAIL = "4";
    public static final String SKU_ADD_CART_WITH_SURE = "1";
    public static final String SKU_BUY = "2";
    public static final String SKU_SURE_AND_DETAIL = "3";

    static {
        t2o.a(806356103);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abd33774", new Object[]{str});
        }
        if (TextUtils.equals(BottomMode.ADDCART.getValue(), str)) {
            return "5";
        }
        if (TextUtils.equals(BottomMode.BUYNOW.getValue(), str)) {
            return "2";
        }
        TextUtils.equals(BottomMode.ADDCART_AND_BUYNOW.getValue(), str);
        return "4";
    }
}
