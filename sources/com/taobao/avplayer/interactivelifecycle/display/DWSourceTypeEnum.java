package com.taobao.avplayer.interactivelifecycle.display;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum DWSourceTypeEnum {
    ITEMCART("item"),
    COUPON("coupon"),
    ALIPAYCOUPON("alipayCoupon"),
    CONTENTTAG("contentTag"),
    CONTENTTAGTRACE("contentTagTrace");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    DWSourceTypeEnum(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(DWSourceTypeEnum dWSourceTypeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/interactivelifecycle/display/DWSourceTypeEnum");
    }

    public static DWSourceTypeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWSourceTypeEnum) ipChange.ipc$dispatch("3a1550f3", new Object[]{str});
        }
        return (DWSourceTypeEnum) Enum.valueOf(DWSourceTypeEnum.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
