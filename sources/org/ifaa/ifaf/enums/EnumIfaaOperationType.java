package org.ifaa.ifaf.enums;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum EnumIfaaOperationType {
    REQUEST("Request"),
    RESPONSE("Response");
    
    private String value;

    EnumIfaaOperationType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
