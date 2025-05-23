package com.taobao.android.order.bundle.constants;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum OrderType {
    ORDERSEARCH("OrderSearch"),
    ORDERFILTER("OrderFilter"),
    ORDERLIST("OrderList"),
    ORDERRECYCLEBIN("OrderRecycleBin"),
    MAOCHAO("MaoChao");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    OrderType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(OrderType orderType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/constants/OrderType");
    }

    public static OrderType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderType) ipChange.ipc$dispatch("f107145b", new Object[]{str});
        }
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
