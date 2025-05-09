package com.ut.share.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vbm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum WWMessageType {
    WWMessageTypeDefault("Default"),
    WWMessageTypeText(vbm.TYPE_TEXT),
    WWMessageTypeDetail("Detail"),
    WWMessageTypeShop("Shop"),
    WWMessageTypeImage(vbm.TYPE_IMAGE),
    WWMessageTypeWeitaoQR("WeitaoQR"),
    WWMessageTypeWeitaoAccount("WeitaoAccount"),
    WWMessageTypeWeitao("Weitao");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    WWMessageType(String str) {
        this.value = str;
    }

    public static WWMessageType getEnum(String str) {
        WWMessageType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WWMessageType) ipChange.ipc$dispatch("8f976095", new Object[]{str});
        }
        for (WWMessageType wWMessageType : values()) {
            if (wWMessageType.value.equals(str)) {
                return wWMessageType;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(WWMessageType wWMessageType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/share/business/WWMessageType");
    }

    public static WWMessageType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WWMessageType) ipChange.ipc$dispatch("6bd8b706", new Object[]{str});
        }
        return (WWMessageType) Enum.valueOf(WWMessageType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return name();
    }
}
