package com.taobao.android.trade.cart.constant;

import com.alibaba.android.icart.core.QueryParamsManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.urq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum CartFrom {
    TMALL_CLIENT("tmall_client"),
    JHS_CLIENT("jhs_client"),
    TSM_NATIVE_TAOBAO_CROSS_STORE("tsm_native_taobao$cross_store"),
    TSM_NATIVE_TMALL("tsm_native_tmall"),
    TAOBAO_CLIENT(QueryParamsManager.DEFAULT_CART_FROM),
    TAOBAO_CLIENT_CROSS_STORE("taobao_client$cross_store"),
    YUNOS_HOME_FRIDGE("yunos_home_fridge"),
    DEFAULT_CLIENT("default_client"),
    DEFAULT_CLIENT_CROSS_STORE("default_client$cross_store");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    CartFrom(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(CartFrom cartFrom, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/cart/constant/CartFrom");
    }

    public static CartFrom parseCartFrom(String str) {
        CartFrom[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartFrom) ipChange.ipc$dispatch("1c091cfb", new Object[]{str});
        }
        if (!urq.a(str)) {
            for (CartFrom cartFrom : values()) {
                if (cartFrom.getValue().equals(str)) {
                    return cartFrom;
                }
            }
        }
        return DEFAULT_CLIENT;
    }

    public static CartFrom valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartFrom) ipChange.ipc$dispatch("6b577926", new Object[]{str});
        }
        return (CartFrom) Enum.valueOf(CartFrom.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
