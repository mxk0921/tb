package com.taobao.android.order.bundle.constants;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum TabType {
    ALL("all"),
    WAIT_PAY("waitPay"),
    WAIT_SEND("waitSend"),
    WAIT_CONFIRM("waitConfirm"),
    REFUND("reFund"),
    WAIT_RATE("waitRate");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    TabType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(TabType tabType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/constants/TabType");
    }

    public static TabType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabType) ipChange.ipc$dispatch("a480274", new Object[]{str});
        }
        return (TabType) Enum.valueOf(TabType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
