package com.alipay.android.phone.iifaa.did.rpc.model;

import com.alipay.android.phone.iifaa.did.model.DocumentSignData;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DidIdpRpcResponse implements Serializable {
    public String errMessage;
    public DocumentSignData signDocument;
    public boolean success = false;
    public int errCode = 0;
}
