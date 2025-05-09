package org.ifaa.ifaf.enums;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum EnumIfaaAuthType {
    FINGERPRINT((byte) 1),
    IRIS((byte) 2),
    FACE((byte) 4);
    
    private byte value;

    EnumIfaaAuthType(byte b) {
        this.value = b;
    }

    public byte getValue() {
        return this.value;
    }
}
