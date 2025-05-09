package org.ifaa.ifaf.enums;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum EnumIfaaOperation {
    REGISTER("Reg"),
    AUTHENTICATION("Auth"),
    DEREGISTER("DeReg");
    
    private String value;

    EnumIfaaOperation(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
