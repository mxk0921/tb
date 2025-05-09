package com.huawei.hms.core.aidl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class CodecLookup {
    private CodecLookup() {
    }

    public static MessageCodec find(int i) {
        if (i == 2) {
            return new MessageCodecV2();
        }
        return new MessageCodec();
    }
}
