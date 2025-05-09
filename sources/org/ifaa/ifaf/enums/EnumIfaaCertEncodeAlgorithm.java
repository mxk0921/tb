package org.ifaa.ifaf.enums;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum EnumIfaaCertEncodeAlgorithm {
    CERT_ENCODE_ALG_X509((byte) 1),
    CERT_ENCODE_ALG_IFAA((byte) 2);
    
    private byte value;

    EnumIfaaCertEncodeAlgorithm(byte b) {
        this.value = b;
    }

    public byte getValue() {
        return this.value;
    }
}
