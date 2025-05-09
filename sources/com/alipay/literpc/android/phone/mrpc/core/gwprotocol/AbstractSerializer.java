package com.alipay.literpc.android.phone.mrpc.core.gwprotocol;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class AbstractSerializer implements Serializer {
    public String mOperationType;
    public Object mParams;

    public AbstractSerializer(String str, Object obj) {
        this.mOperationType = str;
        this.mParams = obj;
    }
}
