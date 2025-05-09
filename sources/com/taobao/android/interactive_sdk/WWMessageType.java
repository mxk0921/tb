package com.taobao.android.interactive_sdk;

import tb.vbm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum WWMessageType {
    WWMessageTypeDefault("Default"),
    WWMessageTypeText(vbm.TYPE_TEXT),
    WWMessageTypeDetail("Detail"),
    WWMessageTypeShop("Shop"),
    WWMessageTypeImage(vbm.TYPE_IMAGE),
    WWMessageTypeWeitaoQR("WeitaoQR"),
    WWMessageTypeWeitaoAccount("WeitaoAccount"),
    WWMessageTypeWeitao("Weitao");
    
    private String value;

    WWMessageType(String str) {
        this.value = str;
    }

    public static WWMessageType getEnum(String str) {
        WWMessageType[] values;
        for (WWMessageType wWMessageType : values()) {
            if (wWMessageType.value.equals(str)) {
                return wWMessageType;
            }
        }
        return null;
    }

    public String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
